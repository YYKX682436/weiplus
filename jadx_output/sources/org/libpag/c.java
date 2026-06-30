package org.libpag;

/* loaded from: classes13.dex */
abstract class c {

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f347827a;

        /* renamed from: b, reason: collision with root package name */
        int f347828b;

        /* renamed from: c, reason: collision with root package name */
        long f347829c;

        /* renamed from: d, reason: collision with root package name */
        private org.libpag.PAGDecoder f347830d;

        public synchronized boolean a() {
            return this.f347830d != null;
        }

        public synchronized boolean b() {
            boolean z17;
            if (this.f347827a > 0) {
                z17 = this.f347828b > 0;
            }
            return z17;
        }

        public synchronized int c() {
            org.libpag.PAGDecoder pAGDecoder;
            pAGDecoder = this.f347830d;
            return pAGDecoder == null ? 0 : pAGDecoder.numFrames();
        }

        public synchronized void d() {
            org.libpag.PAGDecoder pAGDecoder = this.f347830d;
            if (pAGDecoder != null) {
                pAGDecoder.release();
                this.f347830d = null;
            }
        }

        public synchronized void e() {
            d();
            this.f347827a = 0;
            this.f347828b = 0;
            this.f347829c = 0L;
        }

        public synchronized boolean a(int i17) {
            boolean z17;
            org.libpag.PAGDecoder pAGDecoder = this.f347830d;
            if (pAGDecoder != null) {
                z17 = pAGDecoder.checkFrameChanged(i17);
            }
            return z17;
        }

        public synchronized boolean a(int i17, android.hardware.HardwareBuffer hardwareBuffer) {
            boolean z17;
            org.libpag.PAGDecoder pAGDecoder = this.f347830d;
            if (pAGDecoder != null && hardwareBuffer != null) {
                z17 = pAGDecoder.readFrame(i17, hardwareBuffer);
            }
            return z17;
        }

        public synchronized boolean a(android.graphics.Bitmap bitmap, int i17) {
            boolean z17;
            org.libpag.PAGDecoder pAGDecoder = this.f347830d;
            if (pAGDecoder != null && bitmap != null) {
                z17 = pAGDecoder.copyFrameTo(bitmap, i17);
            }
            return z17;
        }

        public synchronized boolean a(org.libpag.PAGComposition pAGComposition, int i17, int i18, float f17) {
            float f18;
            int height;
            if (pAGComposition == null || i17 <= 0 || i18 <= 0 || f17 <= 0.0f) {
                return false;
            }
            if (pAGComposition.width() >= pAGComposition.height()) {
                f18 = i17 * 1.0f;
                height = pAGComposition.width();
            } else {
                f18 = i18 * 1.0f;
                height = pAGComposition.height();
            }
            org.libpag.PAGDecoder Make = org.libpag.PAGDecoder.Make(pAGComposition, f17, f18 / height);
            this.f347830d = Make;
            this.f347827a = Make.width();
            this.f347828b = this.f347830d.height();
            this.f347829c = pAGComposition.duration();
            return true;
        }
    }

    public static double a(int i17, int i18) {
        if (i18 <= 1 || i17 < 0) {
            return 0.0d;
        }
        if (i17 >= i18 - 1) {
            return 1.0d;
        }
        return ((i17 * 1.0d) + 0.1d) / i18;
    }

    public static android.graphics.Matrix a(int i17, int i18, int i19, int i27, int i28) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (i17 != 0 && i18 > 0 && i19 > 0 && i27 > 0 && i28 > 0) {
            float f17 = i27;
            float f18 = i18;
            float f19 = (f17 * 1.0f) / f18;
            float f27 = i28;
            float f28 = i19;
            float f29 = (1.0f * f27) / f28;
            if (i17 == 1) {
                matrix.setScale(f19, f29);
            } else if (i17 != 3) {
                float min = java.lang.Math.min(f19, f29);
                matrix.setScale(min, min);
                if (f19 < f29) {
                    matrix.postTranslate(0.0f, (f27 - (f28 * min)) * 0.5f);
                } else {
                    matrix.postTranslate((f17 - (f18 * min)) * 0.5f, 0.0f);
                }
            } else {
                float max = java.lang.Math.max(f19, f29);
                matrix.setScale(max, max);
                if (f19 > f29) {
                    matrix.postTranslate(0.0f, (f27 - (f28 * max)) * 0.5f);
                } else {
                    matrix.postTranslate((f17 - (f18 * max)) * 0.5f, 0.0f);
                }
            }
        }
        return matrix;
    }

    private static double a(double d17, double d18) {
        return d17 - (((int) java.lang.Math.floor(d17 / d18)) * d18);
    }

    public static int a(double d17, int i17) {
        if (i17 <= 1) {
            return 0;
        }
        double a17 = a(d17, 1.0d);
        if (a17 <= 0.0d && d17 != 0.0d) {
            a17 += 1.0d;
        }
        int floor = (int) java.lang.Math.floor(a17 * i17);
        return floor == i17 ? i17 - 1 : floor;
    }
}
