package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes12.dex */
public final /* synthetic */ class MMFilterDialog$$d implements com.tencent.mm.ui.widget.dialog.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.MMFilterDialog f211707a;

    public /* synthetic */ MMFilterDialog$$d(com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog) {
        this.f211707a = mMFilterDialog;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w2
    public final void a(com.tencent.mm.ui.widget.dialog.p2 p2Var) {
        com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog = this.f211707a;
        int indexOf = ((java.util.ArrayList) mMFilterDialog.f211701q).indexOf(p2Var);
        if (indexOf >= 0) {
            mMFilterDialog.f211697m.notifyItemChanged(indexOf, new android.util.Pair(com.tencent.mm.ui.widget.dialog.t2.UpdateTitle, p2Var.f211946b));
        }
    }
}
