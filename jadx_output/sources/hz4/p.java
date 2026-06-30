package hz4;

/* loaded from: classes12.dex */
public class p extends hz4.h implements com.tencent.mm.modelbase.u0 {
    public static final java.util.HashMap R = new java.util.HashMap();
    public o72.r2 B;
    public java.lang.String F;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f286444J;
    public java.lang.String K;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f286448x;

    /* renamed from: u, reason: collision with root package name */
    public long f286445u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f286446v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f286447w = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f286449y = "";

    /* renamed from: z, reason: collision with root package name */
    public boolean f286450z = false;
    public boolean A = false;
    public boolean C = true;
    public int D = 0;
    public int E = 0;
    public int G = 0;
    public long H = 0;
    public r45.dq0 I = new r45.dq0();
    public byte[] L = null;
    public boolean M = false;
    public java.lang.String N = "";
    public java.lang.String P = "";
    public java.lang.String Q = null;

    public p() {
        this.f286415f.clear();
        this.f286414e = null;
        this.f286420n = false;
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        c01.d9.e().a(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, this);
    }

    public static void r(hz4.p pVar, r45.bq0 bq0Var, boolean z17, int i17) {
        pVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(bq0Var == null);
        objArr[1] = java.lang.Boolean.valueOf(z17);
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteFavProcess", "processNoteData: start, favProtoItem null=%b, allowNull=%b, dealScene=%d", objArr);
        if (bq0Var != null || z17) {
            o72.r2 r2Var = new o72.r2();
            r2Var.field_localId = pVar.f286445u;
            r2Var.field_favProto = bq0Var;
            pVar.f286421o = bq0Var;
            pVar.f286414e = r2Var;
            pVar.B = r2Var;
        }
        if (pVar.q()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteFavProcess", "processNoteData: skip");
            return;
        }
        java.util.HashMap hashMap = R;
        if (hashMap.containsKey(pVar.B)) {
            pVar.f286413d = (iz4.m) hashMap.get(pVar.B);
        } else {
            pVar.u();
        }
        iz4.m mVar = pVar.f286413d;
        if (mVar != null) {
            pVar.b(mVar.f296123a, true, i17);
        }
        mz4.j0 j0Var = mz4.j0.f333290v;
        if (j0Var == null || j0Var == null) {
            return;
        }
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h;
        noteEditorUI.getClass();
        noteEditorUI.q7(true, false);
    }

    @Override // hz4.h
    public boolean a(android.content.Context context, java.lang.String str) {
        return false;
    }

    @Override // hz4.h
    public void b(java.util.List list, boolean z17, int i17) {
        o72.r2 r2Var = this.B;
        if (r2Var != null) {
            r2Var.w0("MicroMsg.WNNoteFavProcess", o72.r2.H1);
        }
        super.b(list, z17, i17);
    }

    @Override // hz4.h
    public void c(r45.gp0 gp0Var) {
        iz4.m mVar = this.f286413d;
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 28;
        z9Var.f8532e = mVar.f296124b.field_localId;
        z9Var.f8533f = gp0Var;
        z9Var.f8542o = "";
        z9Var.f8540m = 18;
        favoriteOperationEvent.e();
    }

    @Override // hz4.h
    public void d(r45.gp0 gp0Var, java.lang.String str) {
        iz4.m mVar = this.f286413d;
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 28;
        z9Var.f8532e = mVar.f296124b.field_localId;
        z9Var.f8533f = gp0Var;
        z9Var.f8542o = str;
        z9Var.f8540m = 18;
        favoriteOperationEvent.e();
    }

    @Override // hz4.h
    public java.lang.String e(r45.gp0 gp0Var) {
        return hz4.l.c(gp0Var);
    }

