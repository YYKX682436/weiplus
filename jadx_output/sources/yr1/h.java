package yr1;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment f464642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment bizContactInfoDialogFragment) {
        super(2);
        this.f464642d = bizContactInfoDialogFragment;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        float floatValue = ((java.lang.Number) obj2).floatValue();
        com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment bizContactInfoDialogFragment = this.f464642d;
        bizContactInfoDialogFragment.f94075n = floatValue;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = bizContactInfoDialogFragment.f94076o;
        if (aVar != null) {
            aVar.a(floatValue);
        }
        yr1.k kVar = bizContactInfoDialogFragment.f94073i;
        if (kVar != null) {
            android.content.Context context = kVar.f464648d;
            float b17 = (intValue - 0.0f) / (i65.a.b(context, 56) - 0.0f);
            float f17 = (b17 - 0.5f) * 2.0f;
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            if (b17 > 1.0f) {
                b17 = 1.0f;
            }
            if (0.0f >= b17) {
                b17 = 0.0f;
            }
            int b18 = i65.a.b(context, 16);
            int b19 = i65.a.b(context, 4);
            android.view.View view = kVar.f464646b;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.profile.BizDragHeaderView");
            com.tencent.mm.plugin.brandservice.ui.profile.BizDragHeaderView bizDragHeaderView = (com.tencent.mm.plugin.brandservice.ui.profile.BizDragHeaderView) view;
            int i17 = (int) (b19 + (b17 * (b18 - b19)));
            android.graphics.RectF rectF = bizDragHeaderView.f94081e;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = bizDragHeaderView.f94083g;
            rectF.bottom = i17;
            bizDragHeaderView.postInvalidate();
            android.view.View view2 = kVar.f464647c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/profile/BizDragHeaderComponent", "onDragTranslation", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/profile/BizDragHeaderComponent", "onDragTranslation", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f302826a;
    }
}
