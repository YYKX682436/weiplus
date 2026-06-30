package cw1;

/* loaded from: classes12.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f222892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f222894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f222895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f222896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222897i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, android.widget.TextView textView, android.widget.Button button, android.widget.Button button2, android.widget.Button button3, android.view.View view) {
        super(0);
        this.f222892d = cleanCacheNewUI;
        this.f222893e = textView;
        this.f222894f = button;
        this.f222895g = button2;
        this.f222896h = button3;
        this.f222897i = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f222892d;
        cw1.t0 t0Var = cleanCacheNewUI.f95656d;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        java.util.Iterator it = t0Var.f223324d.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((cw1.v0) it.next()).f223362d;
        }
        cw1.t0 t0Var2 = cleanCacheNewUI.f95656d;
        if (t0Var2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        int size = t0Var2.f223324d.size();
        java.lang.String string = cleanCacheNewUI.getString(com.tencent.mm.R.string.bom, fp.n0.a(j17));
        android.widget.TextView textView = this.f222893e;
        textView.setText(string);
        textView.setVisibility(j17 > 0 ? 0 : 8);
        cw1.t0 t0Var3 = cleanCacheNewUI.f95656d;
        if (t0Var3 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        java.util.List<cw1.v0> list = t0Var3.f223324d;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (cw1.v0 v0Var : list) {
                if (!(v0Var.f223359a < -2 || v0Var.f223361c)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        this.f222894f.setEnabled(!z17);
        cw1.t0 t0Var4 = cleanCacheNewUI.f95656d;
        if (t0Var4 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        java.util.List<cw1.v0> list2 = t0Var4.f223324d;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            for (cw1.v0 v0Var2 : list2) {
                if (v0Var2.f223359a >= -2 && (v0Var2.f223361c || v0Var2.f223362d > 0)) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        this.f222895g.setEnabled(z18);
        this.f222896h.setEnabled(j17 > 0);
        android.view.View view = this.f222897i;
        int i17 = size <= 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$initUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
