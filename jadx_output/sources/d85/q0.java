package d85;

/* loaded from: classes12.dex */
public final class q0 implements yj0.c {

    /* renamed from: a, reason: collision with root package name */
    public static final d85.q0 f227238a = new d85.q0();

    @Override // yj0.c
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        java.util.HashMap hashMap = d85.r0.f227239a;
        com.tencent.mars.xlog.Log.i("MicrophoneHooker", "HookMicroPhone");
        k85.t tVar = k85.t.f305439a;
        kotlin.jvm.internal.o.d(str4);
        if (k85.t.b(tVar, str4, null, 2, null)) {
            return null;
        }
        obj.getClass().getMethod(str4, new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
        return null;
    }
}
