package r45;

/* loaded from: classes2.dex */
public enum ox2 implements com.tencent.mm.protobuf.h {
    FinderStreamShowReddotType_LbsSameCity(4),
    FinderStreamShowReddotType_None(0),
    FinderStreamShowReddotType_Friend(1),
    FinderStreamShowReddotType_Follow(2),
    FinderStreamShowReddotType_PersonalCenter(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f382604d;

    ox2(int i17) {
        this.f382604d = i17;
    }

    public static r45.ox2 a(int i17) {
        if (i17 == 0) {
            return FinderStreamShowReddotType_None;
        }
        if (i17 == 1) {
            return FinderStreamShowReddotType_Friend;
        }
        if (i17 == 2) {
            return FinderStreamShowReddotType_Follow;
        }
        if (i17 == 3) {
            return FinderStreamShowReddotType_PersonalCenter;
        }
        if (i17 != 4) {
            return null;
        }
        return FinderStreamShowReddotType_LbsSameCity;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f382604d;
    }
}
