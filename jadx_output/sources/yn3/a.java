package yn3;

/* loaded from: classes8.dex */
public class a extends xn3.b {

    /* renamed from: e, reason: collision with root package name */
    public static yn3.a f464013e;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Set f464014c;

    /* renamed from: d, reason: collision with root package name */
    public yn3.d f464015d = null;

    public static yn3.a c() {
        if (f464013e == null) {
            f464013e = new yn3.a();
        }
        return f464013e;
    }

    public int a(android.content.Context context) {
        int d17 = d(context);
        if (d17 != 3 && d17 != 2) {
            return d17;
        }
        try {
            yn3.d dVar = this.f464015d;
            if (dVar != null && dVar.a()) {
                if (this.f464015d.isConnected()) {
                    return 3;
                }
            }
            return 2;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngine", "[NFC] IOException : " + e17.toString());
            return 2;
        }
    }

    public boolean b(xn3.a aVar) {
        wn3.a aVar2;
        if (this.f464015d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngine", "[NFC]ApduEngine not ready !");
            throw new java.lang.IllegalStateException("ApduEngine not ready !");
        }
        if (aVar == null || (aVar2 = aVar.f455594f) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngine", "[NFC]apdu is null !");
            throw new java.lang.IllegalArgumentException("apdu is null !");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[NFC][");
        java.lang.String str = aVar.f455593e;
        sb6.append(str);
        sb6.append("] do cmd : ");
        sb6.append(aVar2.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.ApduEngine", sb6.toString());
        wn3.c b17 = this.f464015d.b(aVar2);
        aVar.f455595g = b17;
        int b18 = b17.b() << 8;
        byte[] bArr = b17.f447528d;
        if (((short) (((short) (bArr[bArr.length + (-1)] & 255)) | b18)) == -28672) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ApduEngine", "[NFC][" + str + "] result==> OK : " + aVar.f455595g.toString());
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngine", "[NFC][" + str + "] result==> fail : " + aVar.f455595g.toString());
        return false;
    }

    public int d(android.content.Context context) {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ApduEngine", "[NFC] No nfc chip !");
            return 0;
        }
        if (!defaultAdapter.isEnabled()) {
            return 1;
        }
        yn3.d dVar = this.f464015d;
        if (dVar == null) {
            return 4;
        }
        if (dVar != null) {
            try {
                if (dVar.isConnected()) {
                    return 3;
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngine", "[NFC] IOException : " + e17.toString());
            }
        }
        return 2;
    }

    public boolean e(android.nfc.Tag tag) {
        this.f455596a = tag;
        if (tag != null) {
            this.f455597b = tag.getId();
        }
        this.f464014c = new java.util.HashSet();
        for (java.lang.String str : tag.getTechList()) {
            this.f464014c.add(str);
        }
        try {
            yn3.d dVar = this.f464015d;
            if (dVar != null && dVar.isConnected()) {
                this.f464015d.close();
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ApduEngine", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngine", e17.toString());
        }
        if (this.f464014c.contains(android.nfc.tech.IsoDep.class.getName())) {
            this.f464015d = new yn3.b(tag);
            return true;
        }
        if (this.f464014c.contains(android.nfc.tech.NfcA.class.getName())) {
            this.f464015d = new yn3.c(tag);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ApduEngine", "[NFC]ApduEngine not support this tag");
        return false;
    }
}
