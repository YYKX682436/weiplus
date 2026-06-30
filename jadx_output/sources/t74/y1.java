package t74;

/* loaded from: classes4.dex */
public final class y1 extends dc4.v implements i64.k0 {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f416305p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f416306q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f416307r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.Activity f416308s;

    /* renamed from: t, reason: collision with root package name */
    public final int f416309t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f416310u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f416311v;

    /* renamed from: w, reason: collision with root package name */
    public final t74.d2 f416312w;

    /* renamed from: x, reason: collision with root package name */
    public int f416313x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Handler f416314y;

    public y1(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17) {
        kotlin.jvm.internal.o.g(mActivity, "mActivity");
        this.f416305p = snsInfo;
        this.f416306q = iVar;
        this.f416307r = b1Var;
        this.f416308s = mActivity;
        this.f416309t = i17;
        this.f416312w = new t74.d2();
        this.f416314y = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        com.tencent.mars.xlog.Log.i("AdFlipCardDetailItem", "initView, snsId is " + ca4.z0.y0(this.f416305p));
        if (view == null || view2 == null || this.f416307r == null) {
            com.tencent.mars.xlog.Log.e("AdFlipCardDetailItem", "initView, params error");
        }
        this.f228833f = view;
        this.f228834g = view2;
        this.f416310u = view != null ? (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f485014tx1) : null;
        this.f416311v = view != null ? (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f485015tx2) : null;
        this.f416313x = ca4.m0.y("AdFlipCardDetailItem", this.f416308s, this.f416309t, this.f228839o);
        t74.b2 b2Var = new t74.b2(this.f416310u, this.f416311v, this.f228836i, this.f416313x, this.f228839o, this.f416307r, new w64.n(this.f416308s, this.f416309t, this.f416307r, null, null), this.f416306q, this.f416308s, this.f416309t);
        t74.d2 d2Var = this.f416312w;
        d2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        d2Var.f416124a = b2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        d2Var.b(this.f416313x);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        com.tencent.mars.xlog.Log.i("AdFlipCardDetailItem", "onAdRemoved, snsId is " + str);
        this.f416312w.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // dc4.v
    public void e(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        super.e(configuration);
        com.tencent.mars.xlog.Log.i("AdFlipCardDetailItem", "onConfigurationChanged");
        t74.d2 d2Var = this.f416312w;
        d2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = d2Var.f416125b;
        if (w1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            kotlinx.coroutines.y0 h17 = w1Var.h();
            if (h17 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(w1Var.A0), null, new t74.a(w1Var, null), 2, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        super.g();
        com.tencent.mars.xlog.Log.i("AdFlipCardDetailItem", "onPause");
        this.f416312w.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // dc4.v
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        super.i();
        com.tencent.mars.xlog.Log.i("AdFlipCardDetailItem", "onUIDestroy");
        this.f416314y.removeCallbacksAndMessages(null);
        this.f416312w.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f416305p;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdFlipCardDetailItem", "refreshView, snsId is " + ca4.z0.y0(snsInfo));
        this.f416312w.a(this.f416308s, snsInfo);
        android.os.Handler handler = this.f416314y;
        handler.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        java.lang.String T = ca4.z0.T(snsInfo);
        if (!android.text.TextUtils.isEmpty(T) && !kotlin.jvm.internal.o.b("0", T) && (b1Var = this.f416307r) != null) {
            b1Var.a(T, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        handler.postDelayed(new t74.x1(this, snsInfo), 600L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }
}
