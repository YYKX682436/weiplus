package z83;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f470729e;

    public a(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI, java.lang.String str) {
        this.f470728d = kidsWatchRegGetInfoUI;
        this.f470729e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.String str;
        android.graphics.Bitmap bitmap;
        java.lang.String str2 = this.f470729e;
        int i18 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.f143139t;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470728d;
        kidsWatchRegGetInfoUI.getClass();
        gm0.j1.d().a(145, kidsWatchRegGetInfoUI);
        java.lang.String obj = kidsWatchRegGetInfoUI.T6().f444001m.getText().toString();
        int length = obj.length() - 1;
        int i19 = 0;
        boolean z17 = false;
        while (i19 <= length) {
            boolean z18 = kotlin.jvm.internal.o.i(obj.charAt(!z17 ? i19 : length), 32) <= 0;
            if (z17) {
                if (!z18) {
                    break;
                } else {
                    length--;
                }
            } else if (z18) {
                i19++;
            } else {
                z17 = true;
            }
        }
        java.lang.String h17 = com.tencent.mm.sdk.platformtools.c5.h(obj.subSequence(i19, length + 1).toString());
        java.lang.String str3 = kidsWatchRegGetInfoUI.f143142f;
        if (str3 == null || kidsWatchRegGetInfoUI.f143143g == null || kotlin.jvm.internal.o.b(h17, str3) || !kotlin.jvm.internal.o.b(h17, kidsWatchRegGetInfoUI.f143143g)) {
            java.lang.String str4 = kidsWatchRegGetInfoUI.f143142f;
            i17 = (str4 == null || (str = kidsWatchRegGetInfoUI.f143143g) == null || kotlin.jvm.internal.o.b(str, str4) || kotlin.jvm.internal.o.b(h17, kidsWatchRegGetInfoUI.f143143g)) ? 0 : 2;
        } else {
            i17 = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "checkMobileStateFun, adJust:" + i17 + ", opCode:22, " + kidsWatchRegGetInfoUI.f143145i);
        ((gv.a) ((hv.e) i95.n0.c(hv.e.class))).getClass();
        h11.e eVar = new h11.e(str2, 22, "", 0, "");
        ((o45.eh) eVar.f278071d.getReqObj()).f342922a.f372494s = kidsWatchRegGetInfoUI.f143145i;
        com.tencent.mm.network.v0 v0Var = eVar.f278071d;
        ((o45.eh) v0Var.getReqObj()).f342922a.f372495t = i17;
        fo3.s sVar = fo3.s.INSTANCE;
        if (sVar.wf("ie_reg")) {
            sVar.E7("ie_reg");
        }
        r45.kn5 kn5Var = new r45.kn5();
        kn5Var.f378856d = kidsWatchRegGetInfoUI.T6().f444002n.getText().toString();
        if (kidsWatchRegGetInfoUI.f143147n && (bitmap = kidsWatchRegGetInfoUI.f143148o) != null && !bitmap.isRecycled()) {
            kn5Var.f378858f = com.tencent.mm.sdk.platformtools.w2.b(com.tencent.mm.sdk.platformtools.x.a(kidsWatchRegGetInfoUI.f143148o));
        }
        kn5Var.f378859g = str2;
        kn5Var.f378860h = com.tencent.mm.sdk.platformtools.t8.k0();
        java.lang.String id6 = java.util.TimeZone.getDefault().getID();
        kn5Var.f378861i = id6;
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "%s,%s", kn5Var.f378860h, id6);
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(sVar.Ph("ie_reg"));
        k57Var.f378394d = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.Ci("ce_reg"));
        k57Var.f378395e = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(sVar.o3(16));
        k57Var.f378396f = cu5Var3;
        r45.cu5 cu5Var4 = new r45.cu5();
        cu5Var4.d(sVar.L9());
        k57Var.f378400m = cu5Var4;
        try {
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(kn5Var.toByteArray());
            k57Var.f378397g = cu5Var5;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KidsWatchRegGetInfoUI", e17, "convert to byte error ! %s", e17.getMessage());
        }
        eVar.R(k57Var);
        java.lang.String str5 = kidsWatchRegGetInfoUI.f143140d;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        ((o45.eh) v0Var.getReqObj()).f342922a.C = str5;
        gm0.j1.d().g(eVar);
        java.lang.String obj2 = kidsWatchRegGetInfoUI.T6().f444001m.getText().toString();
        int length2 = obj2.length() - 1;
        int i27 = 0;
        boolean z19 = false;
        while (i27 <= length2) {
            boolean z27 = kotlin.jvm.internal.o.i(obj2.charAt(!z19 ? i27 : length2), 32) <= 0;
            if (z19) {
                if (!z27) {
                    break;
                } else {
                    length2--;
                }
            } else if (z27) {
                i27++;
            } else {
                z19 = true;
            }
        }
        kidsWatchRegGetInfoUI.f143142f = com.tencent.mm.sdk.platformtools.c5.h(obj2.subSequence(i27, length2 + 1).toString());
        kidsWatchRegGetInfoUI.f143145i++;
    }
}
