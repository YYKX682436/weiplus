package com.tencent.mm.xwebutil;

/* loaded from: classes11.dex */
public class h implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f214833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214836g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214837h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f214838i;

    public h(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.app.Activity activity) {
        this.f214833d = j17;
        this.f214834e = str;
        this.f214835f = str2;
        this.f214836g = str3;
        this.f214837h = str4;
        this.f214838i = activity;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Collection collection;
        if (i17 != 1 || i18 != -1) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, resultCode not ok");
            return;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, retData is null");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, toUser is null");
            return;
        }
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        java.lang.String str = this.f214834e;
        long j17 = this.f214833d;
        java.lang.String str2 = this.f214835f;
        if (n17) {
            java.util.List g17 = new r26.t(",").g(stringExtra, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f313996d;
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
            kotlin.jvm.internal.o.d(P1);
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                kotlin.jvm.internal.o.d(str3);
                ut.s0 s0Var = new ut.s0(str3, str2 == null ? "" : str2);
                if (pt0.f0.f358209b1.a(str != null ? str : "", j17)) {
                    c01.h7 h7Var = new c01.h7();
                    h7Var.f37227b = j17;
                    h7Var.f37229d = str;
                    s0Var.f430723g = h7Var;
                    s0Var.f430721e = "forward_qb_file_msg";
                } else {
                    s0Var.f430721e = "forward_qb_file_path";
                }
                kotlinx.coroutines.flow.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new com.tencent.mm.xwebutil.b(tj6, null), 1, null);
                }
                if (!(stringExtra2 == null || r26.n0.N(stringExtra2))) {
                    ((dk5.s5) tg3.t1.a()).fj(str3, stringExtra2, c01.e2.C(str3), 0);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("XFilesReaderLogic", "sendFileToFriend, send broadcast, filePath: " + str2);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setAction("MINIQB_OPEN_RET");
            intent2.putExtra("op_type", "SEND_TO_FRIENDS");
            intent2.putExtra("file_path", str2);
            intent2.putExtra("file_name", this.f214836g);
            intent2.putExtra("file_ext", this.f214837h);
            intent2.putExtra("forward_msgid", j17);
            intent2.putExtra("forward_msg_talker", str);
            intent2.putExtra("to_user", stringExtra);
            intent2.putExtra("send_text", stringExtra2);
            intent2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            this.f214838i.sendBroadcast(intent2, com.tencent.mm.sdk.platformtools.v9.a());
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.xwebutil.g(this));
    }
}
