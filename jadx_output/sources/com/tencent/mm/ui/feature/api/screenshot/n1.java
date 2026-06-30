package com.tencent.mm.ui.feature.api.screenshot;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/feature/api/screenshot/n1;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class n1 implements com.tencent.mm.ipcinvoker.i<android.os.Bundle, com.tencent.mm.ipcinvoker.type.IPCBoolean> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String string;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (string = bundle.getString("image_path")) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShareToBizTask", "imagePath is null");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
                return;
            }
            return;
        }
        java.lang.String string2 = bundle.getString("json_params");
        if (string2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShareToBizTask", "jsonParams is null");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
                return;
            }
            return;
        }
        tk.q qVar = (tk.q) i95.n0.c(tk.q.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((ox.o) qVar).Di(context, new org.json.JSONObject(string2), kz5.b0.c(new com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo(string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null)), new com.tencent.mm.ui.feature.api.screenshot.m1(rVar));
    }
}
