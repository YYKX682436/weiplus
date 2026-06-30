package com.tencent.mm.plugin.music.player.base;

/* loaded from: classes15.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.music.player.base.n f150663a;

    /* renamed from: b, reason: collision with root package name */
    public b21.r f150664b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.music.player.base.o f150665c = new com.tencent.mm.plugin.music.player.base.o();

    public abstract int a();

    public abstract int b();

    public abstract java.lang.String c();

    public abstract boolean d();

    public abstract boolean e();

    public void f(boolean z17) {
        if (this.f150663a != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.player.base.h(this, z17));
        }
    }

    public abstract void g();

    public abstract void h();

    public abstract void i(long j17);

    public abstract void j(java.lang.String str);

    public abstract void k();
}
