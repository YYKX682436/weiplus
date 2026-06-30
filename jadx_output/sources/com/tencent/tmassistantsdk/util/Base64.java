package com.tencent.tmassistantsdk.util;

/* loaded from: classes16.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    /* loaded from: classes16.dex */
    public static abstract class Coder {

        /* renamed from: op, reason: collision with root package name */
        public int f215552op;
        public byte[] output;

        public abstract int maxOutputSize(int i17);

        public abstract boolean process(byte[] bArr, int i17, int i18, boolean z17);
    }

    /* loaded from: classes16.dex */
    public static class Decoder extends com.tencent.tmassistantsdk.util.Base64.Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i17, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i17 & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.tencent.tmassistantsdk.util.Base64.Coder
        public int maxOutputSize(int i17) {
            return ((i17 * 3) / 4) + 10;
        }

        @Override // com.tencent.tmassistantsdk.util.Base64.Coder
        public boolean process(byte[] bArr, int i17, int i18, boolean z17) {
            int i19 = this.state;
            if (i19 == 6) {
                return false;
            }
            int i27 = i18 + i17;
            int i28 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i29 = 0;
            int i37 = i28;
            int i38 = i19;
            int i39 = i17;
            while (i39 < i27) {
                if (i38 == 0) {
                    while (true) {
                        int i47 = i39 + 4;
                        if (i47 > i27 || (i37 = (iArr[bArr[i39] & 255] << 18) | (iArr[bArr[i39 + 1] & 255] << 12) | (iArr[bArr[i39 + 2] & 255] << 6) | iArr[bArr[i39 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i29 + 2] = (byte) i37;
                        bArr2[i29 + 1] = (byte) (i37 >> 8);
                        bArr2[i29] = (byte) (i37 >> 16);
                        i29 += 3;
                        i39 = i47;
                    }
                    if (i39 >= i27) {
                        break;
                    }
                }
                int i48 = i39 + 1;
                int i49 = iArr[bArr[i39] & 255];
                if (i38 != 0) {
                    if (i38 == 1) {
                        if (i49 < 0) {
                            if (i49 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i49 |= i37 << 6;
                    } else if (i38 == 2) {
                        if (i49 < 0) {
                            if (i49 == -2) {
                                bArr2[i29] = (byte) (i37 >> 4);
                                i29++;
                                i38 = 4;
                            } else if (i49 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i49 |= i37 << 6;
                    } else if (i38 != 3) {
                        if (i38 != 4) {
                            if (i38 == 5 && i49 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i49 == -2) {
                            i38++;
                        } else if (i49 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i49 >= 0) {
                        int i57 = i49 | (i37 << 6);
                        bArr2[i29 + 2] = (byte) i57;
                        bArr2[i29 + 1] = (byte) (i57 >> 8);
                        bArr2[i29] = (byte) (i57 >> 16);
                        i29 += 3;
                        i37 = i57;
                        i38 = 0;
                    } else if (i49 == -2) {
                        bArr2[i29 + 1] = (byte) (i37 >> 2);
                        bArr2[i29] = (byte) (i37 >> 10);
                        i29 += 2;
                        i38 = 5;
                    } else if (i49 != -1) {
                        this.state = 6;
                        return false;
                    }
                    i38++;
                    i37 = i49;
                } else {
                    if (i49 < 0) {
                        if (i49 != -1) {
                            this.state = 6;
                            return false;
                        }
                    }
                    i38++;
                    i37 = i49;
                }
                i39 = i48;
            }
            if (!z17) {
                this.state = i38;
                this.value = i37;
                this.f215552op = i29;
                return true;
            }
            if (i38 == 1) {
                this.state = 6;
                return false;
            }
            if (i38 == 2) {
                bArr2[i29] = (byte) (i37 >> 4);
                i29++;
            } else if (i38 == 3) {
                int i58 = i29 + 1;
                bArr2[i29] = (byte) (i37 >> 10);
                i29 = i58 + 1;
                bArr2[i58] = (byte) (i37 >> 2);
            } else if (i38 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i38;
            this.f215552op = i29;
            return true;
        }
    }

    /* loaded from: classes16.dex */
    public static class Encoder extends com.tencent.tmassistantsdk.util.Base64.Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i17, byte[] bArr) {
            this.output = bArr;
            this.do_padding = (i17 & 1) == 0;
            boolean z17 = (i17 & 2) == 0;
            this.do_newline = z17;
            this.do_cr = (i17 & 4) != 0;
            this.alphabet = (i17 & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z17 ? 19 : -1;
        }

        @Override // com.tencent.tmassistantsdk.util.Base64.Coder
        public int maxOutputSize(int i17) {
            return ((i17 * 8) / 5) + 10;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        @Override // com.tencent.tmassistantsdk.util.Base64.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.util.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }

    public static byte[] decode(java.lang.String str, int i17) {
        return decode(str.getBytes(), i17);
    }

    public static byte[] encode(byte[] bArr, int i17) {
        return encode(bArr, 0, bArr.length, i17);
    }

    public static java.lang.String encodeToString(byte[] bArr, int i17) {
        try {
            return new java.lang.String(encode(bArr, i17), "US-ASCII");
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public static byte[] decode(byte[] bArr, int i17) {
        return decode(bArr, 0, bArr.length, i17);
    }

    public static byte[] encode(byte[] bArr, int i17, int i18, int i19) {
        com.tencent.tmassistantsdk.util.Base64.Encoder encoder = new com.tencent.tmassistantsdk.util.Base64.Encoder(i19, null);
        int i27 = (i18 / 3) * 4;
        if (encoder.do_padding) {
            if (i18 % 3 > 0) {
                i27 += 4;
            }
        } else {
            int i28 = i18 % 3;
            if (i28 == 1) {
                i27 += 2;
            } else if (i28 == 2) {
                i27 += 3;
            }
        }
        if (encoder.do_newline && i18 > 0) {
            i27 += (((i18 - 1) / 57) + 1) * (encoder.do_cr ? 2 : 1);
        }
        encoder.output = new byte[i27];
        encoder.process(bArr, i17, i18, true);
        return encoder.output;
    }

    public static byte[] decode(byte[] bArr, int i17, int i18, int i19) {
        com.tencent.tmassistantsdk.util.Base64.Decoder decoder = new com.tencent.tmassistantsdk.util.Base64.Decoder(i19, new byte[(i18 * 3) / 4]);
        if (decoder.process(bArr, i17, i18, true)) {
            int i27 = decoder.f215552op;
            byte[] bArr2 = decoder.output;
            if (i27 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i27];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i27);
            return bArr3;
        }
        throw new java.lang.IllegalArgumentException("bad base-64");
    }
}
