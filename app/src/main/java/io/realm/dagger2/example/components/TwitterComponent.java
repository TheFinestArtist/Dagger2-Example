package io.realm.dagger2.example.components;

import javax.inject.Singleton;

import dagger.Subcomponent;
import io.realm.dagger2.example.modules.TwitterModule;
import io.realm.dagger2.example.twitters.Timeline;
import io.realm.dagger2.example.twitters.Tweeter;

/**
 * Created by TheFinestArtist on 6/15/15.
 */
@Singleton
@Subcomponent(modules = {TwitterModule.class})
public interface TwitterComponent {
    Tweeter tweeter();
    Timeline timeline();
}