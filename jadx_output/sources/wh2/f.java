package wh2;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final wh2.f f445949a = new wh2.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f445950b;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102135d);
        sb6.append("InteractiveGift/");
        f445950b = sb6.toString();
    }

    public final java.lang.String a(r45.kv1 gift) {
        kotlin.jvm.internal.o.g(gift, "gift");
        java.lang.String string = gift.getString(20);
        java.lang.String string2 = gift.getString(0);
        if (!(string == null || string.length() == 0)) {
            if (!(string2 == null || string2.length() == 0)) {
                return f445950b + com.tencent.mm.sdk.platformtools.w2.a(string + '_' + string2) + ".zip";
            }
        }
        com.tencent.mars.xlog.Log.w("Finder.FinderInteractiveGiftLoader", "getInteractiveGiftPath invalid url:" + string + ", id:" + string2);
        return null;
    }
}
