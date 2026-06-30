package com.tencent.mm.plugin.game.ui;

/* loaded from: classes15.dex */
public class u5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f141789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f141790e;

    public u5(com.tencent.mm.plugin.game.ui.z5 z5Var, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f141789d = textView;
        this.f141790e = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f141789d;
        int lineCount = textView.getLineCount();
        android.widget.TextView textView2 = this.f141790e;
        if (lineCount <= 1) {
            textView2.setMaxLines(2);
        } else {
            textView.setMaxLines(2);
            textView2.setMaxLines(1);
        }
    }
}
