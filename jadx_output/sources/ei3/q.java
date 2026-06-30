package ei3;

/* loaded from: classes14.dex */
public class q extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.u f253117a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ei3.u uVar, android.os.Looper looper) {
        super(looper);
        this.f253117a = uVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        ei3.u uVar = this.f253117a;
        ei3.h hVar = uVar.f253135l;
        if (hVar != null) {
            hVar.a();
            uVar.f253135l = null;
        }
    }
}
