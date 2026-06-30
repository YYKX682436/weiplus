package hz4;

/* loaded from: classes12.dex */
public class w extends hz4.h {
    public static final java.util.HashMap M = new java.util.HashMap();
    public boolean A;
    public java.lang.String B;
    public java.lang.String G;
    public java.lang.String K;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f286471u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f286472v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Long f286473w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f286476z;

    /* renamed from: x, reason: collision with root package name */
    public long f286474x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f286475y = 0;
    public r45.ul5 C = null;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public r45.dq0 H = new r45.dq0();
    public byte[] I = null;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f286470J = "";
    public java.lang.String L = null;

    public w() {
        this.f286415f.clear();
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
    }

    @Override // hz4.h
    public boolean a(android.content.Context context, java.lang.String str) {
        iz4.o oVar;
        if (str == null || str.isEmpty() || (oVar = (iz4.o) ((java.util.LinkedHashMap) this.f286417h).get(str)) == null || oVar.f296130n.M == null) {
            return false;
        }
        return ((fo.e) ((le5.e) i95.n0.c(le5.e.class))).aj(context, this.f286473w.longValue(), oVar.f296130n.M);
    }

    @Override // hz4.h
    public void c(r45.gp0 gp0Var) {
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 8;
        eqVar.f6585c = gp0Var;
        eqVar.f6586d = this.f286473w.longValue();
        eqVar.f6587e = this.B;
        eqVar.f6593k = "";
        recordOperationEvent.e();
    }

    @Override // hz4.h
    public void d(r45.gp0 gp0Var, java.lang.String str) {
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 8;
        eqVar.f6585c = gp0Var;
        eqVar.f6586d = this.f286473w.longValue();
        eqVar.f6587e = this.B;
        eqVar.f6593k = str;
        recordOperationEvent.e();
    }

    @Override // hz4.h
    public java.lang.String e(r45.gp0 gp0Var) {
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 1;
        eqVar.f6585c = gp0Var;
        eqVar.f6586d = this.f286473w.longValue();
        eqVar.f6587e = this.B;
        recordOperationEvent.e();
        return recordOperationEvent.f54664h.f6693b;
    }

    @Override // hz4.h
    public java.lang.String h() {
        if (this.L == null) {
            java.lang.String str = "";
            if (this.f286473w.longValue() != -1) {
                str = pt0.f0.Li(this.B, this.f286473w.longValue()).I0() + "";
            }
            this.L = str;
        }
        return this.L;
    }

    @Override // hz4.h
    public java.lang.String i() {
        return this.f286472v;
    }

    @Override // hz4.h
    public java.lang.String j(r45.gp0 gp0Var) {
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 1;
        eqVar.f6585c = gp0Var;
        eqVar.f6586d = this.f286473w.longValue();
        eqVar.f6587e = this.B;
        recordOperationEvent.e();
        return recordOperationEvent.f54664h.f6694c;
    }

