package com.tencent.mm.ui.feature.api.screenshot;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/feature/api/screenshot/q;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class q implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.sdk.platformtools.e7 e7Var;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            return;
        }
        boolean z17 = bundle.getBoolean("isRegister");
        java.lang.String string = bundle.getString("callbackProcess");
        if (string == null || (e7Var = com.tencent.mm.sdk.platformtools.m7.f192859d) == null) {
            return;
        }
        ((com.tencent.mm.ui.feature.api.screenshot.p) e7Var).a(string, z17);
    }
}
