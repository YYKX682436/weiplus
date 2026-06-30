package dy4;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.w f244705d;

    public t(dy4.w wVar) {
        this.f244705d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar = this.f244705d;
        dy4.d dVar = wVar.f244716b;
        if (dVar != null) {
            kotlin.jvm.internal.o.d(dVar);
            if (dVar.f244613a.f340860a instanceof android.app.Activity) {
                com.tencent.mars.xlog.Log.i(wVar.f244715a, "startKeepScreenOn");
                try {
                    dy4.d dVar2 = wVar.f244716b;
                    kotlin.jvm.internal.o.d(dVar2);
                    android.content.Context context = dVar2.f244613a.f340860a;
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((android.app.Activity) context).getWindow().addFlags(128);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(wVar.f244715a, "startKeepScreenOn exception", e17);
                }
            }
        }
    }
}
