package ol1;

/* loaded from: classes7.dex */
public class m implements ol1.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f346134d;

    /* renamed from: e, reason: collision with root package name */
    public int f346135e;

    public m(android.content.Context context) {
        this.f346134d = new ol1.l(this, context);
    }

    @Override // ol1.o
    public android.view.View getPanelView() {
        return this.f346134d;
    }

    @Override // ol1.o
    public boolean l() {
        return false;
    }

    @Override // ol1.o
    public boolean n(int i17) {
        if (i17 <= 0 || this.f346135e == i17) {
            return false;
        }
        this.f346135e = i17;
        return true;
    }

    @Override // ol1.o
    public void o() {
        android.view.View view = this.f346134d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ol1.o
    public void onDestroy() {
    }

    @Override // ol1.o
    public void onPause() {
    }

    @Override // ol1.o
    public void onResume() {
    }

    @Override // ol1.o
    public void p(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        return true;
    }

    @Override // ol1.o
    public void r(boolean z17) {
    }

    @Override // ol1.o
    public void s(boolean z17) {
        android.view.View view = this.f346134d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "hideContentView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "hideContentView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ol1.o
    public void setOnEmoticonOperationListener(ol1.t tVar) {
    }

    @Override // ol1.o
    public void setOnTextOperationListener(ol1.u uVar) {
    }

    @Override // ol1.o
    public boolean t() {
        return this.f346134d.isInLayout();
    }
}
