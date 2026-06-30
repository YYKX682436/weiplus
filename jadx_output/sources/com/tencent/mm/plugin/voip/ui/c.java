package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes5.dex */
public final class c implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.d f176940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f176941e;

    public c(com.tencent.mm.plugin.voip.ui.d dVar, int i17) {
        this.f176940d = dVar;
        this.f176941e = i17;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5 && i17 != 6) {
            return false;
        }
        this.f176940d.f176945e.invoke(java.lang.Integer.valueOf(this.f176941e), java.lang.Integer.valueOf(uk.n.a(textView.getText().toString(), 0)));
        return true;
    }
}
