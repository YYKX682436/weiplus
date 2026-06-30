package tc4;

/* loaded from: classes4.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f417459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(android.content.Context context) {
        super(0);
        this.f417459d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$contentText$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$contentText$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView(this.f417459d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$contentText$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$contentText$2");
        return improveContentView;
    }
}
