package vh4;

/* loaded from: classes.dex */
public class h2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f437079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f437081c;

    public h2(vh4.t1 t1Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.Context context) {
        this.f437081c = t1Var;
        this.f437079a = u3Var;
        this.f437080b = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f437079a.dismiss();
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            return null;
        }
        r45.m20 m20Var = (r45.m20) fVar.f70618d;
        boolean z17 = m20Var.f380087d;
        android.content.Context context = this.f437080b;
        if (z17) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
            intent.putExtra("intent_process", 1);
            com.tencent.mm.ui.MMWizardActivity.Y6(context, intent, (c01.e2.a0() && this.f437081c.df() == null) ? new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.BindGuardianUI.class) : new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.class));
            return null;
        }
        if (!m20Var.f380088e) {
            com.tencent.mm.ui.MMWizardActivity.Y6(context, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI.class), new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.class));
            return null;
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
        intent2.putExtra("intent_process", 3);
        android.content.Context context2 = this.f437080b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$7", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/teenmode/model/TeenModeService$7", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
