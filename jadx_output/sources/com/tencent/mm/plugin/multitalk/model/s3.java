package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.u3 f150132e;

    public s3(com.tencent.mm.plugin.multitalk.model.u3 u3Var, java.lang.String str) {
        this.f150132e = u3Var;
        this.f150131d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f150132e.J4(this.f150131d);
        com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent();
        refreshMainUIMultitalkIconEvent.f54671g.f7358a = 2;
        refreshMainUIMultitalkIconEvent.e();
    }
}
