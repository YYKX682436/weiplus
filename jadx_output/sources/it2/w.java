package it2;

/* loaded from: classes13.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final it2.w f294527d = new it2.w();

    public w() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        int indexOf;
        va.b bVar = new va.b();
        va.p pVar = va.p.f434200d;
        va.p pVar2 = bVar.f434179a;
        int i17 = 0;
        if (pVar2 == null) {
            bVar.f434179a = pVar;
            va.w wVar = va.z.f434210p;
            return new va.z(bVar, va.q.f434202a);
        }
        java.lang.Object[] objArr = {pVar2};
        java.lang.Object obj = objArr[0];
        try {
            str = java.lang.String.valueOf(obj);
        } catch (java.lang.Exception e17) {
            java.lang.String str2 = obj.getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
            java.util.logging.Logger.getLogger("com.google.common.base.Strings").log(java.util.logging.Level.WARNING, "Exception during lenientFormat for " + str2, (java.lang.Throwable) e17);
            str = "<" + str2 + " threw " + e17.getClass().getName() + ">";
        }
        objArr[0] = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(52);
        int i18 = 0;
        while (i17 < 1 && (indexOf = "Value strength was already set to %s".indexOf("%s", i18)) != -1) {
            sb6.append((java.lang.CharSequence) "Value strength was already set to %s", i18, indexOf);
            sb6.append(objArr[i17]);
            i18 = indexOf + 2;
            i17++;
        }
        sb6.append((java.lang.CharSequence) "Value strength was already set to %s", i18, 36);
        if (i17 < 1) {
            sb6.append(" [");
            sb6.append(objArr[i17]);
            for (int i19 = i17 + 1; i19 < 1; i19++) {
                sb6.append(", ");
                sb6.append(objArr[i19]);
            }
            sb6.append(']');
        }
        throw new java.lang.IllegalStateException(sb6.toString());
    }
}
