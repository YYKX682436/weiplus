package df2;

/* loaded from: classes3.dex */
public final class v0 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public long f231572m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f231573n;

    /* renamed from: o, reason: collision with root package name */
    public r45.yg7 f231574o;

    /* renamed from: p, reason: collision with root package name */
    public az2.j f231575p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f231576q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231573n = "";
        this.f231574o = r45.yg7.FinderLiveImgSource_PhotoAlbum;
    }

    public static final void Z6(df2.v0 v0Var, int i17, df2.k0 k0Var) {
        v0Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveEditCoverController", "reportEditCoverSheetAction " + i17 + ", " + k0Var);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("element", k0Var.f230535d);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328381u2, jSONObject.toString(), null, 4, null);
    }

    public static final void a7(df2.v0 v0Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = v0Var.f231576q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        v0Var.f231576q = com.tencent.mm.ui.widget.dialog.u3.f(v0Var.O6(), v0Var.O6().getString(com.tencent.mm.R.string.f490604zq), true, 3, new df2.u0(v0Var));
    }

    public final java.lang.Object b7(r45.lw1 lw1Var, boolean z17, int i17, kotlin.coroutines.Continuation continuation) {
        boolean z18 = true;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 6);
        jSONObject.put("type", 1);
        jSONObject.put("sub_element", 7);
        jSONObject.put("sub_type", 3);
        java.lang.String str = this.f231573n;
        if (str != null && str.length() != 0) {
            z18 = false;
        }
        if (!z18) {
            jSONObject.put("ai_msg_id", this.f231573n);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        v65.n nVar = new v65.n(rVar);
        ek2.r1 r1Var = new ek2.r1(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) business(mm2.e1.class)).f328983m, i17, ek2.r1.f253524u.d(lw1Var));
        pq5.g l17 = r1Var.l();
        l17.K(new df2.m0(nVar, this, z17));
        l17.f((com.tencent.mm.ui.MMActivity) O6());
        this.f231575p = r1Var;
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final boolean c7() {
        return (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_force_enable_cover_enhance, 0) == 1) || ((mm2.f1) business(mm2.f1.class)).f329021g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(java.lang.String r7, r45.yg7 r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.v0.d7(java.lang.String, r45.yg7, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e7() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(O6(), 1, true);
        android.content.res.Resources resources = O6().getResources();
        java.lang.Object[] objArr = new java.lang.Object[2];
        r45.z02 z02Var = ((mm2.f1) business(mm2.f1.class)).f329020f;
        objArr[0] = java.lang.Integer.valueOf(z02Var != null ? z02Var.getInteger(1) : 0);
        r45.z02 z02Var2 = ((mm2.f1) business(mm2.f1.class)).f329020f;
        objArr[1] = java.lang.Integer.valueOf(z02Var2 != null ? z02Var2.getInteger(0) : 0);
        k0Var.q(resources.getString(com.tencent.mm.R.string.e66, objArr), 17);
        k0Var.f211872n = new df2.p0(this);
        k0Var.f211881s = new df2.r0(this);
        k0Var.C = new df2.s0(this);
        k0Var.v();
    }

    public final void f7(java.lang.String str) {
        r45.z02 z02Var = ((mm2.f1) business(mm2.f1.class)).f329020f;
        if ((z02Var != null ? z02Var.getInteger(0) : 0) <= 0) {
            db5.t7.g(N6(), O6().getResources().getString(com.tencent.mm.R.string.e67));
            return;
        }
        if (c01.id.c() - this.f231572m < 60000) {
            db5.t7.g(N6(), O6().getResources().getString(com.tencent.mm.R.string.e68));
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f231573n = str;
        if (U6()) {
            W6(new df2.t0(this));
        } else {
            e7();
        }
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.MMActivity N6;
        android.net.Uri data;
        r5 = null;
        java.lang.String str = null;
        if (i17 == 100115) {
            if (i18 != -1) {
                return;
            }
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = intent != null ? (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            if ((captureDataManager$CaptureVideoNormalModel != null ? captureDataManager$CaptureVideoNormalModel.f155662f : null) == null || !com.tencent.mm.vfs.w6.j(captureDataManager$CaptureVideoNormalModel.f155662f)) {
                return;
            }
            java.lang.String str2 = captureDataManager$CaptureVideoNormalModel.f155662f;
            r45.yg7 yg7Var = this.f231574o;
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("key_extra_data") : null;
            boolean z17 = bundleExtra != null ? bundleExtra.getBoolean("has_apply_hd", false) : false;
            this.f231574o = r45.yg7.FinderLiveImgSource_PhotoAlbum;
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.n0(this, str2, yg7Var, z17, null), 3, null);
            return;
        }
        if (i17 == 155001 && i18 == -1) {
            if (intent != null && (data = intent.getData()) != null) {
                str = data.getPath();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                com.tencent.mm.ui.MMActivity N62 = N6();
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                java.lang.String str3 = com.tencent.mm.plugin.finder.assist.e9.f102143l;
                ((ub0.r) oVar).getClass();
                str = com.tencent.mm.pluginsdk.ui.tools.l7.b(N62, intent, str3);
            }
            java.lang.String str4 = str;
            if (str4 == null || (N6 = N6()) == null) {
                return;
            }
            zl2.k.f473851a.a(N6, str4, 100115, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? false : c7(), (r17 & 32) != 0 ? r45.bo1.FinderLiveCoverImageEnhanceScene_CreateLive : r45.bo1.FinderLiveCoverImageEnhanceScene_ChangeCover, (r17 & 64) != 0 ? false : false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }
}
