package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes4.dex */
public final class nf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.tf f174135d;

    public nf(com.tencent.mm.plugin.textstatus.ui.tf tfVar) {
        this.f174135d = tfVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        androidx.appcompat.app.AppCompatActivity activity = this.f174135d.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity == null) {
            return true;
        }
        mMActivity.onBackPressed();
        return true;
    }
}
