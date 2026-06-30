package kg;

/* loaded from: classes6.dex */
public enum o implements com.google.protobuf.p6 {
    IMAGE_CLIP(1),
    VIDEO_CLIP(2),
    AUDIO_CLIP(3),
    CLIP_NOT_SET(0);


    /* renamed from: d, reason: collision with root package name */
    public final int f307593d;

    o(int i17) {
        this.f307593d = i17;
    }

    @Override // com.google.protobuf.p6
    public int getNumber() {
        return this.f307593d;
    }
}
