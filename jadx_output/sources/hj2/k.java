package hj2;

/* loaded from: classes10.dex */
public final class k extends hj2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f281588b = jz5.h.b(hj2.j.f281587d);

    @Override // gi2.c
    public java.lang.String d() {
        return "SingleVoiceRoomLayout";
    }

    @Override // hj2.a
    public void h(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent, android.view.View anchorView, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(anchorView, "anchorView");
        android.view.View space = new android.widget.Space(parent.getContext());
        space.setId(android.view.View.generateViewId());
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, 0);
        layoutParams.f10891g = 0;
        layoutParams.setMargins(0, 0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, i17 > 5 ? 128 : 0), 0);
        parent.addView(space, layoutParams);
        int b17 = i65.a.b(parent.getContext(), i17 == 1 ? 136 : 112);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(b17, b17);
        layoutParams2.f10893h = 0;
        layoutParams2.f10885d = 0;
        layoutParams2.f10891g = space.getId();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (i17 == 1) {
            qg2.d dVar = qg2.d.f362793a;
            i18 = qg2.d.f362798f;
        } else {
            qg2.d dVar2 = qg2.d.f362793a;
            i18 = qg2.d.f362798f + 12;
        }
        layoutParams2.setMargins(0, com.tencent.mm.ui.zk.a(context, i18), 0, 0);
        parent.addView(anchorView, layoutParams2);
        g(parent, anchorView.getId(), i65.a.b(parent.getContext(), 32));
    }

    @Override // hj2.a
    public void i(android.view.View anchorView, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent, java.util.ArrayList viewList, gi2.d adapter) {
        kotlin.jvm.internal.o.g(anchorView, "anchorView");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(viewList, "viewList");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        j(0, viewList, adapter, parent, 0, -1, i65.a.b(parent.getContext(), 8));
        android.view.View view = (android.view.View) kz5.n0.a0(viewList, 1);
        j(4, viewList, adapter, parent, -1, view != null ? view.getId() : 0, 0);
    }

    public final void j(int i17, java.util.ArrayList arrayList, gi2.d dVar, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, int i18, int i19, int i27) {
        int b17 = i65.a.b(liveVoiceRoomLayoutView.getContext(), 64);
        int b18 = i65.a.b(liveVoiceRoomLayoutView.getContext(), 183);
        int b19 = i65.a.b(liveVoiceRoomLayoutView.getContext(), 20);
        int i28 = i17 + 1;
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i28);
        if (view != null) {
            f(view, dVar, i28);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(b17, -2);
            layoutParams.f10893h = 0;
            if (i18 != -1) {
                layoutParams.f10891g = i18;
            }
            if (i19 != -1) {
                layoutParams.f10889f = i19;
            }
            layoutParams.setMargins(0, b18, i27, 0);
            liveVoiceRoomLayoutView.addView(view, layoutParams);
        }
        int i29 = i17 + 2;
        android.view.View view2 = (android.view.View) kz5.n0.a0(arrayList, i29);
        if (view2 != null) {
            f(view2, dVar, i29);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(b17, -2);
            android.view.View view3 = (android.view.View) kz5.n0.a0(arrayList, i28);
            if (view3 != null) {
                layoutParams2.f10895i = view3.getId();
            }
            if (i18 != -1) {
                layoutParams2.f10891g = i18;
            }
            if (i19 != -1) {
                layoutParams2.f10889f = i19;
            }
            layoutParams2.setMargins(0, b19, i27, 0);
            liveVoiceRoomLayoutView.addView(view2, layoutParams2);
        }
        int i37 = i17 + 3;
        android.view.View view4 = (android.view.View) kz5.n0.a0(arrayList, i37);
        if (view4 != null) {
            f(view4, dVar, i37);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(b17, -2);
            android.view.View view5 = (android.view.View) kz5.n0.a0(arrayList, i29);
            if (view5 != null) {
                layoutParams3.f10895i = view5.getId();
            }
            if (i18 != -1) {
                layoutParams3.f10891g = i18;
            }
            if (i19 != -1) {
                layoutParams3.f10889f = i19;
            }
            layoutParams3.setMargins(0, b19, i27, 0);
            liveVoiceRoomLayoutView.addView(view4, layoutParams3);
        }
        int i38 = i17 + 4;
        android.view.View view6 = (android.view.View) kz5.n0.a0(arrayList, i38);
        if (view6 != null) {
            f(view6, dVar, i38);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(b17, -2);
            android.view.View view7 = (android.view.View) kz5.n0.a0(arrayList, i37);
            if (view7 != null) {
                layoutParams4.f10895i = view7.getId();
            }
            if (i18 != -1) {
                layoutParams4.f10891g = i18;
            }
            if (i19 != -1) {
                layoutParams4.f10889f = i19;
            }
            layoutParams4.setMargins(0, b19, i27, 0);
            liveVoiceRoomLayoutView.addView(view6, layoutParams4);
        }
    }
}
