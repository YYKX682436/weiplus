package n72;

/* loaded from: classes14.dex */
public class m implements com.tencent.mm.plugin.facedetect.model.u {
    public m(n72.q qVar) {
    }

    @Override // com.tencent.mm.plugin.facedetect.model.u
    public void a(byte[] bArr) {
        com.tencent.mm.plugin.facedetect.model.s sVar = com.tencent.mm.plugin.facedetect.model.s.f100033d;
        synchronized (sVar) {
            sVar.k(bArr);
        }
    }

    @Override // com.tencent.mm.plugin.facedetect.model.u
    public com.tencent.mm.memory.a b() {
        return com.tencent.mm.plugin.facedetect.model.s.f100033d;
    }
}
