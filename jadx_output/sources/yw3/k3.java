package yw3;

/* loaded from: classes5.dex */
public final class k3 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f466785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI f466786e;

    public k3(android.view.View view, com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI) {
        this.f466785d = view;
        this.f466786e = repairerKeyboardObserverDemoUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        e3.d a17;
        android.view.View view = this.f466785d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI.i;
        android.view.View contentView = this.f466786e.getContentView();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a18 = n3.b1.a(contentView);
        view.setPadding(0, 0, 0, (a18 == null || (a17 = a18.a(2)) == null) ? 0 : a17.f247047d);
        return true;
    }
}
