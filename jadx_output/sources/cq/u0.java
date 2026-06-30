package cq;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(yz5.l lVar) {
        super(0);
        this.f221290d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("requestFinderUploadHeadImg", "canceled!");
        yz5.l lVar = this.f221290d;
        if (lVar != null) {
            lVar.invoke(null);
        }
        return jz5.f0.f302826a;
    }
}
