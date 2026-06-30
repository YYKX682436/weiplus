package q8;

/* loaded from: classes15.dex */
public final class c implements q8.h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Constructor f360622a;

    static {
        java.lang.reflect.Constructor constructor;
        try {
            constructor = java.lang.Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(q8.e.class).getConstructor(new java.lang.Class[0]);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            constructor = null;
        }
        f360622a = constructor;
    }

    @Override // q8.h
    public synchronized q8.e[] a() {
        q8.e[] eVarArr;
        java.lang.reflect.Constructor constructor = f360622a;
        eVarArr = new q8.e[constructor == null ? 11 : 12];
        eVarArr[0] = new s8.i(0);
        eVarArr[1] = new u8.l(0, null);
        eVarArr[2] = new u8.o(0);
        eVarArr[3] = new t8.c(0);
        eVarArr[4] = new w8.c();
        eVarArr[5] = new w8.a();
        eVarArr[6] = new w8.c0(1, 0);
        eVarArr[7] = new r8.b();
        eVarArr[8] = new v8.f();
        eVarArr[9] = new w8.v();
        eVarArr[10] = new x8.a();
        if (constructor != null) {
            try {
                eVarArr[11] = (q8.e) constructor.newInstance(new java.lang.Object[0]);
            } catch (java.lang.Exception e17) {
                throw new java.lang.IllegalStateException("Unexpected error creating FLAC extractor", e17);
            }
        }
        return eVarArr;
    }
}
