package kz3;

/* loaded from: classes3.dex */
public final class o implements sy3.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f313905a = new java.util.HashMap();

    public void a(int i17, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append(',');
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.util.HashMap hashMap = this.f313905a;
        hashMap.get(sb7);
        java.lang.Object obj = hashMap.get(sb7);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(obj, bool)) {
            return;
        }
        hashMap.put(sb7, bool);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22143, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
    }
}
