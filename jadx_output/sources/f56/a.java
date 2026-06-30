package f56;

/* loaded from: classes7.dex */
public class a extends f56.k {
    public a(f56.g gVar) {
        super(new org.msgpack.core.buffer.b(gVar.f259800f), gVar);
    }

    public byte[] D() {
        try {
            flush();
            java.util.ArrayList arrayList = (java.util.ArrayList) ((org.msgpack.core.buffer.b) this.f259816g).f347836d;
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                i17 += ((org.msgpack.core.buffer.h) it.next()).size();
            }
            byte[] bArr = new byte[i17];
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                org.msgpack.core.buffer.h hVar = (org.msgpack.core.buffer.h) it6.next();
                hVar.getBytes(0, bArr, i18, hVar.size());
                i18 += hVar.size();
            }
            return bArr;
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
