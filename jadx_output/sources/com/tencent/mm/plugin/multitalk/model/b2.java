package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.d2 f149887e;

    public b2(com.tencent.mm.plugin.multitalk.model.d2 d2Var, java.lang.String str) {
        this.f149887e = d2Var;
        this.f149886d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f149887e.J4(this.f149886d);
        com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent();
        refreshMainUIMultitalkIconEvent.f54671g.f7358a = 2;
        refreshMainUIMultitalkIconEvent.e();
    }
}
