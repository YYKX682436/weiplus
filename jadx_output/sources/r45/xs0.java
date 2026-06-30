package r45;

/* loaded from: classes5.dex */
public enum xs0 implements com.tencent.mm.protobuf.h {
    MediaTypePic(1),
    MediaTypeAudio(2),
    MediaTypeNone(0),
    MediaTypeVideo(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f390373d;

    xs0(int i17) {
        this.f390373d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f390373d;
    }
}
