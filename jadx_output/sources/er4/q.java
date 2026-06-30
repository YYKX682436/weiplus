package er4;

/* loaded from: classes6.dex */
public enum q implements com.tencent.mm.protobuf.h {
    MP_ROOM_ROLE_CALLER(1),
    MP_ROOM_ROLE_CALLEE(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f256158d;

    q(int i17) {
        this.f256158d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256158d;
    }
}
