package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes4.dex */
public class p implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f155550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f155551b;

    public p(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar, q80.d0 d0Var, android.content.Context context) {
        this.f155550a = d0Var;
        this.f155551b = context;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.OtherViewWrapper", "openLiteApp fail %s.", this.f155550a.f360649a);
        db5.t7.makeText(this.f155551b, com.tencent.mm.R.string.ggb, 0).show();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OtherViewWrapper", "openLiteApp success %s.", this.f155550a.f360649a);
    }
}
