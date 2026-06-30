package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.dc f126170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f126172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f126173g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(zy2.dc dcVar, java.lang.String str, kotlin.jvm.internal.h0 h0Var, c01.o8 o8Var) {
        super(0);
        this.f126170d = dcVar;
        this.f126171e = str;
        this.f126172f = h0Var;
        this.f126173g = o8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zy2.dc dcVar = this.f126170d;
        boolean z17 = dcVar != null ? ((ya2.b2) dcVar).G2 : false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderStrangerContact] callback! succ=");
        sb6.append(z17);
        sb6.append(", username=");
        java.lang.String str = this.f126171e;
        sb6.append(str);
        sb6.append(" talker=");
        sb6.append((java.lang.String) this.f126172f.f310123d);
        com.tencent.mars.xlog.Log.i("Finder.GetContactInterceptor", sb6.toString());
        c01.o8 o8Var = this.f126173g;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
        return jz5.f0.f302826a;
    }
}
