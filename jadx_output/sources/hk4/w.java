package hk4;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.x f281982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f281983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f281984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(hk4.x xVar, long j17, yz5.a aVar) {
        super(1);
        this.f281982d = xVar;
        this.f281983e = j17;
        this.f281984f = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f281982d.f281985k, "seek:" + this.f281983e + " finished");
        yz5.a aVar = this.f281984f;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
