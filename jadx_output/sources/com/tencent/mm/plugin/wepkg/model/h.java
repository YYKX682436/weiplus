package com.tencent.mm.plugin.wepkg.model;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes8.dex */
public class h implements com.tencent.mm.ipcinvoker.k0 {
    private h() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            return null;
        }
        com.tencent.mm.plugin.wepkg.model.i.f(bundle.getString("ipc_param_pkgid"), bundle.getInt("ipc_param_type", -1), bundle.getInt("ipc_param_reason", 0));
        return null;
    }
}
