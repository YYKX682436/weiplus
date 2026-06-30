package mp4;

/* loaded from: classes5.dex */
public final class b implements com.tencent.mm.xeffect.effect.IStickerDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f330465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f330466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f330467c;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0158 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp4.b.<init>(android.content.Context, java.lang.String):void");
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public void destroy() {
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public long duration() {
        return 1073741824L;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public android.graphics.Bitmap getFrame() {
        return this.f330465a;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public void seekTo(long j17) {
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public android.util.Size size() {
        return new android.util.Size(this.f330466b, this.f330467c);
    }
}
