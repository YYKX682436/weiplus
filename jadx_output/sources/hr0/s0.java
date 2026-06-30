package hr0;

/* loaded from: classes12.dex */
public final class s0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public static final hr0.s0 f283328a = new hr0.s0();

    public static final void a(java.util.Set set, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i17) {
        set.add(uncaughtExceptionHandler);
        java.lang.reflect.Field[] declaredFields = uncaughtExceptionHandler.getClass().getDeclaredFields();
        kotlin.jvm.internal.o.f(declaredFields, "getDeclaredFields(...)");
        for (java.lang.reflect.Field field : declaredFields) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(uncaughtExceptionHandler);
            com.tencent.mars.xlog.Log.w("MicroMsg.SignalHookHandler", r26.i0.s("\t", i17) + " - " + field.getName() + ": " + field.getClass().getName() + " = " + obj);
            if ((obj instanceof java.lang.Thread.UncaughtExceptionHandler) && !set.contains(obj)) {
                a(set, (java.lang.Thread.UncaughtExceptionHandler) obj, i17 + 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
    
        if (kotlin.jvm.internal.o.b(r13 != null ? r13.processName : null, com.tencent.mm.sdk.platformtools.x2.f193072b) != false) goto L59;
     */
    @Override // m3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr0.s0.accept(java.lang.Object):void");
    }
}
