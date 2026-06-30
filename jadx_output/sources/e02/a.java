package e02;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f245845a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f245846b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.Pair f245847c;

    /* renamed from: d, reason: collision with root package name */
    public android.util.Pair f245848d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.Pair f245849e;

    public void a() {
        android.util.Pair pair;
        boolean z17 = this.f245845a;
        if (!z17 || (pair = this.f245847c) == null || this.f245848d == null || this.f245849e == null) {
            throw new java.lang.RuntimeException("ApkSectionInfo paramters is not valid : " + toString());
        }
        if (!z17) {
            throw null;
        }
        if (!(((long) ((java.nio.ByteBuffer) pair.first).remaining()) + ((java.lang.Long) this.f245847c.second).longValue() == ((java.lang.Long) this.f245848d.second).longValue() && ((long) ((java.nio.ByteBuffer) this.f245848d.first).remaining()) + ((java.lang.Long) this.f245848d.second).longValue() == ((java.lang.Long) this.f245849e.second).longValue() && ((long) ((java.nio.ByteBuffer) this.f245849e.first).remaining()) + ((java.lang.Long) this.f245849e.second).longValue() == this.f245846b)) {
            throw new java.lang.RuntimeException("ApkSectionInfo paramters is not valid : " + toString());
        }
        android.util.Pair pair2 = this.f245849e;
        long d17 = e02.e.d((java.nio.ByteBuffer) pair2.first, ((java.lang.Long) pair2.second).longValue());
        if (d17 == ((java.lang.Long) this.f245848d.second).longValue()) {
            return;
        }
        throw new java.lang.RuntimeException("CentralDirOffset mismatch , EocdCentralDirOffset : " + d17 + ", centralDirOffset : " + this.f245848d.second);
    }

    public java.lang.String toString() {
        return "lowMemory : " + this.f245845a + "\n apkSize : " + this.f245846b + "\n contentEntry : null\n schemeV2Block : " + this.f245847c + "\n centralDir : " + this.f245848d + "\n eocd : " + this.f245849e;
    }
}
