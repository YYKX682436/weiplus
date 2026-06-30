package h72;

/* loaded from: classes14.dex */
public class o implements com.tencent.mm.plugin.facedetect.model.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h72.s f279454a;

    public o(h72.s sVar) {
        this.f279454a = sVar;
    }

    @Override // com.tencent.mm.plugin.facedetect.model.u
    public void a(byte[] bArr) {
        h72.s sVar = this.f279454a;
        sVar.f279469c.postToWorker(new h72.p(sVar, bArr));
    }

    @Override // com.tencent.mm.plugin.facedetect.model.u
    public com.tencent.mm.memory.a b() {
        return ei3.x.f253187d;
    }
}
