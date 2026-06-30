package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class g0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f148383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 f148384b;

    public g0(com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 mallIndexBaseUIv2, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f148384b = mallIndexBaseUIv2;
        this.f148383a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "btn click, hide dialog");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14419, this.f148384b.f148259i, 8);
        this.f148383a.B();
    }
}
