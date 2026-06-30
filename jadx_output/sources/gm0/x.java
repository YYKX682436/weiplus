package gm0;

/* loaded from: classes7.dex */
public class x implements com.tencent.mars.cdn.CronetLogic.IGetHostIps {

    /* renamed from: a, reason: collision with root package name */
    public static gm0.x f273285a;

    @Override // com.tencent.mars.cdn.CronetLogic.IGetHostIps
    public java.lang.String[] getNewDnsIps(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "current not it MM proc");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "try resolve host %s", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int f17 = com.tencent.mm.network.n.f(str, false, arrayList);
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MMKernel.CoreNetwork", "resolved dnstype %d iplist %s", java.lang.Integer.valueOf(f17), java.util.Arrays.toString(strArr));
        return strArr;
    }
}
