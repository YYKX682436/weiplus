package fn4;

/* loaded from: classes15.dex */
public class q0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.r0 f264598d;

    public q0(fn4.r0 r0Var, fn4.l0 l0Var) {
        this.f264598d = r0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (gVar == null || gVar.field_toltalLength <= 0) {
            return 0;
        }
        fn4.r0 r0Var = this.f264598d;
        if (!r0Var.f264602c.containsKey(str)) {
            return 0;
        }
        r45.yn6 yn6Var = (r45.yn6) r0Var.f264602c.get(str);
        long j17 = gVar.field_finishedLength;
        yn6Var.f391244e = j17;
        yn6Var.f391245f = r0Var.a(j17, gVar.field_toltalLength);
        yn6Var.f391246g = gVar.field_toltalLength;
        r0Var.f264602c.put(str, yn6Var);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
