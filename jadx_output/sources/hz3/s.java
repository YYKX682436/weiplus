package hz3;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f286354a;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Point f286356c;

    /* renamed from: f, reason: collision with root package name */
    public int f286359f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f286360g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f286355b = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f286357d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f286358e = "";

    public s(long j17, int i17) {
        this.f286354a = i17;
    }

    public final r45.si a() {
        r45.si siVar = new r45.si();
        int i17 = this.f286359f;
        if (i17 == 1) {
            siVar.f385743d = 1;
        } else if (i17 == 0) {
            siVar.f385743d = 2;
        }
        siVar.f385746g = this.f286357d;
        siVar.f385747h = this.f286358e;
        android.graphics.Point point = this.f286356c;
        siVar.f385744e = point != null ? point.x : 0;
        siVar.f385745f = point != null ? point.y : 0;
        siVar.f385748i = 0;
        return siVar;
    }
}
