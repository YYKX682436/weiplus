package fi2;

/* loaded from: classes10.dex */
public final class x0 extends fi2.a {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f262925c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f262926d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f262927e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f262928f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.view.ratio.RatioLayout f262929g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f262930h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f262931i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f262932j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f262933k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f262934l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f262935m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f262936n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f262937o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f262938p;

    /* renamed from: q, reason: collision with root package name */
    public final dj2.k f262939q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.live.core.view.LivePreviewView f262940r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f262941s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f262942t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f262943u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f262944v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(zi2.w plugin, android.view.ViewGroup viewGroup) {
        super(plugin);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f262925c = viewGroup;
        android.view.View findViewById = plugin.f365323d.findViewById(com.tencent.mm.R.id.qrp);
        this.f262926d = findViewById;
        this.f262927e = findViewById.findViewById(com.tencent.mm.R.id.pod);
        this.f262928f = findViewById.findViewById(com.tencent.mm.R.id.qro);
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = (com.tencent.mm.view.ratio.RatioLayout) findViewById.findViewById(com.tencent.mm.R.id.f_s);
        this.f262929g = ratioLayout;
        jz5.g b17 = jz5.h.b(new fi2.m0(this, plugin));
        this.f262930h = b17;
        this.f262931i = jz5.h.b(new fi2.g0(this, plugin));
        this.f262932j = jz5.h.b(new fi2.i0(this, plugin));
        this.f262933k = jz5.h.b(new fi2.j0(this, plugin));
        this.f262934l = jz5.h.b(new fi2.k0(this, plugin));
        this.f262935m = jz5.h.b(new fi2.h0(this, plugin));
        this.f262936n = jz5.h.b(new fi2.v0(this, plugin));
        this.f262937o = jz5.h.b(new fi2.w0(this, plugin));
        this.f262938p = jz5.h.b(new fi2.u0(this, plugin));
        dj2.k kVar = new dj2.k();
        this.f262939q = kVar;
        this.f262943u = jz5.h.b(new fi2.n0(plugin));
        this.f262944v = jz5.h.b(new fi2.l0(this, plugin));
        qo0.c cVar = plugin.f473153p;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        this.f262940r = k0Var != null ? (com.tencent.mm.live.core.view.LivePreviewView) k0Var.findViewById(com.tencent.mm.R.id.icy) : null;
        ratioLayout.setAdapter((dj2.h) ((jz5.n) b17).getValue());
        ratioLayout.setLayoutManager(new com.tencent.mm.view.ratio.a());
        ratioLayout.setItemDecoration(kVar);
        ratioLayout.setErrorPixel(3);
    }

    public final dj2.b B() {
        dj2.b bVar;
        xh2.c cVar = (xh2.c) ((mm2.o4) this.f262801a.P0(mm2.o4.class)).A.getValue();
        switch (cVar != null ? cVar.f454533c : 0) {
            case 1:
                bVar = (dj2.d) ((jz5.n) this.f262932j).getValue();
                break;
            case 2:
                bVar = (dj2.g) ((jz5.n) this.f262934l).getValue();
                break;
            case 3:
                bVar = (dj2.f) ((jz5.n) this.f262933k).getValue();
                break;
            case 4:
                bVar = (dj2.m) ((jz5.n) this.f262936n).getValue();
                break;
            case 5:
                bVar = (dj2.n) ((jz5.n) this.f262937o).getValue();
                break;
            case 6:
                bVar = (dj2.l) ((jz5.n) this.f262938p).getValue();
                break;
            case 7:
                bVar = (dj2.e) ((jz5.n) this.f262931i).getValue();
                break;
            case 8:
                bVar = (dj2.c) ((jz5.n) this.f262935m).getValue();
                break;
            default:
                bVar = (dj2.h) ((jz5.n) this.f262930h).getValue();
                break;
        }
        bVar.f232901h = this.f262941s;
        this.f262929g.setAdapter(bVar);
        return bVar;
    }

