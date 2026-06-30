package h72;

/* loaded from: classes14.dex */
public class d implements ei3.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h72.s f279421d;

    public d(h72.s sVar) {
        this.f279421d = sVar;
    }

    @Override // ei3.k
    public void j(int i17) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        h72.s sVar = this.f279421d;
        sVar.i("MicroMsg.FaceVideoRecorder", "hy: video capture error: %d", objArr);
        sVar.f279469c.postToWorker(new h72.c(this, i17));
    }
}
