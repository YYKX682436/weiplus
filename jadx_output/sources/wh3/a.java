package wh3;

/* loaded from: classes10.dex */
public final class a extends wh3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String mediaId, java.lang.String filePath) {
        super(mediaId, filePath);
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(filePath, "filePath");
    }

    public java.lang.String toString() {
        return "LocalMediaSource mediaId:" + this.f445965a + " filePath:" + this.f445966b;
    }
}
