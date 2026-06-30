package yn3;

/* loaded from: classes8.dex */
public class b implements yn3.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.nfc.tech.IsoDep f464016a;

    public b(android.nfc.Tag tag) {
        if (tag != null) {
            this.f464016a = android.nfc.tech.IsoDep.get(tag);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngineIsoDep", "[NFC]tag is null");
            throw new java.lang.IllegalStateException("tag is null");
        }
    }

    @Override // yn3.d
    public boolean a() {
        android.nfc.tech.IsoDep isoDep = this.f464016a;
        try {
            if (isoDep.isConnected()) {
                return true;
            }
            isoDep.connect();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ApduEngineIsoDep", e17, null, new java.lang.Object[0]);
            return false;
        }
    }

    @Override // yn3.d
    public wn3.c b(wn3.a aVar) {
        android.nfc.tech.IsoDep isoDep = this.f464016a;
        if (isoDep == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngineIsoDep", "[NFC]IsoDep is null");
            throw new java.lang.IllegalStateException("IsoDep is null");
        }
        a();
        wn3.c cVar = null;
        while (true) {
            wn3.c cVar2 = new wn3.c(isoDep.transceive((byte[]) aVar.f447526d.clone()));
            if (cVar2.f447528d.length == 0) {
                return cVar;
            }
            if (r2.length - 2 <= 0) {
                return cVar2;
            }
            if (cVar2.b() == 108) {
                short s17 = (short) (cVar2.f447528d[r2.length - 1] & 255);
                aVar.f447526d[r3.length - 1] = (byte) s17;
            } else {
                if (cVar == null) {
                    cVar = cVar2;
                } else {
                    cVar.a(cVar2);
                }
                if (cVar2.b() != 97) {
                    return cVar;
                }
                aVar = new wn3.a((byte[]) wn3.b.f447527a.clone());
            }
        }
    }

    @Override // yn3.d
    public boolean c() {
        close();
        a();
        return true;
    }

    @Override // yn3.d
    public void close() {
        android.nfc.tech.IsoDep isoDep = this.f464016a;
        try {
            if (isoDep.isConnected()) {
                isoDep.close();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ApduEngineIsoDep", e17, null, new java.lang.Object[0]);
        }
    }

    @Override // yn3.d
    public boolean isConnected() {
        try {
            return this.f464016a.isConnected();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ApduEngineIsoDep", e17, null, new java.lang.Object[0]);
            return false;
        }
    }
}
