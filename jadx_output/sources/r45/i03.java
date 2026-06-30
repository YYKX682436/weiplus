package r45;

/* loaded from: classes2.dex */
public enum i03 implements com.tencent.mm.protobuf.h {
    FinderTipsShowInfoJumpType_None(0),
    FinderTipsShowInfoJumpType_WxMentionList(1),
    FinderTipsShowInfoJumpType_FinderMentionList(2),
    FinderTipsShowInfoJumpType_WxPrivateMsg(3),
    FinderTipsShowInfoJumpType_FinderPrivateMsg(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f376620d;

    i03(int i17) {
        this.f376620d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f376620d;
    }
}
