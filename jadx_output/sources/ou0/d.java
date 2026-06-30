package ou0;

/* loaded from: classes5.dex */
public abstract class d {
    public static final androidx.lifecycle.c1 a(android.app.Activity activity, java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(modelClass);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return a17;
    }

    public static final com.tencent.maas.model.time.MJTime b(gx0.bf bfVar, com.tencent.maas.model.time.MJTimeRange range) {
        kotlin.jvm.internal.o.g(bfVar, "<this>");
        kotlin.jvm.internal.o.g(range, "range");
        com.tencent.maas.model.time.MJTime i76 = bfVar.i7();
        if (range.containsTime(i76)) {
            return i76;
        }
        com.tencent.maas.model.time.MJTime startTime = range.getStartTime();
        kotlin.jvm.internal.o.f(startTime, "getStartTime(...)");
        bfVar.p7(startTime, true, 0L);
        com.tencent.maas.model.time.MJTime startTime2 = range.getStartTime();
        kotlin.jvm.internal.o.f(startTime2, "getStartTime(...)");
        return startTime2;
    }
}
