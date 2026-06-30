package d40;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d40.m f226364d = new d40.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.file.RepairerConfigPreviewFile());
        java.util.HashSet hashSet = new java.util.HashSet();
        if (f17 != null) {
            for (java.lang.String str : r26.n0.f0(f17, new java.lang.String[]{"/"}, false, 0, 6, null)) {
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                java.lang.String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                hashSet.add(lowerCase);
            }
        }
        return hashSet;
    }
}
