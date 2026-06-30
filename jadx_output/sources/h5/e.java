package h5;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f278984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h5.f f278985e;

    public e(h5.f fVar, java.util.List list) {
        this.f278985e = fVar;
        this.f278984d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (f5.a aVar : this.f278984d) {
            java.lang.Object obj = this.f278985e.f278991e;
            g5.d dVar = (g5.d) aVar;
            dVar.f268878b = obj;
            dVar.d(dVar.f268880d, obj);
        }
    }
}
