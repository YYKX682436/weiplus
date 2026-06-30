package cw1;

/* loaded from: classes3.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f222981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f222985h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222986i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222987m;

    public i0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, android.view.View view, android.view.View view2, android.view.View view3, boolean z17, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f222981d = cleanAllMessagesUI;
        this.f222982e = view;
        this.f222983f = view2;
        this.f222984g = view3;
        this.f222985h = z17;
        this.f222986i = textView;
        this.f222987m = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f222981d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = cleanAllMessagesUI.f95648e;
        if (k0Var != null) {
            k0Var.u();
        }
        cleanAllMessagesUI.f95648e = null;
        android.view.View view = this.f222982e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f222983f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f222984g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = this.f222985h;
        android.widget.TextView textView = this.f222987m;
        android.widget.TextView textView2 = this.f222986i;
        if (z17) {
            textView2.setText(cleanAllMessagesUI.getString(com.tencent.mm.R.string.b8k));
            textView.setVisibility(0);
        } else {
            textView2.setText(cleanAllMessagesUI.getString(com.tencent.mm.R.string.a_l));
            textView.setVisibility(8);
        }
        cleanAllMessagesUI.setResult(-1);
    }
}
