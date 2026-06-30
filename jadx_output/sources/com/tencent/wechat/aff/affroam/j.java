package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public enum j implements com.tencent.mm.protobuf.h {
    kAll(1),
    kFriend(2),
    kChatRoom(3),
    kSticky(4),
    kStar(5),
    kFoldChatRoom(6),
    kFriendSnsBlack(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f215873d;

    j(int i17) {
        this.f215873d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f215873d;
    }
}
