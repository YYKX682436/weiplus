package zp5;

@j95.b
/* loaded from: classes5.dex */
public final class f extends i95.w implements gh0.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f474963d = "MicroMsg.WeDrop.WeDropFeatureService";

    public void wi(android.content.Context context, java.lang.String str, java.lang.Runnable callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new zp5.e(str, this, context, callback, null), 2, null);
        }
    }
}
