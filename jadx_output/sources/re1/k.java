package re1;

/* loaded from: classes13.dex */
public class k implements re1.g, java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public volatile long f394343d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.TreeSet f394344e = new java.util.TreeSet(this);

    /* renamed from: f, reason: collision with root package name */
    public long f394345f;

    public k(long j17) {
        this.f394343d = j17;
    }

    public final void a(re1.b bVar, long j17) {
        while (this.f394345f + j17 > this.f394343d && !this.f394344e.isEmpty()) {
            ((re1.m) bVar).f((re1.i) this.f394344e.first());
        }
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        re1.i iVar = (re1.i) obj;
        re1.i iVar2 = (re1.i) obj2;
        long j17 = iVar.f394342n;
        long j18 = iVar2.f394342n;
        return j17 - j18 == 0 ? iVar.compareTo(iVar2) : j17 < j18 ? -1 : 1;
    }
}
