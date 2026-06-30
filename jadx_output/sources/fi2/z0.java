package fi2;

/* loaded from: classes10.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.j1 f262951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f262952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(fi2.j1 j1Var, zi2.w wVar) {
        super(0);
        this.f262951d = j1Var;
        this.f262952e = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        zi2.w wVar = this.f262952e;
        android.view.ViewGroup root = wVar.f365323d;
        fi2.j1 j1Var = this.f262951d;
        j1Var.getClass();
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View inflate = ((android.view.ViewStub) root.findViewById(com.tencent.mm.R.id.qrs)).inflate();
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        j1Var.f262849d = inflate;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView) inflate.findViewById(com.tencent.mm.R.id.qrr);
        if (liveVoiceRoomLayoutView != null) {
            j1Var.f262848c = liveVoiceRoomLayoutView;
            fi2.w B = j1Var.B();
            B.getClass();
            jz5.g gVar = B.f262919e;
            android.view.ViewParent parent = ((mh2.k) ((jz5.n) gVar).getValue()).getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView((mh2.k) ((jz5.n) gVar).getValue());
            }
            android.view.ViewParent parent2 = B.m().getParent();
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(B.m());
            }
            liveVoiceRoomLayoutView.getCoverBackgroundLayout().addView((mh2.k) ((jz5.n) gVar).getValue(), new android.view.ViewGroup.LayoutParams(-1, -1));
            liveVoiceRoomLayoutView.getSingContentLayout().addView(B.m(), new android.view.ViewGroup.LayoutParams(-1, -1));
            liveVoiceRoomLayoutView.getSongListLayout().addView(((fg2.n0) ((jz5.n) B.f262920f).getValue()).f262160a, new android.view.ViewGroup.LayoutParams(-2, -2));
            liveVoiceRoomLayoutView.setOnSongOrderClickListener(new fi2.y0(liveVoiceRoomLayoutView, j1Var, wVar));
            fi2.d dVar = (fi2.d) ((jz5.n) j1Var.f262854i).getValue();
            dVar.getClass();
            android.view.ViewParent parent3 = dVar.d().getParent();
            android.view.ViewGroup viewGroup3 = parent3 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent3 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(dVar.d());
            }
            liveVoiceRoomLayoutView.getChatVoiceRoomContentLayout().addView(dVar.d(), new android.view.ViewGroup.LayoutParams(-1, -2));
        }
        android.view.View view = j1Var.f262849d;
        if (view != null && (findViewById3 = view.findViewById(com.tencent.mm.R.id.r1m)) != null) {
            j1Var.f262867v = findViewById3;
            findViewById3.setBackgroundDrawable(null);
            android.view.View findViewById4 = findViewById3.findViewById(com.tencent.mm.R.id.d0v);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = j1Var.f262849d;
        if (view2 != null && (findViewById2 = view2.findViewById(com.tencent.mm.R.id.r1n)) != null) {
            j1Var.f262866u = findViewById2;
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView2 = j1Var.f262848c;
            if (liveVoiceRoomLayoutView2 != null) {
                liveVoiceRoomLayoutView2.setSingleBattleBarViewLayout(findViewById2);
            }
        }
        android.view.View view3 = j1Var.f262849d;
        if (view3 != null && (findViewById = view3.findViewById(com.tencent.mm.R.id.r1o)) != null) {
            j1Var.f262868w = findViewById;
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView3 = j1Var.f262848c;
            if (liveVoiceRoomLayoutView3 != null) {
                liveVoiceRoomLayoutView3.setTeamBattleBarViewLayout(findViewById);
            }
        }
        if (!zl2.r4.f473950a.w1()) {
            j1Var.C();
        }
        j1Var.A(8);
        return jz5.f0.f302826a;
    }
}
