package lp;

/* loaded from: classes12.dex */
public class h implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320229a = 0;

    static {
        q25.b.b(new lp.h(), "//fts");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (com.tencent.mars.xlog.Log.getLogLevel() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        char c17 = 65535;
        switch (str2.hashCode()) {
            case -1354714445:
                if (str2.equals("copydb")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1183792455:
                if (str2.equals("insert")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1132164145:
                if (str2.equals("clearconfig")) {
                    c17 = 2;
                    break;
                }
                break;
            case -926188360:
                if (str2.equals("setcorrupttime")) {
                    c17 = 3;
                    break;
                }
                break;
            case -617644996:
                if (str2.equals("clearunread")) {
                    c17 = 4;
                    break;
                }
                break;
            case 3237038:
                if (str2.equals("info")) {
                    c17 = 5;
                    break;
                }
                break;
            case 104187309:
                if (str2.equals("msbiz")) {
                    c17 = 6;
                    break;
                }
                break;
            case 648505237:
                if (str2.equals("dismisskey")) {
                    c17 = 7;
                    break;
                }
                break;
            case 819712873:
                if (str2.equals("deletedb")) {
                    c17 = '\b';
                    break;
                }
                break;
            case 955180557:
                if (str2.equals("corrupt")) {
                    c17 = '\t';
                    break;
                }
                break;
            case 967115467:
                if (str2.equals("inserttest")) {
                    c17 = '\n';
                    break;
                }
                break;
            case 1873247692:
                if (str2.equals("addchatroomcontact")) {
                    c17 = 11;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(gm0.j1.u().h(), "FTS5IndexMicroMsg_encrypt.db");
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("/sdcard/IndexMicroMsg.db"));
                if (r6Var2.m()) {
                    r6Var2.l();
                }
                com.tencent.mm.vfs.w6.c(r6Var.o(), r6Var2.o());
                break;
            case 1:
                p13.u uVar = new p13.u();
                uVar.f351140b = com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_ABS;
                uVar.f351147i = 100;
                if (strArr.length > 2) {
                    try {
                        uVar.f351147i = java.lang.Integer.valueOf(strArr[2]).intValue();
                    } catch (java.lang.Exception unused) {
                    }
                }
                if (strArr.length > 3) {
                    uVar.f351144f = strArr[3];
                }
                ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar);
                break;
            case 2:
                com.tencent.mm.storage.u3[] u3VarArr = {com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_CN_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_TW_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_HK_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_EN_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_AR_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_DE_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_DE_DE_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_ES_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_FR_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_HE_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_HI_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_ID_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_IN_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_IT_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_IW_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_JA_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_KO_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_LO_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_MS_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_MY_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_PL_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_PT_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_RU_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_TH_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_TR_STRING, com.tencent.mm.storage.u3.USERINFO_WEB_SEARCH_CONFIG_VI_STRING};
                for (int i17 = 0; i17 < 26; i17++) {
                    c01.d9.b().p().x(u3VarArr[i17], "");
                }
                break;
            case 3:
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC, 5);
                break;
            case 4:
                p13.u uVar2 = new p13.u();
                uVar2.f351140b = 65524;
                ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar2);
                break;
            case 5:
                com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(o13.d.f342234t, "FTS5IndexMicroMsgInfo.txt");
                if (r6Var3.m()) {
                    try {
                        b(context, com.tencent.mm.vfs.w6.M(r6Var3.o()));
                        break;
                    } catch (java.io.IOException unused2) {
                        break;
                    }
                }
                break;
            case 6:
                r45.hq4 c18 = su4.t2.c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = c18.f376386d.iterator();
                while (it.hasNext()) {
                    r45.gq4 gq4Var = (r45.gq4) it.next();
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str3 = gq4Var.f375483d;
                    ((sg3.a) v0Var).getClass();
                    sb6.append(java.lang.String.format("%s | %.2f | %s", c01.a2.e(str3), java.lang.Double.valueOf(gq4Var.f375484e), k35.m1.d("yyyy-MM-dd HH:mm", gq4Var.f375485f / 1000)));
                    sb6.append("\n");
                }
                b(context, sb6.toString());
                break;
            case 7:
                java.lang.String str4 = "test_key_" + java.lang.System.currentTimeMillis();
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FTS_MASTER_DB_ENCRYPT_PWD_STRING_SYNC, str4);
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/console/command/FTSCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/console/command/FTSCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                break;
            case '\b':
                com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(gm0.j1.u().h(), "FTS5IndexMicroMsg_encrypt.db");
                if (r6Var4.m()) {
                    r6Var4.l();
                }
                int myPid2 = android.os.Process.myPid();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(myPid2));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/console/command/FTSCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(obj2, "com/tencent/mm/console/command/FTSCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                break;
            case '\t':
                try {
                    ((com.tencent.mm.plugin.fts.d0$$a) ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137388p).onCorruption(null);
                    break;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CommandTestFTS", e17, "corrupt command", new java.lang.Object[0]);
                    break;
                }
            case '\n':
                p13.u uVar3 = new p13.u();
                uVar3.f351140b = 65525;
                ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar3);
                break;
            case 11:
                p13.u uVar4 = new p13.u();
                uVar4.f351141c = strArr[2];
                uVar4.f351140b = 65523;
                ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar4);
                break;
        }
        return true;
    }

    public final void b(android.content.Context context, java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
    }
}
