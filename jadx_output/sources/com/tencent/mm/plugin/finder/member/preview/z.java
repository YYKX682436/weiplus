package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class z implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f121304f;

    public z(int i17, com.tencent.mm.plugin.finder.member.preview.c0 c0Var, android.widget.TextView textView) {
        this.f121302d = i17;
        this.f121303e = c0Var;
        this.f121304f = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int lineHeight;
        android.widget.TextView textView = this.f121304f;
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121303e;
        int i17 = this.f121302d;
        if (i17 != -1) {
            android.widget.TextView textView2 = c0Var.f121182i;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("previewIntro");
                throw null;
            }
            if (textView2.getLineCount() > i17) {
                android.widget.TextView textView3 = c0Var.f121184m;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("previewIntroExpend");
                    throw null;
                }
                textView3.setVisibility(0);
                textView.setMaxLines(i17);
            } else {
                android.widget.TextView textView4 = c0Var.f121184m;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("previewIntroExpend");
                    throw null;
                }
                textView4.setVisibility(8);
            }
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.graphics.Rect rect = new android.graphics.Rect();
                textView.getLineBounds(0, rect);
                lineHeight = rect.bottom - rect.top;
            } else {
                lineHeight = textView.getLineHeight();
            }
            if (textView.getHeight() <= com.tencent.mm.plugin.finder.member.preview.c0.V6(c0Var) || lineHeight == 0) {
                android.widget.TextView textView5 = c0Var.f121184m;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("previewIntroExpend");
                    throw null;
                }
                textView5.setVisibility(8);
                textView.setMaxLines(Integer.MAX_VALUE);
            } else {
                int V6 = com.tencent.mm.plugin.finder.member.preview.c0.V6(c0Var) / lineHeight;
                if (V6 < 1) {
                    V6 = 1;
                }
                textView.setMaxLines(V6);
                android.widget.TextView textView6 = c0Var.f121184m;
                if (textView6 == null) {
                    kotlin.jvm.internal.o.o("previewIntroExpend");
                    throw null;
                }
                textView6.setVisibility(0);
            }
        }
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