    public final android.view.View C() {
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = this.f262929g;
        int childCount = ratioLayout.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = ratioLayout.getChildAt(i17);
            if (childAt != null && (childAt instanceof tj2.a)) {
                return ((tj2.a) childAt).getClickView();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0221, code lost:
    
        if (lj2.k.f318879f.contains(java.lang.Integer.valueOf(r1.f454533c)) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(xh2.c r21) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.x0.D(xh2.c):void");
    }

    @Override // fi2.m
    public android.view.View a() {
        return this.f262926d;
    }

    @Override // fi2.m
    public void b(boolean z17) {
        dj2.d dVar = (dj2.d) ((jz5.n) this.f262932j).getValue();
        if (dVar.f282613a != null) {
            int childCount = dVar.d().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = dVar.d().getChildAt(i17);
                sj2.f fVar = childAt instanceof sj2.f ? (sj2.f) childAt : null;
                if (fVar != null) {
                    if (fVar.N.f262187j.getVisibility() == 8 || kotlin.jvm.internal.o.b(fVar.P, java.lang.Boolean.valueOf(z17))) {
                        return;
                    }
                    pm0.v.X(new sj2.e(fVar, z17));
                    return;
                }
            }
        }
    }

    @Override // fi2.m
    public void c(xh2.a micCoverData) {
        kotlin.jvm.internal.o.g(micCoverData, "micCoverData");
        ni2.r1 r1Var = (ni2.r1) ((jz5.n) this.f262943u).getValue();
        r1Var.getClass();
        if (micCoverData.f454520a != null) {
            com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomGrabEditPanel", "linkMicUser is not null");
        } else {
            r1Var.f337454d = micCoverData;
            ((nj2.b) ((jz5.n) r1Var.f337458h).getValue()).w();
        }
    }

    @Override // fi2.m
    public void e(xh2.a micCoverData) {
        kotlin.jvm.internal.o.g(micCoverData, "micCoverData");
        ((ni2.r1) ((jz5.n) this.f262943u).getValue()).a(micCoverData);
    }

    @Override // fi2.m
    public void f(java.lang.String str) {
        pm0.v.X(new fi2.t0(this, str));
    }

    @Override // fi2.m
    public void h() {
        r();
        D(null);
    }

    @Override // fi2.m
    public void i(java.lang.String userId, boolean z17) {
        kotlin.jvm.internal.o.g(userId, "userId");
        pm0.v.X(new fi2.o0(this, userId, z17));
    }

    @Override // fi2.m
    public android.view.View j() {
        android.view.View view = this.f262927e;
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.qxr);
        }
        return null;
    }

    @Override // fi2.m
    public android.view.View k() {
        return this.f262928f;
    }

    @Override // fi2.m
    public android.view.View l() {
        return this.f262927e;
    }

    @Override // fi2.m
    public void n(boolean z17, boolean z18) {
        this.f262941s = z17;
        this.f262942t = z18;
    }

    @Override // fi2.m
    public android.widget.ImageView o() {
        android.view.View view = this.f262928f;
        if (view != null) {
            return (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486011qv3);
        }
        return null;
    }

    @Override // fi2.m
    public android.view.ViewGroup p() {
        return this.f262929g;
    }

    @Override // fi2.m
    public void r() {
        android.widget.TextView textView;
        zi2.w wVar = this.f262801a;
        ((mm2.o4) wVar.P0(mm2.o4.class)).A.observe(wVar, new fi2.q0(this));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.y2) wVar.P0(mm2.y2.class)).B;
        liveMutableData.observe(wVar, new fi2.r0(this));
        xh2.e eVar = (xh2.e) liveMutableData.getValue();
        if (eVar != null) {
            lj2.k b17 = b();
            b17.getClass();
            java.lang.String title = eVar.f454543a;
            kotlin.jvm.internal.o.g(title, "title");
            if (b17.f318883d && (textView = b17.f318885g) != null) {
                textView.setText(title.concat(": "));
            }
            lj2.k b18 = b();
            b18.getClass();
            java.lang.String text = eVar.f454544b;
            kotlin.jvm.internal.o.g(text, "text");
            if (b18.f318883d) {
                android.widget.TextView textView2 = b18.f318881b;
                if (textView2 != null) {
                    textView2.setText(text);
                }
                b18.a();
            }
        }
    }

    @Override // fi2.m
    public android.view.View s() {
        android.view.View view = this.f262928f;
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ewf);
        }
        return null;
    }

    @Override // fi2.m
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (fi2.f0.f262831a[status.ordinal()] == 1) {
            this.f262941s = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            this.f262942t = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
        }
        dj2.b B = B();
        if (dj2.a.f232894a[status.ordinal()] == 1) {
            B.f232901h = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            if (bundle != null) {
                bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false);
            }
            if (!(B.f282613a != null)) {
                com.tencent.mars.xlog.Log.i("FinderLiveMicBaseRatioAdapter", "notifyAnchorModeSwitch layout isInitialized = false");
                return;
            }
            int childCount = B.d().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                if (B.d().getChildAt(i17) instanceof sj2.f) {
                    android.view.View childAt = B.d().getChildAt(i17);
                    kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.widget.focus.FinderLiveMicFocusAnchorCoverWidget");
                    ((sj2.f) childAt).c0(B.f232901h);
                }
            }
        }
    }

    @Override // fi2.m
    public void u(r45.xn1 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        pm0.v.X(new fi2.s0(this, contact));
    }

    @Override // fi2.m
    public android.view.View v() {
        android.view.View view = this.f262928f;
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.qxs);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0678  */
    @Override // fi2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(java.util.LinkedHashMap r23, xh2.b r24) {
        /*
            Method dump skipped, instructions count: 1691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.x0.w(java.util.LinkedHashMap, xh2.b):void");
    }

    @Override // fi2.m
    public void x(java.lang.String userName) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        xh2.b bVar = ((mm2.y2) this.f262801a.P0(mm2.y2.class)).f329565r;
        if (bVar == null || (linkedList = bVar.f454530i) == null) {
            return;
        }
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                km2.q qVar = ((xh2.a) next).f454520a;
                if (kotlin.jvm.internal.o.b(qVar != null ? qVar.f309172c : null, userName)) {
                    obj = next;
                    break;
                }
            }
        }
        xh2.a aVar = (xh2.a) obj;
        if (aVar != null) {
            ((ni2.r1) ((jz5.n) this.f262943u).getValue()).a(aVar);
        }
    }

    @Override // fi2.a
    public java.lang.String z() {
        return "NormalLiveCoverLogicCore";
    }

    public final lj2.k b() {
        return (lj2.k) ((jz5.n) this.f262944v).getValue();
    }
}
