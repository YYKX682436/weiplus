package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f114809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f114811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, int i17, boolean z17) {
        super(0);
        this.f114809d = dqVar;
        this.f114810e = i17;
        this.f114811f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int intValue;
        byte[] bArr;
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        android.view.View view;
        com.tencent.mm.plugin.finder.live.util.t tVar;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "showGiftSendAgainLayout networkEnable:" + this.f114809d.V + " batchCount:" + this.f114810e + " showSendBtn: " + this.f114811f);
        if (this.f114809d.V) {
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f114809d;
            if (dqVar.N == null) {
                dqVar.N = new com.tencent.mm.plugin.finder.live.util.t();
            }
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar2 = this.f114809d;
            dqVar2.f112332x0 = new com.tencent.mm.plugin.finder.live.plugin.mo0(dqVar2);
            com.tencent.mm.plugin.finder.live.util.t tVar2 = this.f114809d.N;
            if (tVar2 != null && (view = tVar2.f115692n) != null) {
                com.tencent.mm.plugin.finder.live.plugin.dq dqVar3 = this.f114809d;
                android.view.View t17 = com.tencent.mm.plugin.finder.live.plugin.dq.t1(dqVar3);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "register view in continuousClickManager:" + view + " is not targetView:" + t17);
                if (!kotlin.jvm.internal.o.b(view, t17) && (tVar = dqVar3.N) != null) {
                    tVar.d(view);
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar4 = this.f114809d;
            com.tencent.mm.plugin.finder.live.util.t tVar3 = dqVar4.N;
            if (tVar3 != null) {
                android.view.View t18 = com.tencent.mm.plugin.finder.live.plugin.dq.t1(dqVar4);
                com.tencent.mm.plugin.finder.live.util.m mVar = this.f114809d.L;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f114810e);
                boolean z17 = this.f114810e > 1;
                tVar3.f115692n = t18;
                tVar3.f115689k = z17;
                if (t18 != null) {
                    t18.setOnTouchListener(tVar3.f115694p);
                }
                tVar3.f115690l = mVar;
                com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "initialValue:" + valueOf);
                if (valueOf != null && (intValue = valueOf.intValue()) > 0) {
                    tVar3.f115685g = intValue;
                    tVar3.f115686h = 0;
                    tVar3.f115683e = intValue > 1 ? com.tencent.mm.plugin.finder.live.util.n.f115633f : com.tencent.mm.plugin.finder.live.util.n.f115632e;
                    com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                    tVar3.f115684f = new dk2.g((k0Var == null || (e1Var = (mm2.e1) k0Var.business(mm2.e1.class)) == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0));
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    dk2.g gVar = tVar3.f115684f;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.String r17 = c01.z1.r();
                    if (r17 != null) {
                        bArr = r17.getBytes(r26.c.f368865a);
                        kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
                    } else {
                        bArr = null;
                    }
                    sb6.append(kk.k.g(bArr));
                    sb6.append('_');
                    sb6.append(java.util.UUID.randomUUID());
                    java.lang.String sb7 = sb6.toString();
                    gVar.getClass();
                    kotlin.jvm.internal.o.g(sb7, "<set-?>");
                    gVar.f233467b = sb7;
                    com.tencent.mm.plugin.finder.live.util.r2 r2Var = tVar3.f115693o;
                    synchronized (r2Var.f115668a) {
                        r2Var.f115668a.clear();
                    }
                    tVar3.f115693o.c(tVar3.f115684f, intValue);
                    tVar3.f115687i = java.lang.System.currentTimeMillis();
                    com.tencent.mm.sdk.platformtools.b4 b4Var = tVar3.f115696r;
                    long j17 = tVar3.f115680b;
                    b4Var.c(j17, j17);
                    tVar3.f115691m = mVar != null ? ((com.tencent.mm.plugin.finder.live.plugin.ep) mVar).d(tVar3.f115692n, valueOf.intValue(), tVar3.f115683e, tVar3.f115684f, valueOf.intValue(), z17) : true;
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("isCurrentSingleClickEnable:");
            com.tencent.mm.plugin.finder.live.util.t tVar4 = this.f114809d.N;
            sb8.append(tVar4 != null ? java.lang.Boolean.valueOf(tVar4.f115691m) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", sb8.toString());
            if (this.f114811f) {
                com.tencent.mm.plugin.finder.live.plugin.dq dqVar5 = this.f114809d;
                com.tencent.mm.plugin.finder.live.util.t tVar5 = dqVar5.N;
                if (tVar5 != null && tVar5.f115691m) {
                    dqVar5.K0(0);
                    this.f114809d.M.d();
                    ((je2.t) this.f114809d.P0(je2.t.class)).f299269o.postValue(new jz5.l(java.lang.Boolean.TRUE, this.f114809d.f112323p1));
                }
            }
            this.f114809d.K0(8);
            ((je2.t) this.f114809d.P0(je2.t.class)).f299269o.postValue(new jz5.l(java.lang.Boolean.TRUE, this.f114809d.f112323p1));
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "showGiftSendAgainLayout networkEnable:" + this.f114809d.V);
        }
        return jz5.f0.f302826a;
    }
}
