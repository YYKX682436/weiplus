package zv;

/* loaded from: classes.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, java.lang.String str) {
        super(1);
        this.f476061d = flutterBrandEcsPlugin;
        this.f476062e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(value);
        java.lang.String str = this.f476062e;
        com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = this.f476061d;
        if (m528isSuccessimpl) {
            com.tencent.mars.xlog.Log.i(flutterBrandEcsPlugin.f65189d, "onDeleteUserListener, username = " + str + " success");
        } else {
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
            com.tencent.mars.xlog.Log.e(flutterBrandEcsPlugin.f65189d, "onDeleteUserListener, username = " + str + " failed error: " + m524exceptionOrNullimpl);
        }
        return jz5.f0.f302826a;
    }
}
