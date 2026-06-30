package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class x3 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f133314d;

    public x3(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f133314d = finderCollapsibleTextView;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f133314d.getContentTextView().setBackgroundResource(com.tencent.mm.R.color.a9e);
    }
}
