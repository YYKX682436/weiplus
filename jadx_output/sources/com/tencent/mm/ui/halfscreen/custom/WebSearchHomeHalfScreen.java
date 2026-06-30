package com.tencent.mm.ui.halfscreen.custom;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WebSearchHomeHalfScreen extends com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment {
    public final jz5.g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSearchHomeHalfScreen(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
        this.G = jz5.h.b(new ch5.n1(activityContext));
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        super.dismiss();
        android.view.View view = (android.view.View) ((jz5.n) this.G).getValue();
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(0.0f)) == null) {
            return;
        }
        alpha.setInterpolator(ta5.h.f416879a.a());
        alpha.setDuration(300L);
        alpha.start();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public bh5.l m0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        bh5.l lVar = new bh5.l(context, com.tencent.mm.R.style.f494301jd);
        android.view.Window window = lVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        return lVar;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        n3.m0.a(view, new ch5.m1(this));
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public float s0() {
        return 0.0f;
    }
}
