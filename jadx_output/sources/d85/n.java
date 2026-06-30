package d85;

/* loaded from: classes12.dex */
public final class n implements yj0.c {

    /* renamed from: a, reason: collision with root package name */
    public static final d85.n f227221a = new d85.n();

    @Override // yj0.c
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        d85.o oVar = d85.o.f227226a;
        com.tencent.mars.xlog.Log.i("ExportFileHooker", "saveBitmapToImage");
        if (k85.t.f305439a.d(d85.g0.STORAGE, d85.f0.M, new d85.m(str, str4, obj, objArr))) {
            return null;
        }
        d85.o oVar2 = d85.o.f227226a;
        kotlin.jvm.internal.o.d(str);
        kotlin.jvm.internal.o.d(str4);
        kotlin.jvm.internal.o.d(objArr);
        return oVar2.b(str, str4, obj, objArr, java.lang.Boolean.FALSE);
    }
}
