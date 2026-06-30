package w14;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final w14.a f442225a = new w14.a();

    public final java.lang.String a(java.lang.String email) {
        java.util.Collection collection;
        kotlin.jvm.internal.o.g(email, "email");
        java.util.List g17 = new r26.t("@").g(email, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f313996d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        if (strArr.length != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsEmailUtil", "invalid email address");
            return email;
        }
        java.lang.String str = strArr[0];
        java.lang.String str2 = strArr[1];
        return (str.charAt(0) + "****" + str.charAt(str.length() - 1)) + '@' + str2;
    }
}
