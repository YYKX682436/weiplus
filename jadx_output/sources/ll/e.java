package ll;

/* loaded from: classes13.dex */
public class e implements com.tencent.mm.audio.mix.decode.IDecodeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ll.f f319100a;

    public e(ll.f fVar) {
        this.f319100a = fVar;
    }

    @Override // com.tencent.mm.audio.mix.decode.IDecodeCallback
    public boolean onDecodeData(byte[] bArr, int i17, boolean z17) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "onDecodeData length:%d", objArr);
        kl.k kVar = this.f319100a.f319084e;
        if (kVar == null) {
            return false;
        }
        kVar.a(bArr);
        return false;
    }
}
