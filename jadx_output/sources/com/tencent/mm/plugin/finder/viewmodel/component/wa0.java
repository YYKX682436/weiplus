package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes4.dex */
public final class wa0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f136329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ya0 f136330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136331f;

    public wa0(long j17, com.tencent.mm.plugin.finder.viewmodel.component.ya0 ya0Var, java.lang.String str) {
        this.f136329d = j17;
        this.f136330e = ya0Var;
        this.f136331f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        long j17 = this.f136329d;
        com.tencent.mm.plugin.finder.viewmodel.component.ya0 ya0Var = this.f136330e;
        if (j17 > 0 && (textView = ya0Var.f136544d) != null) {
            textView.postDelayed(ya0Var.f136545e, j17);
        }
        ya0Var.R6(true);
        com.tencent.mars.xlog.Log.i("FinderWifiHintUIC", "[showHint] hint:" + this.f136331f);
    }
}
