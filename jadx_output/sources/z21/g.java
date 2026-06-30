package z21;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z21.h f469573a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z21.h hVar, android.os.Looper looper) {
        super(looper);
        this.f469573a = hVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 291) {
            return;
        }
        z21.h hVar = this.f469573a;
        if (hVar.P()) {
            gm0.j1.d().g(hVar);
        }
    }
}
