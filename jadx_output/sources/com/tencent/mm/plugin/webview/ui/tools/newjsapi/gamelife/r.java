package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.DeleteMsgParams f186195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f186196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f186197f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.DeleteMsgParams deleteMsgParams, java.util.ArrayList arrayList, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f186195d = deleteMsgParams;
        this.f186196e = arrayList;
        this.f186197f = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.HashMap item = (java.util.HashMap) obj;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = (java.lang.String) item.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        java.lang.Object obj2 = item.get("localMsgId");
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null);
        if (!this.f186195d.f186122d.equals(str) || E1 < 0) {
            this.f186197f.f310112d = true;
        } else {
            this.f186196e.add(java.lang.Long.valueOf(E1));
        }
        return jz5.f0.f302826a;
    }
}
