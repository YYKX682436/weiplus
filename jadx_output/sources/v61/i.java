package v61;

/* loaded from: classes8.dex */
public final class i implements v61.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f433444a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f433445b;

    /* renamed from: c, reason: collision with root package name */
    public final android.net.Uri f433446c;

    public i(int i17, java.lang.String str, android.net.Uri uri) {
        this.f433444a = i17;
        this.f433445b = str;
        this.f433446c = uri;
    }

    @Override // v61.h
    public int a(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
            return 1;
        }
        if (!gm0.j1.b().n() || gm0.m.r()) {
            return 3;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().l(6, ""))) {
            return 2;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contacts permission");
            return 1;
        }
        if (this.f433446c == null) {
            java.lang.String str3 = this.f433445b;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                return b(context, kk.k.g(o25.b.a(str3).getBytes()), null, null);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "uri is null and the phone num is null");
            return 1;
        }
        android.database.Cursor query = context.getContentResolver().query(this.f433446c, new java.lang.String[]{"contact_id", "_id", "data4"}, null, null, null);
        if (query == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err");
            return 1;
        }
        if (!query.moveToFirst()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err, move to first fail");
            return 1;
        }
        int columnIndex = query.getColumnIndex("data4");
        try {
            if (columnIndex == -1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no data4 segment exist");
                return 1;
            }
            try {
                str2 = query.getString(columnIndex);
                try {
                    int columnIndex2 = query.getColumnIndex("contact_id");
                    str = columnIndex2 >= 0 ? query.getString(columnIndex2) : "";
                } catch (java.lang.Exception e17) {
                    e = e17;
                    str = "";
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                str = "";
                str2 = str;
            }
            try {
                int columnIndex3 = query.getColumnIndex("_id");
                java.lang.String string = columnIndex3 >= 0 ? query.getString(columnIndex3) : "";
                query.close();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    return b(context, str2, string, str);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null friendmobile");
                return 1;
            } catch (java.lang.Exception e19) {
                e = e19;
                com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "match error, %s\n%s", e.getMessage(), com.tencent.mm.sdk.platformtools.z3.c(e));
                com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "result friendMobileMd5 %s contact_id %s data_id %s", str2, str, "");
                return 1;
            }
        } finally {
            query.close();
        }
    }

    public final int b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        r61.a i17 = m61.k.wi().i(str);
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
            return 1;
        }
        if (i17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "this user is not my friend");
            return 1;
        }
        java.lang.String i18 = i17.i();
        if (com.tencent.mm.sdk.platformtools.t8.K0(i18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "get username failed, phonenum md5 is " + str);
            return 1;
        }
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(i18)) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            int i19 = this.f433444a;
            g0Var.d(11157, java.lang.Integer.valueOf(i19));
            if (i19 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", i18);
                intent.putExtra("finish_direct", true);
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, context);
                return 0;
            }
            if (i19 == 2) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_userName", i18);
                intent2.addFlags(67108864);
                intent2.putExtra("sns_adapter_type", 1);
                j45.l.j(context, "sns", ".ui.SnsUserUI", intent2, null);
                return 0;
            }
            if (i19 == 3) {
                com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
                am.y00 y00Var = voipEvent.f54945g;
                y00Var.f8415b = 5;
                y00Var.f8418e = i18;
                y00Var.f8417d = context;
                y00Var.f8419f = 3;
                voipEvent.e();
                return 0;
            }
            if (i19 == 4) {
                com.tencent.mm.autogen.events.VoipEvent voipEvent2 = new com.tencent.mm.autogen.events.VoipEvent();
                am.y00 y00Var2 = voipEvent2.f54945g;
                y00Var2.f8415b = 5;
                y00Var2.f8418e = i18;
                y00Var2.f8417d = context;
                y00Var2.f8419f = 2;
                voipEvent2.e();
                return 0;
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contact permission");
                return 1;
            }
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.bkn), 1).show();
            context.getContentResolver().delete(android.provider.ContactsContract.Data.CONTENT_URI, "_id = ?", new java.lang.String[]{str2});
            context.getContentResolver().delete(android.provider.ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new java.lang.String[]{str3, "com.tencent.mm.account"});
        }
        return 1;
    }
}
