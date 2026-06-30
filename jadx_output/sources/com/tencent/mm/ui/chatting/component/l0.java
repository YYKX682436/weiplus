package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f199388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.m0 f199390f;

    public l0(com.tencent.mm.ui.chatting.component.m0 m0Var, boolean z17, java.lang.String str) {
        this.f199390f = m0Var;
        this.f199388d = z17;
        this.f199389e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.m0 m0Var = this.f199390f;
        java.lang.String x17 = m0Var.f199471a.f198580d.x();
        m0Var.f199471a.f199329e = this.f199388d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (x17.equals(this.f199389e)) {
            m0Var.f199471a.n0();
        }
    }
}
