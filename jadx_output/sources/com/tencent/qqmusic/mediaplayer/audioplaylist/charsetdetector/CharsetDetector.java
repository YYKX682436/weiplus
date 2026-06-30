package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

/* loaded from: classes16.dex */
public class CharsetDetector {
    private static final java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo> ALL_CS_RECOGNIZERS;
    private static final int kBufSize = 8000;
    java.lang.String fDeclaredEncoding;
    private boolean[] fEnabledRecognizers;
    int fInputLen;
    java.io.InputStream fInputStream;
    byte[] fRawInput;
    int fRawLength;
    byte[] fInputBytes = new byte[8000];
    short[] fByteStats = new short[256];
    boolean fC1Bytes = false;
    private boolean fStripTags = false;

    /* loaded from: classes16.dex */
    public static class CSRecognizerInfo {
        boolean isDefaultEnabled;
        com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer recognizer;

        public CSRecognizerInfo(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer charsetRecognizer, boolean z17) {
            this.recognizer = charsetRecognizer;
            this.isDefaultEnabled = z17;
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_UTF8(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode.CharsetRecog_UTF_16_BE(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode.CharsetRecog_UTF_16_LE(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode.CharsetRecog_UTF_32_BE(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode.CharsetRecog_UTF_32_LE(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_sjis(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022.CharsetRecog_2022JP(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022.CharsetRecog_2022CN(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022.CharsetRecog_2022KR(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_gb_18030(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_euc.CharsetRecog_euc_jp(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_euc.CharsetRecog_euc_kr(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_big5(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_1(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_2(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_5_ru(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_6_ar(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_7_el(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_8_I_he(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_8_he(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_windows_1251(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_windows_1256(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_KOI8_R(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_9_tr(), true));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_IBM424_he_rtl(), false));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_IBM424_he_ltr(), false));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_IBM420_ar_rtl(), false));
        arrayList.add(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_IBM420_ar_ltr(), false));
        ALL_CS_RECOGNIZERS = java.util.Collections.unmodifiableList(arrayList);
    }

    private void MungeInput() {
        int i17;
        int i18;
        if (this.fStripTags) {
            int i19 = 0;
            i17 = 0;
            i18 = 0;
            boolean z17 = false;
            for (int i27 = 0; i27 < this.fRawLength; i27++) {
                byte[] bArr = this.fInputBytes;
                if (i19 >= bArr.length) {
                    break;
                }
                byte b17 = this.fRawInput[i27];
                if (b17 == 60) {
                    if (z17) {
                        i18++;
                    }
                    i17++;
                    z17 = true;
                }
                if (!z17) {
                    bArr[i19] = b17;
                    i19++;
                }
                if (b17 == 62) {
                    z17 = false;
                }
            }
            this.fInputLen = i19;
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (i17 < 5 || i17 / 5 < i18 || (this.fInputLen < 100 && this.fRawLength > 600)) {
            int i28 = this.fRawLength;
            if (i28 > 8000) {
                i28 = 8000;
            }
            int i29 = 0;
            while (i29 < i28) {
                this.fInputBytes[i29] = this.fRawInput[i29];
                i29++;
            }
            this.fInputLen = i29;
        }
        java.util.Arrays.fill(this.fByteStats, (short) 0);
        for (int i37 = 0; i37 < this.fInputLen; i37++) {
            int i38 = this.fInputBytes[i37] & 255;
            short[] sArr = this.fByteStats;
            sArr[i38] = (short) (sArr[i38] + 1);
        }
        this.fC1Bytes = false;
        for (int i39 = 128; i39 <= 159; i39++) {
            if (this.fByteStats[i39] != 0) {
                this.fC1Bytes = true;
                return;
            }
        }
    }

    public static java.lang.String[] getAllDetectableCharsets() {
        int size = ALL_CS_RECOGNIZERS.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = ALL_CS_RECOGNIZERS.get(i17).recognizer.getName();
        }
        return strArr;
    }

    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch detect() {
        com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch[] detectAll = detectAll();
        if (detectAll == null || detectAll.length == 0) {
            return null;
        }
        return detectAll[0];
    }

    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch[] detectAll() {
        com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        MungeInput();
        int i17 = 0;
        while (true) {
            java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo> list = ALL_CS_RECOGNIZERS;
            if (i17 >= list.size()) {
                java.util.Collections.sort(arrayList);
                java.util.Collections.reverse(arrayList);
                return (com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch[]) arrayList.toArray(new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch[arrayList.size()]);
            }
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo cSRecognizerInfo = list.get(i17);
            boolean[] zArr = this.fEnabledRecognizers;
            if ((zArr != null ? zArr[i17] : cSRecognizerInfo.isDefaultEnabled) && (match = cSRecognizerInfo.recognizer.match(this)) != null) {
                arrayList.add(match);
            }
            i17++;
        }
    }

    public boolean enableInputFilter(boolean z17) {
        boolean z18 = this.fStripTags;
        this.fStripTags = z17;
        return z18;
    }

    @java.lang.Deprecated
    public java.lang.String[] getDetectableCharsets() {
        java.util.ArrayList arrayList = new java.util.ArrayList(ALL_CS_RECOGNIZERS.size());
        int i17 = 0;
        while (true) {
            java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo> list = ALL_CS_RECOGNIZERS;
            if (i17 >= list.size()) {
                return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
            }
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo cSRecognizerInfo = list.get(i17);
            boolean[] zArr = this.fEnabledRecognizers;
            if (zArr == null ? cSRecognizerInfo.isDefaultEnabled : zArr[i17]) {
                arrayList.add(cSRecognizerInfo.recognizer.getName());
            }
            i17++;
        }
    }

    public java.io.Reader getReader(java.io.InputStream inputStream, java.lang.String str) {
        this.fDeclaredEncoding = str;
        try {
            setText(inputStream);
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch detect = detect();
            if (detect == null) {
                return null;
            }
            return detect.getReader();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public java.lang.String getString(byte[] bArr, java.lang.String str) {
        this.fDeclaredEncoding = str;
        try {
            setText(bArr);
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch detect = detect();
            if (detect == null) {
                return null;
            }
            return detect.getString(-1);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public boolean inputFilterEnabled() {
        return this.fStripTags;
    }

    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector setDeclaredEncoding(java.lang.String str) {
        this.fDeclaredEncoding = str;
        return this;
    }

    @java.lang.Deprecated
    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector setDetectableCharset(java.lang.String str, boolean z17) {
        java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo> list;
        boolean z18;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            list = ALL_CS_RECOGNIZERS;
            if (i18 >= list.size()) {
                i18 = -1;
                break;
            }
            com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo cSRecognizerInfo = list.get(i18);
            if (!cSRecognizerInfo.recognizer.getName().equals(str)) {
                i18++;
            } else if (cSRecognizerInfo.isDefaultEnabled == z17) {
                z18 = true;
            }
        }
        z18 = false;
        if (i18 < 0) {
            throw new java.lang.IllegalArgumentException("Invalid encoding: \"" + str + "\"");
        }
        if (this.fEnabledRecognizers == null && !z18) {
            this.fEnabledRecognizers = new boolean[list.size()];
            while (true) {
                java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector.CSRecognizerInfo> list2 = ALL_CS_RECOGNIZERS;
                if (i17 >= list2.size()) {
                    break;
                }
                this.fEnabledRecognizers[i17] = list2.get(i17).isDefaultEnabled;
                i17++;
            }
        }
        boolean[] zArr = this.fEnabledRecognizers;
        if (zArr != null) {
            zArr[i18] = z17;
        }
        return this;
    }

    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector setText(byte[] bArr) {
        this.fRawInput = bArr;
        this.fRawLength = bArr.length;
        return this;
    }

    public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector setText(java.io.InputStream inputStream) {
        this.fInputStream = inputStream;
        int i17 = 8000;
        inputStream.mark(8000);
        this.fRawInput = new byte[8000];
        this.fRawLength = 0;
        while (i17 > 0) {
            int read = this.fInputStream.read(this.fRawInput, this.fRawLength, i17);
            if (read <= 0) {
                break;
            }
            this.fRawLength += read;
            i17 -= read;
        }
        this.fInputStream.reset();
        return this;
    }
}
