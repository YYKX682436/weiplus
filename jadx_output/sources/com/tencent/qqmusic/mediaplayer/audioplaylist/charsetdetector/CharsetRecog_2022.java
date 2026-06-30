package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

/* loaded from: classes16.dex */
abstract class CharsetRecog_2022 extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer {

    /* loaded from: classes16.dex */
    public static class CharsetRecog_2022CN extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022 {
        private byte[][] escapeSequences = {new byte[]{27, 36, 41, 65}, new byte[]{27, 36, 41, 71}, new byte[]{27, 36, 42, 72}, new byte[]{27, 36, 41, 69}, new byte[]{27, 36, 43, 73}, new byte[]{27, 36, 43, 74}, new byte[]{27, 36, 43, 75}, new byte[]{27, 36, 43, 76}, new byte[]{27, 36, 43, 77}, new byte[]{27, 78}, new byte[]{27, 79}};

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getName() {
            return "ISO-2022-CN";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            int match = match(charsetDetector.fInputBytes, charsetDetector.fInputLen, this.escapeSequences);
            if (match == 0) {
                return null;
            }
            return new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch(charsetDetector, this, match);
        }
    }

    /* loaded from: classes16.dex */
    public static class CharsetRecog_2022JP extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022 {
        private byte[][] escapeSequences = {new byte[]{27, 36, 40, 67}, new byte[]{27, 36, 40, 68}, new byte[]{27, 36, 64}, new byte[]{27, 36, 65}, new byte[]{27, 36, 66}, new byte[]{27, 38, 64}, new byte[]{27, 40, 66}, new byte[]{27, 40, 72}, new byte[]{27, 40, 73}, new byte[]{27, 40, 74}, new byte[]{27, 46, 65}, new byte[]{27, 46, 70}};

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getName() {
            return "ISO-2022-JP";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            int match = match(charsetDetector.fInputBytes, charsetDetector.fInputLen, this.escapeSequences);
            if (match == 0) {
                return null;
            }
            return new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch(charsetDetector, this, match);
        }
    }

    /* loaded from: classes16.dex */
    public static class CharsetRecog_2022KR extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022 {
        private byte[][] escapeSequences = {new byte[]{27, 36, 41, 67}};

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getName() {
            return "ISO-2022-KR";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            int match = match(charsetDetector.fInputBytes, charsetDetector.fInputLen, this.escapeSequences);
            if (match == 0) {
                return null;
            }
            return new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch(charsetDetector, this, match);
        }
    }

    public int match(byte[] bArr, int i17, byte[][] bArr2) {
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i18 < i17) {
            if (bArr[i18] == 27) {
                for (byte[] bArr3 : bArr2) {
                    if (i17 - i18 >= bArr3.length) {
                        for (int i29 = 1; i29 < bArr3.length; i29++) {
                            if (bArr3[i29] != bArr[i18 + i29]) {
                                break;
                            }
                        }
                        i19++;
                        i18 += bArr3.length - 1;
                        break;
                    }
                }
                i27++;
            }
            byte b17 = bArr[i18];
            if (b17 == 14 || b17 == 15) {
                i28++;
            }
            i18++;
        }
        if (i19 == 0) {
            return 0;
        }
        int i37 = ((i19 * 100) - (i27 * 100)) / (i27 + i19);
        int i38 = i19 + i28;
        if (i38 < 5) {
            i37 -= (5 - i38) * 10;
        }
        if (i37 < 0) {
            return 0;
        }
        return i37;
    }
}
