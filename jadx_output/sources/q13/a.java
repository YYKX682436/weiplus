package q13;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f359678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f359679b;

    /* renamed from: c, reason: collision with root package name */
    public final q13.a f359680c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f359681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f359682e;

    public a(int i17, int i18, q13.a aVar) {
        this.f359678a = i17;
        this.f359679b = i18;
        this.f359680c = aVar;
    }

    public java.lang.String toString() {
        int i17 = this.f359679b;
        int i18 = this.f359678a;
        q13.a aVar = this.f359680c;
        return aVar == null ? java.lang.String.format("[%d,%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)) : java.lang.String.format("%s [%d,%d]", aVar, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }
}
