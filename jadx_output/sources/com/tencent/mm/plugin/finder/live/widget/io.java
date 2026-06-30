package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class io extends com.tencent.mm.ui.widget.dialog.y1 {
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.h2 f118690J;
    public com.tencent.mm.ui.widget.dialog.h2 K;

    public io(android.content.Context context) {
        super(context);
        com.tencent.mm.plugin.finder.live.widget.go goVar = new com.tencent.mm.plugin.finder.live.widget.go(this);
        this.f118690J = goVar;
        o(goVar);
        this.I = false;
    }

    @Override // com.tencent.mm.ui.widget.dialog.y1
    public void o(com.tencent.mm.ui.widget.dialog.h2 h2Var) {
        if (kotlin.jvm.internal.o.b(h2Var, this.f118690J)) {
            this.f212037s = h2Var;
        } else {
            this.K = h2Var;
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.y1
    public void s() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.s();
        com.tencent.mars.xlog.Log.i("FinderLiveMMCustomHalfBottomDialog", "start openPanel");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        android.view.View view = this.f212027f;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.live.widget.ho(this));
    }

    public io(android.content.Context context, int i17, boolean z17, boolean z18) {
        super(context, i17, z17, z18);
        com.tencent.mm.plugin.finder.live.widget.go goVar = new com.tencent.mm.plugin.finder.live.widget.go(this);
        this.f118690J = goVar;
        o(goVar);
        this.I = z18;
    }
}
