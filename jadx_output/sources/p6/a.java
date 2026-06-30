package p6;

/* loaded from: classes16.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f352107a;

    /* renamed from: b, reason: collision with root package name */
    public long f352108b;

    /* renamed from: c, reason: collision with root package name */
    public int f352109c;

    /* renamed from: d, reason: collision with root package name */
    public int f352110d;

    /* renamed from: e, reason: collision with root package name */
    public int f352111e;

    /* renamed from: f, reason: collision with root package name */
    public m6.c f352112f;

    /* renamed from: g, reason: collision with root package name */
    public q6.a f352113g;

    /* renamed from: h, reason: collision with root package name */
    public int f352114h;

    /* renamed from: i, reason: collision with root package name */
    public int f352115i;

    /* renamed from: j, reason: collision with root package name */
    public java.io.File f352116j;

    public static boolean a(m6.c cVar) {
        o6.a aVar;
        java.util.ArrayList arrayList;
        if (cVar == null) {
            return false;
        }
        if (1 != cVar.getVersion()) {
            return 2 == cVar.getVersion() && (arrayList = (aVar = (o6.a) cVar).f343174b) != null && arrayList.size() >= 1 && ((o6.c) aVar.f343174b.get(0)).f343176b != null && ((o6.c) aVar.f343174b.get(0)).f343176b.size() >= 1 && ((m6.e) ((o6.c) aVar.f343174b.get(0)).f343176b.get(0)).f324349a != null;
        }
        n6.a aVar2 = (n6.a) cVar;
        java.util.ArrayList arrayList2 = aVar2.f335169b;
        return (arrayList2 == null || arrayList2.size() < 1 || ((m6.e) aVar2.f335169b.get(0)).f324349a == null) ? false : true;
    }

    public void b() {
        this.f352107a = null;
        this.f352108b = 0L;
        this.f352109c = 0;
        this.f352110d = 0;
        this.f352111e = 0;
        this.f352112f = null;
        this.f352113g = null;
        this.f352114h = 0;
        this.f352115i = 0;
    }

    public java.lang.String toString() {
        return "CurrentPlayingHeInfo{mHeString='" + this.f352107a + "', mStartTime=" + this.f352108b + ", mLoop=" + this.f352109c + ", mAmplitude=" + this.f352110d + ", mFreq=" + this.f352111e + ", mHeRoot=" + this.f352112f + ", mSyncCallback=" + this.f352113g + ", mStartPosition=" + this.f352114h + ", mStatus:" + this.f352115i + '}';
    }
}
