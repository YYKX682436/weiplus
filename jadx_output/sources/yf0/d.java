package yf0;

/* loaded from: classes12.dex */
public final class d implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf0.f f461516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f461517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f461518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f461519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f461520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f461522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p25.e f461523h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oi3.h f461524i;

    public d(yf0.f fVar, boolean z17, kotlinx.coroutines.q qVar, t21.v2 v2Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str, java.util.Map map, p25.e eVar, oi3.h hVar) {
        this.f461516a = fVar;
        this.f461517b = z17;
        this.f461518c = qVar;
        this.f461519d = v2Var;
        this.f461520e = h0Var;
        this.f461521f = str;
        this.f461522g = map;
        this.f461523h = eVar;
        this.f461524i = hVar;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        java.util.Map map = this.f461522g;
        if (map != null) {
            map.put("cgiUploadErrorCode", java.lang.Integer.valueOf(i17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f461516a.d());
        sb6.append(this.f461517b ? ya.b.ORIGIN : "");
        sb6.append(" parallelUploadFile onUploadFailure errCode:");
        sb6.append(i17);
        sb6.append(" parallelUploadID:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.VideoCGISendApi", sb6.toString());
        try {
            kotlinx.coroutines.q qVar = this.f461518c;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(-520022));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        long j18;
        yf0.f fVar = this.f461516a;
        qi3.g0 g0Var = fVar.f461549a.f363677f;
        if (g0Var == qi3.g0.f363713o) {
            z25.a aVar = ((z25.d) this.f461523h).f469776a;
            if (aVar != null ? aVar.f469751t : false) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(this.f461516a.d());
                sb6.append(' ');
                sb6.append(this.f461517b ? ya.b.ORIGIN : "");
                sb6.append(" onUploadProgress cancel and stop upload");
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoCGISendApi", sb6.toString());
                ((z25.d) this.f461523h).f();
                try {
                    kotlinx.coroutines.q qVar = this.f461518c;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(-510001));
                    return;
                } catch (java.lang.Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (g0Var == qi3.g0.f363709h) {
            fVar.d();
            if (!this.f461517b) {
                vf0.m3.m(this.f461519d, j17);
                zf0.v0 v0Var = this.f461516a.f461549a;
                v0Var.getClass();
                j18 = f17 > 0.0f ? ((float) j17) / f17 : 0L;
                v0Var.f472570s = j17;
                v0Var.f472571t = j18;
                v0Var.J();
                return;
            }
            t21.v2 f18 = vf0.m3.f(this.f461524i);
            if (f18 != null) {
                vf0.m3.m(f18, j17);
            }
            zf0.v0 v0Var2 = this.f461516a.f461549a;
            v0Var2.getClass();
            j18 = f17 > 0.0f ? ((float) j17) / f17 : 0L;
            v0Var2.f472572u = j17;
            v0Var2.f472573v = j18;
            v0Var2.J();
        }
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        int i17;
        boolean z17 = this.f461517b;
        yf0.f fVar = this.f461516a;
        if (jVar != null) {
            java.lang.String h17 = this.f461519d.h();
            kotlin.jvm.internal.o.f(h17, "getUser(...)");
            java.lang.String str = (java.lang.String) this.f461520e.f310123d;
            java.lang.String sendVideoPath = this.f461521f;
            kotlin.jvm.internal.o.g(sendVideoPath, "sendVideoPath");
            dn.h hVar = new dn.h();
            hVar.field_toUser = h17;
            hVar.field_aesKey = jVar.f469824b;
            hVar.field_fileId = jVar.f469823a;
            hVar.field_filemd5 = jVar.f469825c;
            hVar.field_fileLength = jVar.f469826d;
            if (str != null) {
                hVar.field_thumbimgLength = (int) com.tencent.mm.vfs.w6.k(str);
            }
            hVar.field_filecrc = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(sendVideoPath);
            hVar.field_mp4identifymd5 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(sendVideoPath);
            vf0.m3.b(hVar, z17, fVar.f461549a.f472563i);
            i17 = 0;
        } else {
            i17 = -520009;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(fVar.d());
        sb6.append(' ');
        sb6.append(z17 ? ya.b.ORIGIN : "");
        sb6.append(" parallelUploadFile onUploadFinish ret:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoCGISendApi", sb6.toString());
        java.lang.Integer e17 = qi3.c.e(fVar.f461549a, false, 1, null);
        if (e17 != null) {
            i17 = e17.intValue();
        }
        kotlinx.coroutines.q qVar = this.f461518c;
        try {
            if (i17 != 0) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(i17)));
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(0));
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
