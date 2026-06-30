package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class to implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.cp f133144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f133145f;

    public to(android.view.View view, com.tencent.mm.plugin.finder.view.cp cpVar, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f133143d = view;
        this.f133144e = cpVar;
        this.f133145f = mMEditText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 || !((android.widget.Button) this.f133143d.findViewById(com.tencent.mm.R.id.b2z)).isEnabled()) {
            return false;
        }
        ((com.tencent.mm.plugin.finder.view.so) this.f133144e.f131793e).d(java.lang.Integer.parseInt(this.f133145f.getText().toString()));
        return false;
    }
}
