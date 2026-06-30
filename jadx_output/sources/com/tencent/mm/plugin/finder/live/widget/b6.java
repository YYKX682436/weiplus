package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b6 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f117835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.u24 f117836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f117837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f117838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f117839e;

    public b6(com.tencent.mm.plugin.finder.live.widget.d6 d6Var, r45.u24 u24Var, r45.xq1 xq1Var, int i17, java.lang.Integer num) {
        this.f117835a = d6Var;
        this.f117836b = u24Var;
        this.f117837c = xq1Var;
        this.f117838d = i17;
        this.f117839e = num;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.j0.Oj((ml2.j0) c17, ml2.i3.f327557h, 0, new ml2.i0(i17, i18, str), 2, null);
        com.tencent.mars.xlog.Log.i(this.f117835a.f118062d, "onFail " + i17 + ' ' + i18 + ' ' + str);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.a6(this.f117835a, this.f117836b, this.f117837c, this.f117838d, this.f117839e));
    }
}
