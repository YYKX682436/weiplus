package com.tencent.mm.xwebutil;

/* loaded from: classes7.dex */
final class h0 implements com.tencent.mm.ipcinvoker.k0 {
    private h0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
                arrayList.addAll(((com.tencent.mars.mmdns.MMDnsManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.mmdns.MMDnsManager.class)).getHostWithParam(iPCString.f68406d, 100, false, 0));
            }
            bundle.putStringArrayList("ipList", arrayList);
            com.tencent.mars.xlog.Log.i("XWeb.MM.GetHostByNameFromSimpleTask", "GetHostByNameFromSimpleTask ipList:" + arrayList.size());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("XWeb.MM.GetHostByNameFromSimpleTask", e17, "GetHostByNameFromSimpleTask error", new java.lang.Object[0]);
        }
        return bundle;
    }
}
