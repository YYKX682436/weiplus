package wv3;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final wv3.m f450068a = new wv3.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f450069b;

    static {
        r26.t tVar = new r26.t("^0:(\\d+):\\d+$");
        wv3.i iVar = wv3.i.f450062b;
        f450069b = kz5.c0.i(new wv3.a(tVar, iVar), new wv3.a(new r26.t("^qq_(\\d+)$"), iVar), new wv3.a(new r26.t("^sns_(\\d+)$"), iVar), new wv3.a(new r26.t("^finderbgm_(\\d+)$"), wv3.e.f450058b), new wv3.a(new r26.t("^wevision_(\\d+)$"), wv3.j.f450063b), new wv3.a(new r26.t("^1:(\\d+):\\d+$"), wv3.g.f450060b), new wv3.a(new r26.t("^listen_(\\d+)$"), wv3.f.f450059b));
    }

    public final wv3.l a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("WCMusicIdParser", "WCMusicIdParser no idString");
            return null;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        com.tencent.mars.xlog.Log.i("WCMusicIdParser", "WCMusicIdParser Parsing: ".concat(str));
        for (wv3.a aVar : f450069b) {
            r26.m b17 = aVar.f450046a.b(lowerCase, 0);
            if (b17 != null) {
                return new wv3.l((java.lang.String) ((r26.q) b17).a().get(1), aVar.f450047b, str);
            }
        }
        com.tencent.mars.xlog.Log.i("WCMusicIdParser", "No pattern matched");
        return new wv3.l(str, wv3.h.f450061b, str);
    }
}
