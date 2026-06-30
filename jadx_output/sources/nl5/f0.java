package nl5;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.s0 f338269d;

    public f0(nl5.s0 s0Var) {
        this.f338269d = s0Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        boolean z17 = false;
        com.tencent.mm.ui.yk.a("SelectableEditTextHelper", "init() called with: view = " + view + ", i = " + i17 + ", keyEvent = " + keyEvent, new java.lang.Object[0]);
        nl5.s0 s0Var = this.f338269d;
        s0Var.getClass();
        if (s0Var.f338375z) {
            if (keyEvent != null && keyEvent.getAction() == 1) {
                z17 = true;
            }
            if (z17) {
                switch (i17) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        s0Var.a();
                        break;
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
