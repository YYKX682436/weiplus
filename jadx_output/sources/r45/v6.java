package r45;

/* loaded from: classes3.dex */
public enum v6 implements com.tencent.mm.protobuf.h {
    Responding(4),
    Listening(1),
    DisplayDefault(0),
    Pending(3),
    Processing(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f387931d;

    v6(int i17) {
        this.f387931d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f387931d;
    }
}
