package dc;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f228660a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f228661b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f228662c;

    /* renamed from: d, reason: collision with root package name */
    public final int f228663d;

    public n(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        this.f228660a = str;
        this.f228661b = str2;
        this.f228662c = str3;
        this.f228663d = i18;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f228660a);
        sb6.append(this.f228661b.replace('/', '.'));
        sb6.append(" - ");
        sb6.append(this.f228662c);
        sb6.append(":");
        int i17 = this.f228663d;
        sb6.append(i17 != -3 ? i17 != -2 ? i17 != -1 ? i17 != 0 ? java.lang.String.valueOf(i17) : "No line number" : "Unknown line number" : "Compiled method" : "Native method");
        return sb6.toString();
    }
}
