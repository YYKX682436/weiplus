package rq4;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f398934a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f398935b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.Size f398936c;

    /* renamed from: d, reason: collision with root package name */
    public int f398937d;

    public a(int i17) {
        this.f398934a = i17;
        java.lang.String[] strArr = new java.lang.String[2];
        for (int i18 = 0; i18 < 2; i18++) {
            strArr[i18] = "";
        }
        this.f398935b = strArr;
    }

    public int hashCode() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return (int) java.lang.System.currentTimeMillis();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("apiLevel ");
        sb6.append(this.f398937d);
        sb6.append(",cameraid: ");
        sb6.append(this.f398934a);
        sb6.append(" and preview size is");
        android.util.Size size = this.f398936c;
        sb6.append(size != null ? java.lang.Integer.valueOf(size.getWidth()) : null);
        sb6.append('*');
        android.util.Size size2 = this.f398936c;
        sb6.append(size2 != null ? java.lang.Integer.valueOf(size2.getHeight()) : null);
        return sb6.toString();
    }
}
