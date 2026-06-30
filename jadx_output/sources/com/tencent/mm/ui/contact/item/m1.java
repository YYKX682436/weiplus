package com.tencent.mm.ui.contact.item;

/* loaded from: classes.dex */
public final class m1 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.q1 f206895d;

    public m1(com.tencent.mm.ui.contact.item.q1 q1Var) {
        this.f206895d = q1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f206895d.F = null;
    }
}
