package r45;

/* loaded from: classes9.dex */
public enum fv2 implements com.tencent.mm.protobuf.h {
    GroupChat(3),
    Finder(4),
    WechatFavorite(5),
    SingleChat(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f374620d;

    fv2(int i17) {
        this.f374620d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f374620d;
    }
}
