package cw1;

/* loaded from: classes3.dex */
public final class d7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI f222877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222879g;

    public d7(android.widget.TextView textView, com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI, android.widget.TextView textView2, android.view.View view) {
        this.f222876d = textView;
        this.f222877e = cleanOtherAccountUI;
        this.f222878f = textView2;
        this.f222879g = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI = this.f222877e;
        this.f222876d.setText(cleanOtherAccountUI.getString(com.tencent.mm.R.string.b8h));
        this.f222878f.setText("");
        android.view.View view = this.f222879g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$3$bs$1$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$3$bs$1$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = cleanOtherAccountUI.f95797g;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        cleanOtherAccountUI.f95797g = null;
    }
}
