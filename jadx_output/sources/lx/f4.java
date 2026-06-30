package lx;

/* loaded from: classes11.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin) {
        super(0);
        this.f321759d = flutterBizPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(g83.a.d(), false);
        kotlin.jvm.internal.o.d(i17);
        com.tencent.mars.xlog.Log.i(this.f321759d.f65253d, "imgPreviewCacheDirectory=".concat(i17));
        return i17;
    }
}
