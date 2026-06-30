package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yx {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.sx f120478f = new com.tencent.mm.plugin.finder.live.widget.sx(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f120479a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f120480b;

    /* renamed from: c, reason: collision with root package name */
    public gk2.e f120481c;

    /* renamed from: d, reason: collision with root package name */
    public kn0.r f120482d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f120483e;

    public yx(android.content.Context context, gk2.e buContext) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f120479a = context;
        this.f120480b = jz5.h.b(com.tencent.mm.plugin.finder.live.widget.xx.f120388d);
        this.f120481c = buContext;
    }

    public final void a(boolean z17) {
        kn0.i iVar;
        kn0.g gVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resolutionChange result:");
        sb6.append(z17);
        sb6.append(",modifyVideoDefinition:");
        sb6.append(this.f120483e);
        sb6.append(",showLevel:");
        kn0.r rVar = this.f120482d;
        sb6.append(rVar != null ? java.lang.Integer.valueOf(rVar.f309597b) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", sb6.toString());
        if (this.f120483e) {
            int i17 = 0;
            this.f120483e = false;
            if (z17) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                kn0.r rVar2 = this.f120482d;
                int i18 = rVar2 != null ? rVar2.f309597b : 0;
                gk2.e eVar = this.f120481c;
                if (eVar != null && (iVar = ((mm2.e1) eVar.a(mm2.e1.class)).f328990t) != null && (gVar = iVar.f309558b) != null) {
                    i17 = gVar.a();
                }
                r0Var.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("from_birate", i18);
                jSONObject.put("to_birate", i17);
                ml2.r0.hj(r0Var, ml2.b4.P, null, 0L, jSONObject.toString(), null, null, null, null, 244, null);
            }
            if (((java.lang.Boolean) ((jz5.n) this.f120480b).getValue()).booleanValue()) {
                android.content.Context context = this.f120479a;
                if (z17) {
                    db5.t7.h(context, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egw));
                } else {
                    db5.t7.g(context, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egu));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.yx.b(boolean, int):void");
    }
}
