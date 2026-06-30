package lx;

/* loaded from: classes.dex */
public final class f2 implements rv.i3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx.i2 f321755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321756c;

    public f2(android.content.Context context, lx.i2 i2Var, yz5.l lVar) {
        this.f321754a = context;
        this.f321755b = i2Var;
        this.f321756c = lVar;
    }

    @Override // rv.i3
    public final void a(android.content.Intent intent) {
        if (intent == null) {
            lx.i2.a(this.f321755b);
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "editTextCover: failed to create intent");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f321756c.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Failed to create text cover editor intent")))));
            return;
        }
        android.content.Context context = this.f321754a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizMediaPlugin$editTextCover$2", "onResult", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizMediaPlugin$editTextCover$2", "onResult", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
