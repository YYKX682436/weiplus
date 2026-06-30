package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f176780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f176781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f176782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f176783g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f176784h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176785i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.h2 f176786m;

    public p2(com.tencent.mm.plugin.voip.model.h2 h2Var, long j17, android.content.Context context, android.content.Intent intent, int i17, boolean z17, java.lang.String str) {
        this.f176786m = h2Var;
        this.f176780d = j17;
        this.f176781e = context;
        this.f176782f = intent;
        this.f176783g = i17;
        this.f176784h = z17;
        this.f176785i = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        mg0.a wi6 = ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).wi(java.lang.String.valueOf(this.f176780d));
        if (wi6 != null) {
            wi6.a();
        }
        jq4.c1 c1Var = this.f176786m.f176581x;
        long j17 = this.f176780d;
        int i17 = this.f176783g;
        boolean z17 = this.f176784h;
        c1Var.getClass();
        android.content.Context context = this.f176781e;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = this.f176782f;
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String toUser = this.f176785i;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        jq4.y.y(c1Var, context, intent, j17, i17, z17, toUser, false, 0, 192, null);
    }
}
