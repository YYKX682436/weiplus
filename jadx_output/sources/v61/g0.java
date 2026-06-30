package v61;

/* loaded from: classes.dex */
public final class g0 {
    public g0(kotlin.jvm.internal.i iVar) {
    }

    public final int a() {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("LoginUtil", "getLanguageIndex: language:" + f17 + ' ');
        if (f17.equals("zh_CN")) {
            f17 = "zh_TW";
        }
        java.util.List list = v61.h0.f433442b;
        return list.contains(f17) ? list.indexOf(f17) : list.indexOf("en");
    }
}
