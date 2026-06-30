package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class b0 implements com.tencent.mm.pluginsdk.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f190928c;

    public b0(int i17, java.lang.String str, android.content.Intent intent) {
        this.f190926a = i17;
        this.f190927b = str;
        this.f190928c = intent;
    }

    @Override // com.tencent.mm.pluginsdk.model.n0
    public void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        jz5.f0 f0Var = null;
        java.lang.String str = null;
        if (!kz5.c0.i(3, 4, 2, 1).contains(java.lang.Integer.valueOf(this.f190926a))) {
            android.content.Intent intent = this.f190928c;
            if (intent != null) {
                android.content.Intent createChooser = android.content.Intent.createChooser(intent, context.getString(com.tencent.mm.R.string.obd));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(createChooser);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenByOtherAppHelper$getAppList$1$1$1", "onClick", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/otherway/OpenByOtherAppHelper$getAppList$1$1$1", "onClick", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenByOtherAppHelper", "launch chooser but intent is null");
                return;
            }
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211780g = 2;
        e4Var.f211778e = false;
        com.tencent.mm.ui.widget.dialog.f4 c17 = e4Var.c();
        int i18 = this.f190926a;
        if (i18 == 1) {
            str = "jpg";
        } else if (i18 == 2) {
            str = "mp4";
        }
        zb0.f0 f0Var2 = (zb0.f0) i95.n0.c(zb0.f0.class);
        java.lang.String str2 = this.f190927b;
        ac0.a aVar = new ac0.a(str2, str);
        com.tencent.mm.pluginsdk.ui.otherway.a0 a0Var = new com.tencent.mm.pluginsdk.ui.otherway.a0(c17, this.f190928c, context);
        yb0.f0 f0Var3 = (yb0.f0) f0Var2;
        f0Var3.getClass();
        if (!(str2 == null || str2.length() == 0) && com.tencent.mm.vfs.w6.j(str2)) {
            ((ku5.t0) ku5.t0.f312615d).g(new yb0.e0(aVar, f0Var3, a0Var));
            return;
        }
        com.tencent.mars.xlog.Log.e(f0Var3.f460629d, "getShareFilePath invalid params: " + str2);
        a0Var.a(-1, "");
    }
}
