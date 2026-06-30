package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f112695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112696f;

    public gg(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, java.lang.Boolean bool, int i17) {
        this.f112694d = mgVar;
        this.f112695e = bool;
        this.f112696f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Boolean bool = this.f112695e;
        int i17 = this.f112696f;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112694d;
        mgVar.x1(bool, i17);
        mgVar.getClass();
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
        ((mm2.x4) mgVar.P0(mm2.x4.class)).f329540u = false;
    }
}
