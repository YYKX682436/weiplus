package cw1;

/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f223509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f223512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f223513h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223514i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(cw1.o0 o0Var, android.widget.TextView textView, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI, android.widget.Button button, android.widget.Button button2, android.view.View view) {
        super(0);
        this.f223509d = o0Var;
        this.f223510e = textView;
        this.f223511f = cleanCacheUI;
        this.f223512g = button;
        this.f223513h = button2;
        this.f223514i = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        cw1.o0 o0Var = this.f223509d;
        long f17 = o0Var.f();
        java.lang.String string = this.f223511f.getString(com.tencent.mm.R.string.bom, fp.n0.a(f17));
        android.widget.TextView textView = this.f223510e;
        textView.setText(string);
        boolean[] zArr = o0Var.f223188f;
        int length = zArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = true;
                break;
            }
            if (!zArr[i17]) {
                z17 = false;
                break;
            }
            i17++;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        android.widget.Button button = this.f223512g;
        button.setTag(valueOf);
        button.setText(z17 ? com.tencent.mm.R.string.aq8 : com.tencent.mm.R.string.f489994hu);
        this.f223513h.setEnabled(f17 > 0);
        textView.setVisibility(f17 > 0 ? 0 : 8);
        android.view.View view = this.f223514i;
        int i18 = o0Var.getGroupCount() <= 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$1", "invoke", "()Ljava/lang/Boolean;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$1", "invoke", "()Ljava/lang/Boolean;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        button.setEnabled(o0Var.getGroupCount() > 0);
        return java.lang.Boolean.TRUE;
    }
}
