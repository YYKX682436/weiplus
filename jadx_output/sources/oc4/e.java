package oc4;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView f344341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView improveUnreadTierView) {
        super(0);
        this.f344341d = improveUnreadTierView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadAvatarView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadAvatarView$2");
        com.tencent.mm.ui.widget.StoryAvatarDotsView storyAvatarDotsView = (com.tencent.mm.ui.widget.StoryAvatarDotsView) this.f344341d.findViewById(com.tencent.mm.R.id.nce);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadAvatarView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$unreadAvatarView$2");
        return storyAvatarDotsView;
    }
}
