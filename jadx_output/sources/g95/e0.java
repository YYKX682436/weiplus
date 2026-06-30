package g95;

/* loaded from: classes12.dex */
public abstract class e0 {
    public static final long a(com.tencent.mm.storage.f9 f9Var) {
        v05.a aVar;
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17, true);
        v05.b k17 = cVar.k();
        if (k17 == null || (aVar = (v05.a) k17.getCustom(k17.f432315e + 8)) == null) {
            return 0L;
        }
        return aVar.getLong(aVar.f368364d + 0);
    }

    public static final int b(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        if (!f9Var.k2()) {
            return 0;
        }
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17, true);
        v05.b k17 = cVar.k();
        if (k17 != null) {
            return k17.getInteger(k17.f368365d + 6);
        }
        return 0;
    }

    public static final java.lang.String c(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        if (f9Var.A0() != 1 && !com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
            return c01.z1.r();
        }
        return f9Var.Q0();
    }

    public static final java.lang.String d(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        return f9Var.A0() == 1 ? c01.z1.r() : com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? c01.w9.s(f9Var.j()) : f9Var.Q0();
    }

    public static final int e(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        return f9Var.getType() & 65535;
    }

    public static final java.lang.String f(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        if (i(f9Var)) {
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            return r17;
        }
        java.lang.String V1 = f9Var.V1();
        if (V1 != null) {
            return V1;
        }
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        return Q0;
    }

    public static final boolean g(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        return com.tencent.mm.storage.z3.R4(f9Var.Q0());
    }

    public static final boolean h(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        return c01.ia.y(f9Var) || c01.ia.x(f9Var) || c01.ia.A(f9Var);
    }

    public static final boolean i(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        return f9Var.A0() == 1;
    }

    public static final boolean j(com.tencent.mm.storage.f9 f9Var) {
        p15.e eVar = new p15.e();
        java.lang.String str = f9Var != null ? f9Var.G : null;
        if (str == null) {
            str = "";
        }
        eVar.fromXml(str);
        p15.s q17 = eVar.q();
        return q17 != null && q17.y() == 1;
    }

    public static final void k(com.tencent.mm.storage.f9 f9Var, up5.w message) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        kotlin.jvm.internal.o.g(message, "message");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("msgId", java.lang.Long.valueOf(message.f430091a));
        contentValues.put("msgSvrId", java.lang.Long.valueOf(message.f430092b));
        contentValues.put("type", java.lang.Integer.valueOf(message.f430093c));
        contentValues.put("status", java.lang.Integer.valueOf(message.f430094d));
        contentValues.put("isSend", java.lang.Integer.valueOf(message.f430095e));
        contentValues.put("isShowTimer", java.lang.Integer.valueOf(message.f430096f));
        contentValues.put("createTime", java.lang.Long.valueOf(message.f430097g));
        contentValues.put("talker", message.f430098h);
        java.lang.String str = message.f430099i;
        if (str == null) {
            str = "";
        }
        contentValues.put("content", str);
        contentValues.put("imgPath", message.f430100j);
        contentValues.put("reserved", message.f430101k);
        contentValues.put("lvbuffer", message.f430102l);
        contentValues.put("talkerId", java.lang.Integer.valueOf(message.f430105o));
        java.lang.String str2 = message.f430103m;
        if (str2 == null) {
            str2 = "";
        }
        contentValues.put("transContent", str2);
        java.lang.String str3 = message.f430104n;
        if (str3 == null) {
            str3 = "";
        }
        contentValues.put("transBrandWording", str3);
        java.lang.String str4 = message.f430106p;
        if (str4 == null) {
            str4 = "";
        }
        contentValues.put("bizClientMsgId", str4);
        contentValues.put("bizChatId", java.lang.Long.valueOf(message.f430107q));
        java.lang.String str5 = message.f430108r;
        if (str5 == null) {
            str5 = "";
        }
        contentValues.put("bizChatUserId", str5);
        contentValues.put("msgSeq", java.lang.Long.valueOf(message.f430109s));
        contentValues.put("flag", java.lang.Integer.valueOf(message.f430110t));
        contentValues.put("solitaireFoldInfo", message.f430111u);
        contentValues.put("fromUsername", message.f430113w);
        contentValues.put("toUsername", message.f430114x);
        contentValues.put("historyId", message.f430112v);
        f9Var.convertFrom(contentValues, false);
        f9Var.parseBuff();
        f9Var.setMsgId(message.f430091a);
        f9Var.systemRowid = f9Var.getMsgId();
        java.lang.String j17 = f9Var.j();
        if (j17 != null && j17.length() > 2097152) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
            sb6.append("Very big message: \nmsgId = ");
            sb6.append(f9Var.getMsgId());
            sb6.append("\nmsgSvrId = ");
            sb6.append(f9Var.I0());
            sb6.append("\ntype = ");
            sb6.append(f9Var.getType());
            sb6.append("\ncreateTime = ");
            sb6.append(f9Var.getCreateTime());
            sb6.append("\ntalker = ");
            sb6.append(f9Var.Q0());
            sb6.append("\nflag = ");
            sb6.append(f9Var.w0());
            sb6.append("\ncontent.length() = ");
            sb6.append(j17.length());
            sb6.append("\ncontent = ");
            java.lang.String substring = j17.substring(0, 256);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            sb6.append(substring);
            com.tencent.mars.xlog.Log.e("MessageEx", sb6.toString());
            f9Var.setType(1);
            f9Var.d1("");
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.getMsgId(), com.tencent.mm.storage.f9.M1(f9Var));
        }
        com.tencent.mm.storage.f9.L1(f9Var.getMsgId());
    }

    public static final com.tencent.wcdb.orm.Field[] l(up5.w wVar, android.content.ContentValues cv6) {
        kotlin.jvm.internal.o.g(wVar, "<this>");
        kotlin.jvm.internal.o.g(cv6, "cv");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cv6.containsKey("msgId")) {
            java.lang.Long asLong = cv6.getAsLong("msgId");
            kotlin.jvm.internal.o.f(asLong, "getAsLong(...)");
            wVar.f430091a = asLong.longValue();
            arrayList.add(up5.i.f429971c);
        }
        if (cv6.containsKey("msgSvrId")) {
            java.lang.Long asLong2 = cv6.getAsLong("msgSvrId");
            kotlin.jvm.internal.o.f(asLong2, "getAsLong(...)");
            wVar.f430092b = asLong2.longValue();
            arrayList.add(up5.i.f429972d);
        }
        if (cv6.containsKey("type")) {
            java.lang.Integer asInteger = cv6.getAsInteger("type");
            kotlin.jvm.internal.o.f(asInteger, "getAsInteger(...)");
            wVar.f430093c = asInteger.intValue();
            arrayList.add(up5.i.f429973e);
        }
        if (cv6.containsKey("status")) {
            java.lang.Integer asInteger2 = cv6.getAsInteger("status");
            kotlin.jvm.internal.o.f(asInteger2, "getAsInteger(...)");
            wVar.f430094d = asInteger2.intValue();
            arrayList.add(up5.i.f429974f);
        }
        if (cv6.containsKey("isSend")) {
            java.lang.Integer asInteger3 = cv6.getAsInteger("isSend");
            kotlin.jvm.internal.o.f(asInteger3, "getAsInteger(...)");
            wVar.f430095e = asInteger3.intValue();
            arrayList.add(up5.i.f429975g);
        }
        if (cv6.containsKey("isShowTimer")) {
            java.lang.Integer asInteger4 = cv6.getAsInteger("isShowTimer");
            kotlin.jvm.internal.o.f(asInteger4, "getAsInteger(...)");
            wVar.f430096f = asInteger4.intValue();
            arrayList.add(up5.i.f429976h);
        }
        if (cv6.containsKey("createTime")) {
            java.lang.Long asLong3 = cv6.getAsLong("createTime");
            kotlin.jvm.internal.o.f(asLong3, "getAsLong(...)");
            wVar.f430097g = asLong3.longValue();
            arrayList.add(up5.i.f429977i);
        }
        if (cv6.containsKey("talker")) {
            wVar.f430098h = cv6.getAsString("talker");
            arrayList.add(up5.i.f429978j);
        }
        if (cv6.containsKey("content")) {
            wVar.f430099i = cv6.getAsString("content");
            arrayList.add(up5.i.f429979k);
        }
        if (cv6.containsKey("imgPath")) {
            wVar.f430100j = cv6.getAsString("imgPath");
            arrayList.add(up5.i.f429980l);
        }
        if (cv6.containsKey("reserved")) {
            wVar.f430101k = cv6.getAsString("reserved");
            arrayList.add(up5.i.f429981m);
        }
        if (cv6.containsKey("lvbuffer")) {
            wVar.f430102l = cv6.getAsByteArray("lvbuffer");
            arrayList.add(up5.i.f429982n);
        }
        if (cv6.containsKey("talkerId")) {
            java.lang.Integer asInteger5 = cv6.getAsInteger("talkerId");
            kotlin.jvm.internal.o.f(asInteger5, "getAsInteger(...)");
            wVar.f430105o = asInteger5.intValue();
            arrayList.add(up5.i.f429985q);
        }
        if (cv6.containsKey("transContent")) {
            wVar.f430103m = cv6.getAsString("transContent");
            arrayList.add(up5.i.f429983o);
        }
        if (cv6.containsKey("transBrandWording")) {
            wVar.f430104n = cv6.getAsString("transBrandWording");
            arrayList.add(up5.i.f429984p);
        }
        if (cv6.containsKey("bizClientMsgId")) {
            wVar.f430106p = cv6.getAsString("bizClientMsgId");
            arrayList.add(up5.i.f429986r);
        }
        if (cv6.containsKey("bizChatId")) {
            java.lang.Long asLong4 = cv6.getAsLong("bizChatId");
            kotlin.jvm.internal.o.f(asLong4, "getAsLong(...)");
            wVar.f430107q = asLong4.longValue();
            arrayList.add(up5.i.f429987s);
        }
        if (cv6.containsKey("bizChatUserId")) {
            wVar.f430108r = cv6.getAsString("bizChatUserId");
            arrayList.add(up5.i.f429988t);
        }
        if (cv6.containsKey("msgSeq")) {
            java.lang.Long asLong5 = cv6.getAsLong("msgSeq");
            kotlin.jvm.internal.o.f(asLong5, "getAsLong(...)");
            wVar.f430109s = asLong5.longValue();
            arrayList.add(up5.i.f429989u);
        }
        if (cv6.containsKey("flag")) {
            java.lang.Integer asInteger6 = cv6.getAsInteger("flag");
            kotlin.jvm.internal.o.f(asInteger6, "getAsInteger(...)");
            wVar.f430110t = asInteger6.intValue();
            arrayList.add(up5.i.f429990v);
        }
        if (cv6.containsKey("solitaireFoldInfo")) {
            try {
                wVar.f430111u = cv6.getAsByteArray("solitaireFoldInfo");
                arrayList.add(up5.i.f429991w);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MessageEx", e17.getMessage());
            }
        }
        if (cv6.containsKey("fromUsername")) {
            wVar.f430113w = cv6.getAsString("fromUsername");
            arrayList.add(up5.i.f429993y);
        }
        if (cv6.containsKey("toUsername")) {
            wVar.f430114x = cv6.getAsString("toUsername");
            arrayList.add(up5.i.f429994z);
        }
        if (cv6.containsKey("historyId")) {
            wVar.f430112v = cv6.getAsString("historyId");
            arrayList.add(up5.i.f429992x);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (com.tencent.wcdb.orm.Field[]) arrayList.toArray(new com.tencent.wcdb.orm.Field[0]);
    }
}
