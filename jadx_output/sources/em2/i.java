package em2;

/* loaded from: classes10.dex */
public final class i implements lj2.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f255132a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.y20 f255133b;

    /* renamed from: c, reason: collision with root package name */
    public final int f255134c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f255135d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f255136e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f255137f;

    /* renamed from: g, reason: collision with root package name */
    public lj2.t0 f255138g;

    /* renamed from: h, reason: collision with root package name */
    public final em2.f f255139h;

    /* renamed from: i, reason: collision with root package name */
    public final em2.h f255140i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f255141j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f255142k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f255143l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f255144m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f255145n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f255146o;

    /* renamed from: p, reason: collision with root package name */
    public int f255147p;

    /* renamed from: q, reason: collision with root package name */
    public int f255148q;

    /* renamed from: r, reason: collision with root package name */
    public int f255149r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f255150s;

    public i(android.content.Context context, com.tencent.mm.plugin.finder.feed.y20 y20Var, lj2.t0 t0Var, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f255132a = context;
        this.f255133b = y20Var;
        this.f255134c = i17;
        this.f255135d = "Finder.FloatVoiceRoomAdapter";
        this.f255136e = new java.util.LinkedList();
        this.f255137f = new gk2.e("Finder.FloatVoiceRoomAdapter");
        this.f255138g = t0Var;
        this.f255139h = new em2.f(this);
        this.f255140i = new em2.h();
        this.f255141j = jz5.h.b(new em2.g(this));
        this.f255142k = jz5.h.b(new em2.e(this));
        this.f255143l = jz5.h.b(new em2.d(this));
        this.f255144m = jz5.h.b(new em2.b(this));
        this.f255145n = jz5.h.b(new em2.c(this));
        this.f255146o = jz5.h.b(new em2.a(this));
    }

    @Override // lj2.y0
    public void a(android.graphics.Point curWindowSize, int i17) {
        kotlin.jvm.internal.o.g(curWindowSize, "curWindowSize");
        int i18 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        if (i18 <= 0) {
            return;
        }
        float f17 = curWindowSize.x / i18;
        float f18 = 0.0f;
        if (f17 <= 0.0f) {
            return;
        }
        int i19 = this.f255148q;
        if (((i19 == 0 && this.f255147p == 4) || (i19 == 2 && this.f255149r == 16)) && g().f()) {
            f18 = ((r0.y * f17) - curWindowSize.y) / 2.0f;
        } else if (this.f255134c != 4) {
            f18 = fj2.r.f263182a.m(f17, curWindowSize, i17);
        }
        com.tencent.mars.xlog.Log.i(this.f255135d, "updateData curWindowSize: " + curWindowSize + " scale = " + f17 + " translateY: " + f18);
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f255150s;
        if (liveVoiceRoomLayoutView != null) {
            liveVoiceRoomLayoutView.setTranslationY(-f18);
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView2 = this.f255150s;
        if (liveVoiceRoomLayoutView2 != null) {
            liveVoiceRoomLayoutView2.setScaleX(f17);
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView3 = this.f255150s;
        if (liveVoiceRoomLayoutView3 == null) {
            return;
        }
        liveVoiceRoomLayoutView3.setScaleY(f17);
    }

    @Override // lj2.y0
    public void b(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView) {
        android.view.ViewGroup.LayoutParams layoutParams;
        this.f255150s = liveVoiceRoomLayoutView;
        if (liveVoiceRoomLayoutView != null) {
            h().n(liveVoiceRoomLayoutView);
            g().g(liveVoiceRoomLayoutView);
        }
        if (liveVoiceRoomLayoutView == null || (layoutParams = liveVoiceRoomLayoutView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        layoutParams.height = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
    }

    @Override // lj2.y0
    public fi2.l c() {
        return g();
    }

    @Override // lj2.y0
    public void d(gk2.e buContext, int i17, int i18, int i19, int i27, android.graphics.Point curWindowSize, java.util.LinkedList dataList) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(curWindowSize, "curWindowSize");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f255147p = i19;
        this.f255148q = i17;
        this.f255149r = i18;
        if (this.f255138g == null) {
            this.f255138g = new zi2.y(buContext);
        }
        java.util.LinkedList linkedList = this.f255136e;
        linkedList.clear();
        linkedList.addAll(dataList);
        a(curWindowSize, i27);
        f().j(linkedList, new android.graphics.Rect());
    }

    @Override // lj2.y0
    public ah2.f e() {
        return h();
    }

    public final gi2.e f() {
        gi2.e d17;
        int i17 = this.f255148q;
        boolean z17 = false;
        if ((i17 == 0 && this.f255147p == 1) || (i17 == 2 && this.f255149r == 1)) {
            d17 = (gi2.e) ((jz5.n) this.f255141j).getValue();
        } else {
            if (this.f255148q == 2 && this.f255149r == 8) {
                d17 = this.f255134c == 4 ? (gi2.e) ((jz5.n) this.f255144m).getValue() : (gi2.e) ((jz5.n) this.f255143l).getValue();
            } else {
                int i18 = this.f255148q;
                int i19 = this.f255149r;
                int i27 = this.f255147p;
                if ((i18 == 0 && i27 == 4) || (i18 == 2 && i19 == 16)) {
                    z17 = true;
                }
                d17 = z17 ? g().d() : (gi2.e) ((jz5.n) this.f255142k).getValue();
            }
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f255150s;
        if (liveVoiceRoomLayoutView != null) {
            liveVoiceRoomLayoutView.setAdapter(d17);
        }
        return d17;
    }

    public final fi2.k g() {
        return (fi2.k) ((jz5.n) this.f255146o).getValue();
    }

    public final fi2.e0 h() {
        return (fi2.e0) ((jz5.n) this.f255145n).getValue();
    }

    @Override // lj2.y0
    public void onAttach() {
        h().m();
    }

    @Override // lj2.y0
    public void reset() {
        java.util.LinkedList linkedList = this.f255136e;
        if (linkedList.size() > 0) {
            linkedList.clear();
            f().j(linkedList, new android.graphics.Rect());
        }
        h().o();
    }
}
