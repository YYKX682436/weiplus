package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class fd implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment f173879d;

    public fd(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f173879d = textStatusLikeListFragment;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f173879d.f173651v = -1;
    }
}
