package df2;

/* loaded from: classes10.dex */
public final class jx extends if2.b {
    public int A;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230504m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f230505n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f230506o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f230507p;

    /* renamed from: q, reason: collision with root package name */
    public final zi2.y f230508q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f230509r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f230510s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f230511t;

    /* renamed from: u, reason: collision with root package name */
    public final df2.fx f230512u;

    /* renamed from: v, reason: collision with root package name */
    public final df2.ix f230513v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f230514w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f230515x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f230516y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f230517z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230504m = "LiveVoiceMorePreviewController";
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(com.tencent.mm.sdk.platformtools.x2.f193071a);
        weImageView.setImageResource(com.tencent.mm.R.raw.microphone_note_filled);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.f479102q1));
        this.f230507p = weImageView;
        this.f230508q = new zi2.y(store.getLiveRoomData());
        this.f230509r = jz5.h.b(new df2.gx(this));
        this.f230510s = jz5.h.b(new df2.bx(this));
        this.f230511t = jz5.h.b(df2.yw.f231897d);
        this.f230512u = new df2.fx(this);
        this.f230513v = new df2.ix();
        this.f230514w = jz5.h.b(new df2.hx(this));
        this.f230515x = jz5.h.b(new df2.cx(this));
        this.f230516y = jz5.h.b(new df2.ax(this));
        this.f230517z = jz5.h.b(new df2.zw(this));
        this.A = -1;
    }

    public static final void Z6(df2.jx jxVar, r45.q12 q12Var) {
        yf2.i2 i2Var;
        android.view.View view;
        int i17 = 8;
        if (((mm2.c1) jxVar.business(mm2.c1.class)).a8()) {
            android.view.View view2 = jxVar.f230505n;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVoiceModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveVoiceModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar = jxVar.f291099e;
        int height = (ubVar == null || (i2Var = (yf2.i2) ubVar.getController(yf2.i2.class)) == null || (view = i2Var.f461723s) == null) ? 0 : view.getHeight();
        android.view.View view3 = jxVar.f230505n;
        if (view3 == null) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.p2(q12Var)) {
            if (!pm0.v.z((int) ((mm2.c1) jxVar.business(mm2.c1.class)).f328866q, 64)) {
                ((mm2.c1) jxVar.business(mm2.c1.class)).p8(64 | ((int) ((mm2.c1) jxVar.business(mm2.c1.class)).f328866q));
            }
            ((mm2.c1) jxVar.business(mm2.c1.class)).p8(((int) ((mm2.c1) jxVar.business(mm2.c1.class)).f328866q) & (-16385));
            if (jxVar.A == -1) {
                jxVar.A = com.tencent.mm.ui.bl.c(jxVar.O6());
            }
            android.view.View view4 = jxVar.f230505n;
            if (view4 != null) {
                r4Var.f(jxVar.f230504m, view4, false, false, jxVar.A);
            }
            ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) jxVar.business(mm2.c1.class)).f328852o);
            if (b17 != null) {
                java.lang.String y07 = b17.y0();
                com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = jxVar.f230506o;
                if (liveVoiceRoomLayoutView != null) {
                    r4Var.k(liveVoiceRoomLayoutView, y07);
                }
            }
            java.lang.Integer valueOf = q12Var != null ? java.lang.Integer.valueOf(q12Var.getInteger(1)) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView2 = jxVar.f230506o;
                jz5.g gVar = jxVar.f230514w;
                if (liveVoiceRoomLayoutView2 != null) {
                    liveVoiceRoomLayoutView2.setAdapter((gi2.e) ((jz5.n) gVar).getValue());
                }
                ((gi2.e) ((jz5.n) gVar).getValue()).j((java.util.LinkedList) ((jz5.n) jxVar.f230509r).getValue(), new android.graphics.Rect());
            } else {
                jz5.g gVar2 = jxVar.f230510s;
                if (valueOf != null && valueOf.intValue() == 2) {
                    com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView3 = jxVar.f230506o;
                    jz5.g gVar3 = jxVar.f230515x;
                    if (liveVoiceRoomLayoutView3 != null) {
                        liveVoiceRoomLayoutView3.setAdapter((gi2.e) ((jz5.n) gVar3).getValue());
                    }
                    ((gi2.e) ((jz5.n) gVar3).getValue()).f272268b = height;
                    ((gi2.e) ((jz5.n) gVar3).getValue()).j((java.util.LinkedList) ((jz5.n) gVar2).getValue(), new android.graphics.Rect());
                } else if (valueOf != null && valueOf.intValue() == 8) {
                    com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView4 = jxVar.f230506o;
                    jz5.g gVar4 = jxVar.f230516y;
                    if (liveVoiceRoomLayoutView4 != null) {
                        liveVoiceRoomLayoutView4.setAdapter((gi2.e) ((jz5.n) gVar4).getValue());
                    }
                    ((gi2.e) ((jz5.n) gVar4).getValue()).f272268b = height;
                    ((gi2.e) ((jz5.n) gVar4).getValue()).j((java.util.LinkedList) ((jz5.n) gVar2).getValue(), new android.graphics.Rect());
                } else if (valueOf != null && valueOf.intValue() == 16) {
                    com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView5 = jxVar.f230506o;
                    jz5.g gVar5 = jxVar.f230517z;
                    if (liveVoiceRoomLayoutView5 != null) {
                        liveVoiceRoomLayoutView5.setAdapter((bi2.b) ((jz5.n) gVar5).getValue());
                    }
                    ((bi2.b) ((jz5.n) gVar5).getValue()).f272268b = height;
                    ((bi2.b) ((jz5.n) gVar5).getValue()).j((java.util.LinkedList) ((jz5.n) jxVar.f230511t).getValue(), new android.graphics.Rect());
                }
            }
            i17 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVoiceModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/LiveVoiceModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView) S6(com.tencent.mm.R.id.qrt);
        this.f230506o = liveVoiceRoomLayoutView;
        if (liveVoiceRoomLayoutView != null) {
            android.widget.FrameLayout singContentLayout = liveVoiceRoomLayoutView.getSingContentLayout();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f230507p;
            singContentLayout.removeView(weImageView);
            android.view.ViewParent parent = weImageView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(weImageView);
            }
            android.widget.FrameLayout singContentLayout2 = liveVoiceRoomLayoutView.getSingContentLayout();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i65.a.b(liveVoiceRoomLayoutView.getContext(), 112), i65.a.b(liveVoiceRoomLayoutView.getContext(), 112));
            layoutParams.gravity = 1;
            singContentLayout2.addView(weImageView, layoutParams);
            liveVoiceRoomLayoutView.getContentScrollLayout().setTranslationY(-i65.a.b(liveVoiceRoomLayoutView.getContext(), 96));
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ex(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        android.widget.FrameLayout singContentLayout;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f230505n = null;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f230506o;
        if (liveVoiceRoomLayoutView != null && (singContentLayout = liveVoiceRoomLayoutView.getSingContentLayout()) != null) {
            singContentLayout.removeView(this.f230507p);
        }
        this.f230506o = null;
    }
}
