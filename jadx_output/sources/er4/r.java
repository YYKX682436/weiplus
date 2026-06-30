package er4;

/* loaded from: classes14.dex */
public enum r implements com.tencent.mm.protobuf.h {
    MP_ROOM_TYPE_UNKNOWN(0),
    MP_ROOM_TYPE_VOICE(1),
    MP_ROOM_TYPE_VIDEO(2),
    MP_ROOM_TYPE_MULTI_TALK(3),
    MP_ROOM_TYPE_TRANS_MUTLTI(4),
    MP_ROOM_TYPE_OPENVOICE(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f256166d;

    r(int i17) {
        this.f256166d = i17;
    }

    public static er4.r a(int i17) {
        if (i17 == 0) {
            return MP_ROOM_TYPE_UNKNOWN;
        }
        if (i17 == 1) {
            return MP_ROOM_TYPE_VOICE;
        }
        if (i17 == 2) {
            return MP_ROOM_TYPE_VIDEO;
        }
        if (i17 == 3) {
            return MP_ROOM_TYPE_MULTI_TALK;
        }
        if (i17 == 4) {
            return MP_ROOM_TYPE_TRANS_MUTLTI;
        }
        if (i17 != 5) {
            return null;
        }
        return MP_ROOM_TYPE_OPENVOICE;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256166d;
    }
}
