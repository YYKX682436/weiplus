package com.tencent.mm.plugin.scanner;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class y0 implements com.tencent.mm.ipcinvoker.k0 {
    private y0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Set b17 = com.tencent.mm.plugin.scanner.z0.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashSet hashSet = (java.util.HashSet) b17;
        if (!hashSet.isEmpty()) {
            java.util.Iterator it = hashSet.iterator();
            sb6.append((java.lang.String) it.next());
            while (it.hasNext()) {
                sb6.append("|");
                sb6.append((java.lang.String) it.next());
            }
            bundle.putString("wxCodePrefix", sb6.toString());
        }
        return bundle;
    }
}
