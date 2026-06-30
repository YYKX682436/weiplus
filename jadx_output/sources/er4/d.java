package er4;

/* loaded from: classes14.dex */
public enum d implements com.tencent.mm.protobuf.h {
    SPEAKER(1),
    EARPIECE(2),
    HEADSET(3),
    BLUETOOTH(4),
    DEFAULT(1000);


    /* renamed from: d, reason: collision with root package name */
    public final int f256071d;

    d(int i17) {
        this.f256071d = i17;
    }

    public static er4.d a(int i17) {
        if (i17 == 1) {
            return SPEAKER;
        }
        if (i17 == 2) {
            return EARPIECE;
        }
        if (i17 == 3) {
            return HEADSET;
        }
        if (i17 == 4) {
            return BLUETOOTH;
        }
        if (i17 != 1000) {
            return null;
        }
        return DEFAULT;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256071d;
    }
}
