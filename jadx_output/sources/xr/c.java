package xr;

/* loaded from: classes8.dex */
public class c implements n23.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f456135a;

    /* renamed from: b, reason: collision with root package name */
    public final xr.b f456136b;

    /* renamed from: c, reason: collision with root package name */
    public final qk.n7 f456137c;

    public c(java.util.List list, qk.n7 n7Var, xr.b bVar) {
        this.f456137c = n7Var;
        this.f456136b = bVar;
        this.f456135a = list;
    }

    public final java.lang.String a(java.lang.String str) {
        return ".addmsg" + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c4, code lost:
    
        r2 = c(r1.field_addMsg, r1.field_defaultContent);
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "[fetchInternal] addMsgDefault is null? %s", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d7, code lost:
    
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d9, code lost:
    
        r1.field_addMsg = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e6, code lost:
    
        if (r1.field_actionTime <= (c01.id.a() / 1000)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e8, code lost:
    
        r3 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00eb, code lost:
    
        r1.field_status = r3;
        com.tencent.mm.storage.x7.f196331d.z0(r1.field_functionmsgid, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f4, code lost:
    
        if (r2 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fc, code lost:
    
        if (r9.f456135a.remove(r1) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
    
        if (r9.f456135a.remove(r1) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
    
        r9.f456136b.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fe, code lost:
    
        r9.f456136b.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        r3 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.c.b():void");
    }

    public final r45.j4 c(r45.j4 j4Var, java.lang.String str) {
        if (j4Var == null) {
            com.tencent.mars.xlog.Log.w("FunctionMsg.FunctionMsgFetcher", "null == raw");
            return null;
        }
        int indexOf = str.indexOf("<addmsg");
        if (indexOf == -1) {
            com.tencent.mars.xlog.Log.e("FunctionMsg.FunctionMsgFetcher", "msgContent not start with <addmsg! content is null?%s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str)));
            return null;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str.substring(indexOf), "addmsg", null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (d17.containsKey(a(".msgid"))) {
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(a(".msgid")), 0);
            j4Var.f377557d = P;
            sb6.append("msgid:" + P);
        }
        if (d17.containsKey(a(".newmsgid"))) {
            long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(a(".newmsgid")), 0L);
            j4Var.f377568r = V;
            sb6.append(" newMsgId:" + V);
        }
        if (d17.containsKey(a(".msgseq"))) {
            int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(a(".msgseq")), 0);
            j4Var.f377569s = P2;
            sb6.append(" msgSeq:" + P2);
        }
        if (d17.containsKey(a(".fromusername"))) {
            java.lang.String str2 = (java.lang.String) d17.get(a(".fromusername"));
            j4Var.f377558e = x51.j1.i(str2);
            sb6.append(" fromUsername:" + str2);
        }
        if (d17.containsKey(a(".tousername"))) {
            java.lang.String str3 = (java.lang.String) d17.get(a(".tousername"));
            j4Var.f377559f = x51.j1.i(str3);
            sb6.append(" toUsername:" + str3);
        }
        if (d17.containsKey(a(".msgtype"))) {
            int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(a(".msgtype")), 0);
            j4Var.f377560g = P3;
            sb6.append(" msgType:" + P3);
        }
        if (d17.containsKey(a(".status"))) {
            int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(a(".status")), 0);
            j4Var.f377562i = P4;
            sb6.append(" status:" + P4);
        }
        if (d17.containsKey(a(".content"))) {
            j4Var.f377561h = x51.j1.i(u46.k.g(str.substring(str.indexOf("<content>") + 9, str.indexOf("</content>"))));
            sb6.append(" msgContent:*");
        } else {
            sb6.append(" msgContent:null");
            j4Var.f377561h = null;
        }
        if (d17.containsKey(a(".msgsource"))) {
            j4Var.f377566p = u46.k.g(str.substring(str.indexOf("<msgsource>") + 11, str.indexOf("</msgsource>")));
            sb6.append(" msgSource:*");
        }
        if (d17.containsKey(a(".pushcontent"))) {
            j4Var.f377567q = u46.k.g(str.substring(str.indexOf("<pushcontent>") + 13, str.indexOf("</pushcontent>")));
            sb6.append(" pushContent:*");
        }
        if (d17.containsKey(a(".imgstatus"))) {
            int P5 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(a(".imgstatus")), 0);
            j4Var.f377563m = P5;
            sb6.append(" ImgStatus:" + P5);
        }
        if (d17.containsKey(a(".imgbuf"))) {
            j4Var.f377564n = x51.j1.h((java.lang.String) d17.get(a(".imgbuf")), true);
            sb6.append(" imgBuf:*");
        }
        if (d17.containsKey(a(".createtime"))) {
            int P6 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(a(".createtime")), 0);
            j4Var.f377565o = P6;
            sb6.append(" createTime:" + P6);
        }
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "[mergeAddMsg] result:%s", sb6.toString());
        return j4Var;
    }

    public void d(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        n23.a aVar;
        int i19;
        if (m1Var.getType() != 825) {
            return;
        }
        java.util.List list = this.f456135a;
        if (list == null) {
            com.tencent.mars.xlog.Log.e("FunctionMsg.FunctionMsgFetcher", "[onSceneEnd] mFetchItemList is null.");
            return;
        }
        m23.a aVar2 = (m23.a) m1Var;
        r45.gg3 gg3Var = aVar2.f323085f;
        qk.h6 h6Var = (qk.h6) aVar2.f323088i;
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "[onSceneEnd] size:%s errCode:%s errMsg:%s functionMsgId:%s", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(i18), str, h6Var.field_functionmsgid);
        java.util.HashMap hashMap = n45.c.f335085a;
        java.lang.String cgiKey = h6Var.field_cgi;
        kotlin.jvm.internal.o.g(cgiKey, "cgiKey");
        java.util.HashMap hashMap2 = n45.c.f335087c;
        synchronized (hashMap2) {
            aVar = (n23.a) hashMap2.get(cgiKey);
            if (aVar == null) {
                aVar = n45.c.f335086b;
            }
        }
        aVar.a(i18);
        if (this.f456135a.contains(h6Var)) {
            if (i18 != 0 || ((i18 == 0 && gg3Var == null) || ((gg3Var != null && gg3Var.f375214d == 2) || (gg3Var != null && gg3Var.f375214d == 1)))) {
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = h6Var.field_functionmsgid;
                objArr[1] = java.lang.Long.valueOf(h6Var.field_preVersion);
                objArr[2] = java.lang.Long.valueOf(h6Var.field_version);
                objArr[3] = java.lang.Integer.valueOf(gg3Var == null ? -1 : gg3Var.f375214d);
                com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "functionMsgId: %s, fetch failed, mark as fetch failed, preVersion: %s, version: %s op:%s", objArr);
                int i27 = h6Var.field_retryCount;
                if (i27 < h6Var.field_retryCountLimit) {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[0] = java.lang.Integer.valueOf(i27);
                    objArr2[1] = h6Var.field_functionmsgid;
                    objArr2[2] = java.lang.Integer.valueOf(h6Var.field_retryinterval);
                    objArr2[3] = java.lang.Boolean.valueOf(gg3Var == null);
                    com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] has retryCount:%s id:%s retryInterval:%s response is null?%s", objArr2);
                    if (gg3Var != null) {
                        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] opCode:%s actionTime:%s", java.lang.Integer.valueOf(gg3Var.f375214d), java.lang.Integer.valueOf(gg3Var.f375218h));
                        int i28 = gg3Var.f375214d;
                        if (i28 == 2) {
                            h6Var.field_actionTime = gg3Var.f375218h;
                            h6Var.field_retryCount++;
                            h6Var.field_status = -1;
                        } else if (i28 == 1) {
                            h6Var.field_status = 3;
                            h6Var.field_retryCount = h6Var.field_retryCountLimit;
                        } else {
                            h6Var.field_status = 3;
                        }
                        java.lang.String str2 = gg3Var.f375217g;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            h6Var.field_custombuff = str2;
                        }
                    } else {
                        h6Var.field_status = -1;
                        h6Var.field_actionTime = (c01.id.a() / 1000) + h6Var.field_retryinterval;
                        h6Var.field_retryCount++;
                    }
                } else {
                    h6Var.field_status = 3;
                }
                com.tencent.mm.storage.x7 x7Var = com.tencent.mm.storage.x7.f196331d;
                x7Var.z0(h6Var.field_functionmsgid, h6Var);
                if (h6Var.field_status != 3) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(h6Var.field_reportid, h6Var.field_failkey, 1L, false);
                    com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] maybe has to retry fetch! delay:%sms retryCount:%s", java.lang.Long.valueOf((h6Var.field_actionTime - (c01.id.a() / 1000)) * 1000), java.lang.Integer.valueOf(h6Var.field_retryCount));
                } else {
                    r45.j4 c17 = c(h6Var.field_addMsg, h6Var.field_defaultContent);
                    com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "[handleFailFetch] addMsgDefault is null? %s", c17);
                    if (c17 != null) {
                        h6Var.field_addMsg = c17;
                    }
                    int i29 = c17 == null ? 3 : 2;
                    h6Var.field_status = i29;
                    if (3 == i29) {
                        h6Var.field_version = h6Var.field_preVersion;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(h6Var.field_reportid, h6Var.field_finalfailkey, 1L, false);
                    }
                    x7Var.z0(h6Var.field_functionmsgid, h6Var);
                }
            } else if (gg3Var != null && i18 == 0 && ((i19 = gg3Var.f375214d) == 3 || i19 == 0)) {
                com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgFetcher", "functionMsgId: %s fetch success, response.version: %s, fetchItem.version: %s ActionTime:%s OpCode:%s", h6Var.field_functionmsgid, java.lang.Long.valueOf(gg3Var.f375215e), java.lang.Long.valueOf(h6Var.field_version), java.lang.Integer.valueOf(gg3Var.f375218h), java.lang.Integer.valueOf(gg3Var.f375214d));
                h6Var.field_status = gg3Var.f375214d == 3 ? -2 : 2;
                h6Var.field_businessInfo = gg3Var.f375219i;
                h6Var.field_actionTime = gg3Var.f375218h;
                r45.j4 j4Var = gg3Var.f375216f;
                if (j4Var != null) {
                    h6Var.field_addMsg = j4Var;
                }
                if (!gg3Var.f375220m.isEmpty()) {
                    java.util.LinkedList linkedList = gg3Var.f375220m;
                    r45.l4 l4Var = new r45.l4();
                    l4Var.f379121d.addAll(linkedList);
                    h6Var.field_addMsgs = l4Var;
                }
                com.tencent.mm.storage.x7.f196331d.z0(h6Var.field_functionmsgid, h6Var);
            }
            int i37 = h6Var.field_status;
            if ((i37 == 2 || i37 == -2) && this.f456135a.remove(h6Var)) {
                this.f456136b.a(h6Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(h6Var.field_reportid, h6Var.field_successkey, 1L, false);
            } else if (this.f456135a.remove(h6Var)) {
                this.f456136b.b(h6Var);
            }
        }
    }
}
