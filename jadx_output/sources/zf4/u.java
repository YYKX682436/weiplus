package zf4;

/* loaded from: classes13.dex */
public class u extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf4.v f472691a;

    public u(zf4.v vVar, zf4.w wVar) {
        this.f472691a = vVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        zf4.w wVar = this.f472691a.f472693e;
        if (wVar.f472700f <= 0) {
            return;
        }
        com.tencent.mm.modelbase.f1 f1Var = wVar.f472696b;
        wVar.f472700f = 2;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
