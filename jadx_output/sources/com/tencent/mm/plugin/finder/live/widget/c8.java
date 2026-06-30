package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c8 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i8 f117974d;

    public c8(com.tencent.mm.plugin.finder.live.widget.i8 i8Var) {
        this.f117974d = i8Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.i8 i8Var = this.f117974d;
        i8Var.h0(i8Var.f118649J);
        return false;
    }
}
