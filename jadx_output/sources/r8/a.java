package r8;

/* loaded from: classes15.dex */
public final class a extends r8.e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f393262e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f393263b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f393264c;

    /* renamed from: d, reason: collision with root package name */
    public int f393265d;

    public boolean a(t9.p pVar) {
        if (this.f393263b) {
            pVar.x(1);
        } else {
            int m17 = pVar.m();
            int i17 = (m17 >> 4) & 15;
            this.f393265d = i17;
            q8.o oVar = this.f393281a;
            if (i17 == 2) {
                oVar.c(com.google.android.exoplayer2.Format.c(null, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG, null, -1, -1, 1, f393262e[(m17 >> 2) & 3], null, null, 0, null));
                this.f393264c = true;
            } else if (i17 == 7 || i17 == 8) {
                oVar.c(com.google.android.exoplayer2.Format.b(null, i17 == 7 ? com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_ALAW : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MLAW, null, -1, -1, 1, 8000, (m17 & 1) == 1 ? 2 : 3, null, null, 0, null));
                this.f393264c = true;
            } else if (i17 != 10) {
                throw new r8.d("Audio format not supported: " + this.f393265d);
            }
            this.f393263b = true;
        }
        return true;
    }

    public void b(t9.p pVar, long j17) {
        int i17 = this.f393265d;
        q8.o oVar = this.f393281a;
        if (i17 == 2) {
            int i18 = pVar.f416542c - pVar.f416541b;
            oVar.a(pVar, i18);
            this.f393281a.b(j17, 1, i18, 0, null);
            return;
        }
        int m17 = pVar.m();
        if (m17 != 0 || this.f393264c) {
            if (this.f393265d != 10 || m17 == 1) {
                int i19 = pVar.f416542c - pVar.f416541b;
                oVar.a(pVar, i19);
                this.f393281a.b(j17, 1, i19, 0, null);
                return;
            }
            return;
        }
        int i27 = pVar.f416542c - pVar.f416541b;
        byte[] bArr = new byte[i27];
        pVar.b(bArr, 0, i27);
        android.util.Pair b17 = t9.e.b(bArr);
        oVar.c(com.google.android.exoplayer2.Format.c(null, "audio/mp4a-latm", null, -1, -1, ((java.lang.Integer) b17.second).intValue(), ((java.lang.Integer) b17.first).intValue(), java.util.Collections.singletonList(bArr), null, 0, null));
        this.f393264c = true;
    }
}
