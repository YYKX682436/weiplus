package com.tencent.mm.plugin.sns.ui.improve.item.header;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemHeader;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveItemHeader extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView f169096d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView f169097e;

    public ImproveItemHeader(android.content.Context context) {
        super(context);
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView improveUnreadTierView = new com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView(getContext());
        this.f169096d = improveUnreadTierView;
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView(getContext());
        this.f169097e = improveFinderTierView;
        setOrientation(1);
        addView(improveUnreadTierView);
        addView(improveFinderTierView);
    }

    public ImproveItemHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView improveUnreadTierView = new com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView(getContext());
        this.f169096d = improveUnreadTierView;
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView(getContext());
        this.f169097e = improveFinderTierView;
        setOrientation(1);
        addView(improveUnreadTierView);
        addView(improveFinderTierView);
    }

    public ImproveItemHeader(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView improveUnreadTierView = new com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView(getContext());
        this.f169096d = improveUnreadTierView;
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView(getContext());
        this.f169097e = improveFinderTierView;
        setOrientation(1);
        addView(improveUnreadTierView);
        addView(improveFinderTierView);
    }
}
