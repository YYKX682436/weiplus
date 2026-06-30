package oc4;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final oc4.i f344344d = new oc4.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$config$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$config$2");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReleaseConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig$Companion");
        oc4.r rVar = new oc4.r(true, ih.a.d(e42.d0.clicfg_timeline_unread_jump_min_interval_android, 3600L), ih.a.d(e42.d0.clicfg_timeline_unread_jump_max_interval_android, 86400L), ih.a.d(e42.d0.clicfg_timeline_unread_jump_min_feeds_android, 5L), ih.a.d(e42.d0.clicfg_timeline_unread_jump_min_skip_feeds_android, 10L), ih.a.d(e42.d0.clicfg_timeline_unread_jump_not_ws_percent_android, 0L), ih.a.d(e42.d0.clicfg_timeline_unread_jump_read_continuous_feeds_android, 2L), ih.a.a(e42.d0.clicfg_timeline_unread_jump_indicator_index_offset_android, 1), ih.a.d(e42.d0.clicfg_timeline_unread_jump_indicator_expose_interval_android, 14400L));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReleaseConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$config$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$config$2");
        return rVar;
    }
}
