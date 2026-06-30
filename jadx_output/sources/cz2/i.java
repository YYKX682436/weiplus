package cz2;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final cz2.j f225008a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f225009b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f225010c;

    /* renamed from: d, reason: collision with root package name */
    public final fp.j f225011d;

    /* renamed from: e, reason: collision with root package name */
    public long f225012e;

    /* renamed from: f, reason: collision with root package name */
    public long f225013f;

    /* renamed from: g, reason: collision with root package name */
    public final int f225014g;

    /* renamed from: h, reason: collision with root package name */
    public long f225015h;

    /* renamed from: i, reason: collision with root package name */
    public int f225016i;

    public i(cz2.j cigTrack) {
        kotlin.jvm.internal.o.g(cigTrack, "cigTrack");
        this.f225008a = cigTrack;
        this.f225009b = "Finder.FinderCgiReport";
        this.f225010c = "Finder.FinderCgiDetail" + hashCode();
        this.f225011d = new fp.j();
        this.f225014g = ((java.lang.Number) kb2.d.f306230a.r()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r27, int r28, java.lang.String r29, com.tencent.mm.modelbase.o r30) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cz2.i.a(int, int, java.lang.String, com.tencent.mm.modelbase.o):void");
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        java.lang.String substring;
        if (str2.length() < 4000) {
            com.tencent.mars.xlog.Log.i(str, str2);
            return;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < str2.length()) {
            int i19 = i17 + 4000;
            if (str2.length() <= i19) {
                substring = str2.substring(i17);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
            } else {
                substring = str2.substring(i17, i19);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
            }
            com.tencent.mars.xlog.Log.i(str, "=>id:" + i18 + ' ' + substring);
            i18++;
            i17 = i19;
        }
    }

    public final void c(com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        this.f225011d.b();
        this.f225015h = c01.id.c();
        boolean z17 = true;
        if (this.f225014g == 1) {
            cz2.e eVar = cz2.e.f224991a;
            java.lang.String str = oVar != null ? oVar.f70712c : null;
            if (str != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (!cz2.e.f224992b.contains(r26.n0.p0(str, "/", str))) {
                    z17 = false;
                }
            }
            if (z17 || oVar == null || (fVar = oVar.f70710a.f70684a) == null) {
                return;
            }
            java.lang.String str2 = "##########request uri: ===> " + oVar.f70712c;
            java.lang.String str3 = this.f225010c;
            com.tencent.mars.xlog.Log.i(str3, str2);
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            b(str3, "uri:" + oVar.f70712c + " request buf: " + pm0.b0.g(fVar));
        }
    }
}
