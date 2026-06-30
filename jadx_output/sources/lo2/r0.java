package lo2;

/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI f320167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI finderMemberTimelineUI) {
        super(0);
        this.f320167d = finderMemberTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.member.ui.FinderMemberTimelineUI finderMemberTimelineUI = this.f320167d;
        int i17 = finderMemberTimelineUI.K;
        if (i17 == 0) {
            db5.t7.m(finderMemberTimelineUI.getContext(), finderMemberTimelineUI.getContext().getString(com.tencent.mm.R.string.f491920en3));
        } else if (i17 == 1) {
            db5.t7.m(finderMemberTimelineUI.getContext(), finderMemberTimelineUI.getContext().getString(com.tencent.mm.R.string.f491921en4));
        }
        return jz5.f0.f302826a;
    }
}
