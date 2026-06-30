package mn2;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mn2.k f330028d = new mn2.k();

    public k() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            return new org.json.JSONObject(com.tencent.mm.plugin.finder.storage.t70.f127590a.g()).optString(ya.b.ORIGIN, "0");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAvatar", "originSizeUrl:", th6);
            return "";
        }
    }
}
