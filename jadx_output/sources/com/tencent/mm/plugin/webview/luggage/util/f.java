package com.tencent.mm.plugin.webview.luggage.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements com.tencent.mm.ipcinvoker.k0 {
    private f() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("has_set_uin", gm0.j1.a());
        return bundle;
    }
}
