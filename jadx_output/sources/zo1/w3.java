package zo1;

/* loaded from: classes.dex */
public final class w3 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f474814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474815e;

    public w3(android.view.View view, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        this.f474814d = view;
        this.f474815e = selectContactUI;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        android.view.View maskView = this.f474814d;
        kotlin.jvm.internal.o.f(maskView, "$maskView");
        sa5.d.d(maskView, 0, 0L, new zo1.v3(maskView), 3, null);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f474815e.f92850g;
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.arrow_down);
        } else {
            kotlin.jvm.internal.o.o("sortTypeIv");
            throw null;
        }
    }
}
