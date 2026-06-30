package eg2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qc0.a f252651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(qc0.a aVar) {
        super(2);
        this.f252651d = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String localPath = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(localPath, "localPath");
        qc0.a aVar = this.f252651d;
        aVar.f361349d.invoke(localPath);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveCoverEditDelegateImpl", "onHDToggleListener: isHD=" + booleanValue + ", context.isCurrentImageHD=" + aVar.f361355j);
        return jz5.f0.f302826a;
    }
}
