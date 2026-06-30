package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Notification f149883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f149884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.v0 f149885f;

    public b1(com.tencent.mm.plugin.multitalk.model.v0 v0Var, android.app.Notification notification, boolean z17) {
        this.f149885f = v0Var;
        this.f149883d = notification;
        this.f149884e = z17;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f149885f;
        v0Var.f150186y1 = true;
        android.content.Intent intent = new android.content.Intent();
        if (v0Var.f150169n) {
            intent.putExtra("enterMainUIScreenProjectOnline", true);
            intent.putExtra("enterMainUIScreenProjectParams", v0Var.f150170o);
        }
        intent.setFlags(268435456);
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = v0Var.f150177t;
        intent.putExtra("enterMainUiWxGroupId", multiTalkGroup != null ? multiTalkGroup.f71608f : "");
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.class);
        intent.putExtra("notification", this.f149883d);
        intent.putExtra("enterMainUiSource", 1);
        sj3.d4 Zi = com.tencent.mm.plugin.multitalk.model.e3.Zi();
        com.tencent.mm.plugin.multitalk.model.a1 a1Var = new com.tencent.mm.plugin.multitalk.model.a1(this);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().getClass();
        boolean z17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q.size() > com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q.contains(c01.z1.r());
        Zi.getClass();
        Zi.f408477f = intent;
        Zi.f408476e = a1Var;
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            a1Var.d();
            Zi.f(intent, z17);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkSmallWindow", "mini, permission denied");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        java.lang.String string = context.getString(com.tencent.mm.R.string.kbt);
        sj3.c4 c4Var = new sj3.c4(a1Var, Zi, intent, z17);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.R6(context, 9, string, c4Var, true, false, a17);
    }
}
