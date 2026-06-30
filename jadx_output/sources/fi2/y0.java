package fi2;

/* loaded from: classes3.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f262947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi2.j1 f262948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f262949f;

    public y0(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, fi2.j1 j1Var, zi2.w wVar) {
        this.f262947d = liveVoiceRoomLayoutView;
        this.f262948e = j1Var;
        this.f262949f = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f262947d;
        android.content.Context context = liveVoiceRoomLayoutView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!((pl2.x) uVar.b(context).a(pl2.x.class)).f356683f) {
            this.f262948e.B().n(2);
            zh2.b m17 = this.f262949f.m();
            if (m17 != null) {
                fn2.u1 u1Var = fn2.u1.f264411f;
                sf2.d3 d3Var = (sf2.d3) ((ch2.o2) m17).controller(sf2.d3.class);
                if (d3Var != null) {
                    d3Var.v7(u1Var, -1);
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Context context2 = liveVoiceRoomLayoutView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((pl2.x) uVar.b(context2).a(pl2.x.class)).f356687m.f356678h = 3;
        android.content.Context context3 = liveVoiceRoomLayoutView.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pl2.s sVar = ((pl2.x) uVar.b(context3).a(pl2.x.class)).f356684g;
        if (sVar != null) {
            pl2.s.e(sVar, 0L, null, 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
