package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class t2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.v2 f125855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mu2 f125856e;

    public t2(com.tencent.mm.plugin.finder.search.v2 v2Var, r45.mu2 mu2Var) {
        this.f125855d = v2Var;
        this.f125856e = mu2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.finder.search.v2 v2Var = this.f125855d;
        v2Var.f125931m.getViewTreeObserver().removeOnPreDrawListener(this);
        java.lang.Object parent = v2Var.f125931m.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((android.view.View) parent).getWidth();
        int width2 = v2Var.f125938t.getVisibility() == 0 ? v2Var.f125938t.getWidth() + ((int) v2Var.f125938t.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl)) + 0 : 0;
        if (v2Var.f125937s.getVisibility() == 0) {
            width2 += v2Var.f125937s.getWidth() + ((int) v2Var.f125937s.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
        }
        android.text.TextPaint paint = v2Var.f125931m.getPaint();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.f125856e.getCustom(0);
        float measureText = paint.measureText(finderContact != null ? ya2.d.h(finderContact, null, false, 3, null).w0() : "");
        if (width2 + measureText > width) {
            android.widget.TextView textView = v2Var.f125931m;
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = (width - width2) - 1;
            textView.setLayoutParams(layoutParams);
            com.tencent.mars.xlog.Log.i(v2Var.f125928g, "adjustTitleTvSize titleW:" + v2Var.f125931m.getLayoutParams().width + ", containerW:" + width + ",iconW:" + width2);
        } else {
            android.widget.TextView textView2 = v2Var.f125931m;
            android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            layoutParams2.width = (int) measureText;
            textView2.setLayoutParams(layoutParams2);
            com.tencent.mars.xlog.Log.i(v2Var.f125928g, "adjustTitleTvSize titleW:" + v2Var.f125931m.getLayoutParams().width + ", titleMaxWidth:" + measureText);
        }
        return true;
    }
}
