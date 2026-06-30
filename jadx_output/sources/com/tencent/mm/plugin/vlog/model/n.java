package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class n implements com.tencent.mm.plugin.vlog.model.f0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f175681p = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f175684c;

    /* renamed from: h, reason: collision with root package name */
    public int f175689h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f175691j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f175692k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f175693l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f175694m;

    /* renamed from: n, reason: collision with root package name */
    public rm5.v f175695n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f175696o;

    /* renamed from: a, reason: collision with root package name */
    public int f175682a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f175683b = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f175685d = true;

    /* renamed from: e, reason: collision with root package name */
    public final ko4.e f175686e = new ko4.e(false, false, 3, null);

    /* renamed from: f, reason: collision with root package name */
    public final lo4.b f175687f = new lo4.b(false, false, null);

    /* renamed from: g, reason: collision with root package name */
    public int f175688g = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f175690i = new java.util.LinkedList();

    static {
        new java.util.LinkedList();
    }

    public final boolean c(boolean z17) {
        boolean z18 = false;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_soft_encode_audio_enable, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CompositionExporter", "exportImpl: audio soft enable");
            z18 = true;
        }
        if (!z18 && z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_soft_encode_audio_fallback, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CompositionExporter", "exportImpl: audio soft fallback");
                return true;
            }
        }
        return z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0776, code lost:
    
        if (r9 == 2) goto L284;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0793 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0555  */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float d(r45.h70 r45, yz5.l r46) {
        /*
            Method dump skipped, instructions count: 2790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.n.d(r45.h70, yz5.l):float");
    }

    public final int e() {
        xo4.d dVar = xo4.d.f455770a;
        if (!kz5.z.G(xo4.d.f455772c, java.lang.Integer.valueOf(this.f175684c))) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("video_composition_export_config");
            kotlin.jvm.internal.o.f(M, "getMMKV(...)");
            return M.getInt("fallback_size", 0);
        }
        i95.m c17 = i95.n0.c(e42.e0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((h62.d) ((e42.e0) c17)).Ni(e42.c0.clicfg_finder_post_disable_remux_fallback_size, 1) == 1) {
            return 0;
        }
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("video_composition_export_config");
        kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
        return M2.getInt("finder_fallback_size", 0);
    }

    public java.lang.String f(r45.h70 h70Var) {
        kotlin.jvm.internal.o.g(h70Var, "<this>");
        java.lang.String str = h70Var.f375909s;
        if (str != null) {
            return str;
        }
        java.lang.String outputPath = h70Var.f375902i.f376775d;
        kotlin.jvm.internal.o.f(outputPath, "outputPath");
        return outputPath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0230, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiMediaIDKeyStat", "cannot get videoInfo path:".concat(r1));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1372, 0, 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.tencent.mm.plugin.vlog.model.h1 r25, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.n.g(com.tencent.mm.plugin.vlog.model.h1, java.lang.String, boolean):void");
    }

    public int h(int i17, int i18) {
        if (i17 <= i18) {
            return i18;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf((i18 - 1) & i17);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return i17;
        }
        int intValue = valueOf.intValue();
        return intValue * 2 > i18 ? (i17 - intValue) + i18 : i17 - intValue;
    }

    public void i(boolean z17, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        kotlin.jvm.internal.o.g(videoTransPara, "videoTransPara");
        this.f175691j = z17;
        this.f175692k = videoTransPara;
    }
}
