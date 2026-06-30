package o25;

/* loaded from: classes9.dex */
public class p2 extends com.tencent.mm.app.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f342572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f342573e;

    public p2(o25.q2 q2Var, android.content.Context context, l81.e1 e1Var) {
        this.f342572d = context;
        this.f342573e = e1Var;
    }

    @Override // com.tencent.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (activity == this.f342572d) {
            ((android.app.Application) com.tencent.mm.sdk.platformtools.x2.f193071a).unregisterActivityLifecycleCallbacks(this);
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this.f342573e);
        }
    }
}
