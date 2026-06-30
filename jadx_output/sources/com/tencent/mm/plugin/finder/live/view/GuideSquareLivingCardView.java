package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/GuideSquareLivingCardView;", "Lcom/tencent/mm/plugin/finder/live/view/EasySimpleLivingCardView;", "", "g", "Ljz5/g;", "getContextId", "()Ljava/lang/String;", "contextId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GuideSquareLivingCardView extends com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g contextId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideSquareLivingCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.contextId = jz5.h.b(com.tencent.mm.plugin.finder.live.view.sb.f116681d);
    }

    private final java.lang.String getContextId() {
        return (java.lang.String) ((jz5.n) this.contextId).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView
    public void b(com.tencent.mm.plugin.finder.storage.FinderItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        kk2.p.f308505t.a(5);
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        long refObjectId = item.getRefObjectId();
        r45.nw1 liveInfo = item.getLiveInfo();
        ml2.v0 v0Var = new ml2.v0(refObjectId, liveInfo != null ? liveInfo.getLong(0) : -1L, item.getDupFlag(), item.getUserName(), -1L, item.getLiveInfo() != null ? r2.getInteger(1) : -1L, ml2.x1.f328207n, "313", 0L, 0L, null, null, 1, null, null, null, getContextId(), item.getFeedObject(), 61184, null);
        j0Var.getClass();
        j0Var.wi(v0Var, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView
    public void c(com.tencent.mm.plugin.finder.storage.FinderItem item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String userName = item.getUserName();
        java.lang.String valueOf = java.lang.String.valueOf(item.getRefObjectId());
        long refObjectId = item.getRefObjectId();
        r45.nw1 liveInfo = item.getLiveInfo();
        long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
        ml2.x1 x1Var = ml2.x1.f328202f;
        r45.nw1 liveInfo2 = item.getLiveInfo();
        int integer = liveInfo2 != null ? liveInfo2.getInteger(1) : -1;
        java.lang.String nickname = item.getFeedObject().getNickname();
        if (nickname == null) {
            nickname = "";
        }
        ((b92.d1) zbVar).wi(new ml2.f0(null, userName, i17, valueOf, refObjectId, j17, x1Var, "313", integer, nickname, ml2.e0.f327371f, false, false, 0, null, null, null, null, 1L, null, 0, 0L, 0, null, getContextId(), null, 50065408, null));
    }

    @Override // com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView
    public void d(com.tencent.mm.plugin.finder.storage.FinderItem item, java.lang.String id6) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(id6, "id");
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.d("313");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        ml2.i4 i4Var = ml2.i4.f327561f;
        y4Var.getClass();
        y4Var.I = i4Var;
        super.d(item, getContextId());
    }
}
