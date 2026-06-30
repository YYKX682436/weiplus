package t21;

/* loaded from: classes12.dex */
public class h1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f414778d;

    public h1(t21.w0 w0Var) {
        this.f414778d = w0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        int i18;
        int i19;
        t21.w0 w0Var = this.f414778d;
        w0Var.N();
        if (i17 == -21005) {
            return 0;
        }
        if (i17 != 0) {
            t21.d3.G(w0Var.f415033f);
            f65.y0.f260019a.l(null, w0Var.f415033f, 3, 0L, 0L, 0L, 0L, false, i17);
            w0Var.f415031d.onSceneEnd(3, i17, "", w0Var);
            return 0;
        }
        t21.v2 h17 = t21.d3.h(w0Var.f415033f);
        w0Var.f415038n = h17;
        if (h17 != null && h17.f415011i != 105) {
            if (hVar != null) {
                if (hVar.field_retCode == 0) {
                    m11.m1 i27 = m11.m1.i();
                    i27.f442141p = w0Var.f415033f;
                    i27.f322752q = 0;
                    i27.f322753r = hVar;
                    i27.f322757v = w0Var.f415041q;
                    i27.f322754s = new t21.g1(this, hVar);
                    i27.f442134i = 20;
                    i27.a().a();
                    return 0;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideo", "%s cdntra sceneResult.retCode :%d arg[%s] info[%s]", w0Var.N(), java.lang.Integer.valueOf(hVar.field_retCode), hVar.field_arg, hVar.field_transInfo);
                t21.d3.G(w0Var.f415033f);
                f65.y0.f260019a.l(null, w0Var.f415033f, 3, 0L, 0L, 0L, 0L, false, hVar.field_retCode);
                w0Var.f415031d.onSceneEnd(3, hVar.field_retCode, "", w0Var);
            }
            return 0;
        }
        int i28 = h17 == null ? -1 : h17.f415011i;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s info is null or has paused, status:%d", w0Var.N(), java.lang.Integer.valueOf(i28));
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(w0Var.f415042r);
        if (w0Var.f415038n != null) {
            f65.y0 y0Var = f65.y0.f260019a;
            java.lang.String str2 = w0Var.f415033f;
            if (str2 != null) {
                ((ku5.t0) ku5.t0.f312615d).b(new f65.p0(str2), "MicroMsg.VideoSendReporter");
            }
            i18 = i28;
            i19 = 0;
        } else {
            i18 = i28;
            i19 = 0;
            f65.y0.f260019a.l(null, w0Var.f415033f, 5, 0L, 0L, 0L, 0L, false, i17);
        }
        w0Var.f415031d.onSceneEnd(3, i17, "info is null or has paused, status" + i18, w0Var);
        return i19;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
