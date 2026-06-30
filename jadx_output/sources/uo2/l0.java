package uo2;

/* loaded from: classes2.dex */
public final class l0 {
    public l0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.lite.s a(android.content.Context context, r45.sd1 liteAppParam, java.lang.String str, uo2.m0 callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liteAppParam, "liteAppParam");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", liteAppParam.getString(0));
        if (str == null || str.length() == 0) {
            str = liteAppParam.getString(2);
        } else {
            java.lang.String string = liteAppParam.getString(2);
            if (!(string == null || string.length() == 0)) {
                str = liteAppParam.getString(2) + '&' + str;
            }
        }
        bundle.putString("query", str);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, liteAppParam.getString(1));
        bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477721i);
        bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477889ed);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = callback;
        callback.f429634a = sVar;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(context, bundle, true, false, sVar, null);
        return sVar;
    }
}
