package com.tencent.mm.plugin.scanner;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class x0 implements com.tencent.mm.ipcinvoker.k0 {
    private x0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Set a17 = com.tencent.mm.plugin.scanner.z0.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashSet hashSet = (java.util.HashSet) a17;
        if (!hashSet.isEmpty()) {
            java.util.Iterator it = hashSet.iterator();
            sb6.append((java.lang.String) it.next());
            while (it.hasNext()) {
                sb6.append("|");
                sb6.append((java.lang.String) it.next());
            }
            bundle.putString("brandCodePrefix", sb6.toString());
        }
        return bundle;
    }
}
