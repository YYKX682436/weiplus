package v8;

/* loaded from: classes15.dex */
public final class e extends v8.n {

    /* renamed from: n, reason: collision with root package name */
    public t9.h f433991n;

    /* renamed from: o, reason: collision with root package name */
    public v8.d f433992o;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0018. Please report as an issue. */
    @Override // v8.n
    public long b(t9.p pVar) {
        int i17;
        int i18;
        int i19;
        byte[] bArr = pVar.f416540a;
        int i27 = -1;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i28 = (bArr[2] & 255) >> 4;
        switch (i28) {
            case 1:
                i27 = 192;
                return i27;
            case 2:
            case 3:
            case 4:
            case 5:
                i17 = i28 - 2;
                i18 = 576;
                i27 = i18 << i17;
                return i27;
            case 6:
            case 7:
                pVar.x(4);
                long j17 = pVar.f416540a[pVar.f416541b];
                int i29 = 7;
                while (true) {
                    if (i29 >= 0) {
                        if (((1 << i29) & j17) != 0) {
                            i29--;
                        } else if (i29 < 6) {
                            j17 &= r8 - 1;
                            i19 = 7 - i29;
                        } else if (i29 == 7) {
                            i19 = 1;
                        }
                    }
                }
                i19 = 0;
                if (i19 == 0) {
                    throw new java.lang.NumberFormatException("Invalid UTF-8 sequence first byte: " + j17);
                }
                for (int i37 = 1; i37 < i19; i37++) {
                    if ((pVar.f416540a[pVar.f416541b + i37] & 192) != 128) {
                        throw new java.lang.NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j17);
                    }
                    j17 = (j17 << 6) | (r8 & 63);
                }
                pVar.f416541b += i19;
                int m17 = i28 == 6 ? pVar.m() : pVar.r();
                pVar.w(0);
                i27 = m17 + 1;
                return i27;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i17 = i28 - 8;
                i18 = 256;
                i27 = i18 << i17;
                return i27;
            default:
                return i27;
        }
    }

    @Override // v8.n
    public boolean c(t9.p pVar, long j17, v8.l lVar) {
        byte[] bArr = pVar.f416540a;
        if (this.f433991n == null) {
            this.f433991n = new t9.h(bArr, 17);
            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 9, pVar.f416542c);
            copyOfRange[4] = Byte.MIN_VALUE;
            java.util.List singletonList = java.util.Collections.singletonList(copyOfRange);
            t9.h hVar = this.f433991n;
            int i17 = hVar.f416515c;
            int i18 = hVar.f416513a;
            lVar.f434012a = com.google.android.exoplayer2.Format.c(null, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_FLAC, null, -1, i17 * i18, hVar.f416514b, i18, singletonList, null, 0, null);
        } else {
            byte b17 = bArr[0];
            if ((b17 & Byte.MAX_VALUE) == 3) {
                v8.d dVar = new v8.d(this);
                this.f433992o = dVar;
                pVar.x(1);
                int o17 = pVar.o() / 18;
                dVar.f433986a = new long[o17];
                dVar.f433987b = new long[o17];
                for (int i19 = 0; i19 < o17; i19++) {
                    dVar.f433986a[i19] = pVar.h();
                    dVar.f433987b[i19] = pVar.h();
                    pVar.x(2);
                }
            } else if (b17 == -1) {
                v8.d dVar2 = this.f433992o;
                if (dVar2 != null) {
                    dVar2.f433988c = j17;
                    lVar.f434013b = dVar2;
                }
                return false;
            }
        }
        return true;
    }

    @Override // v8.n
    public void d(boolean z17) {
        super.d(z17);
        if (z17) {
            this.f433991n = null;
            this.f433992o = null;
        }
    }
}
