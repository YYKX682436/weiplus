package j20;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f297217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar) {
        super(1);
        this.f297217d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f297217d;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("EcsPoiPermission", "location permission granted");
            lVar.invoke(0);
        } else {
            com.tencent.mars.xlog.Log.i("EcsPoiPermission", "location permission denied");
            lVar.invoke(109);
        }
        return jz5.f0.f302826a;
    }
}
