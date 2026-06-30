package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class j0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175438d;

    public j0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175438d = v0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 && 66 != keyEvent.getAction()) {
            return false;
        }
        com.tencent.mm.plugin.transvoice.ui.v0.E(this.f175438d);
        return true;
    }
}
