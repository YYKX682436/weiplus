package er4;

/* loaded from: classes14.dex */
public enum i implements com.tencent.mm.protobuf.h {
    MP_MALE(0),
    MP_FEMALE(1),
    MP_UNKOWN(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f256103d;

    i(int i17) {
        this.f256103d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256103d;
    }
}
