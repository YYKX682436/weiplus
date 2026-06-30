package com.tencent.mm.xwebutil;

/* loaded from: classes.dex */
final class g0 implements com.tencent.mm.ipcinvoker.k0 {
    private g0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            int hostByName = !com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d) ? gm0.j1.n().f273288b.f70764d.getHostByName(iPCString.f68406d, arrayList) : 0;
            bundle.putStringArrayList("ipList", arrayList);
            bundle.putInt("result", hostByName);
            com.tencent.mars.xlog.Log.i("XWeb.MM.GetHostByNameFromNewTask", "GetHostByNameFromNewTask, result:" + hostByName + ", ipList:" + arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("XWeb.MM.GetHostByNameFromNewTask", e17, "GetHostByNameFromNewTask error", new java.lang.Object[0]);
        }
        return bundle;
    }
}
