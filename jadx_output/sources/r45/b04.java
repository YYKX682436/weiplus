package r45;

/* loaded from: classes3.dex */
public enum b04 implements com.tencent.mm.protobuf.h {
    kInteractionType_Comment(2),
    kInteractionType_Share(3),
    kInteractionType_Like(1),
    kInteractionType_Unknown(0);


    /* renamed from: d, reason: collision with root package name */
    public final int f370394d;

    b04(int i17) {
        this.f370394d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f370394d;
    }
}
