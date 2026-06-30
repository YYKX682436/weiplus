package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f191040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f191041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191043g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.ui.widget.dialog.f4 f4Var, android.content.Intent intent, com.tencent.mm.pluginsdk.ui.otherway.a0 a0Var, android.content.Context context, java.lang.String str) {
        super(0);
        this.f191040d = f4Var;
        this.f191041e = intent;
        this.f191042f = context;
        this.f191043g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        this.f191040d.dismiss();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        android.content.Intent intent = this.f191041e;
        if (intent != null) {
            java.lang.String str = this.f191043g;
            if (str == null) {
                str = "";
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            android.content.Context context = this.f191042f;
            intent.putExtra("android.intent.extra.STREAM", com.tencent.mm.sdk.platformtools.i1.a(context, r6Var));
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, context.getString(com.tencent.mm.R.string.obd));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenByOtherAppHelper$getAppList$1$1$1$onClick$1$onFinish$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/otherway/OpenByOtherAppHelper$getAppList$1$1$1$onClick$1$onFinish$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenByOtherAppHelper", "launch chooser but intent is null");
        }
        return f0Var2;
    }
}
