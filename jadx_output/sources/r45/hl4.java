package r45;

/* loaded from: classes6.dex */
public enum hl4 implements com.tencent.mm.protobuf.h {
    kMicReplayFail(1),
    kMicReplayPending(2),
    kMicReplayExpired(5),
    kMicReplaySuccess(3),
    kMicReplayDefault(0),
    kMicReplayFailed(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f376266d;

    hl4(int i17) {
        this.f376266d = i17;
    }

    public static r45.hl4 a(int i17) {
        if (i17 == 0) {
            return kMicReplayDefault;
        }
        if (i17 == 1) {
            return kMicReplayFail;
        }
        if (i17 == 2) {
            return kMicReplayPending;
        }
        if (i17 == 3) {
            return kMicReplaySuccess;
        }
        if (i17 == 4) {
            return kMicReplayFailed;
        }
        if (i17 != 5) {
            return null;
        }
        return kMicReplayExpired;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f376266d;
    }
}
