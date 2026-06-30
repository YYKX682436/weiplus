package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gc0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f112682a;

    public gc0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        this.f112682a = nd0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.b1.e(new jz5.l("live_follow_type", java.lang.Integer.valueOf(this.f112682a.C1() ? 1 : 0)));
    }
}
