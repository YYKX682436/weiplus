package x5;

/* loaded from: classes16.dex */
public abstract class j implements x5.g {

    /* renamed from: b, reason: collision with root package name */
    public static final l36.l f451954b;

    /* renamed from: c, reason: collision with root package name */
    public static final l36.l f451955c;

    /* renamed from: a, reason: collision with root package name */
    public final l36.m f451956a;

    static {
        l36.k kVar = new l36.k();
        kVar.f315526a = true;
        kVar.f315527b = true;
        f451954b = new l36.l(kVar);
        l36.k kVar2 = new l36.k();
        kVar2.f315526a = true;
        kVar2.f315529d = true;
        f451955c = new l36.l(kVar2);
    }

    public j(l36.m callFactory) {
        kotlin.jvm.internal.o.g(callFactory, "callFactory");
        this.f451956a = callFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01bc, code lost:
    
        if (r5 == null) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(x5.j r3, s5.a r4, java.lang.Object r5, coil.size.Size r6, v5.k r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.j.d(x5.j, s5.a, java.lang.Object, coil.size.Size, v5.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // x5.g
    public boolean a(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        return true;
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        return d(this, aVar, obj, size, kVar, continuation);
    }

    public abstract l36.k0 e(java.lang.Object obj);
}
