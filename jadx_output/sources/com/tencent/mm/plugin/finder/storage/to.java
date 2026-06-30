package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class to extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.to f128095d = new com.tencent.mm.plugin.finder.storage.to();

    public to() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "进入Profile时自动补齐ref_comment_scene和enter_scene", "FINDER_PROFILE_INJECT_SCENE_SWITCH", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_profile_inject_scene_switch, false, 2, null);
        return aVar;
    }
}
