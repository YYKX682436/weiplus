package r45;

/* loaded from: classes8.dex */
public enum za0 implements com.tencent.mm.protobuf.h {
    ORIGINAL_CONTENT(1),
    THUMBNAIL_CONTENT(2),
    AUTO_ELLIPSE_CONTENT(3),
    ORIGINAL_CONTENT_CLIENT_THUMBNAIL(4),
    THUMBNAIL_CONTENT_CLIENT_THUMBNAIL(5),
    RENDER_DROP(6),
    NO_DSL_ORIGINAL_CONTENT(10001),
    NO_DSL_THUMBNAIL_CONTENT(10002),
    NO_DSL_AUTO_ELLIPSE_CONTENT(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL);


    /* renamed from: d, reason: collision with root package name */
    public final int f391856d;

    za0(int i17) {
        this.f391856d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f391856d;
    }
}
