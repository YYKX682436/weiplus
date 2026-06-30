package ex3;

/* loaded from: classes.dex */
public final class a implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f257205a;

    public a(android.app.Activity activity) {
        this.f257205a = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent addFlags = new android.content.Intent().setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI").putExtra("absolutely_exit", true).addFlags(67108864);
            kotlin.jvm.internal.o.f(addFlags, "addFlags(...)");
            android.app.Activity activity = this.f257205a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(addFlags);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/repairer/ui/model/RepairerInnerLogic$checkNeedRestart$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/model/RepairerInnerLogic$checkNeedRestart$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
