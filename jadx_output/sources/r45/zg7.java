package r45;

/* loaded from: classes3.dex */
public enum zg7 implements com.tencent.mm.protobuf.h {
    FinderLiveMode_Game(3),
    FinderLiveMode_Voice(2),
    FinderLiveMode_Unknown(0),
    FinderLiveMode_Video(1),
    FinderLiveMode_Ktv(4),
    FinderLiveMode_CoLive(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f392044d;

    zg7(int i17) {
        this.f392044d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f392044d;
    }
}
