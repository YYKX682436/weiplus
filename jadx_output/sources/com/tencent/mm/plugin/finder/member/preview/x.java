package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class x implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121296a;

    public x(com.tencent.mm.plugin.finder.member.preview.c0 c0Var) {
        this.f121296a = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        float f17;
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121296a;
        android.view.ViewGroup viewGroup = c0Var.f121178e;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("previewContainer");
            throw null;
        }
        float scrollY = viewGroup.getScrollY();
        androidx.appcompat.app.AppCompatActivity activity = c0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.member.preview.b bVar = (com.tencent.mm.plugin.finder.member.preview.b) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.member.preview.b.class);
        bVar.getClass();
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(scrollY) * 1.0f) / bVar.f255579q);
        if (min < 0.5f) {
            f17 = (0.5f - min) / 0.5f;
            android.view.View view = bVar.f255572g;
            if (view != null) {
                view.setBackgroundColor(bVar.f255577o);
            }
            android.widget.FrameLayout frameLayout = bVar.f255575m;
            if (frameLayout != null) {
                frameLayout.setAlpha(0.0f);
            }
            bVar.V6(min, f17);
        } else {
            f17 = (min - 0.5f) / 0.5f;
            int i17 = (int) (255 * f17);
            android.view.View view2 = bVar.f255572g;
            if (view2 != null) {
                view2.setBackgroundColor(com.tencent.mm.ui.uk.a(bVar.f255578p, i17));
            }
            android.widget.FrameLayout frameLayout2 = bVar.f255575m;
            if (frameLayout2 != null) {
                frameLayout2.setAlpha(f17);
            }
            bVar.V6(min, f17);
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "alpha : " + f17);
    }
}
