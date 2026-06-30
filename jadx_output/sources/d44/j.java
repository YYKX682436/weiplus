package d44;

/* loaded from: classes3.dex */
public abstract class j {
    public static final void a(final java.lang.String username, int i17, final yz5.l callback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("follow", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            com.tencent.mars.xlog.Log.i("FinderFollow", "it is begin to follow finder");
            new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(username, callback) { // from class: com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener

                /* renamed from: d, reason: collision with root package name */
                public final java.lang.String f162655d;

                /* renamed from: e, reason: collision with root package name */
                public final yz5.l f162656e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(com.tencent.mm.app.a0.f53288d);
                    kotlin.jvm.internal.o.g(username, "username");
                    kotlin.jvm.internal.o.g(callback, "callback");
                    this.f162655d = username;
                    this.f162656e = callback;
                    this.__eventId = 398763182;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                    com.tencent.mm.autogen.events.FollowUserEvent event = followUserEvent;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                    kotlin.jvm.internal.o.g(event, "event");
                    boolean z17 = true;
                    try {
                        dead();
                        boolean z18 = false;
                        am.zd zdVar = event.f54346g;
                        if (zdVar == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                            z17 = false;
                        } else {
                            com.tencent.mars.xlog.Log.i("FinderFollow", "the follow user name is " + zdVar.f8551a);
                            java.lang.String str = zdVar.f8551a;
                            if (str != null && str.equals(this.f162655d)) {
                                z18 = true;
                            }
                            if (z18 && zdVar.f8552b == 1) {
                                this.f162656e.invoke(java.lang.Boolean.valueOf(zdVar.f8553c));
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                        }
                    } catch (java.lang.Throwable unused) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                    return z17;
                }
            }.alive();
            ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ni(username, 1, 0L, false, i17, 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderFollow", "the finder follow exception: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("follow", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper");
    }
}
