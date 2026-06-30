package t21;

/* loaded from: classes12.dex */
public class o1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f414848d;

    public o1(t21.w0 w0Var) {
        this.f414848d = w0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.String, com.tencent.mm.storage.f9] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        ?? r86;
        t21.w0 w0Var = this.f414848d;
        w0Var.N();
        java.lang.String str2 = w0Var.f415042r;
        if (i17 == -21005) {
            java.lang.String str3 = w0Var.f415042r;
            return 0;
        }
        if (i17 != 0) {
            t21.d3.G(w0Var.f415033f);
            w0Var.f415031d.onSceneEnd(3, i17, "", w0Var);
            return 0;
        }
        w0Var.f415038n = t21.d3.h(w0Var.f415033f);
        t21.v2 v2Var = w0Var.f415038n;
        if (v2Var == null || v2Var.f415011i == 105) {
            int i18 = v2Var == null ? -1 : v2Var.f415011i;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s info is null or has paused, status:%d", w0Var.N(), java.lang.Integer.valueOf(i18));
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(w0Var.f415042r);
            w0Var.f415031d.onSceneEnd(3, i17, "info is null or has paused, status" + i18, w0Var);
            return 0;
        }
        if (gVar != null) {
            if (v2Var.f415006d > gVar.field_finishedLength) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", w0Var.N(), java.lang.Integer.valueOf(w0Var.f415038n.f415006d), java.lang.Long.valueOf(gVar.field_finishedLength));
                return 0;
            }
            v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
            t21.v2 v2Var2 = w0Var.f415038n;
            v2Var2.f415006d = (int) gVar.field_finishedLength;
            v2Var2.U = 1032;
            t21.d3.Q(v2Var2);
            return 0;
        }
        if (hVar != null) {
            if (hVar.field_retCode != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideo", "%s cdntra sceneResult.retCode :%d arg[%s] info[%s]", w0Var.N(), java.lang.Integer.valueOf(hVar.field_retCode), hVar.field_arg, hVar.field_transInfo);
                t21.d3.G(w0Var.f415033f);
                w0Var.f415031d.onSceneEnd(3, hVar.field_retCode, "", w0Var);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn uploadvideo by cdn, videohash isHitCacheUpload: %d, enableHitcheck:%b", w0Var.N(), java.lang.Integer.valueOf(hVar.field_UploadHitCacheType), java.lang.Boolean.valueOf(w0Var.f415041q));
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf((w0Var.f415046v ? 810 : w0Var.f415045u ? com.tencent.mm.plugin.appbrand.jsapi.pay.j1.CTRL_INDEX : 830) + hVar.field_UploadHitCacheType);
                objArr[1] = java.lang.Integer.valueOf(w0Var.f415038n.f415008f);
                g0Var.d(12696, objArr);
                boolean z18 = hVar.field_isVideoReduced;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s it video was reduced by cdn %b %s", w0Var.N(), java.lang.Boolean.valueOf(z18), w0Var.f415033f);
                if (z18) {
                    r86 = 0;
                    g0Var.idkeyStat(106L, 200L, 1L, false);
                } else {
                    java.lang.Object obj = null;
                    g0Var.idkeyStat(106L, 205L, 1L, false);
                    if (w0Var.f415047w > 0 && hVar.field_thumbimgLength > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s send video thumb too big thumb length [%d, %d] ", w0Var.N(), java.lang.Integer.valueOf(w0Var.f415047w), java.lang.Integer.valueOf(hVar.field_thumbimgLength));
                        if (w0Var.f415047w * 2 > hVar.field_thumbimgLength) {
                            g0Var.idkeyStat(106L, 206L, 1L, false);
                        } else {
                            g0Var.idkeyStat(106L, 207L, 1L, false);
                        }
                    }
                    int k17 = (int) com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, w0Var.f415033f, false));
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s send video too big thumb length [%d, %d] ", w0Var.N(), java.lang.Integer.valueOf(w0Var.f415038n.f415008f), java.lang.Integer.valueOf(k17));
                    if (w0Var.f415038n.f415008f != k17) {
                        g0Var.idkeyStat(106L, 208L, 1L, false);
                        r86 = obj;
                    } else {
                        g0Var.idkeyStat(106L, 209L, 1L, false);
                        r86 = obj;
                    }
                }
                w0Var.f415038n = t21.d3.h(w0Var.f415033f);
                if (com.tencent.mm.sdk.platformtools.t8.K0(w0Var.f415038n.g())) {
                    java.lang.String str4 = (((("<msg><videomsg aeskey=\"" + hVar.field_aesKey + "\" cdnthumbaeskey=\"" + hVar.field_aesKey + "\" cdnvideourl=\"" + hVar.field_fileId + "\" ") + "cdnthumburl=\"" + hVar.field_fileId + "\" ") + "length=\"" + hVar.field_fileLength + "\" ") + "thumbfullmd5=\"" + hVar.field_thumbfilemd5 + "\" ") + "cdnthumblength=\"" + hVar.field_thumbimgLength + "\"/>";
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str4);
                    java.lang.String str5 = w0Var.f415038n.N;
                    sb6.append(str5 != null ? str5 : "");
                    java.lang.String str6 = sb6.toString() + "</msg>";
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s cdn callback new build cdnInfo:%s", w0Var.N(), str6);
                    t21.v2 v2Var3 = w0Var.f415038n;
                    v2Var3.f415025w = str6;
                    t21.d3.Q(v2Var3);
                }
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(w0Var.f415038n.g(), "msg", r86);
                if (d17 != null) {
                    boolean B = t21.o2.Ui().B(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(r86, bm5.f0.f22571s, w0Var.f415033f, false), (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl"), (java.lang.String) d17.get(".msg.videomsg.$aeskey"));
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = java.lang.Integer.valueOf((B ? 1 : 2) + 900);
                    objArr2[1] = java.lang.Integer.valueOf(w0Var.f415038n.f415008f);
                    g0Var.d(12696, objArr2);
                }
                if (w0Var.f415038n.f415026x == 4) {
                    t21.w0.H(w0Var, hVar);
                    return 0;
                }
                f65.y0.f260019a.i(w0Var.f415033f, hVar.field_UploadHitCacheType);
                m11.m1 i19 = m11.m1.i();
                i19.f442141p = w0Var.f415033f;
                i19.f322752q = z18 ? 0 : w0Var.I();
                i19.f322753r = hVar;
                i19.f322754s = new t21.n1(this, hVar);
                i19.f442134i = 4;
                i19.a().a();
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
