package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

/* loaded from: classes16.dex */
abstract class CharsetRecog_mbcs extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer {

    /* loaded from: classes16.dex */
    public static class CharsetRecog_big5 extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs {
        static int[] commonChars = {41280, 41281, 41282, 41283, 41287, 41289, 41333, 41334, 42048, 42054, 42055, 42056, 42065, 42068, 42071, 42084, 42090, 42092, 42103, 42147, 42148, 42151, 42177, 42190, 42193, 42207, 42216, 42237, 42304, 42312, 42328, 42345, 42445, 42471, 42583, 42593, 42594, 42600, 42608, 42664, 42675, 42681, 42707, 42715, 42726, 42738, 42816, 42833, 42841, 42970, 43171, 43173, 43181, 43217, 43219, 43236, 43260, 43456, 43474, 43507, 43627, 43706, 43710, 43724, 43772, 44103, 44111, 44208, 44242, 44377, 44745, 45024, 45290, 45423, 45747, 45764, 45935, 46156, 46158, 46412, 46501, 46525, 46544, 46552, 46705, 47085, 47207, 47428, 47832, 47940, 48033, 48593, 49860, 50105, 50240, 50271};

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getLanguage() {
            return "zh";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getName() {
            return "Big5";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            int match = match(charsetDetector, commonChars);
            if (match == 0) {
                return null;
            }
            return new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch(charsetDetector, this, match);
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
        public boolean nextChar(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.iteratedChar iteratedchar, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            iteratedchar.error = false;
            int nextByte = iteratedchar.nextByte(charsetDetector);
            iteratedchar.charValue = nextByte;
            if (nextByte < 0) {
                return false;
            }
            if (nextByte > 127 && nextByte != 255) {
                int nextByte2 = iteratedchar.nextByte(charsetDetector);
                if (nextByte2 < 0) {
                    return false;
                }
                iteratedchar.charValue = (iteratedchar.charValue << 8) | nextByte2;
                if (nextByte2 < 64 || nextByte2 == 127 || nextByte2 == 255) {
                    iteratedchar.error = true;
                }
            }
            return true;
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class CharsetRecog_euc extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs {

        /* loaded from: classes16.dex */
        public static class CharsetRecog_euc_jp extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_euc {
            static int[] commonChars = {41377, 41378, 41379, 41382, 41404, 41418, 41419, 41430, 41431, 42146, 42148, 42150, 42152, 42154, 42155, 42156, 42157, 42159, 42161, 42163, 42165, 42167, 42169, 42171, 42173, 42175, 42176, 42177, 42179, 42180, 42182, 42183, 42184, 42185, 42186, 42187, 42190, 42191, 42192, 42206, 42207, 42209, 42210, 42212, 42216, 42217, 42218, 42219, 42220, 42223, 42226, 42227, 42402, 42403, 42404, 42406, 42407, 42410, 42413, 42415, 42416, 42419, 42421, 42423, 42424, 42425, 42431, 42435, 42438, 42439, 42440, 42441, 42443, 42448, 42453, 42454, 42455, 42462, 42464, 42465, 42469, 42473, 42474, 42475, 42476, 42477, 42483, 47273, 47572, 47854, 48072, 48880, 49079, 50410, 50940, 51133, 51896, 51955, 52188, 52689};

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public java.lang.String getLanguage() {
                return "ja";
            }

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public java.lang.String getName() {
                return "EUC-JP";
            }

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
                int match = match(charsetDetector, commonChars);
                if (match == 0) {
                    return null;
                }
                return new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch(charsetDetector, this, match);
            }
        }

        /* loaded from: classes16.dex */
        public static class CharsetRecog_euc_kr extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_euc {
            static int[] commonChars = {45217, 45235, 45253, 45261, 45268, 45286, 45293, 45304, 45306, 45308, 45496, 45497, 45511, 45527, 45538, 45994, 46011, 46274, 46287, 46297, 46315, 46501, 46517, 46527, 46535, 46569, 46835, 47023, 47042, 47054, 47270, 47278, 47286, 47288, 47291, 47337, 47531, 47534, 47564, 47566, 47613, 47800, 47822, 47824, 47857, 48103, 48115, 48125, 48301, 48314, 48338, 48374, 48570, 48576, 48579, 48581, 48838, 48840, 48863, 48878, 48888, 48890, 49057, 49065, 49088, 49124, 49131, 49132, 49144, 49319, 49327, 49336, 49338, 49339, 49341, 49351, 49356, 49358, 49359, 49366, 49370, 49381, 49403, 49404, 49572, 49574, 49590, 49622, 49631, 49654, 49656, 50337, 50637, 50862, 51151, 51153, 51154, 51160, 51173, 51373};

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public java.lang.String getLanguage() {
                return "ko";
            }

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public java.lang.String getName() {
                return "EUC-KR";
            }

            @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
            public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
                int match = match(charsetDetector, commonChars);
                if (match == 0) {
                    return null;
                }
                return new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch(charsetDetector, this, match);
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
        public boolean nextChar(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.iteratedChar iteratedchar, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            iteratedchar.error = false;
            int nextByte = iteratedchar.nextByte(charsetDetector);
            iteratedchar.charValue = nextByte;
            if (nextByte < 0) {
                iteratedchar.done = true;
            } else if (nextByte > 141) {
                int nextByte2 = iteratedchar.nextByte(charsetDetector);
                iteratedchar.charValue = (iteratedchar.charValue << 8) | nextByte2;
                if (nextByte < 161 || nextByte > 254) {
                    if (nextByte == 142) {
                        if (nextByte2 < 161) {
                            iteratedchar.error = true;
                        }
                    } else if (nextByte == 143) {
                        int nextByte3 = iteratedchar.nextByte(charsetDetector);
                        iteratedchar.charValue = (iteratedchar.charValue << 8) | nextByte3;
                        if (nextByte3 < 161) {
                            iteratedchar.error = true;
                        }
                    }
                } else if (nextByte2 < 161) {
                    iteratedchar.error = true;
                }
            }
            return !iteratedchar.done;
        }
    }

    /* loaded from: classes16.dex */
    public static class CharsetRecog_gb_18030 extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs {
        static int[] commonChars = {41377, 41378, 41379, 41380, 41392, 41393, 41457, 41459, 41889, 41900, 41914, 45480, 45496, 45502, 45755, 46025, 46070, 46323, 46525, 46532, 46563, 46767, 46804, 46816, 47010, 47016, 47037, 47062, 47069, 47284, 47327, 47350, 47531, 47561, 47576, 47610, 47613, 47821, 48039, 48086, 48097, 48122, 48316, 48347, 48382, 48588, 48845, 48861, 49076, 49094, 49097, 49332, 49389, 49611, 49883, 50119, 50396, 50410, 50636, 50935, 51192, 51371, 51403, 51413, 51431, 51663, 51706, 51889, 51893, 51911, 51920, 51926, 51957, 51965, 52460, 52728, 52906, 52932, 52946, 52965, 53173, 53186, 53206, 53442, 53445, 53456, 53460, 53671, 53930, 53938, 53941, 53947, 53972, 54211, 54224, 54269, 54466, 54490, 54754, 54992};

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getLanguage() {
            return "zh";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getName() {
            return "GB18030";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            int match = match(charsetDetector, commonChars);
            if (match == 0) {
                return null;
            }
            return new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch(charsetDetector, this, match);
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
        public boolean nextChar(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.iteratedChar iteratedchar, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            int nextByte;
            int nextByte2;
            iteratedchar.error = false;
            int nextByte3 = iteratedchar.nextByte(charsetDetector);
            iteratedchar.charValue = nextByte3;
            if (nextByte3 < 0) {
                iteratedchar.done = true;
            } else if (nextByte3 > 128) {
                int nextByte4 = iteratedchar.nextByte(charsetDetector);
                iteratedchar.charValue = (iteratedchar.charValue << 8) | nextByte4;
                if (nextByte3 >= 129 && nextByte3 <= 254 && ((nextByte4 < 64 || nextByte4 > 126) && (nextByte4 < 80 || nextByte4 > 254))) {
                    if (nextByte4 < 48 || nextByte4 > 57 || (nextByte = iteratedchar.nextByte(charsetDetector)) < 129 || nextByte > 254 || (nextByte2 = iteratedchar.nextByte(charsetDetector)) < 48 || nextByte2 > 57) {
                        iteratedchar.error = true;
                    } else {
                        iteratedchar.charValue = nextByte2 | (iteratedchar.charValue << 16) | (nextByte << 8);
                    }
                }
            }
            return !iteratedchar.done;
        }
    }

    /* loaded from: classes16.dex */
    public static class CharsetRecog_sjis extends com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs {
        static int[] commonChars = {33088, 33089, 33090, 33093, 33115, 33129, 33130, 33141, 33142, 33440, 33442, 33444, 33449, 33450, 33451, 33453, 33455, 33457, 33459, 33461, 33463, 33469, 33470, 33473, 33476, 33477, 33478, 33480, 33481, 33484, 33485, 33500, 33504, 33511, 33512, 33513, 33514, 33520, 33521, 33601, 33603, 33614, 33615, 33624, 33630, 33634, 33639, 33653, 33654, 33673, 33674, 33675, 33677, 33683, 36502, 37882, 38314};

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getLanguage() {
            return "ja";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public java.lang.String getName() {
            return "Shift_JIS";
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
        public com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            int match = match(charsetDetector, commonChars);
            if (match == 0) {
                return null;
            }
            return new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch(charsetDetector, this, match);
        }

        @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs
        public boolean nextChar(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.iteratedChar iteratedchar, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            iteratedchar.error = false;
            int nextByte = iteratedchar.nextByte(charsetDetector);
            iteratedchar.charValue = nextByte;
            if (nextByte < 0) {
                return false;
            }
            if (nextByte > 127 && (nextByte <= 160 || nextByte > 223)) {
                int nextByte2 = iteratedchar.nextByte(charsetDetector);
                if (nextByte2 < 0) {
                    return false;
                }
                iteratedchar.charValue = (nextByte << 8) | nextByte2;
                if ((nextByte2 < 64 || nextByte2 > 127) && (nextByte2 < 128 || nextByte2 > 255)) {
                    iteratedchar.error = true;
                }
            }
            return true;
        }
    }

    /* loaded from: classes16.dex */
    public static class iteratedChar {
        int charValue = 0;
        int nextIndex = 0;
        boolean error = false;
        boolean done = false;

        public int nextByte(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector) {
            int i17 = this.nextIndex;
            if (i17 >= charsetDetector.fRawLength) {
                this.done = true;
                return -1;
            }
            byte[] bArr = charsetDetector.fRawInput;
            this.nextIndex = i17 + 1;
            return bArr[i17] & 255;
        }

        public void reset() {
            this.charValue = 0;
            this.nextIndex = 0;
            this.error = false;
            this.done = false;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecognizer
    public abstract java.lang.String getName();

    public int match(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector, int[] iArr) {
        com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.iteratedChar iteratedchar = new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.iteratedChar();
        iteratedchar.reset();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (nextChar(iteratedchar, charsetDetector)) {
            i18++;
            if (iteratedchar.error) {
                i19++;
            } else {
                long j17 = iteratedchar.charValue & io.flutter.embedding.android.KeyboardMap.kValueMask;
                if (j17 > 255) {
                    i17++;
                    if (iArr != null && java.util.Arrays.binarySearch(iArr, (int) j17) >= 0) {
                        i27++;
                    }
                }
            }
            if (i19 >= 2 && i19 * 5 >= i17) {
                return 0;
            }
        }
        int i28 = 10;
        if (i17 > 10 || i19 != 0) {
            int i29 = i19 * 20;
            if (i17 < i29) {
                return 0;
            }
            if (iArr != null) {
                return java.lang.Math.min((int) ((java.lang.Math.log(i27 + 1) * (90.0d / java.lang.Math.log(i17 / 4.0f))) + 10.0d), 100);
            }
            i28 = (i17 + 30) - i29;
            if (i28 > 100) {
                return 100;
            }
        } else if (i17 == 0 && i18 < 10) {
            return 0;
        }
        return i28;
    }

    public abstract boolean nextChar(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.iteratedChar iteratedchar, com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector charsetDetector);
}
