package ll3;

/* loaded from: classes4.dex */
public final class b2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f319142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f319143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f319144c;

    public b2(android.content.Context context, android.content.Intent intent, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f319142a = context;
        this.f319143b = intent;
        this.f319144c = a5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = this.f319144c;
        try {
            android.content.Context context = this.f319142a;
            android.content.Intent intent = this.f319143b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/music/model/MusicUIUtil$doJumpToQQMusicPayment$4", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/music/model/MusicUIUtil$doJumpToQQMusicPayment$4", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (a5Var != null) {
                a5Var.a(true, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MusicUIUtil", e17, "launchQQMusic exception", new java.lang.Object[0]);
            if (a5Var != null) {
                a5Var.a(false, false);
            }
        }
    }
}
