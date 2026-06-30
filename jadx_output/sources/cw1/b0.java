package cw1;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f222799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222800h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222801i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ cw1.k0 f222802m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.view.View view, android.view.View view2, android.view.View view3, com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, android.widget.TextView textView, android.view.View view4, cw1.k0 k0Var) {
        super(0);
        this.f222796d = view;
        this.f222797e = view2;
        this.f222798f = view3;
        this.f222799g = cleanAllMessagesUI;
        this.f222800h = textView;
        this.f222801i = view4;
        this.f222802m = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f222796d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$2$realClean$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$2$realClean$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f222797e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$2$realClean$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$2$realClean$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f222798f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$2$realClean$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$2$realClean$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f222799g.setBackBtnVisible(false);
        this.f222799g.setBackBtn(cw1.z.f223528d);
        this.f222799g.addOnBackPressListener(cw1.a0.f222713a);
        this.f222800h.setText(this.f222799g.getString(com.tencent.mm.R.string.a_y, 0));
        android.view.View view4 = this.f222801i;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$2$realClean$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$2$realClean$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f222799g;
        cw1.k0 k0Var = this.f222802m;
        cleanAllMessagesUI.getClass();
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = new com.tencent.wcdb.support.CancellationSignal();
        cleanAllMessagesUI.f95647d = cancellationSignal;
        ((ku5.t0) ku5.t0.f312615d).a(new cw1.n(cancellationSignal, k0Var, cleanAllMessagesUI));
        return jz5.f0.f302826a;
    }
}
