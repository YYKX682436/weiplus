package er4;

/* loaded from: classes6.dex */
public enum u implements com.tencent.mm.protobuf.h {
    VoIPMPSystemAuthRequestTypeUnknown(0),
    VoIPMPSystemAuthRequestTypeMicrophone(1),
    VoIPMPSystemAuthRequestTypeCamera(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f256180d;

    u(int i17) {
        this.f256180d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256180d;
    }
}
