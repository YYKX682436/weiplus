package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class q3 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f129719d;

    public q3(android.widget.EditText editText) {
        this.f129719d = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (5 != i17) {
            return false;
        }
        this.f129719d.clearFocus();
        return false;
    }
}
