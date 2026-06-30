package df5;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.d f232056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(df5.d dVar) {
        super(0);
        this.f232056d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df5.d dVar = this.f232056d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FeederQueue", "[FEEDER_QUEUE] onFeederComplete, pendingSize=%d", java.lang.Integer.valueOf(((java.util.ArrayList) dVar.f232066f).size()));
        dVar.f232064d = null;
        dVar.e();
        return jz5.f0.f302826a;
    }
}
