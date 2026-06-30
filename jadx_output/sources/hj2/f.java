package hj2;

/* loaded from: classes10.dex */
public class f extends hj2.c {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f281584c;

    static {
        new hj2.e(null);
        f281584c = jz5.h.b(hj2.d.f281583d);
    }

    @Override // hj2.c, gi2.c
    public java.lang.String d() {
        return "MultiVoiceRoomSinglePkLayout";
    }

    @Override // hj2.c, hj2.a
    public void h(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent, android.view.View firstItemView, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(firstItemView, "firstItemView");
        android.view.View singleBattleBarViewLayout = parent.getSingleBattleBarViewLayout();
        jz5.f0 f0Var = null;
        if (singleBattleBarViewLayout != null) {
            android.view.ViewParent parent2 = singleBattleBarViewLayout.getParent();
            android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(singleBattleBarViewLayout);
            }
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f10893h = 0;
            layoutParams.f10885d = 0;
            layoutParams.f10891g = 0;
            layoutParams.setMargins(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 172), 0, 0);
            parent.addView(singleBattleBarViewLayout, layoutParams);
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
        android.view.View singleBattleBarViewLayout2 = parent.getSingleBattleBarViewLayout();
        if (singleBattleBarViewLayout2 != null) {
            layoutParams2.f10895i = singleBattleBarViewLayout2.getId();
            layoutParams2.setMargins(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16), 0, 0);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            layoutParams2.f10893h = 0;
            layoutParams2.setMargins(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 172), 0, 0);
        }
        layoutParams2.f10885d = 0;
        layoutParams2.f10891g = 0;
        parent.addView(firstItemView, layoutParams2);
    }
}
