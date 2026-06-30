package nf2;

/* loaded from: classes10.dex */
public final class g implements of2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f336737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336738b;

    public g(int i17, nf2.w wVar) {
        this.f336737a = i17;
        this.f336738b = wVar;
    }

    public void a(nf2.a componentLayoutMode, nf2.l1 colorStyle) {
        nf2.k1 k1Var;
        kotlin.jvm.internal.o.g(componentLayoutMode, "componentLayoutMode");
        kotlin.jvm.internal.o.g(colorStyle, "colorStyle");
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsController", "onStylePreview: layout=" + componentLayoutMode + ", color=" + colorStyle);
        nf2.d1 d1Var = this.f336738b.f336808m;
        if (d1Var == null || !d1Var.f336703x) {
            return;
        }
        nf2.f1 f1Var = d1Var.f336682c;
        int ordinal = componentLayoutMode.ordinal();
        if (ordinal == 0) {
            k1Var = nf2.k1.f336767d;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            k1Var = nf2.k1.f336768e;
        }
        boolean z17 = true;
        nf2.f1 a17 = nf2.f1.a(f1Var, 0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, componentLayoutMode, k1Var, null, 0L, colorStyle, 106495, null);
        if (d1Var.f336682c.f336732n == componentLayoutMode) {
            z17 = false;
        }
        d1Var.D = new jz5.l(java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(d1Var.A));
        d1Var.j(a17);
        if (!z17) {
            d1Var.l(0.5f, d1Var.A);
        }
        android.view.View view = d1Var.f336688i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "applyPreviewStyle", "(Lcom/tencent/mm/plugin/finder/live/controller/lyrics/ComponentLayoutMode;Lcom/tencent/mm/plugin/finder/live/controller/lyrics/LyricsTextColorStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "applyPreviewStyle", "(Lcom/tencent/mm/plugin/finder/live/controller/lyrics/ComponentLayoutMode;Lcom/tencent/mm/plugin/finder/live/controller/lyrics/LyricsTextColorStyle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "applyPreviewStyle: layout=" + componentLayoutMode + ", color=" + colorStyle);
    }
}
