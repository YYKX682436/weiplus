package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class e2 extends com.tencent.mm.plugin.finder.live.view.k2 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f116264p = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.x7 f116265h;

    /* renamed from: i, reason: collision with root package name */
    public final yi2.i0 f116266i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f116267m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.c2 f116268n;

    /* renamed from: o, reason: collision with root package name */
    public long f116269o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(gk2.e liveData, android.content.Context context, com.tencent.mm.plugin.finder.live.plugin.x7 plugin) {
        super(liveData, context);
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f116265h = plugin;
        this.f116269o = java.lang.System.currentTimeMillis();
        android.view.View.inflate(context, com.tencent.mm.R.layout.eam, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tlb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116266i = new yi2.i0(liveData, (android.view.ViewGroup) findViewById, plugin);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void a(int i17) {
        boolean z17 = this.f116433f == i17;
        this.f116432e = z17;
        if (z17) {
            o();
        } else {
            n();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void b() {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void c(int i17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void d(int i17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: all -> 0x019f, TryCatch #1 {, blocks: (B:18:0x0077, B:20:0x007b, B:23:0x0082, B:25:0x008a, B:33:0x00af, B:34:0x00ba, B:36:0x00c3), top: B:17:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #1 {, blocks: (B:18:0x0077, B:20:0x007b, B:23:0x0082, B:25:0x008a, B:33:0x00af, B:34:0x00ba, B:36:0x00c3), top: B:17:0x0077 }] */
    @Override // com.tencent.mm.plugin.finder.live.view.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.e2.e():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void f() {
        this.f116434g = false;
        if (this.f116432e) {
            n();
        }
        m(null, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void g(boolean z17, int i17) {
    }

    public final java.lang.String getAiAssistantId() {
        return this.f116267m;
    }

    public final com.tencent.mm.plugin.finder.live.view.c2 getOnAnchorApplyListListener() {
        return this.f116268n;
    }

    public final long getOpenTime() {
        return this.f116269o;
    }

    public final com.tencent.mm.plugin.finder.live.plugin.x7 getPlugin() {
        return this.f116265h;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void h(long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void j() {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void k(boolean z17, km2.q qVar) {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void l(gk2.e eVar) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.d2(eVar, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k2
    public void m(java.lang.String str, byte[] bArr) {
        this.f116267m = str;
        yi2.i0 i0Var = this.f116266i;
        if (i0Var != null) {
            i0Var.f462535x = str;
            i0Var.f462536y = bArr;
        }
    }

    public final void n() {
        fj2.s sVar;
        yi2.i0 i0Var = this.f116266i;
        if (i0Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", "onClose() called");
            i0Var.F.f();
            i0Var.L.removeCallbacksAndMessages(null);
            com.tencent.mm.app.s2 s2Var = i0Var.K;
            if (s2Var != null) {
                s2Var.dead();
            }
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) i0Var.f462537z;
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                sVar = fj2.s.f263183a;
                if (!hasNext) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                sVar.d(ml2.q2.Q, i0Var.f462535x, (hi2.a) entry.getValue());
            }
            linkedHashMap.clear();
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) i0Var.A;
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                sVar.d(ml2.q2.R, i0Var.f462535x, (hi2.a) entry2.getValue());
            }
            linkedHashMap2.clear();
            java.util.LinkedHashMap linkedHashMap3 = (java.util.LinkedHashMap) i0Var.B;
            for (java.util.Map.Entry entry3 : linkedHashMap3.entrySet()) {
                sVar.d(ml2.q2.T, i0Var.f462535x, (hi2.a) entry3.getValue());
            }
            linkedHashMap3.clear();
            i0Var.C = true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f116269o;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.q2 q2Var = ml2.q2.f327818e;
        jSONObject.put("type", 59);
        jSONObject.put("stay_time", currentTimeMillis);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveApplyLinkAnchorView", "reportExitTab: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328390y, jSONObject.toString(), null, 4, null);
    }

    public final void o() {
        yi2.i0 i0Var = this.f116266i;
        if (i0Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", "onOpen() called");
            i0Var.F.b();
            com.tencent.mm.app.s2 s2Var = i0Var.K;
            if (s2Var != null) {
                s2Var.alive();
            }
        }
        this.f116269o = java.lang.System.currentTimeMillis();
    }

    public final void setAiAssistantId(java.lang.String str) {
        this.f116267m = str;
    }

    public final void setOnAnchorApplyListListener(com.tencent.mm.plugin.finder.live.view.c2 c2Var) {
        this.f116268n = c2Var;
        yi2.i0 i0Var = this.f116266i;
        if (i0Var == null) {
            return;
        }
        i0Var.f462517J = c2Var;
    }

    public final void setOpenTime(long j17) {
        this.f116269o = j17;
    }
}
