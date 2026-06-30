package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class hc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI f173960d;

    public hc(com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI textStatusHistoryUI) {
        this.f173960d = textStatusHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        androidx.fragment.app.FragmentActivity activity = this.f173960d.getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }
}
