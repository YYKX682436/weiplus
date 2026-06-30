package v8;

/* loaded from: classes15.dex */
public final class j extends v8.n {

    /* renamed from: o, reason: collision with root package name */
    public static final int f434009o = t9.d0.f("Opus");

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f434010p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n, reason: collision with root package name */
    public boolean f434011n;

    @Override // v8.n
    public long b(t9.p pVar) {
        int i17;
        byte[] bArr = pVar.f416540a;
        int i18 = bArr[0] & 255;
        int i19 = i18 & 3;
        if (i19 != 0) {
            i17 = 2;
            if (i19 != 1 && i19 != 2) {
                i17 = bArr[1] & 63;
            }
        } else {
            i17 = 1;
        }
        int i27 = i18 >> 3;
        return (this.f434022i * (i17 * (i27 >= 16 ? 2500 << r1 : i27 >= 12 ? 10000 << (r1 & 1) : (i27 & 3) == 3 ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL : 10000 << r1))) / 1000000;
    }

    @Override // v8.n
    public boolean c(t9.p pVar, long j17, v8.l lVar) {
        if (this.f434011n) {
            boolean z17 = pVar.c() == f434009o;
            pVar.w(0);
            return z17;
        }
        byte[] copyOf = java.util.Arrays.copyOf(pVar.f416540a, pVar.f416542c);
        int i17 = copyOf[9] & 255;
        int i18 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(copyOf);
        e(arrayList, i18);
        e(arrayList, 3840);
        lVar.f434012a = com.google.android.exoplayer2.Format.c(null, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_OPUS, null, -1, -1, i17, 48000, arrayList, null, 0, null);
        this.f434011n = true;
        return true;
    }

    @Override // v8.n
    public void d(boolean z17) {
        super.d(z17);
        if (z17) {
            this.f434011n = false;
        }
    }

    public final void e(java.util.List list, int i17) {
        list.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong((i17 * 1000000000) / 48000).array());
    }
}
