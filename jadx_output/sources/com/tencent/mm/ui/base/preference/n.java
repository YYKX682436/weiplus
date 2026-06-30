package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.EditPreference f197844d;

    public n(com.tencent.mm.ui.base.preference.EditPreference editPreference) {
        this.f197844d = editPreference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f197844d.N;
        if (j0Var != null) {
            j0Var.dismiss();
        }
    }
}