    @Override // hz4.h
    public void k(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", this.f286473w);
        intent.putExtra("message_talker", this.B);
        intent.putExtra("record_xml", this.f286471u);
        java.util.Map map = this.f286417h;
        intent.putExtra("record_data_id", ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f296103a);
        r45.gp0 n17 = bt3.g2.n(this.f286471u, ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f296103a);
        java.lang.String str2 = this.B;
        java.lang.Long l17 = this.f286473w;
        if (o72.x1.t0(bw5.ar0.TingScene_Chat, n17, bt3.g2.t(n17, str2, l17 != null ? l17.longValue() : 0L, 1))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteMsgProcess", "goToFile playLocalFile by ting");
        } else {
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "record", ".ui.RecordMsgFileUI", intent, null);
        }
    }

    @Override // hz4.h
    public void l(android.content.Context context, java.lang.String str) {
        if (mz4.m.f333318a.a()) {
            r(context, str);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", this.f286473w);
        intent.putExtra("message_talker", this.B);
        intent.putExtra("record_data_id", ((iz4.o) ((java.util.LinkedHashMap) this.f286417h).get(str)).f296103a);
        intent.putExtra("record_xml", this.f286471u);
        intent.putExtra("from_scene", 1);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "record", ".ui.RecordMsgImageUI", intent, null);
    }

    @Override // hz4.h
    public void m(android.content.Context context, java.lang.String str) {
        r45.ip0 ip0Var;
        java.lang.String str2;
        java.util.Map map = this.f286417h;
        r45.gp0 gp0Var = ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f296130n;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var != null) {
            hp0Var.getClass();
            ip0Var = gp0Var.J1.f376353d;
        } else {
            ip0Var = null;
        }
        if (ip0Var == null) {
            str2 = null;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(ip0Var.f377237o)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str3 = ip0Var.f377231f;
            ((sg3.a) v0Var).getClass();
            str2 = c01.a2.e(str3);
        } else {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = ip0Var.f377237o;
            ((sg3.a) v0Var2).getClass();
            str2 = c01.a2.e(str4);
        }
        iz4.s sVar = (iz4.s) ((java.util.LinkedHashMap) map).get(str);
        if (sVar == null) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.e1.T(context2, context2.getString(com.tencent.mm.R.string.cc9));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 12);
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
        intent.putExtra("kisUsername", str2);
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }

    @Override // hz4.h
    public boolean n(android.content.Context context, java.lang.String str) {
        if (!mz4.m.f333318a.a()) {
            return false;
        }
        r(context, str);
        return true;
    }

    public final void r(android.content.Context context, java.lang.String str) {
        byte[] bArr;
        android.content.Intent putExtra = new android.content.Intent().addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING).putExtra("message_id", this.f286473w).putExtra("message_talker", this.B);
        java.util.Map map = this.f286417h;
        android.content.Intent putExtra2 = putExtra.putExtra("record_data_id", ((iz4.o) ((java.util.LinkedHashMap) map).get(str)).f296103a).putExtra("record_xml", this.f286471u).putExtra("from_scene", 1);
        r45.yp0 yp0Var = new r45.yp0();
        for (iz4.o oVar : ((java.util.LinkedHashMap) map).values()) {
            if (oVar instanceof iz4.k) {
                iz4.k kVar = (iz4.k) oVar;
                r45.zp0 zp0Var = new r45.zp0();
                zp0Var.f392261d = kVar.f296135s;
                zp0Var.f392262e = kVar.f296117t;
                zp0Var.f392263f = kVar.f296118u;
                zp0Var.f392264g = kVar.f296103a;
                zp0Var.f392265h = kVar.f296130n.f375431q2;
                zp0Var.f392266i = 4;
                yp0Var.f391269d.add(zp0Var);
            }
        }
        try {
            bArr = yp0Var.toByteArray();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WNNoteMsgProcess", th6, "to bytes err", new java.lang.Object[0]);
            bArr = null;
        }
        android.content.Intent putExtra3 = putExtra2.putExtra("KEY_MEDIA_FAV_PREVIEW_DATA", bArr);
        if (context instanceof android.app.Activity) {
            j45.l.n((android.app.Activity) context, "record", ".ui.RecordMsgImageUI", putExtra3, 1);
        } else {
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "record", ".ui.RecordMsgImageUI", putExtra3, null);
        }
    }

    public void s(android.content.Context context, hz4.u uVar) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteMsgProcess", "setupWNNoteData, openData: " + uVar);
        o72.r2 r07 = o72.x1.r0(uVar.f286457c);
        this.f286471u = uVar.f286457c;
        this.f286472v = r07 == null ? "" : o72.r2.G0(r07);
        this.f286473w = uVar.f286456b;
        this.B = uVar.f286460f;
        this.f286474x = java.lang.System.currentTimeMillis();
        this.f286475y = uVar.f286463i;
        this.K = uVar.f286464j;
        this.f286476z = uVar.f286458d;
        this.A = uVar.f286459e;
        this.B = uVar.f286460f;
        this.D = uVar.f286461g;
        this.E = uVar.f286462h;
        this.H = uVar.f286465k;
        android.os.Bundle bundle = uVar.f286466l;
        if (bundle != null) {
            this.I = bundle.getByteArray("key_multi_task_common_info");
        }
        k82.c cVar = k82.c.f304887a;
        cVar.c(this.f286474x, 0L, 18, uVar.f286455a, 0);
        java.lang.String str = uVar.f286457c;
        kk.j jVar = qz4.c.f367937a;
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 0;
        eqVar.f6584b = str;
        recordOperationEvent.e();
        r45.ul5 ul5Var = recordOperationEvent.f54664h.f6692a;
        this.C = ul5Var;
        if (ul5Var != null && (linkedList = ul5Var.f387465f) != null && linkedList.size() > 1) {
            com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent2 = new com.tencent.mm.autogen.events.RecordOperationEvent();
            am.eq eqVar2 = recordOperationEvent2.f54663g;
            eqVar2.f6583a = 9;
            eqVar2.f6585c = (r45.gp0) this.C.f387465f.get(0);
            eqVar2.f6586d = this.f286473w.longValue();
            eqVar2.f6587e = this.B;
            recordOperationEvent2.e();
            this.F = recordOperationEvent2.f54664h.f6695d;
        }
        r45.ul5 ul5Var2 = this.C;
        if (ul5Var2 == null || ul5Var2.f387467h == null) {
            this.G = null;
        } else {
            this.G = this.C.f387467h.f385891d + ";" + this.C.f387467h.f385892e + ";" + this.C.f387468i;
        }
        if (this.f286473w.longValue() != -1) {
            this.f286470J = te5.p1.a(pt0.f0.Li(this.B, this.f286473w.longValue()));
        }
        int i17 = uVar.f286455a;
        int i18 = i17 == 10 ? 5 : 1;
        if (q()) {
            cVar.b(this.f286474x);
            dz4.y2.f245468a.b();
            java.lang.String l17 = this.f286473w.toString();
            java.lang.String str2 = this.B;
            java.lang.String str3 = str2 != null ? str2 : "";
            java.lang.String str4 = this.f286471u;
            dz4.f fVar = new dz4.f(l17, str3, str4 != null ? str4 : "", i18, this.f286474x, this.f286476z);
            fVar.f245296g = false;
            java.lang.String str5 = this.f286422p;
            kotlin.jvm.internal.o.g(str5, "<set-?>");
            fVar.f245298i = str5;
            fVar.f245297h = this.f286423q;
            fVar.f245299j = this.I;
            fVar.f245300k = this.f286418i;
            java.lang.String h17 = h();
            kotlin.jvm.internal.o.g(h17, "<set-?>");
            fVar.f245301l = h17;
            kotlin.jvm.internal.o.g(context, "context");
            kotlinx.coroutines.l.d(dz4.y2.f245469b, null, null, new dz4.x2(fVar, context, null), 3, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("note_fav_scene", i17);
            intent.putExtra("note_open_from_scene", i18);
            intent.putExtra("edit_status", this.f286420n);
            intent.putExtra("note_msgid", this.f286473w);
            intent.putExtra("SecurityMsgUsername", this.K);
            intent.putExtra("note_msgtalker", this.B);
            intent.putExtra("Retr_Security_Msg_Id", this.f286473w);
            intent.putExtra("Retr_Security_Msg_Talker", this.B);
            intent.putExtra("note_fav_localid", this.f286474x);
            intent.putExtra("SecurityPreviewType", this.f286475y);
            intent.putExtra("record_show_share", this.f286476z);
            intent.putExtra("show_share", this.f286476z);
            intent.putExtra("show_jump_chat", this.A);
            intent.putExtra("talker", this.B);
            intent.putExtra("fav_note_xml", this.f286471u);
            intent.putExtra("fav_note_out_of_date", this.F);
            intent.putExtra("fav_note_scroll_to_position", this.D);
            intent.putExtra("fav_note_scroll_to_offset", this.E);
            intent.putExtra("fav_note_blacklist_file_md5s", this.f286470J);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.G)) {
                intent.putExtra("fav_note_link_source_info", this.G);
            }
            intent.putExtra("key_detail_fav_scene", this.H.f372653d);
            intent.putExtra("key_detail_fav_sub_scene", this.H.f372654e);
            intent.putExtra("key_detail_fav_index", this.H.f372655f);
            intent.putExtra("key_multi_task_common_info", this.I);
            com.tencent.mm.ui.fj.d(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.class, 0);
            j45.l.j(context, "wenote", ".ui.nativenote.NoteEditorUI", intent, null);
        }
        gm0.j1.e().j(new hz4.v(this, r07, uVar));
    }

    public void t(java.lang.String str, java.lang.Long l17, java.lang.String str2, boolean z17, android.content.Context context, int i17, int i18, r45.dq0 dq0Var, android.os.Bundle bundle) {
        hz4.u uVar = new hz4.u();
        uVar.f286455a = dq0Var.f372653d;
        uVar.f286456b = l17;
        uVar.f286460f = str2;
        uVar.f286457c = str;
        uVar.f286458d = z17;
        uVar.f286461g = i17;
        uVar.f286462h = i18;
        uVar.f286463i = 0;
        uVar.f286465k = dq0Var;
        uVar.f286466l = bundle;
        s(context, uVar);
    }
}
