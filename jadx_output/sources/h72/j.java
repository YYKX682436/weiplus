package h72;

/* loaded from: classes10.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f279445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.s f279446e;

    public j(h72.s sVar, float f17) {
        this.f279446e = sVar;
        this.f279445d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.m mVar = this.f279446e.f279467a;
        if (mVar != null) {
            mVar.e(this.f279445d);
        }
    }
}
