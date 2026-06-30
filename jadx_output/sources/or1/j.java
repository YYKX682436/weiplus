package or1;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI f347508d;

    public j(com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI bizSearchDetailPageUI) {
        this.f347508d = bizSearchDetailPageUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/BizSearchDetailPageUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI bizSearchDetailPageUI = this.f347508d;
        com.tencent.mm.ui.tools.c9 c9Var = bizSearchDetailPageUI.f93973d;
        if (c9Var != null) {
            c9Var.a();
        }
        bizSearchDetailPageUI.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/brandservice/ui/BizSearchDetailPageUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
