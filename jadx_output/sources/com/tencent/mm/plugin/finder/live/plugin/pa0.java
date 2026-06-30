package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pa0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wa0 f113851a;

    public pa0(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var) {
        this.f113851a = wa0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.obj;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj;
        int i17 = msg.what;
        com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var = this.f113851a;
        if (i17 == 1) {
            wa0Var.x1().setText(str);
        } else {
            if (i17 != 2) {
                return;
            }
            java.lang.Object value = ((jz5.n) wa0Var.f114900q).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.widget.TextView) value).setText(str);
        }
    }
}
