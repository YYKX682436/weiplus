package gd1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.n5 {
    public static final int CTRL_INDEX = 790;
    public static final java.lang.String NAME = "onNFCDiscovered";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.n5
    public void m() {
        o();
        super.m();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.n5
    public com.tencent.mm.plugin.appbrand.jsapi.n5 p(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super.p(lVar);
        return this;
    }

    public final void u(byte[] bArr, java.util.List techs, java.util.HashMap hashMap) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(techs, "techs");
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] encode = android.util.Base64.encode(bArr, 2);
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
        java.lang.String str = new java.lang.String(encode, UTF_8);
        if (hashMap != null) {
            hashMap.put(dm.i4.COL_ID, str);
            hashMap.put("techs", techs);
            map = hashMap;
        } else {
            map = kz5.c1.k(new jz5.l(dm.i4.COL_ID, str), new jz5.l("techs", techs));
        }
        t(map);
        m();
    }

    public gd1.f v(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super.p(lVar);
        return this;
    }
}