    @Override // hz4.h
    public java.lang.String h() {
        if (this.Q == null) {
            java.lang.String str = "";
            if (android.text.TextUtils.isEmpty(this.f286448x)) {
                o72.r2 r2Var = this.B;
                if (r2Var != null) {
                    str = java.lang.String.valueOf(r2Var.field_id);
                }
            } else {
                com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(this.f286448x);
                if (b17 != null) {
                    str = java.lang.String.valueOf(b17.field_snsId);
                }
            }
            if (android.text.TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.Q = str;
        }
        return this.Q;
    }

    @Override // hz4.h
    public java.lang.String i() {
        return this.f286449y;
    }

    @Override // hz4.h
    public java.lang.String j(r45.gp0 gp0Var) {
        return hz4.l.e(gp0Var);
    }

    @Override // hz4.h
    public void k(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.util.Map map = this.f286417h;
        iz4.u uVar = (iz4.u) ((java.util.LinkedHashMap) map).get(str);
        if (uVar != null && com.tencent.mm.vfs.w6.j(uVar.f296135s)) {
            if (((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(uVar.f296158v)) {
                bw5.l80 wi6 = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).wi(uVar.f296135s, uVar.f296158v, uVar.f296156t, null);
                il4.e eVar = new il4.e();
                eVar.f292106c = 1500;
                eVar.f292107d = false;
                ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ni(wi6, eVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteFavProcess", "goToFile playLocalFile by ting");
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("fav_open_from_wnnote", true);
        intent.putExtra("fav_note_xml", this.f286449y);
        if (uVar != null) {
            o72.r2 a17 = hz4.l.a(this.f286445u);
            if (a17 != null) {
                java.util.Iterator it = a17.field_favProto.f370964f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f296103a;
                        break;
                    }
                    r45.gp0 gp0Var = (r45.gp0) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.P1) && gp0Var.P1.equals(str)) {
                        str2 = gp0Var.T;
                        break;
                    }
                }
            } else {
                str2 = ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f296103a;
            }
            intent.putExtra("key_detail_data_id", str2);
        }
        intent.putExtra("key_detail_can_delete", false);
        intent.putExtra("key_detail_info_id", this.f286445u);
        intent.putExtra("key_detail_fav_scene", this.I.f372653d);
        intent.putExtra("key_detail_fav_sub_scene", this.I.f372654e);
        intent.putExtra("key_detail_fav_index", this.I.f372655f);
        o72.x1.M0(context, ".ui.detail.FavoriteFileDetailUI", intent, 1, null);
    }

    @Override // hz4.h
    public void l(android.content.Context context, java.lang.String str) {
        if (mz4.m.f333318a.a()) {
            s(context, str);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("fav_open_from_wnnote", true);
        intent.putExtra("fav_note_xml", this.f286449y);
        java.util.Map map = this.f286417h;
        if (((java.util.LinkedHashMap) map).get(str) != null) {
            intent.putExtra("key_detail_data_id", ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f296103a);
        }
        intent.putExtra("key_detail_info_id", this.f286445u);
        intent.putExtra("key_detail_fav_scene", this.I.f372653d);
        intent.putExtra("key_detail_fav_sub_scene", this.I.f372654e);
        intent.putExtra("key_detail_fav_index", this.I.f372655f);
        o72.x1.M0(context, ".ui.FavImgGalleryUI", intent, 1, null);
    }

    @Override // hz4.h
    public void m(android.content.Context context, java.lang.String str) {
        iz4.s sVar = (iz4.s) ((java.util.LinkedHashMap) this.f286417h).get(str);
        if (sVar == null) {
            db5.e1.T(context, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cc9));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kwebmap_slat", sVar.f296149u);
        intent.putExtra("kwebmap_lng", sVar.f296150v);
        intent.putExtra("kPoiName", sVar.f296148t);
        intent.putExtra("Kwebmap_locaion", sVar.f296152x);
        double d17 = sVar.f296151w;
        if (d17 >= 0.0d) {
            intent.putExtra("kwebmap_scale", d17);
        }
        intent.putExtra("kPoiid", sVar.f296153y);
        intent.putExtra("KIsFromPoiList", sVar.f296154z);
        intent.putExtra("KPoiCategoryTips", sVar.A);
        intent.putExtra("kPoiBusinessHour", sVar.B);
        intent.putExtra("KPoiPhone", sVar.C);
        intent.putExtra("KPoiPriceTips", sVar.D);
        intent.putExtra("kBuildingID", sVar.E);
        intent.putExtra("kFloorName", sVar.F);
        intent.putExtra("kisUsername", "");
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("map_view_type", 12);
        intent.putExtra("kFavInfoLocalId", this.f286445u);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        j45.l.n(context, ya.b.LOCATION, ".ui.RedirectUI", intent, 1);
    }

    @Override // hz4.h
    public boolean n(android.content.Context context, java.lang.String str) {
        if (!mz4.m.f333318a.a()) {
            return false;
        }
        s(context, str);
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 426 && (m1Var instanceof o72.l5)) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8543p = m1Var;
            z9Var.f8528a = 31;
            favoriteOperationEvent.e();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(favoriteOperationEvent.f54244h.f6136c) && i18 == -435) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WNNoteFavProcess", "wenote conflict when commit");
            }
            c01.d9.e().q(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, this);
        }
    }

    public final void s(android.content.Context context, java.lang.String str) {
        o72.x1.M0(context, ".ui.gallery.FavMediaGalleryUI", new android.content.Intent().addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING).putExtra("KEY_MEDIA_FAVID_LIST", new long[]{this.f286445u}).putExtra("KEY_MEDIA_SUPPORT_DRAG", true).putExtra("KEY_MEDIA_HIDE_GO_DETAIL", true).putExtra("key_detail_data_id", ((iz4.o) ((java.util.LinkedHashMap) this.f286417h).get(str)).f296103a).putExtra("fav_note_xml", this.f286449y).putExtra("fav_open_from_wnnote", true).putExtra("key_detail_info_id", this.f286445u).putExtra("key_detail_fav_scene", this.I.f372653d).putExtra("key_detail_fav_sub_scene", this.I.f372654e).putExtra("key_detail_fav_index", this.I.f372655f), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0241 A[Catch: Exception -> 0x024f, TRY_LEAVE, TryCatch #0 {Exception -> 0x024f, blocks: (B:57:0x0145, B:61:0x0159, B:63:0x015f, B:67:0x01bb, B:69:0x01ca, B:71:0x01d0, B:75:0x01e7, B:77:0x01ed, B:79:0x023a, B:81:0x0241), top: B:56:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.content.Context r24, int r25) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz4.p.t(android.content.Context, int):void");
    }

    public final void u() {
        r45.bq0 bq0Var;
        iz4.m mVar = new iz4.m();
        this.f286413d = mVar;
        mVar.f296124b = this.B;
        mVar.f296125c = this.f286445u;
        o72.r2 r2Var = this.B;
        if (r2Var == null || (bq0Var = r2Var.field_favProto) == null) {
            return;
        }
        iz4.m mVar2 = this.f286413d;
        mVar2.f296127e = this.H;
        mVar2.f296123a = bq0Var.f370964f;
        R.put(r2Var, mVar2);
    }

    public final void v() {
        o72.r2 a17 = hz4.l.a(this.f286445u);
        this.B = a17;
        if (a17 == null) {
            return;
        }
        if (this.H <= 0) {
            this.H = a17.field_updateTime;
        }
        this.f286421o = a17.field_favProto;
        this.f286414e = a17;
    }

    public void w(long j17, android.content.Context context, java.lang.String str, java.lang.Boolean bool, int i17, int i18, r45.dq0 dq0Var, r45.bq0 bq0Var, byte[] bArr, boolean z17) {
        hz4.j jVar = new hz4.j();
        jVar.f286428a = j17;
        jVar.f286429b = context;
        jVar.f286430c = str;
        jVar.f286431d = bool;
        jVar.f286432e = i17;
        jVar.f286433f = i18;
        jVar.f286434g = dq0Var;
        jVar.f286435h = bq0Var;
        jVar.f286436i = bArr;
        jVar.f286437j = z17;
        x(jVar);
    }

    public void x(hz4.j jVar) {
        r45.jq0 jq0Var;
        this.f286450z = jVar.f286437j;
        this.f286445u = jVar.f286428a;
        this.C = jVar.f286431d.booleanValue();
        this.D = jVar.f286432e;
        this.E = jVar.f286433f;
        this.I = jVar.f286434g;
        this.L = jVar.f286436i;
        v();
        if (!this.f286450z && jVar.f286435h == null) {
            o72.r2 r2Var = this.B;
            int i17 = r2Var != null ? r2Var.field_id : 0;
            this.f286446v = i17;
            int i18 = r2Var != null ? r2Var.field_sourceType : 0;
            r45.dq0 dq0Var = this.I;
            k82.c.f304887a.c(this.f286445u, i17, 18, dq0Var != null ? dq0Var.f372653d : 0, i18);
        }
        if (this.G == 0 && (jq0Var = this.f286421o.f370962d) != null) {
            this.G = jq0Var.f378034d;
        }
        if (q() && this.f286449y.isEmpty()) {
            if (this.B != null) {
                r72.k kVar = new r72.k();
                r72.l.a(kVar, this.B);
                this.f286449y = kVar.toXml();
            } else if (jVar.f286430c.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WNNoteFavProcess", "setupWNNoteData: favNoteXml empty!");
            } else {
                this.f286449y = jVar.f286430c;
            }
        }
        t(jVar.f286429b, 2);
        ((ku5.t0) ku5.t0.f312615d).g(new hz4.o(this, jVar));
    }
}
