package ic2;

/* loaded from: classes7.dex */
public final class r implements com.tencent.mm.ui.cd {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f290359d = kz5.c0.i(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorWithoutAffinityUI.class).d(), kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorAffinityUI.class).d());

    @Override // com.tencent.mm.ui.ad, j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        java.lang.String str2;
        android.content.ComponentName componentName;
        try {
            java.util.List list = this.f290359d;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (componentName = activity.getComponentName()) == null || (str2 = componentName.getClassName()) == null) {
                str2 = "";
            }
            if (list.contains(str2)) {
                ae2.in inVar = ae2.in.f3688a;
                boolean z17 = true;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L6).getValue()).r()).intValue() != 1) {
                    z17 = false;
                }
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorStartActivityInterceptor", "start activity from anchor live, canPostMiniWindow:" + z17);
                if (z17) {
                    com.tencent.mm.autogen.events.FinderLiveStartOtherActivityEvent finderLiveStartOtherActivityEvent = new com.tencent.mm.autogen.events.FinderLiveStartOtherActivityEvent();
                    finderLiveStartOtherActivityEvent.f54295g.getClass();
                    finderLiveStartOtherActivityEvent.e();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorStartActivityInterceptor", "t :" + th6.getMessage());
        }
        return false;
    }
}
