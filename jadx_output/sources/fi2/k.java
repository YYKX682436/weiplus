package fi2;

/* loaded from: classes10.dex */
public final class k implements fi2.l {

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.List f262869l = kz5.c0.i(2, 3, 4);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f262870a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.v0 f262871b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.x0 f262872c;

    /* renamed from: d, reason: collision with root package name */
    public final int f262873d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f262874e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f262875f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f262876g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f262877h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f262878i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f262879j;

    /* renamed from: k, reason: collision with root package name */
    public r45.xn1 f262880k;

    public k(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 widgetService, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(widgetService, "widgetService");
        this.f262870a = context;
        this.f262871b = pluginAbility;
        this.f262872c = widgetService;
        this.f262873d = i17;
        this.f262874e = jz5.h.b(new fi2.h(this));
        this.f262875f = jz5.h.b(new fi2.e(this));
        this.f262876g = jz5.h.b(new fi2.g(this));
        this.f262877h = jz5.h.b(new fi2.j(this));
        this.f262878i = jz5.h.b(new fi2.f(this));
    }

    @Override // fi2.l
    public void b(java.util.Map micUserMap, boolean z17, java.lang.String anchorUserId) {
        android.widget.LinearLayout chatContentLayout;
        km2.q qVar;
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        kotlin.jvm.internal.o.g(anchorUserId, "anchorUserId");
        java.lang.Object obj = null;
        if (!f()) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f262879j;
            if (liveVoiceRoomLayoutView == null || (chatContentLayout = liveVoiceRoomLayoutView.getChatContentLayout()) == null) {
                return;
            }
            int childCount = chatContentLayout.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = chatContentLayout.getChildAt(i17);
                oj2.c cVar = childAt instanceof oj2.c ? (oj2.c) childAt : null;
                if (cVar != null) {
                    cVar.a0(z17);
                }
                android.view.View childAt2 = chatContentLayout.getChildAt(i17);
                wj2.w wVar = childAt2 instanceof wj2.w ? (wj2.w) childAt2 : null;
                if (wVar != null) {
                    xh2.a finderLiveMicCoverData = wVar.getFinderLiveMicCoverData();
                    wVar.I((finderLiveMicCoverData == null || (qVar = finderLiveMicCoverData.f454520a) == null || !qVar.f309183n) ? false : true);
                }
            }
            return;
        }
        java.util.List V = kz5.n0.V(micUserMap.values());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) V).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!((km2.q) next).f309183n) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            obj = it6.next();
            if (it6.hasNext()) {
                int i18 = ((km2.q) obj).f309192w;
                do {
                    java.lang.Object next2 = it6.next();
                    int i19 = ((km2.q) next2).f309192w;
                    if (i18 > i19) {
                        obj = next2;
                        i18 = i19;
                    }
                } while (it6.hasNext());
            }
        }
        km2.q qVar2 = (km2.q) obj;
        if (qVar2 != null) {
            this.f262880k = qVar2.f309187r;
            ci2.n e17 = e();
            r45.xn1 xn1Var = qVar2.f309187r;
            e17.getClass();
            pm0.v.X(new ci2.m(e17, xn1Var, true));
            return;
        }
        if (this.f262880k != null) {
            ci2.n e18 = e();
            r45.xn1 xn1Var2 = this.f262880k;
            e18.getClass();
            pm0.v.X(new ci2.m(e18, xn1Var2, false));
            return;
        }
        km2.q qVar3 = (km2.q) micUserMap.get(anchorUserId);
        if (qVar3 != null) {
            ci2.n e19 = e();
            r45.xn1 xn1Var3 = qVar3.f309187r;
            e19.getClass();
            pm0.v.X(new ci2.m(e19, xn1Var3, false));
        }
    }

    @Override // fi2.l
    public void c(xh2.e micTopicData) {
        kotlin.jvm.internal.o.g(micTopicData, "micTopicData");
        if (f()) {
            return;
        }
        ((ci2.d) ((jz5.n) this.f262874e).getValue()).b(micTopicData);
    }

    public final gi2.e d() {
        if (f()) {
            return (gi2.e) ((jz5.n) this.f262878i).getValue();
        }
        return this.f262873d == 1 ? (gi2.e) ((jz5.n) this.f262876g).getValue() : (gi2.e) ((jz5.n) this.f262875f).getValue();
    }

    public final ci2.n e() {
        return (ci2.n) ((jz5.n) this.f262877h).getValue();
    }

    public final boolean f() {
        return f262869l.contains(java.lang.Integer.valueOf(this.f262873d));
    }

    public final void g(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView it) {
        kotlin.jvm.internal.o.g(it, "it");
        jz5.g gVar = this.f262874e;
        android.view.ViewParent parent = ((ci2.d) ((jz5.n) gVar).getValue()).getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView((ci2.d) ((jz5.n) gVar).getValue());
        }
        android.view.ViewParent parent2 = e().getParent();
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(e());
        }
        it.getChatVoiceRoomContentLayout().removeAllViews();
        this.f262879j = it;
        if (f()) {
            it.getChatVoiceRoomContentLayout().addView(e(), new android.view.ViewGroup.LayoutParams(-1, -1));
        } else {
            it.getChatVoiceRoomContentLayout().addView((ci2.d) ((jz5.n) gVar).getValue(), new android.view.ViewGroup.LayoutParams(-1, -2));
        }
    }
}
