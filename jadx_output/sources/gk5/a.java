package gk5;

/* loaded from: classes9.dex */
public final class a extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new nb5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        v05.b j17 = ((nb5.a) c7()).j();
        return (j17 == null || (xml = j17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    @Override // m50.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k7(xi5.e r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk5.a.k7(xi5.e):boolean");
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        com.tencent.mm.storage.f9 e76 = e7();
        ot0.q Z6 = Z6();
        if (Z6 != null) {
            byte[] bArr = null;
            if (e76 != null && e76.z0() != null && !kotlin.jvm.internal.o.b(e76.z0(), "")) {
                i95.m c17 = i95.n0.c(tg3.u0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                try {
                    bArr = com.tencent.mm.vfs.w6.N(tg3.u0.ga((tg3.u0) c17, e76, e76.z0(), false, 4, null), 0, -1);
                    if (!q7(bArr)) {
                        return;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ForwardAppBrandNativeUIC", e17, "processAppMessageTransfer send to user: %s, exception", up5.f.f429945o);
                }
            }
            ot0.a aVar = (ot0.a) Z6.y(ot0.a.class);
            if (aVar == null) {
                aVar = new ot0.a();
            }
            aVar.R = te5.e2.d(e76);
            Z6.f(aVar);
            ((ez.w0) ot0.j1.a()).wi(Z6, Z6.f348646d, Z6.H, toUser, "", bArr, true);
        }
    }

    public final boolean q7(byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardAppBrandNativeUIC", "isImage called, data[0-4]:[%d,%d,%d,%d,%d]", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[4]));
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.graphics.e.b(bArr, 0, bArr.length, options);
        return options.outWidth >= 0 && options.outHeight >= 0;
    }
}
