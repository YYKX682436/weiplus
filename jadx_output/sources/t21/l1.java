package t21;

/* loaded from: classes12.dex */
public class l1 implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f414831a;

    public l1(t21.w0 w0Var) {
        this.f414831a = w0Var;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideo", "onUploadFailure, errCode:%s, uploadID:%s", java.lang.Integer.valueOf(i17), str);
        t21.w0 w0Var = this.f414831a;
        t21.d3.G(w0Var.f415033f);
        w0Var.f415031d.onSceneEnd(3, i17, "", w0Var);
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        t21.w0 w0Var = this.f414831a;
        t21.v2 h17 = t21.d3.h(w0Var.f415033f);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideo", "%s info is null", w0Var.N());
            return;
        }
        if (h17.f415006d > j17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", w0Var.N(), java.lang.Integer.valueOf(h17.f415006d), java.lang.Long.valueOf(j17));
            return;
        }
        h17.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        h17.f415006d = (int) j17;
        h17.U = 1032;
        t21.d3.Q(h17);
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", jVar.f469824b, jVar.f469823a, java.lang.Long.valueOf(jVar.f469826d));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        long j17 = this.f414831a.f415043s;
        dn.h hVar = new dn.h();
        hVar.field_aesKey = jVar.f469824b;
        hVar.field_fileId = jVar.f469823a;
        hVar.field_filemd5 = jVar.f469825c;
        hVar.field_fileLength = jVar.f469826d;
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f22571s;
        java.lang.String rj6 = ((k90.b) u0Var).rj(null, f0Var, this.f414831a.f415033f, false);
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, this.f414831a.f415033f, false);
        hVar.field_thumbimgLength = (int) com.tencent.mm.vfs.w6.k(this.f414831a.K(tj6));
        hVar.field_filecrc = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(rj6);
        hVar.field_toUser = this.f414831a.f415038n.h();
        ((ku5.t0) ku5.t0.f312615d).g(new t21.i1(this, tj6));
        t21.v2 h17 = t21.d3.h(this.f414831a.f415033f);
        if (com.tencent.mm.sdk.platformtools.t8.K0(h17.g())) {
            java.lang.String str = ((("<msg><videomsg aeskey=\"" + hVar.field_aesKey + "\" cdnthumbaeskey=\"" + hVar.field_aesKey + "\" cdnvideourl=\"" + hVar.field_fileId + "\" ") + "cdnthumburl=\"" + hVar.field_fileId + "\" ") + "length=\"" + hVar.field_fileLength + "\" ") + "cdnthumblength=\"" + hVar.field_thumbimgLength + "\"/>";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            java.lang.String str2 = h17.N;
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            java.lang.String str3 = sb6.toString() + "</msg>";
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s cdn callback new build cdnInfo:%s", this.f414831a.N(), str3);
            h17.f415025w = str3;
            t21.d3.Q(h17);
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(h17.g(), "msg", null);
        if (d17 != null) {
            t21.o2.Ui().B(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, f0Var, this.f414831a.f415033f, false), (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl"), (java.lang.String) d17.get(".msg.videomsg.$aeskey"));
        }
        if (h17.f415026x == 4) {
            t21.w0.H(this.f414831a, hVar);
            t21.w0 w0Var = this.f414831a;
            w0Var.f415031d.onSceneEnd(0, 0, "", w0Var);
            this.f414831a.M(hVar);
            return;
        }
        f65.y0.f260019a.i(this.f414831a.f415033f, hVar.field_UploadHitCacheType);
        com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
        t21.w0 w0Var2 = this.f414831a;
        d18.g(new t21.q1(w0Var2.f415033f, w0Var2.I(), hVar, new t21.k1(this, h17)));
    }
}
