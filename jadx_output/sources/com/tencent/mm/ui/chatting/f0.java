package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.d1 f200482d;

    public f0(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI, db5.d1 d1Var) {
        this.f200482d = d1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        db5.d1 d1Var = this.f200482d;
        if (d1Var != null) {
            d1Var.a(i17, menuItem.getItemId());
        }
    }
}
