package iz5;

/* loaded from: classes7.dex */
public class d extends iz5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f296170d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f296171e;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.f296170d = str2;
        this.f296171e = str3;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String str = this.f296170d;
        java.lang.String str2 = this.f296171e;
        iz5.c cVar = new iz5.c(20, str, str2);
        java.lang.String message = super.getMessage();
        if (str == null || str2 == null || str.equals(str2)) {
            return iz5.a.i(message, str, str2);
        }
        cVar.f296168b = 0;
        int min = java.lang.Math.min(str.length(), str2.length());
        while (true) {
            int i17 = cVar.f296168b;
            if (i17 >= min || str.charAt(i17) != str2.charAt(cVar.f296168b)) {
                break;
            }
            cVar.f296168b++;
        }
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (true) {
            int i18 = cVar.f296168b;
            if (length2 < i18 || length < i18 || str.charAt(length) != str2.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        cVar.f296169c = str.length() - length;
        return iz5.a.i(message, cVar.a(str), cVar.a(str2));
    }
}
