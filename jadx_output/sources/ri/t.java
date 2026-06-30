package ri;

/* loaded from: classes12.dex */
public abstract class t {
    public static java.lang.String a() {
        java.lang.String h17 = com.tencent.mm.app.w.INSTANCE.h();
        if (android.text.TextUtils.isEmpty(h17)) {
            h17 = com.tencent.matrix.lifecycle.owners.f0.f52740v;
        }
        return b(h17);
    }

    public static java.lang.String b(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.g gVar;
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            try {
                gVar = (com.tencent.mm.sdk.platformtools.g) com.tencent.mm.sdk.platformtools.h.f192721a.call();
            } catch (java.lang.Exception unused) {
                gVar = null;
            }
            if (gVar != null && !android.text.TextUtils.isEmpty(gVar.f192712b)) {
                return gVar.f192712b;
            }
        }
        return str.contains("@") ? str.substring(0, str.lastIndexOf("@")) : str;
    }
}
