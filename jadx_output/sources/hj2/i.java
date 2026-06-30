package hj2;

/* loaded from: classes10.dex */
public final class i extends hj2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f281586b;

    static {
        new hj2.h(null);
        f281586b = jz5.h.b(hj2.g.f281585d);
    }

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
        layoutParams.setMargins(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 172), 0, 0);
        parent.addView(firstItemView, layoutParams);
        android.view.View teamBattleBarViewLayout = parent.getTeamBattleBarViewLayout();
        if (teamBattleBarViewLayout != null) {
            android.view.ViewParent parent2 = teamBattleBarViewLayout.getParent();
            android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(teamBattleBarViewLayout);
            }
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -2);
            layoutParams2.f10895i = firstItemView.getId();
            layoutParams2.f10885d = 0;
            layoutParams2.f10891g = 0;
            layoutParams2.setMargins(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), 0, 0);
            parent.addView(teamBattleBarViewLayout, layoutParams2);
        }
    }

    @Override // hj2.a
    public void i(android.view.View firstItemView, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent, java.util.ArrayList viewList, gi2.d adapter) {
        kotlin.jvm.internal.o.g(firstItemView, "firstItemView");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(viewList, "viewList");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        android.widget.Space space = new android.widget.Space(com.tencent.mm.sdk.platformtools.x2.f193071a);
        space.setId(android.view.View.generateViewId());
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f10885d = 0;
        layoutParams.f10891g = 0;
        parent.addView(space, layoutParams);
        int id6 = firstItemView.getId();
        android.view.View view = new android.view.View(com.tencent.mm.sdk.platformtools.x2.f193071a);
        view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.cq_));
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 258));
        layoutParams2.f10885d = 0;
        layoutParams2.f10891g = space.getId();
        layoutParams2.f10895i = id6;
        layoutParams2.N = 0.5f;
        layoutParams2.setMargins(0, i65.a.b(parent.getContext(), 12), 0, 0);
        parent.addView(view, layoutParams2);
        int id7 = firstItemView.getId();
        android.view.View view2 = new android.view.View(com.tencent.mm.sdk.platformtools.x2.f193071a);
        view2.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.cob));
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 258));
        layoutParams3.f10885d = space.getId();
        layoutParams3.f10891g = 0;
        layoutParams3.f10895i = id7;
        layoutParams3.N = 0.5f;
        layoutParams3.setMargins(0, i65.a.b(parent.getContext(), 12), 0, 0);
        parent.addView(view2, layoutParams3);
        j(0, viewList, adapter, parent, firstItemView.getId(), i65.a.b(parent.getContext(), 48), space);
        k(0, viewList, adapter, parent, firstItemView.getId(), i65.a.b(parent.getContext(), 48), space);
        android.view.View view3 = (android.view.View) kz5.n0.a0(viewList, 1);
        j(4, viewList, adapter, parent, view3 != null ? view3.getId() : firstItemView.getId(), i65.a.b(parent.getContext(), 16), space);
        android.view.View view4 = (android.view.View) kz5.n0.a0(viewList, 1);
        k(4, viewList, adapter, parent, view4 != null ? view4.getId() : firstItemView.getId(), i65.a.b(parent.getContext(), 16), space);
        android.view.View view5 = (android.view.View) kz5.n0.a0(viewList, 6);
        g(parent, view5 != null ? view5.getId() : firstItemView.getId(), i65.a.b(parent.getContext(), 32));
    }

    public final void j(int i17, java.util.ArrayList arrayList, gi2.d dVar, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, int i18, int i19, android.widget.Space space) {
        int i27 = i17 + 1;
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i27);
        if (view != null) {
            f(view, dVar, i27);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f10895i = i18;
            layoutParams.f10885d = 0;
            android.view.View view2 = (android.view.View) kz5.n0.a0(arrayList, i17 + 2);
            if (view2 != null) {
                layoutParams.f10889f = view2.getId();
            }
            layoutParams.F = 2;
            layoutParams.setMargins(0, i19, 0, 0);
            liveVoiceRoomLayoutView.addView(view, layoutParams);
        }
        int i28 = i17 + 2;
        android.view.View view3 = (android.view.View) kz5.n0.a0(arrayList, i28);
        if (view3 != null) {
            f(view3, dVar, i28);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams2.f10895i = i18;
            android.view.View view4 = (android.view.View) kz5.n0.a0(arrayList, i27);
            if (view4 != null) {
                layoutParams2.f10887e = view4.getId();
            }
            layoutParams2.f10891g = space.getId();
            layoutParams2.setMargins(0, i19, 0, 0);
            liveVoiceRoomLayoutView.addView(view3, layoutParams2);
        }
    }

    public final void k(int i17, java.util.ArrayList arrayList, gi2.d dVar, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, int i18, int i19, android.widget.Space space) {
        int i27 = i17 + 3;
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i27);
        if (view != null) {
            f(view, dVar, i27);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f10895i = i18;
            layoutParams.F = 2;
            layoutParams.f10885d = space.getId();
            android.view.View view2 = (android.view.View) kz5.n0.a0(arrayList, i17 + 4);
            if (view2 != null) {
                layoutParams.f10889f = view2.getId();
            }
            layoutParams.setMargins(0, i19, 0, 0);
            liveVoiceRoomLayoutView.addView(view, layoutParams);
        }
        int i28 = i17 + 4;
        android.view.View view3 = (android.view.View) kz5.n0.a0(arrayList, i28);
        if (view3 != null) {
            f(view3, dVar, i28);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams2.f10895i = i18;
            android.view.View view4 = (android.view.View) kz5.n0.a0(arrayList, i27);
            if (view4 != null) {
                layoutParams2.f10887e = view4.getId();
            }
            layoutParams2.f10891g = 0;
            layoutParams2.setMargins(0, i19, 0, 0);
            liveVoiceRoomLayoutView.addView(view3, layoutParams2);
        }
    }
}
