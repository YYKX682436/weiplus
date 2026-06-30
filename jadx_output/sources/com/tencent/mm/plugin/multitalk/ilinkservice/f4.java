package com.tencent.mm.plugin.multitalk.ilinkservice;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public class f4 implements com.tencent.mm.ipcinvoker.k0 {
    private f4() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("device_info", gm0.j1.u().j().n0(77825));
        return bundle;
    }
}
