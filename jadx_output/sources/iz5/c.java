package iz5;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f296167a;

    /* renamed from: b, reason: collision with root package name */
    public int f296168b;

    /* renamed from: c, reason: collision with root package name */
    public int f296169c;

    public c(int i17, java.lang.String str, java.lang.String str2) {
        this.f296167a = str;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2 = "[" + str.substring(this.f296168b, (str.length() - this.f296169c) + 1) + "]";
        int i17 = this.f296168b;
        java.lang.String str3 = this.f296167a;
        if (i17 > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(this.f296168b > 20 ? "..." : "");
            sb7.append(str3.substring(java.lang.Math.max(0, this.f296168b - 20), this.f296168b));
            sb6.append(sb7.toString());
            sb6.append(str2);
            str2 = sb6.toString();
        }
        if (this.f296169c <= 0) {
            return str2;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(str2);
        int min = java.lang.Math.min((str3.length() - this.f296169c) + 1 + 20, str3.length());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(str3.substring((str3.length() - this.f296169c) + 1, min));
        sb9.append((str3.length() - this.f296169c) + 1 >= str3.length() - 20 ? "" : "...");
        sb8.append(sb9.toString());
        return sb8.toString();
    }
}
