package je3;

/* loaded from: classes7.dex */
public abstract class j {
    public static final void a(je3.i iVar, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key key, java.lang.String bizName, java.util.Map extraPairs) {
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(iVar, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(extraPairs, "extraPairs");
        if (extraPairs.isEmpty()) {
            sb6 = "bizName:".concat(bizName);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bizName:");
            sb7.append(bizName);
            for (java.util.Map.Entry entry : extraPairs.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    sb7.append(';');
                    sb7.append(str);
                    sb7.append(':');
                    sb7.append(value);
                }
            }
            sb6 = sb7.toString();
            kotlin.jvm.internal.o.f(sb6, "toString(...)");
        }
        iVar.Sc(key.name(), 1, sb6, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.OneTenth.getValue());
    }
}
