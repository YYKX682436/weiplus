package so2;

/* loaded from: classes2.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f410324a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f410325b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f410326c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f410327d;

    public final java.lang.String a(java.util.HashMap hashMap) {
        java.lang.String str;
        int i17 = this.f410327d - 1;
        java.lang.String str2 = "";
        int i18 = 0;
        while (true) {
            str = "0";
            if (i18 >= i17) {
                break;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i18));
            if (num != null) {
                str = java.lang.String.valueOf(num);
            }
            sb6.append(str);
            sb6.append(',');
            str2 = sb6.toString();
            i18++;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str2);
        java.lang.Integer num2 = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(this.f410327d - 1));
        sb7.append(num2 != null ? java.lang.String.valueOf(num2) : "0");
        return sb7.toString();
    }
}
