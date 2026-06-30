package r45;

/* loaded from: classes6.dex */
public enum y84 implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    LIVE_KTV_SING_STATE_UNSING(0),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE_KTV_SING_STATE_BEGIN(1),
    LIVE_KTV_SING_STATE_SINGING(2),
    LIVE_KTV_SING_STATE_END(3),
    LIVE_KTV_SING_STATE_ADVANCE(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f390862d;

    y84(int i17) {
        this.f390862d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f390862d;
    }
}
