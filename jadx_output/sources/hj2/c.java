package hj2;

/* loaded from: classes10.dex */
public class c extends hj2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f281582b = jz5.h.b(hj2.b.f281581d);

    @Override // gi2.c
    public java.lang.String d() {
        return "MultiVoiceRoomLayout";
    }

    @Override // hj2.a
    public void h(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent, android.view.View firstItemView, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(firstItemView, "firstItemView");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f10893h = 0;
        layoutParams.f10885d = 0;
        layoutParams.f10891g = 0;
        int a17 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 172);
        gi2.d f111700w = parent.getF111700w();
        layoutParams.setMargins(0, a17 + (f111700w != null ? f111700w.f272268b : 0), 0, 0);
        parent.addView(firstItemView, layoutParams);
    }

    @Override // hj2.a
    public void i(android.view.View firstItemView, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent, java.util.ArrayList viewList, gi2.d adapter) {
        kotlin.jvm.internal.o.g(firstItemView, "firstItemView");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(viewList, "viewList");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        j(0, viewList, adapter, parent, firstItemView.getId());
        android.view.View view = (android.view.View) kz5.n0.a0(viewList, 1);
        j(4, viewList, adapter, parent, view != null ? view.getId() : firstItemView.getId());
        android.view.View view2 = (android.view.View) kz5.n0.a0(viewList, 6);
        g(parent, view2 != null ? view2.getId() : firstItemView.getId(), 0);
    }

    public final void j(int i17, java.util.ArrayList arrayList, gi2.d dVar, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, int i18) {
        int b17 = i65.a.b(liveVoiceRoomLayoutView.getContext(), 16);
        int i19 = i17 + 1;
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i19);
        if (view != null) {
            f(view, dVar, i19);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f10895i = i18;
            layoutParams.f10885d = 0;
            android.view.View view2 = (android.view.View) kz5.n0.a0(arrayList, i17 + 2);
            if (view2 != null) {
                layoutParams.f10889f = view2.getId();
            }
            layoutParams.F = 2;
            layoutParams.setMargins(0, b17, 0, 0);
            liveVoiceRoomLayoutView.addView(view, layoutParams);
        }
        int i27 = i17 + 2;
        android.view.View view3 = (android.view.View) kz5.n0.a0(arrayList, i27);
        if (view3 != null) {
            f(view3, dVar, i27);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams2.f10895i = i18;
            android.view.View view4 = (android.view.View) kz5.n0.a0(arrayList, i19);
            if (view4 != null) {
                layoutParams2.f10887e = view4.getId();
            }
            android.view.View view5 = (android.view.View) kz5.n0.a0(arrayList, i17 + 3);
            if (view5 != null) {
                layoutParams2.f10889f = view5.getId();
            }
            layoutParams2.setMargins(0, b17, 0, 0);
            liveVoiceRoomLayoutView.addView(view3, layoutParams2);
        }
        int i28 = i17 + 3;
        android.view.View view6 = (android.view.View) kz5.n0.a0(arrayList, i28);
        if (view6 != null) {
            f(view6, dVar, i28);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams3.f10895i = i18;
            android.view.View view7 = (android.view.View) kz5.n0.a0(arrayList, i27);
            if (view7 != null) {
                layoutParams3.f10887e = view7.getId();
            }
            android.view.View view8 = (android.view.View) kz5.n0.a0(arrayList, i17 + 4);
            if (view8 != null) {
                layoutParams3.f10889f = view8.getId();
            }
            layoutParams3.setMargins(0, b17, 0, 0);
            liveVoiceRoomLayoutView.addView(view6, layoutParams3);
        }
        int i29 = i17 + 4;
        android.view.View view9 = (android.view.View) kz5.n0.a0(arrayList, i29);
        if (view9 != null) {
            f(view9, dVar, i29);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams4.f10895i = i18;
            android.view.View view10 = (android.view.View) kz5.n0.a0(arrayList, i28);
            if (view10 != null) {
                layoutParams4.f10887e = view10.getId();
            }
            layoutParams4.f10891g = 0;
            layoutParams4.setMargins(0, b17, 0, 0);
            liveVoiceRoomLayoutView.addView(view9, layoutParams4);
        }
    }
}
