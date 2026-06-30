package f42;

/* loaded from: classes12.dex */
public final class e implements yj0.c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f259523a;

    @Override // yj0.c
    public java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (!kotlin.jvm.internal.o.b(str4, "getString")) {
            return null;
        }
        kotlin.jvm.internal.o.d(objArr);
        java.lang.Object obj2 = objArr[1];
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        if (kotlin.jvm.internal.o.b((java.lang.String) obj2, "android_id")) {
            if (this.f259523a == null) {
                this.f259523a = android.provider.Settings.Secure.getString(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "android_id");
            }
            return this.f259523a;
        }
        android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
        java.lang.Object obj3 = objArr[1];
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        return android.provider.Settings.Secure.getString(contentResolver, (java.lang.String) obj3);
    }
}
