package xh1;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh1.g f454491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xh1.g gVar) {
        super(0);
        this.f454491d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.he heVar = new r45.he();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = this.f454491d.f454509d.u0();
        heVar.f376078e = u07 != null ? u07.f47279x0 : 0;
        heVar.f376080g = com.tencent.mm.sdk.platformtools.z.f193112h;
        java.lang.String k17 = wo.w0.k();
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
        byte[] bytes = k17.getBytes(UTF_8);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bytes);
        b17.f(java.lang.Math.min(b17.f192156a.length, 16));
        heVar.f376079f = b17;
        java.lang.String str = "android-" + android.os.Build.VERSION.SDK_INT;
        java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_82, "UTF_8");
        byte[] bytes2 = str.getBytes(UTF_82);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        com.tencent.mm.protobuf.g b18 = com.tencent.mm.protobuf.g.b(bytes2);
        b18.f(java.lang.Math.min(b18.f192156a.length, 132));
        heVar.f376081h = b18;
        heVar.f376077d = com.tencent.mm.protobuf.g.b(new byte[0]);
        heVar.f376082i = 0;
        return heVar;
    }
}
