package y31;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y31.f f459159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y31.f fVar, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f459159d = fVar;
        this.f459160e = str;
        this.f459161f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        y31.f fVar = this.f459159d;
        jc3.j0 j0Var = fVar.f459163d;
        if (j0Var != null) {
            java.lang.String str = this.f459160e;
            java.lang.String str2 = this.f459161f;
            synchronized (j0Var) {
                int i17 = 500;
                if (fVar.f459168i) {
                    ((rc3.w0) j0Var).k(str, str2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendEvent event:");
                    sb6.append(str);
                    sb6.append(" value:");
                    int length = str2.length();
                    if (length <= 500) {
                        i17 = length;
                    }
                    java.lang.String substring = str2.substring(0, i17);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    sb6.append(substring);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", sb6.toString());
                } else {
                    fVar.f459169m.add(new y31.a(str, str2));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sendEvent add PendingEvent key:");
                    sb7.append(str);
                    sb7.append(" value:");
                    int length2 = str2.length();
                    if (length2 <= 500) {
                        i17 = length2;
                    }
                    java.lang.String substring2 = str2.substring(0, i17);
                    kotlin.jvm.internal.o.f(substring2, "substring(...)");
                    sb7.append(substring2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", sb7.toString());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
