package rt2;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt2.g f399502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rt2.g gVar) {
        super(1);
        this.f399502d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.vs2 vs2Var;
        android.content.Intent intent = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f399502d.getClass();
        java.lang.String stringExtra = intent.getStringExtra("action");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -1768624314:
                    if (stringExtra.equals("notifyCount")) {
                        java.lang.String stringExtra2 = intent.getStringExtra("redDotInfo");
                        byte[] decode = android.util.Base64.decode(stringExtra2 != null ? stringExtra2 : "", 0);
                        kotlin.jvm.internal.o.d(decode);
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decode, r26.c.f368865a));
                            nk6.H0(jSONObject.optInt("likeCount"), jSONObject.optInt("commentCount"), jSONObject.optInt("followCount"), jSONObject.optInt("systemCount"), g92.b.f269769e.T0());
                            break;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.Shell", e17, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
                case -1636480013:
                    if (stringExtra.equals("pushTabTips")) {
                        java.lang.String stringExtra3 = intent.getStringExtra("redDotInfo");
                        byte[] decode2 = android.util.Base64.decode(stringExtra3 != null ? stringExtra3 : "", 0);
                        kotlin.jvm.internal.o.d(decode2);
                        java.lang.String str = new java.lang.String(decode2, r26.c.f368865a);
                        try {
                            if (((decode2.length == 0) ^ true ? decode2 : null) != null) {
                                r45.vs2 vs2Var2 = new r45.vs2();
                                vs2Var2.fromJson(str);
                                r45.dz2 dz2Var = new r45.dz2();
                                java.util.LinkedList list = dz2Var.getList(0);
                                r45.gz2 gz2Var = new r45.gz2();
                                gz2Var.set(0, vs2Var2);
                                list.add(gz2Var);
                                ((com.tencent.mm.plugin.finder.extension.reddot.x2) nk6).e1(dz2Var, "shellTest");
                                break;
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.Shell", e18, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
                case -934908847:
                    if (stringExtra.equals("record")) {
                        int intExtra = intent.getIntExtra("ctrlType", 0);
                        java.lang.String stringExtra4 = intent.getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                        if (stringExtra4 == null) {
                            stringExtra4 = "";
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) kz5.n0.Z(zy2.fa.O0(nk6, stringExtra4, xy2.c.e(context), false, false, 12, null));
                            com.tencent.mm.protobuf.g gVar = jbVar != null ? jbVar.field_ctrInfo.f388488f : null;
                            if (gVar != null) {
                                byte[] decode3 = android.util.Base64.decode(android.util.Base64.encodeToString(gVar.f192156a, 0), 0);
                                byte[] bArr = gVar.f192156a;
                                if (bArr != null) {
                                    int length = bArr.length;
                                    for (int i17 = 0; i17 < length; i17++) {
                                        if (bArr[i17] != decode3[i17]) {
                                            com.tencent.mars.xlog.Log.i("Finder.Shell", "diff " + i17);
                                        }
                                    }
                                }
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("record path:");
                            sb6.append(stringExtra4);
                            sb6.append(" ctrlType:");
                            sb6.append(intExtra);
                            sb6.append(" ctrlInfo:");
                            if (jbVar != null && (vs2Var = jbVar.field_ctrInfo) != null) {
                                r9 = vs2Var.toJSON();
                            }
                            sb6.append(r9);
                            com.tencent.mars.xlog.Log.i("Finder.Shell", sb6.toString());
                            break;
                        }
                    }
                    break;
                case 3452698:
                    if (stringExtra.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH)) {
                        java.lang.String stringExtra5 = intent.getStringExtra("redDotInfo");
                        byte[] decode4 = android.util.Base64.decode(stringExtra5 != null ? stringExtra5 : "", 0);
                        kotlin.jvm.internal.o.d(decode4);
                        java.lang.String str2 = new java.lang.String(decode4, r26.c.f368865a);
                        try {
                            if (((decode4.length == 0) ^ true ? decode4 : null) != null) {
                                r45.vs2 vs2Var3 = new r45.vs2();
                                vs2Var3.fromJson(str2);
                                zy2.fa.D(nk6, vs2Var3, "FinderShell", null, false, null, 28, null);
                                break;
                            }
                        } catch (java.lang.Exception e19) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.Shell", e19, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
                case 1426876321:
                    if (stringExtra.equals("notifyRedDot")) {
                        java.lang.String stringExtra6 = intent.getStringExtra("redDotInfo");
                        byte[] decode5 = android.util.Base64.decode(stringExtra6 != null ? stringExtra6 : "", 0);
                        kotlin.jvm.internal.o.d(decode5);
                        java.lang.String str3 = new java.lang.String(decode5, r26.c.f368865a);
                        try {
                            if (((decode5.length == 0) ^ true ? decode5 : null) != null) {
                                r45.vs2 vs2Var4 = new r45.vs2();
                                vs2Var4.fromJson(str3);
                                r45.ts2 ts2Var = new r45.ts2();
                                ts2Var.set(1, vs2Var4);
                                ts2Var.getList(2).add(vs2Var4);
                                nk6.D0(ts2Var);
                                break;
                            }
                        } catch (java.lang.Exception e27) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.Shell", e27, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
                case 1940808485:
                    if (stringExtra.equals("notifyWxCount")) {
                        java.lang.String stringExtra7 = intent.getStringExtra("redDotInfo");
                        byte[] decode6 = android.util.Base64.decode(stringExtra7 != null ? stringExtra7 : "", 0);
                        kotlin.jvm.internal.o.d(decode6);
                        java.lang.String str4 = new java.lang.String(decode6, r26.c.f368865a);
                        try {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                                r45.vs2 vs2Var5 = new r45.vs2();
                                vs2Var5.fromJson(str4);
                                r45.d33 d33Var = new r45.d33();
                                d33Var.set(5, vs2Var5);
                                d33Var.set(0, 2);
                                nk6.l0(d33Var);
                                break;
                            }
                        } catch (java.lang.Exception e28) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.Shell", e28, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
            }
        }
        return jz5.f0.f302826a;
    }
}
