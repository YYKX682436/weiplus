package gz2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final gz2.e f277732a = new gz2.e();

    public static void a(gz2.e eVar, int i17, java.lang.String tag, java.lang.String value, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        eVar.getClass();
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i("FinderCustomizeReporter", "[report25102] type:" + i17 + ", tag:" + tag + ", value:" + tag);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25102, "0", java.lang.Integer.valueOf(i17), tag, value);
    }
}
