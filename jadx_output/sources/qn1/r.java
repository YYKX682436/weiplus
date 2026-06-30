package qn1;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f365002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn1.t f365003e;

    public r(qn1.t tVar, int i17) {
        this.f365003e = tVar;
        this.f365002d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kn1.b bVar = this.f365003e.f365015i;
        if (bVar != null) {
            ((un1.c) bVar).a(this.f365002d);
        }
    }
}
