package tk4;

/* loaded from: classes11.dex */
public final class a implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419957d;

    public a(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic) {
        this.f419957d = tingAudioPushConfigLogic;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean B = r26.n0.B(activity.getClass().getName(), ".ui.transmit.SelectConversationUI", false);
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = this.f419957d;
        tingAudioPushConfigLogic.C = B;
        tingAudioPushConfigLogic.D = activity instanceof com.tencent.mm.plugin.ting.TingFlutterActivity;
        tingAudioPushConfigLogic.B = ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).Di(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String name = activity.getClass().getName();
        boolean z17 = r26.n0.B(name, ".ui.transmit.SelectConversationUI", false) || r26.n0.B(name, "WXEntryActivity", false) || r26.n0.B(name, "UIEntryStub", false);
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = this.f419957d;
        tingAudioPushConfigLogic.C = z17;
        tingAudioPushConfigLogic.D = activity instanceof com.tencent.mm.plugin.ting.TingFlutterActivity;
        tingAudioPushConfigLogic.B = ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).Di(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }
}
