package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

/* loaded from: classes16.dex */
class CharsetRecog_UTF8 extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer {
    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
    public java.lang.String getName() {
        return com.tencent.mapsdk.internal.rv.f51270c;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector r14) {
        /*
            r13 = this;
            byte[] r0 = r14.fRawInput
            int r1 = r14.fRawLength
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r1 < r5) goto L24
            r1 = r0[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = 239(0xef, float:3.35E-43)
            if (r1 != r6) goto L24
            r1 = r0[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = 187(0xbb, float:2.62E-43)
            if (r1 != r6) goto L24
            r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = 191(0xbf, float:2.68E-43)
            if (r1 != r6) goto L24
            r1 = r3
            goto L25
        L24:
            r1 = r4
        L25:
            r6 = r4
            r7 = r6
            r8 = r7
        L28:
            int r9 = r14.fRawLength
            if (r6 >= r9) goto L63
            r9 = r0[r6]
            r10 = r9 & 128(0x80, float:1.8E-43)
            if (r10 != 0) goto L33
            goto L61
        L33:
            r10 = r9 & 224(0xe0, float:3.14E-43)
            r11 = 192(0xc0, float:2.69E-43)
            if (r10 != r11) goto L3b
            r9 = r3
            goto L4a
        L3b:
            r10 = r9 & 240(0xf0, float:3.36E-43)
            r12 = 224(0xe0, float:3.14E-43)
            if (r10 != r12) goto L43
            r9 = r2
            goto L4a
        L43:
            r9 = r9 & 248(0xf8, float:3.48E-43)
            r10 = 240(0xf0, float:3.36E-43)
            if (r9 != r10) goto L5f
            r9 = r5
        L4a:
            int r6 = r6 + r3
            int r10 = r14.fRawLength
            if (r6 < r10) goto L50
            goto L61
        L50:
            r10 = r0[r6]
            r10 = r10 & r11
            r12 = 128(0x80, float:1.8E-43)
            if (r10 == r12) goto L58
            goto L5f
        L58:
            int r9 = r9 + (-1)
            if (r9 != 0) goto L4a
            int r8 = r8 + 1
            goto L61
        L5f:
            int r7 = r7 + 1
        L61:
            int r6 = r6 + r3
            goto L28
        L63:
            r0 = 100
            if (r1 == 0) goto L6b
            if (r7 != 0) goto L6b
        L69:
            r4 = r0
            goto L8c
        L6b:
            r2 = 80
            if (r1 == 0) goto L75
            int r1 = r7 * 10
            if (r8 <= r1) goto L75
        L73:
            r4 = r2
            goto L8c
        L75:
            if (r8 <= r5) goto L7a
            if (r7 != 0) goto L7a
            goto L69
        L7a:
            if (r8 <= 0) goto L7f
            if (r7 != 0) goto L7f
            goto L73
        L7f:
            if (r8 != 0) goto L86
            if (r7 != 0) goto L86
            r4 = 15
            goto L8c
        L86:
            int r7 = r7 * 10
            if (r8 <= r7) goto L8c
            r4 = 25
        L8c:
            if (r4 != 0) goto L90
            r14 = 0
            goto L96
        L90:
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch r0 = new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch
            r0.<init>(r14, r13, r4)
            r14 = r0
        L96:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_UTF8.match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector):com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch");
    }
}
