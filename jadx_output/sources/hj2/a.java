package hj2;

/* loaded from: classes10.dex */
public abstract class a extends gi2.c {
    @Override // gi2.c
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView) {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent = (com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView) liveCustomRoomLayoutView;
        kotlin.jvm.internal.o.g(viewList, "viewList");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        java.lang.Object obj = viewList.get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        android.view.View view = (android.view.View) obj;
        f(view, adapter, 0);
        h(parent, view, viewList.size());
        i(view, parent, viewList, adapter);
    }

    public final void g(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent, int i17, int i18) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.ViewParent parent2 = parent.getBottomLinkSpace().getParent();
        android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(parent.getBottomLinkSpace());
        }
        android.view.View bottomLinkSpace = parent.getBottomLinkSpace();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, 1);
        layoutParams.f10895i = i17;
        layoutParams.f10885d = 0;
        layoutParams.setMargins(0, i18, 0, 0);
        parent.addView(bottomLinkSpace, layoutParams);
    }

    public abstract void h(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, android.view.View view, int i17);

    public abstract void i(android.view.View view, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, java.util.ArrayList arrayList, gi2.d dVar);
}
