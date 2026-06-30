package t21;

/* loaded from: classes12.dex */
public class c1 implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f414719a;

    public c1(t21.w0 w0Var) {
        this.f414719a = w0Var;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideo", "onUploadFailure, errCode:%s, uploadID:%s", java.lang.Integer.valueOf(i17), str);
        t21.w0 w0Var = this.f414719a;
        t21.d3.G(w0Var.f415033f);
        w0Var.f415031d.onSceneEnd(3, i17, "", w0Var);
    }

    @Override // z25.e
    public void b(float f17, long j17) {
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", jVar.f469824b, jVar.f469823a, java.lang.Long.valueOf(jVar.f469826d));
        dn.h hVar = new dn.h();
        hVar.field_aesKey = jVar.f469824b;
        hVar.field_fileId = jVar.f469823a;
        hVar.field_filemd5 = jVar.f469825c;
        hVar.field_fileLength = jVar.f469826d;
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, this.f414719a.f415033f, false);
        hVar.field_thumbimgLength = (int) com.tencent.mm.vfs.w6.k(this.f414719a.K(tj6));
        hVar.field_toUser = this.f414719a.f415038n.h();
        ((ku5.t0) ku5.t0.f312615d).g(new t21.z0(this, tj6));
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        t21.w0 w0Var = this.f414719a;
        d17.g(new t21.u1(w0Var.f415033f, w0Var.I(), hVar, new t21.b1(this)));
    }
}
