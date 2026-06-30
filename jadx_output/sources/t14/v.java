package t14;

/* loaded from: classes.dex */
public final class v implements j45.k {
    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        if (intent == null) {
            return false;
        }
        android.content.ComponentName component = intent.getComponent();
        if (!kotlin.jvm.internal.o.b("com.tencent.mm.ui.LauncherUI", component != null ? component.getClassName() : null)) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("intercept jump launcherUI called context:");
        sb6.append(context);
        sb6.append(" intent:");
        sb6.append(intent);
        sb6.append(" stack:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.SwitchAccountActivityInterceptor", sb6.toString());
        return false;
    }
}
