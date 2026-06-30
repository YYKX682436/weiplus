package jn4;

/* loaded from: classes11.dex */
public class h extends java.util.concurrent.ConcurrentHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn4.m f300803d;

    public h(jn4.m mVar, jn4.a aVar) {
        this.f300803d = mVar;
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt);
    }

    public void a() {
        java.util.Map map;
        java.lang.String str;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(jn4.m.f300814i);
        boolean m17 = r6Var.m();
        jn4.m mVar = this.f300803d;
        if (!m17) {
            try {
                r6Var.k();
                com.tencent.mm.vfs.w6.a(jn4.m.f300814i, (mVar.f300819d + "\n").getBytes());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "create log file err " + e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTraceRoute", e17, "", new java.lang.Object[0]);
                jn4.m.a(mVar);
                return;
            }
        }
        java.util.Iterator it = mVar.f300817b.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) ((java.util.Map.Entry) it.next()).getKey();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && mVar.f300817b.containsKey(str2) && (map = (java.util.Map) mVar.f300817b.get(str2)) != null) {
                if (map.size() != 1 || map.get(1) == null) {
                    java.lang.String str3 = "";
                    boolean z17 = false;
                    for (int i17 = 0; i17 < map.size() && !z17; i17++) {
                        if (map.get(java.lang.Integer.valueOf(i17)) != null) {
                            java.lang.String sb6 = ((java.lang.StringBuilder) map.get(java.lang.Integer.valueOf(i17))).toString();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(sb6)) {
                                str3 = str3 + sb6;
                                if (sb6.contains("FIN")) {
                                    z17 = true;
                                }
                            }
                        }
                    }
                    str = str3;
                } else {
                    str = "" + ((java.lang.StringBuilder) map.get(1)).toString();
                }
                if (str.length() > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", str2 + str);
                    com.tencent.mm.vfs.w6.a(jn4.m.f300814i, str.getBytes());
                }
            }
        }
        byte[] N = com.tencent.mm.vfs.w6.N(jn4.m.f300814i, 0, -1);
        if (com.tencent.mm.sdk.platformtools.t8.M0(N)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "read log failed");
            jn4.m.a(mVar);
            return;
        }
        int length = N.length;
        java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(length)).getBytes()).toLowerCase();
        byte[] a17 = kk.y.a(N);
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        kk.d.b(pByteArray, a17, lowerCase.getBytes());
        s75.d.b(new jn4.g(this, length, lowerCase, pByteArray), "MMTraceRoute_uploadLog");
    }
}
