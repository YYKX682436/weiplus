package n4;

/* loaded from: classes13.dex */
public class e implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f334868d;

    /* renamed from: e, reason: collision with root package name */
    public final int f334869e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f334870f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f334871g;

    public e(int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f334868d = i17;
        this.f334869e = i18;
        this.f334870f = str;
        this.f334871g = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        n4.e eVar = (n4.e) obj;
        int i17 = this.f334868d - eVar.f334868d;
        return i17 == 0 ? this.f334869e - eVar.f334869e : i17;
    }
}
