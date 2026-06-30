package zv;

/* loaded from: classes8.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f475974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        super(0);
        this.f475974d = flutterBrandEcsPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(g83.a.c(), false);
        kotlin.jvm.internal.o.d(i17);
        com.tencent.mars.xlog.Log.i(this.f475974d.f65189d, "imgCacheDirectory=".concat(i17));
        return i17;
    }
}
