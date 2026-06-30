package com.tencent.mm.plugin.flutter.model;

/* loaded from: classes15.dex */
public class ChannelRegistrant {
    public static void registerWith(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (flutterEngine.getPlugins().has(g03.a.class)) {
            com.tencent.mars.xlog.Log.w("ChannelRegistrant", "already registered");
            return;
        }
        flutterEngine.getPlugins().add(new g03.a());
        flutterEngine.getPlugins().add(new g03.b());
        flutterEngine.getPlugins().add(new g03.c());
        flutterEngine.getPlugins().add(new x03.q1());
        flutterEngine.getPlugins().add(new k03.h());
        flutterEngine.getPlugins().add(new c61.ab());
        flutterEngine.getPlugins().add(new si0.f());
    }
}
