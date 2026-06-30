package com.tencent.mm.plugin.webview.luggage.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements com.tencent.mm.ipcinvoker.k0 {
    private d() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String string = ((android.os.Bundle) obj).getString(dm.i4.COL_USERNAME);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("is_biz_contact", gm0.j1.a() ? c01.e2.G(string) : false);
        return bundle;
    }
}
