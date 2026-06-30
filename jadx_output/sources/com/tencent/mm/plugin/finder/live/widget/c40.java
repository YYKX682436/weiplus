package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public abstract class c40 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.s30 f117955h;

    /* renamed from: i, reason: collision with root package name */
    public final dk2.qf f117956i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f117957m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.r30 f117958n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.y0 f117959o;

    /* renamed from: p, reason: collision with root package name */
    public int f117960p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f117961q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f117962r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f117963s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.d40 params) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f117955h = params.f118053a;
        this.f117956i = params.f118054b;
        this.f117957m = params.f118055c;
        this.f117963s = true;
    }

    public abstract java.lang.String A();

    public abstract dk2.na B(r45.jt1 jt1Var);

    public abstract void C(dk2.na naVar);

    public final void D(dk2.rf micReplayInfo, t40.d galleryScene, int i17) {
        kotlin.jvm.internal.o.g(micReplayInfo, "micReplayInfo");
        kotlin.jvm.internal.o.g(galleryScene, "galleryScene");
        java.lang.String str = micReplayInfo.f234039d;
        if (str == null) {
            return;
        }
        java.lang.String A = A();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openFinderPostGallery: mediaId = ");
        sb6.append(str);
        sb6.append(",coverImageUrl = ");
        java.lang.String str2 = micReplayInfo.f234041f;
        sb6.append(str2);
        sb6.append(",micReplayUrl = ");
        java.lang.String str3 = micReplayInfo.f234040e;
        sb6.append(str3);
        sb6.append(",duration = ");
        dk2.qf qfVar = this.f117956i;
        sb6.append(qfVar.f233979p);
        sb6.append(",liveId = ");
        sb6.append(qfVar.f233970d);
        com.tencent.mars.xlog.Log.i(A, sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams finderLiveGalleryParams = new com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams();
        finderLiveGalleryParams.f66603d = 1;
        finderLiveGalleryParams.f66604e = str;
        finderLiveGalleryParams.f66605f = str2;
        finderLiveGalleryParams.f66606g = str3;
        finderLiveGalleryParams.f66607h = micReplayInfo.f234042g;
        finderLiveGalleryParams.f66608i = java.lang.String.valueOf(micReplayInfo.f234046n);
        arrayList.add(finderLiveGalleryParams);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ((ci5.h) ((s40.x0) i95.n0.c(s40.x0.class))).wi(this.f118381d, new t40.b("task_FinderCdnDownloader", 2, 0, com.tencent.mm.plugin.finder.assist.e9.f102138g, galleryScene, i17), arrayList);
    }

    public final void E(boolean z17) {
        kotlinx.coroutines.y0 y0Var = this.f117959o;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.w30(this, z17, null), 3, null);
        }
    }

    public final void F(long j17) {
        if (j17 <= 0) {
            j17 = 5000;
        }
        com.tencent.mars.xlog.Log.i(A(), "requestMicReplayStatusAfterDelay: nextPollTimeMs = " + j17);
        kotlinx.coroutines.r2 r2Var = this.f117962r;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = this.f117959o;
        this.f117962r = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.x30(j17, this, null), 3, null) : null;
    }

    public abstract void G();

    public final void H() {
        if (this.f117958n == null) {
            com.tencent.mars.xlog.Log.i(A(), "init VisitorMicReplayHeatTip");
            this.f117958n = new com.tencent.mm.plugin.finder.live.widget.r30(this.f118381d);
        }
        com.tencent.mars.xlog.Log.i(A(), "showVisitorMicReplayHeatTip");
        com.tencent.mm.plugin.finder.live.widget.r30 r30Var = this.f117958n;
        if (r30Var != null) {
            r30Var.w();
        }
    }

    public abstract void I();

    public final void J(dk2.na status) {
        kotlin.jvm.internal.o.g(status, "status");
        dk2.qf qfVar = this.f117956i;
        dk2.na naVar = qfVar.f233986w;
        qfVar.getClass();
        qfVar.f233986w = status;
        com.tencent.mars.xlog.Log.i(A(), "updateGenLayout: nextStatus = " + status + ",oldStatus = " + naVar);
        if (naVar != status || this.f117963s) {
            this.f117963s = false;
            C(status);
        }
    }

    public abstract void K();

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        this.f117956i.f233987x = false;
        kotlinx.coroutines.y0 y0Var = this.f117959o;
        if (y0Var != null) {
            kotlinx.coroutines.z0.d(y0Var, "closePanel", null, 2, null);
        }
        this.f117959o = null;
        yz5.a aVar = this.f117957m;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        com.tencent.mm.plugin.finder.live.widget.s30 s30Var;
        super.w();
        G();
        kotlinx.coroutines.y0 y0Var = this.f117959o;
        if (y0Var != null) {
            kotlinx.coroutines.z0.d(y0Var, "openPanel", null, 2, null);
        }
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f117959o = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        dk2.qf qfVar = this.f117956i;
        qfVar.f233987x = true;
        com.tencent.mm.plugin.finder.live.widget.s30 s30Var2 = com.tencent.mm.plugin.finder.live.widget.s30.f119716d;
        com.tencent.mm.plugin.finder.live.widget.s30 s30Var3 = this.f117955h;
        if (s30Var3 != s30Var2 && (s30Var3 != (s30Var = com.tencent.mm.plugin.finder.live.widget.s30.f119717e) || !qfVar.f233988y)) {
            if (s30Var3 == s30Var) {
                K();
                if (qfVar.f233986w == dk2.na.f233809h) {
                    F(10L);
                    return;
                }
                return;
            }
            return;
        }
        qfVar.f233979p = 0L;
        qfVar.f233980q = 0L;
        qfVar.f233981r = 0L;
        qfVar.f233982s = 0L;
        qfVar.f233983t = false;
        qfVar.f233984u = false;
        qfVar.f233985v = 0L;
        qfVar.G.clear();
        qfVar.f233986w = dk2.na.f233807f;
        this.f117960p = 0;
        this.f117963s = true;
        kotlinx.coroutines.y0 y0Var2 = this.f117959o;
        if (y0Var2 != null) {
            kotlinx.coroutines.l.d(y0Var2, null, null, new com.tencent.mm.plugin.finder.live.widget.a40(this, null), 3, null);
        }
    }

    public abstract int y();

    public abstract long z();
}
