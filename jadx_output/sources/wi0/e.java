package wi0;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.l lVar) {
        super(1);
        this.f446142d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.flutter.plugin.proto.e it = (com.tencent.mm.flutter.plugin.proto.e) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPluginSnsDataSource", "getLatestSns finished size:" + it.f67959e.size());
        byte[] byteArray = it.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        this.f446142d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.flutter_voip_status.ProtoBuffer(byteArray))));
        return jz5.f0.f302826a;
    }
}
