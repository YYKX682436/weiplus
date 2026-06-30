package j65;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseIntArray f297993a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f297994b;

    public w(android.util.SparseIntArray sparseIntArray, byte[] bArr) {
        this.f297993a = sparseIntArray;
        this.f297994b = bArr;
    }

    public java.lang.String a(int i17) {
        android.util.SparseIntArray sparseIntArray = this.f297993a;
        try {
            int indexOfKey = sparseIntArray.indexOfKey(i17);
            if (indexOfKey < 0) {
                return null;
            }
            int valueAt = sparseIntArray.valueAt(indexOfKey);
            return new java.lang.String(this.f297994b, valueAt, (indexOfKey < sparseIntArray.size() + (-1) ? sparseIntArray.valueAt(indexOfKey + 1) : this.f297994b.length) - valueAt, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        } catch (java.lang.Exception e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            return null;
        }
    }
}
