package so2;

/* loaded from: classes2.dex */
public final class a2 extends in5.w implements com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.t f410247d;

    /* renamed from: e, reason: collision with root package name */
    public final so2.w4 f410248e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f410249f;

    /* renamed from: g, reason: collision with root package name */
    public final so2.f5 f410250g;

    /* renamed from: h, reason: collision with root package name */
    public final so2.s4 f410251h;

    /* renamed from: i, reason: collision with root package name */
    public final so2.u4 f410252i;

    public a2(so2.t msgNotifyData, so2.w4 privateMsgNotifyData, java.util.concurrent.ConcurrentLinkedQueue commentFailedNotifyDataList, so2.f5 f5Var, so2.s4 s4Var, so2.u4 u4Var, int i17, kotlin.jvm.internal.i iVar) {
        so2.f5 friendTabLikeTipsState = (i17 & 8) != 0 ? new so2.f5(0, -1, null, 4, null) : f5Var;
        so2.s4 finderPopupTips = (i17 & 16) != 0 ? new so2.s4(null, null, null, null, 15, null) : s4Var;
        so2.u4 postRemindData = (i17 & 32) != 0 ? new so2.u4(null, 0L, null, 0, 0L, null, 63, null) : u4Var;
        kotlin.jvm.internal.o.g(msgNotifyData, "msgNotifyData");
        kotlin.jvm.internal.o.g(privateMsgNotifyData, "privateMsgNotifyData");
        kotlin.jvm.internal.o.g(commentFailedNotifyDataList, "commentFailedNotifyDataList");
        kotlin.jvm.internal.o.g(friendTabLikeTipsState, "friendTabLikeTipsState");
        kotlin.jvm.internal.o.g(finderPopupTips, "finderPopupTips");
        kotlin.jvm.internal.o.g(postRemindData, "postRemindData");
        this.f410247d = msgNotifyData;
        this.f410248e = privateMsgNotifyData;
        this.f410249f = commentFailedNotifyDataList;
        this.f410250g = friendTabLikeTipsState;
        this.f410251h = finderPopupTips;
        this.f410252i = postRemindData;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return Integer.MAX_VALUE;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 2019;
    }
}
