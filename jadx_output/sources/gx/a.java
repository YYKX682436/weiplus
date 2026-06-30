package gx;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx.b f276168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, gx.b bVar) {
        super(3);
        this.f276167d = str;
        this.f276168e = bVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo result = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) obj3;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiBrandGetFrameSetPosition", "MBJsApiBrandGetFrameSetPosition " + this.f276167d + ' ' + intValue + ' ' + result);
        gx.b bVar = this.f276168e;
        if (intValue != 0) {
            bVar.s().invoke(bVar.h(intValue, str));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isRecCard", java.lang.Boolean.valueOf(result.getIsRecCard()));
            hashMap.put("position", java.lang.Integer.valueOf(result.getPos()));
            hashMap.put("subPosition", java.lang.Integer.valueOf(result.getSubPos()));
            bVar.s().invoke(bVar.l(hashMap));
        }
        return jz5.f0.f302826a;
    }
}
