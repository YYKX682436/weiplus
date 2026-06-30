package com.tencent.mm.plugin.lite.storage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class p implements com.tencent.mm.ipcinvoker.k0 {
    private p() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        return com.tencent.mm.plugin.lite.storage.q.a(bundle.getString(ya.b.METHOD), bundle.getString("arg"), bundle.getBundle("extras"));
    }
}
