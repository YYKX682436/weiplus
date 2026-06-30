package gk4;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gk4.r rVar) {
        super(0);
        this.f272552d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f272552d.f272602g, "invoke first frame callback, pts:" + this.f272552d.f272612q);
        yz5.a aVar = this.f272552d.f272599d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f272552d.f272599d = null;
        return jz5.f0.f302826a;
    }
}
