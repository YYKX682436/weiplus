package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class dn implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f131910d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131911e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f131912f;

    public dn(java.lang.String nickname, int i17, java.lang.String avatar) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(avatar, "avatar");
        this.f131910d = nickname;
        this.f131911e = i17;
        this.f131912f = avatar;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
