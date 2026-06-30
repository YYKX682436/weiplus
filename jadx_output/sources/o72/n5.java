package o72;

/* loaded from: classes4.dex */
public class n5 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f343424d;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f343426f;

    /* renamed from: g, reason: collision with root package name */
    public final int f343427g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f343428h;

    /* renamed from: i, reason: collision with root package name */
    public final int f343429i;

    /* renamed from: m, reason: collision with root package name */
    public final o72.m5 f343430m;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f343425e = null;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.SparseArray f343431n = new android.util.SparseArray();

    public n5(java.lang.String str, int i17, java.util.List list, o72.m5 m5Var, int i18) {
        this.f343430m = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.g46();
        lVar.f70665b = new r45.h46();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sharefav";
        lVar.f70667d = com.hilive.mediasdk.SdkInfo.ErrCode.kErrCodeNotFound;
        lVar.f70668e = 246;
        lVar.f70669f = 1000000246;
        this.f343424d = lVar.a();
        this.f343426f = str;
        this.f343427g = i17;
        this.f343428h = list;
        this.f343430m = m5Var;
        this.f343429i = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.o oVar = this.f343424d;
        r45.g46 g46Var = (r45.g46) oVar.f70710a.f70684a;
        g46Var.f374879d = this.f343426f;
        g46Var.f374880e = this.f343427g;
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f343428h);
        g46Var.f374882g = linkedList;
        g46Var.f374881f = linkedList.size();
        this.f343425e = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.hilive.mediasdk.SdkInfo.ErrCode.kErrCodeNotFound;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        android.util.SparseArray sparseArray = this.f343431n;
        sparseArray.clear();
        if (i18 == 4 && i19 != 0) {
            o72.d2.f(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, i19, str);
        }
        boolean z17 = i18 == 0 && i19 == 0;
        java.util.HashSet hashSet = o72.d2.f343319a;
        o72.w2 w2Var = o72.w2.f343509a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[createReportSession] create report session = " + currentTimeMillis);
        w2Var.f(3, currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[startFavForwardReportEnv] session = " + currentTimeMillis);
        long d17 = w2Var.d(3);
        com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct c17 = w2Var.c();
        if (c17 == null || d17 == -4369) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavApiUtil", "[reportFavForwardQualityForSns] struct == null, session = " + d17 + ", return");
        } else {
            c17.f56294d = this.f343429i;
            c17.f56295e = 2;
            if (z17) {
                c17.f56296f = 0;
            } else {
                c17.f56296f = -1;
                c17.f56297g = i18;
                c17.f56298h = i19;
            }
        }
        w2Var.c().k();
        w2Var.g(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[endFavForwardReportEnv] session");
        if (i18 == 0 && i19 == 0) {
            r45.h46 h46Var = (r45.h46) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            int i27 = h46Var.f375832d;
            java.util.List list = this.f343428h;
            if (i27 != list.size()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneShareFavItem", "get url error, request count %d, response count %d", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(h46Var.f375832d));
            }
            int i28 = 0;
            while (true) {
                java.util.LinkedList linkedList = h46Var.f375833e;
                if (i28 >= linkedList.size() || i28 >= list.size()) {
                    break;
                }
                list.get(i28);
                linkedList.get(i28);
                sparseArray.put(((java.lang.Integer) list.get(i28)).intValue(), ((r45.du5) linkedList.get(i28)).f372756d);
                i28++;
            }
        }
        this.f343425e.onSceneEnd(i18, i19, str, this);
        o72.m5 m5Var = this.f343430m;
        if (m5Var != null) {
            com.tencent.mm.plugin.fav.ui.z5 z5Var = (com.tencent.mm.plugin.fav.ui.z5) m5Var;
            o72.r2 r2Var = z5Var.f101648a;
            java.lang.String str2 = (java.lang.String) sparseArray.get(r2Var.field_id);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                int i29 = r2Var.field_type;
                if (4 == i29) {
                    r45.gp0 J2 = o72.x1.J(r2Var);
                    java.lang.String str3 = J2.f375404d;
                    android.content.Context context = z5Var.f101649b;
                    java.lang.String string = context.getString(com.tencent.mm.R.string.cdy);
                    if (str3 == null) {
                        str3 = string;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Ksnsupload_link", str2);
                    intent.putExtra("Ksnsupload_title", str3);
                    intent.putExtra("Ksnsupload_imgbuf", com.tencent.mm.vfs.w6.N(o72.x1.X(J2), 0, -1));
                    intent.putExtra("Ksnsupload_type", 1);
                    j45.l.j(context, "sns", ".ui.SnsUploadUI", intent, null);
                    java.lang.String str4 = "fav_" + c01.z1.r() + "_" + r2Var.field_id;
                    java.lang.String a17 = c01.n2.a(str4);
                    c01.n2.d().c(a17, true).i("prePublishId", str4);
                    intent.putExtra("reportSessionId", a17);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "unknown type %d, fav id %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(r2Var.field_id));
                }
            }
            java.lang.Runnable runnable = z5Var.f101650c;
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
            }
        }
    }
}
