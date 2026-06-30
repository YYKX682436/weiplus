package uo5;

/* loaded from: classes14.dex */
public final class t {
    public t(kotlin.jvm.internal.i iVar) {
    }

    public final uo5.u a(java.nio.ByteBuffer byteData) {
        kotlin.jvm.internal.o.g(byteData, "byteData");
        byteData.clear();
        byteData.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        short s17 = byteData.getShort();
        byte b17 = byteData.get();
        byte b18 = byteData.get();
        byte b19 = byteData.get();
        byte b27 = byteData.get();
        byte b28 = byteData.get();
        byte b29 = byteData.get();
        byte b37 = byteData.get();
        byte b38 = byteData.get();
        short s18 = byteData.getShort();
        short s19 = byteData.getShort();
        if (s18 < 5) {
            s18 = uo5.u.f429743o[s18];
        }
        short s27 = uo5.u.f429741m[b19];
        int i17 = s18 > 100 ? 10000 / s18 : s18;
        int i18 = (i17 < 10 || b19 < 4) ? s27 : uo5.u.f429742n[(b19 / 2) - 2][(i17 - 8) / 5];
        short s28 = s18 >= 100 ? s27 : i18 == true ? 1 : 0;
        if (s18 < 100) {
            i18 = s27;
        }
        return new uo5.u(s28, i18, s17, b17, b18, b27, b28 == 1, b29 == 1, b37 == 1, b38, s19, null);
    }
}
