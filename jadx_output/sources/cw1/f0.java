package cw1;

/* loaded from: classes3.dex */
public final class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f222929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222931g;

    public f0(android.widget.TextView textView, com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, android.widget.TextView textView2, android.view.View view) {
        this.f222928d = textView;
        this.f222929e = cleanAllMessagesUI;
        this.f222930f = textView2;
        this.f222931g = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f222929e;
        this.f222928d.setText(cleanAllMessagesUI.getString(com.tencent.mm.R.string.b8h));
        this.f222930f.setText("");
        android.view.View view = this.f222931g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$3$bs$1$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$3$bs$1$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = cleanAllMessagesUI.f95647d;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        cleanAllMessagesUI.f95647d = null;
    }
}
