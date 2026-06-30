package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class j implements com.tencent.mm.pluginsdk.ui.span.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f152651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at4.p0 f152652b;

    public j(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, android.view.View.OnClickListener onClickListener, at4.p0 p0Var) {
        this.f152651a = onClickListener;
        this.f152652b = p0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z
    public java.lang.Object a(r35.m3 m3Var) {
        if (m3Var != null && m3Var.e().trim().startsWith("weixin://wcpay/fqf/opentinyapp")) {
            this.f152651a.onClick(null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18930, java.lang.Integer.valueOf(this.f152652b.f13918a), 3);
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z
    public java.lang.Object b(r35.m3 m3Var) {
        return null;
    }
}
