package z34;

/* loaded from: classes13.dex */
public class d implements z34.k {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f469987a;

    public d(z34.e eVar, int i17, int i18) {
        eVar.e(i17);
        byte[] bArr = new byte[i18];
        this.f469987a = bArr;
        int a17 = eVar.a(bArr);
        if (a17 != i18) {
            throw new z34.g("Error reading string table (read " + a17 + "bytes, expected to read " + i18 + "bytes).");
        }
        int i19 = 0;
        while (true) {
            byte[] bArr2 = this.f469987a;
            if (i19 >= bArr2.length) {
                return;
            }
            byte b17 = bArr2[i19];
            i19++;
        }
    }
}
