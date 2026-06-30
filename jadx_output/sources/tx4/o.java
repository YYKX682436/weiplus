package tx4;

/* loaded from: classes.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx4.p f422705d;

    public o(tx4.p pVar) {
        this.f422705d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/game/menu/GameSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tx4.p pVar = this.f422705d;
        if (pVar.isShowing()) {
            pVar.cancel();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/game/menu/GameSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
