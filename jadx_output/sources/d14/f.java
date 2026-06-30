package d14;

/* loaded from: classes11.dex */
public class f extends ih3.n implements d14.a {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f225737n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f225738o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Map f225739p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public static final dn.k f225740q = new d14.b();

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f225741e;

    /* renamed from: f, reason: collision with root package name */
    public long f225742f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225743g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f225744h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f225745i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f225746m;

    public f(ih3.m mVar) {
        super(mVar);
        this.f225741e = null;
        this.f225746m = false;
    }

    public static void e(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Long.valueOf(j18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = str2 != null ? str2 : "";
        objArr[4] = com.tencent.mm.sdk.platformtools.t8.G1(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "gotoRecordDetailUI msgId:%s msgSvrId:%s sendUserName:%s talker:%s xml:%s", objArr);
        ot0.q v17 = ot0.q.v(str3);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "gotoRecordDetailUI content is null???");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("message_id", j17);
        intent.putExtra("message_talker", str2);
        intent.putExtra("record_xml", v17.f348663h0);
        intent.putExtra("record_show_share", false);
        intent.putExtra("from_scene", 2);
        intent.putExtra("prePublishId", "msg_" + java.lang.Long.toString(j18));
        intent.putExtra("preUsername", str);
        intent.putExtra("preChatName", str2);
        intent.putExtra("preChatTYPE", 2);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "record", ".ui.RecordMsgDetailUI", intent, null);
    }

    public static boolean f(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0());
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) f225737n).entrySet().iterator();
        while (it.hasNext()) {
            r45.pw3 pw3Var = (r45.pw3) ((java.util.Map.Entry) it.next()).getValue();
            if (android.text.TextUtils.equals(pw3Var.f383430i, (java.lang.CharSequence) ((java.util.concurrent.ConcurrentHashMap) f225739p).get(msgIdTalker))) {
                return pw3Var.f383427f && pw3Var.f383431m != 2;
            }
        }
        return false;
    }

    public static boolean h(com.tencent.mm.storage.f9 f9Var, java.util.Map map, java.lang.String str, java.lang.String str2, d14.a aVar) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z17;
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            java.util.Objects.toString(f9Var);
            java.util.Objects.toString(map);
            java.util.Objects.toString(aVar);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        long msgId = f9Var.getMsgId();
        if (aVar != null) {
            ((java.util.concurrent.ConcurrentHashMap) f225738o).put(java.lang.Long.valueOf(msgId), aVar);
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str2, "tmpl_type_profilewithrevoke")) {
            str3 = (java.lang.String) map.get(str + ".fileid");
            if (str3 == null) {
                str3 = "";
            }
            str4 = (java.lang.String) map.get(str + ".aeskey");
            if (str4 == null) {
                str4 = "";
            }
            str5 = (java.lang.String) map.get(str + ".filelength");
            if (str5 == null) {
                str5 = "";
            }
            z17 = false;
        } else {
            str3 = (java.lang.String) map.get(str + ".newformatfileid");
            if (str3 == null) {
                str3 = "";
            }
            str4 = (java.lang.String) map.get(str + ".newformataeskey");
            if (str4 == null) {
                str4 = "";
            }
            str5 = (java.lang.String) map.get(str + ".newfromatfilelength");
            if (str5 == null) {
                str5 = "";
            }
            z17 = true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = (java.lang.String) map.get(str + ".fileid");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str6 = (java.lang.String) map.get(str + ".aeskey");
            str4 = str6 == null ? "" : str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".filelength");
            str5 = str7 == null ? "" : str7;
            z17 = false;
        }
        java.lang.String str8 = (java.lang.String) map.get(str + ".historyid");
        if (str8 == null) {
            str8 = "";
        }
        sg3.r.aj();
        if (!com.tencent.mm.vfs.w6.j("wcf://selectrecord/downloadcache/")) {
            com.tencent.mm.vfs.w6.u("wcf://selectrecord/downloadcache/");
        }
        java.lang.String str9 = "wcf://selectrecord/downloadcache/" + msgId;
        if (com.tencent.mm.vfs.w6.j(str9)) {
            com.tencent.mm.vfs.w6.h(str9);
        }
        java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime() + ", " + msgId).getBytes());
        dn.m mVar = new dn.m();
        mVar.f241787f = f225740q;
        mVar.f241786e = false;
        mVar.field_mediaId = g17;
        mVar.field_fullpath = str9;
        mVar.field_totalLen = java.lang.Long.parseLong(str5);
        mVar.field_fileType = 5;
        mVar.field_fileId = str3;
        mVar.field_aesKey = str4;
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        r45.pw3 pw3Var = new r45.pw3();
        pw3Var.f383425d = msgId;
        pw3Var.f383426e = str9;
        pw3Var.f383427f = z17;
        pw3Var.f383428g = f9Var.getCreateTime();
        pw3Var.f383429h = f9Var.Q0();
        pw3Var.f383430i = str8;
        ((java.util.concurrent.ConcurrentHashMap) f225737n).put(g17, pw3Var);
        ((java.util.concurrent.ConcurrentHashMap) f225739p).put(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0()), str8);
        boolean wi6 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "add download cdn task : %b, msgId : %s, newWay:%s", java.lang.Boolean.valueOf(wi6), java.lang.Long.valueOf(msgId), java.lang.Boolean.valueOf(z17));
        if (!wi6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "triggerErrorCallback errCode:%s errMsg:%s", 0, "add to cdn failed");
        }
        return z17;
    }

    @Override // ih3.n
    public java.lang.String a() {
        return "link_history";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        java.lang.String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String string2 = bundle.getString("template_type");
        com.tencent.mars.xlog.Log.getLogLevel();
        if (com.tencent.mm.sdk.platformtools.t8.D0(string2, "tmpl_type_profile")) {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(string, bundle.getLong("msg_id"));
            if (((Li.F & 262144) != 0) || f(Li)) {
                java.lang.String str4 = (java.lang.String) map.get(str + ".newformattitle");
                java.lang.String str5 = str4 != null ? str4 : "";
                return !android.text.TextUtils.isEmpty(str5) ? str5 : str3;
            }
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        d14.d dVar = new d14.d(this, 1, null, map, bundle, string, weakReference, str, weakReference2);
        dVar.setTextBold(true);
        spannableString.setSpan(dVar, 0, str3.length(), 33);
        return spannableString;
    }

    @Override // ih3.n
    public void c() {
        super.c();
    }

    public void g(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "onClickHistory msgId:%s", java.lang.Long.valueOf(j17));
        if (this.f225746m) {
            android.app.ProgressDialog progressDialog = this.f225741e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            if (str != null) {
                e(j17, this.f225742f, this.f225744h, this.f225743g, str);
            }
        }
    }
}
