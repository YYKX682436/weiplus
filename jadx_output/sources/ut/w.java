package ut;

/* loaded from: classes12.dex */
public final class w implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oi3.g f430762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f430763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v05.b f430765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f430766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p25.e f430767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f430768h;

    public w(ut.q0 q0Var, oi3.g gVar, kotlinx.coroutines.q qVar, java.lang.String str, v05.b bVar, com.tencent.mm.pluginsdk.model.app.d dVar, p25.e eVar, long j17) {
        this.f430761a = q0Var;
        this.f430762b = gVar;
        this.f430763c = qVar;
        this.f430764d = str;
        this.f430765e = bVar;
        this.f430766f = dVar;
        this.f430767g = eVar;
        this.f430768h = j17;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ut.q0 q0Var = this.f430761a;
        sb6.append(q0Var.id());
        sb6.append(" parallelUploadFile cgi onUploadFailure errCode:");
        sb6.append(i17);
        sb6.append(" parallelUploadID:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendFileTask", sb6.toString());
        try {
            q0Var.f430712o.f430726j.put("send_parallel_upload_ret", java.lang.Integer.valueOf(i17));
            kotlinx.coroutines.q qVar = this.f430763c;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(-520022));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        ut.q0 q0Var = this.f430761a;
        java.lang.Integer e17 = qi3.c.e(q0Var, false, 1, null);
        if (e17 == null) {
            if (q0Var.f363677f == qi3.g0.f363709h) {
                q0Var.d0(((((float) j17) / ((float) this.f430768h)) * 50.0f) + 40.0f, true);
                return;
            }
            return;
        }
        kotlinx.coroutines.q qVar = this.f430763c;
        e17.intValue();
        z25.d dVar = (z25.d) this.f430767g;
        z25.a aVar = dVar.f469776a;
        if (aVar != null ? aVar.f469751t : false) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendFileTask", q0Var.id() + " onUploadProgress cancel and stop upload");
            dVar.f();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(-510001));
            } catch (java.lang.Throwable unused) {
            }
        }
        e17.intValue();
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ut.q0 q0Var = this.f430761a;
        sb6.append(q0Var.id());
        sb6.append(" parallelUploadFile cgi onUploadSuccess fileMd5:");
        sb6.append(jVar != null ? jVar.f469825c : null);
        sb6.append(" msgId:");
        oi3.g gVar = this.f430762b;
        sb6.append(gVar.getLong(gVar.f345617d + 0));
        sb6.append(" talker:");
        sb6.append(gVar.getString(gVar.f345617d + 3));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendFileTask", sb6.toString());
        if (jVar != null) {
            dn.h hVar = new dn.h();
            hVar.field_aesKey = jVar.f469824b;
            hVar.field_fileId = jVar.f469823a;
            hVar.field_filemd5 = jVar.f469825c;
            hVar.field_fileLength = jVar.f469826d;
            hVar.field_filecrc = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(this.f430764d);
            i17 = q0Var.c0(hVar, this.f430765e, this.f430766f);
        } else {
            i17 = -520009;
        }
        kotlinx.coroutines.q qVar = this.f430763c;
        try {
            if (i17 != 0) {
                qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(i17)));
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(0));
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
