package r6;

/* loaded from: classes13.dex */
public class g extends java.io.ByteArrayOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r6.h f392771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r6.h hVar, int i17) {
        super(i17);
        this.f392771d = hVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public java.lang.String toString() {
        int i17 = ((java.io.ByteArrayOutputStream) this).count;
        if (i17 > 0 && ((java.io.ByteArrayOutputStream) this).buf[i17 - 1] == 13) {
            i17--;
        }
        try {
            return new java.lang.String(((java.io.ByteArrayOutputStream) this).buf, 0, i17, this.f392771d.f392773e.name());
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }
}
