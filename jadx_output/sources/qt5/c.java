package qt5;

/* loaded from: classes14.dex */
public class c implements qt5.i0 {

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f366655u = "BaseScanCamera";

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.Camera f366656a;

    /* renamed from: k, reason: collision with root package name */
    public boolean f366666k;

    /* renamed from: o, reason: collision with root package name */
    public int f366670o;

    /* renamed from: p, reason: collision with root package name */
    public int f366671p;

    /* renamed from: q, reason: collision with root package name */
    public int f366672q;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f366657b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f366658c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile qt5.d f366659d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f366660e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile qt5.d f366661f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Point f366662g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Point f366663h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Point f366664i = null;

    /* renamed from: j, reason: collision with root package name */
    public float f366665j = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public int f366667l = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f366668m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f366669n = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f366673r = -1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f366674s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f366675t = "";

    public c() {
        f366655u += "#" + hashCode();
    }

    public void a() {
        com.tencent.stubs.logger.Log.i(f366655u, "close(), previewing " + this.f366658c);
        if (this.f366656a != null) {
            this.f366657b = false;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f366656a.setPreviewCallback(null);
            this.f366656a.stopPreview();
            this.f366658c = false;
            this.f366660e = false;
            this.f366661f = null;
            com.tencent.stubs.logger.Log.i(f366655u, "stopPreview costTime " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            yj0.a.j(this.f366656a, "com/tencent/scanlib/camera/BaseScanCamera", "close", "()V", "android/hardware/Camera", "release", "()V");
            this.f366656a = null;
            com.tencent.stubs.logger.Log.i(f366655u, "camera.close() costTime " + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        } else {
            com.tencent.stubs.logger.Log.w(f366655u, "close(), camera == null");
        }
        this.f366668m = false;
        this.f366669n = -1;
        this.f366666k = false;
        this.f366673r = -1;
        this.f366674s = false;
    }

    public final android.graphics.Point b(android.graphics.Point point) {
        android.hardware.Camera.Parameters parameters = this.f366656a.getParameters();
        java.lang.String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        android.graphics.Point point2 = null;
        if (str != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(parameters.getSupportedPreviewSizes());
            java.util.Collections.sort(arrayList, new qt5.b(null));
            arrayList.remove(0);
            int i17 = point.x;
            float f17 = i17 / point.y;
            java.lang.String.format("visible.x: %d, visible.y: %d, ratio: %f", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(point.y), java.lang.Float.valueOf(f17));
            com.tencent.stubs.logger.Log.i(f366655u, java.lang.String.format("SCREEN_PIXELS: %s", java.lang.Integer.valueOf(point.x * point.y)));
            java.util.Iterator it = arrayList.iterator();
            float f18 = Float.POSITIVE_INFINITY;
            while (true) {
                if (it.hasNext()) {
                    android.hardware.Camera.Size size = (android.hardware.Camera.Size) it.next();
                    int i18 = size.width;
                    int i19 = size.height;
                    com.tencent.stubs.logger.Log.i(f366655u, java.lang.String.format("realWidth: %d, realHeight: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
                    int min = !this.f366666k ? i18 : java.lang.Math.min(i18, i19);
                    int max = !this.f366666k ? i19 : java.lang.Math.max(i18, i19);
                    java.lang.String.format("maybeFlippedWidth: %d, maybeFlippedHeight: %d", java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(max));
                    if (min == point.x && max == point.y) {
                        android.graphics.Point point3 = new android.graphics.Point(i18, i19);
                        com.tencent.stubs.logger.Log.i(f366655u, "Found preview size exactly matching screen size: " + point3);
                        point2 = point3;
                        break;
                    }
                    if (i18 * i19 >= 307200) {
                        float abs = java.lang.Math.abs((min / max) - f17);
                        if (abs < f18) {
                            point2 = new android.graphics.Point(i18, i19);
                            f18 = abs;
                        }
                        com.tencent.stubs.logger.Log.i(f366655u, java.lang.String.format("diff:[%s] newdiff:[%s] w:[%s] h:[%s]", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(abs), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
                    }
                } else {
                    if (point2 == null) {
                        android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
                        point2 = new android.graphics.Point(previewSize.width, previewSize.height);
                        com.tencent.stubs.logger.Log.i(f366655u, "No suitable preview sizes, using default: " + point2);
                    }
                    com.tencent.stubs.logger.Log.i(f366655u, "Found best approximate preview size: " + point2);
                }
            }
        }
        return point2 == null ? new android.graphics.Point((point.x >> 3) << 3, (point.y >> 3) << 3) : point2;
    }

    public int c() {
        android.hardware.Camera camera = this.f366656a;
        if (camera == null || camera.getParameters() == null || this.f366656a.getParameters().getZoomRatios() == null || this.f366656a.getParameters().getZoomRatios().size() <= 0) {
            return 100;
        }
        return this.f366656a.getParameters().getZoomRatios().get(this.f366670o).intValue();
    }

    public java.lang.String d(boolean z17) {
        android.hardware.Camera.Parameters parameters;
        if (!z17) {
            try {
                java.lang.String str = this.f366675t;
                if (str != null && !str.isEmpty()) {
                    return this.f366675t;
                }
            } catch (java.lang.Exception e17) {
                this.f366675t = "";
                com.tencent.stubs.logger.Log.e(f366655u, e17, "getFocusMode exception");
            }
        }
        if (!this.f366657b) {
            com.tencent.stubs.logger.Log.w(f366655u, "getFocusMode camera not open, ignore");
            return this.f366675t;
        }
        android.hardware.Camera camera = this.f366656a;
        if (camera != null && (parameters = camera.getParameters()) != null) {
            java.lang.String focusMode = parameters.getFocusMode();
            this.f366675t = focusMode;
            return focusMode;
        }
        return "";
    }

    public final android.graphics.Point e(android.graphics.Point point) {
        float f17;
        float f18;
        int i17;
        if (this.f366666k) {
            android.graphics.Point point2 = this.f366663h;
            f17 = (point2.x * 1.0f) / point.y;
            f18 = point2.y * 1.0f;
            i17 = point.x;
        } else {
            android.graphics.Point point3 = this.f366663h;
            f17 = (point3.x * 1.0f) / point.x;
            f18 = point3.y * 1.0f;
            i17 = point.y;
        }
        this.f366665j = java.lang.Math.max(f17, f18 / i17);
        float f19 = point.x;
        float f27 = this.f366665j;
        return new android.graphics.Point((int) (f19 * f27), (int) (point.y * f27));
    }

    public android.graphics.Point f(android.graphics.Point point) {
        android.graphics.Point point2 = this.f366664i;
        int i17 = point2.x;
        android.graphics.Point point3 = this.f366663h;
        int i18 = (i17 - point3.x) / 2;
        int i19 = (point2.y - point3.y) / 2;
        android.graphics.Point point4 = new android.graphics.Point(point.x + i18, point.y + i19);
        if (this.f366666k) {
            android.graphics.Point point5 = this.f366664i;
            int i27 = point5.y;
            android.graphics.Point point6 = this.f366663h;
            i18 = (i27 - point6.x) / 2;
            i19 = (point5.x - point6.y) / 2;
            point4 = new android.graphics.Point(point.y + i19, (this.f366663h.x - point.x) + i18);
        }
        java.lang.String.format("dx %d, dy %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        float f17 = point4.x;
        float f18 = this.f366665j;
        android.graphics.Point point7 = new android.graphics.Point((int) (f17 / f18), (int) (point4.y / f18));
        com.tencent.stubs.logger.Log.i(f366655u, "viewPoint " + point + ", previewPoint " + point4 + ", scanPoint " + point7);
        return point7;
    }

    public android.graphics.Rect g(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        com.tencent.stubs.logger.Log.i(f366655u, java.lang.String.format("visibleResolution:%s, previewResolution:%s", this.f366663h, this.f366664i));
        android.graphics.Point f17 = f(this.f366666k ? new android.graphics.Point(rect.right, rect.top) : new android.graphics.Point(rect.left, rect.top));
        android.graphics.Point f18 = f(this.f366666k ? new android.graphics.Point(rect.left, rect.bottom) : new android.graphics.Point(rect.right, rect.bottom));
        rect2.set(f17.x, f17.y, f18.x, f18.y);
        com.tencent.stubs.logger.Log.i(f366655u, java.lang.String.format("uiRect %s, scanRect %s", rect, rect2));
        return rect2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r1 <= (r5.size() - 1)) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h(java.util.List r5, int r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L86
            int r0 = r5.size()
            if (r0 <= 0) goto L86
            java.lang.String r0 = qt5.c.f366655u
            int r1 = r5.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1}
            java.lang.String r2 = "zoomRatios: %s,size: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            com.tencent.stubs.logger.Log.i(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            int r0 = java.util.Collections.binarySearch(r5, r0)
            java.lang.String r1 = qt5.c.f366655u
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "insert index: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.stubs.logger.Log.i(r1, r2)
            if (r0 < 0) goto L3d
            goto L87
        L3d:
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r0 + (-1)
            if (r0 < 0) goto L6f
            int r2 = r5.size()
            int r2 = r2 + (-1)
            if (r0 > r2) goto L6f
            if (r1 < 0) goto L6f
            int r2 = r5.size()
            int r2 = r2 + (-1)
            if (r1 > r2) goto L6f
            java.lang.Object r2 = r5.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r2 - r6
            java.lang.Object r5 = r5.get(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r6 - r5
            if (r2 <= r6) goto L87
            goto L84
        L6f:
            if (r0 < 0) goto L7a
            int r6 = r5.size()
            int r6 = r6 + (-1)
            if (r0 > r6) goto L7a
            goto L87
        L7a:
            if (r1 < 0) goto L86
            int r5 = r5.size()
            int r5 = r5 + (-1)
            if (r1 > r5) goto L86
        L84:
            r0 = r1
            goto L87
        L86:
            r0 = 0
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qt5.c.h(java.util.List, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112 A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:30:0x00bc, B:32:0x00c0, B:34:0x00c8, B:39:0x00d4, B:42:0x00dc, B:44:0x00e2, B:47:0x00ea, B:49:0x0112, B:50:0x0129, B:51:0x0115, B:53:0x0123, B:54:0x0158), top: B:29:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:30:0x00bc, B:32:0x00c0, B:34:0x00c8, B:39:0x00d4, B:42:0x00dc, B:44:0x00e2, B:47:0x00ea, B:49:0x0112, B:50:0x0129, B:51:0x0115, B:53:0x0123, B:54:0x0158), top: B:29:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r12) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qt5.c.i(int):void");
    }

    public void j(java.lang.String str) {
        android.hardware.Camera.Parameters parameters;
        java.util.List<java.lang.String> supportedFocusModes;
        try {
            if (!this.f366657b) {
                com.tencent.stubs.logger.Log.w(f366655u, "setFocusMode camera not open, ignore");
                return;
            }
            android.hardware.Camera camera = this.f366656a;
            if (camera == null || (supportedFocusModes = (parameters = camera.getParameters()).getSupportedFocusModes()) == null || !supportedFocusModes.contains(str)) {
                return;
            }
            parameters.setFocusMode(str);
            this.f366656a.setParameters(parameters);
            this.f366675t = str;
        } catch (java.lang.Exception e17) {
            this.f366675t = "";
            com.tencent.stubs.logger.Log.e(f366655u, e17, "setFocusMode exception");
        }
    }

    public void k() {
        try {
            com.tencent.stubs.logger.Log.i(f366655u, "set scan focus");
            java.util.List<java.lang.String> supportedFocusModes = this.f366656a.getParameters().getSupportedFocusModes();
            if (supportedFocusModes != null) {
                com.tencent.stubs.logger.Log.i(f366655u, "supported focus modes size = " + supportedFocusModes.size());
                for (java.lang.String str : supportedFocusModes) {
                    com.tencent.stubs.logger.Log.i(f366655u, "supported focus modes : " + str);
                }
                if (supportedFocusModes.contains("continuous-video")) {
                    j("continuous-video");
                } else if (supportedFocusModes.contains("auto")) {
                    j("auto");
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e(f366655u, e17, "setScanFocus exception");
        }
    }

    public void l(android.graphics.Point point) {
        this.f366663h = new android.graphics.Point(point);
        com.tencent.stubs.logger.Log.i(f366655u, "setVisibleSize: " + this.f366663h);
        try {
            android.graphics.Point b17 = b(this.f366663h);
            this.f366662g = b17;
            this.f366664i = e(b17);
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e(f366655u, e17, "setVisibleSize exception");
        }
    }

    public void m(android.graphics.SurfaceTexture surfaceTexture) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f366656a == null || this.f366658c) {
            return;
        }
        if (surfaceTexture != null) {
            try {
                this.f366656a.setPreviewTexture(surfaceTexture);
            } catch (java.lang.Throwable th6) {
                com.tencent.stubs.logger.Log.e(f366655u, th6, "startPreview-setPreviewTexture exception");
                this.f366661f = new qt5.d(1051, "setPreviewTexture failed", th6);
                return;
            }
        }
        android.graphics.Point point = this.f366663h;
        if (point == null) {
            com.tencent.stubs.logger.Log.w(f366655u, "startPreview visibleResolution null, and ignore");
            this.f366661f = null;
            return;
        }
        try {
            if (this.f366662g == null) {
                android.graphics.Point b17 = b(point);
                this.f366662g = b17;
                this.f366664i = e(b17);
            }
            try {
                android.hardware.Camera.Parameters parameters = this.f366656a.getParameters();
                android.graphics.Point point2 = this.f366662g;
                parameters.setPreviewSize(point2.x, point2.y);
                this.f366656a.setParameters(parameters);
            } catch (java.lang.Exception e17) {
                com.tencent.stubs.logger.Log.e(f366655u, e17, "startPreview-setPreviewSize exception");
            }
            try {
                this.f366660e = true;
                yj0.a.j(this.f366656a, "com/tencent/scanlib/camera/BaseScanCamera", "startPreview", "(Landroid/graphics/SurfaceTexture;)V", "android/hardware/Camera", "startPreview", "()V");
                this.f366658c = true;
                this.f366661f = new qt5.d(0, "", null);
                java.lang.String.format("startPreview done costTime=[%s]", java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis)));
            } catch (java.lang.Throwable th7) {
                com.tencent.stubs.logger.Log.e(f366655u, th7, "startPreview exception");
                this.f366661f = new qt5.d(1053, "startPreview failed", th7);
            }
        } catch (java.lang.Throwable th8) {
            com.tencent.stubs.logger.Log.e(f366655u, th8, "startPreview-getCameraResolution exception");
            this.f366661f = new qt5.d(1052, "getCameraResolution failed", th8);
        }
    }

    public void n(android.hardware.Camera.PreviewCallback previewCallback) {
        android.hardware.Camera camera = this.f366656a;
        if (camera != null) {
            try {
                camera.setOneShotPreviewCallback(previewCallback);
            } catch (java.lang.RuntimeException e17) {
                com.tencent.stubs.logger.Log.e(f366655u, e17, "takeOneShot exception");
            }
        }
    }

    public void o(int i17) {
        if (this.f366656a == null || !this.f366658c) {
            return;
        }
        try {
            android.hardware.Camera.Parameters parameters = this.f366656a.getParameters();
            java.util.List<java.lang.Integer> zoomRatios = parameters.getZoomRatios();
            if (zoomRatios != null && zoomRatios.size() > 0) {
                com.tencent.stubs.logger.Log.i(f366655u, java.lang.String.format("zoom action:%d,beforeZoom:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(parameters.getZoom())));
                if (i17 == 0) {
                    this.f366670o = 0;
                } else if (i17 == 1) {
                    this.f366670o = this.f366671p;
                } else if (i17 == 2) {
                    int i18 = this.f366670o;
                    int i19 = this.f366672q;
                    if (i18 < i19) {
                        int i27 = i18 + 1;
                        this.f366670o = i27;
                        if (i27 <= i19) {
                            i19 = i27;
                        }
                        this.f366670o = i19;
                    }
                } else if (i17 == 3) {
                    int i28 = this.f366670o;
                    int i29 = this.f366671p;
                    if (i28 > i29) {
                        int i37 = i28 - 1;
                        this.f366670o = i37;
                        if (i37 >= i29) {
                            i29 = i37;
                        }
                        this.f366670o = i29;
                    }
                } else if (i17 == 4) {
                    this.f366670o = this.f366672q;
                } else if (i17 == 5) {
                    int i38 = this.f366670o;
                    int i39 = this.f366671p;
                    if (i38 != i39) {
                        this.f366670o = i39;
                    } else {
                        this.f366670o = this.f366672q;
                    }
                }
                parameters.setZoom(this.f366670o);
                this.f366656a.setParameters(parameters);
                com.tencent.stubs.logger.Log.i(f366655u, java.lang.String.format("zoom action:%d,afterZoom:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(parameters.getZoom())));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e(f366655u, "zoom action exception:" + e17.getMessage());
        }
    }

    public void p(int i17) {
        int i18;
        if (this.f366656a == null || !this.f366658c || i17 <= 0) {
            return;
        }
        try {
            android.hardware.Camera.Parameters parameters = this.f366656a.getParameters();
            java.util.List<java.lang.Integer> zoomRatios = parameters.getZoomRatios();
            if (zoomRatios != null && zoomRatios.size() > 0) {
                java.lang.String.format("zoom to ratio:%d", java.lang.Integer.valueOf(i17));
                if (i17 >= zoomRatios.get(this.f366671p).intValue() && i17 <= zoomRatios.get(this.f366672q).intValue()) {
                    i18 = h(zoomRatios, i17);
                } else if (i17 < zoomRatios.get(this.f366671p).intValue()) {
                    i18 = this.f366671p;
                } else {
                    com.tencent.stubs.logger.Log.i(f366655u, "exceed max zoom");
                    int i19 = this.f366670o;
                    int i27 = this.f366672q;
                    i18 = i19 + ((i27 - i19) / 5);
                    if (i18 > i27) {
                        i18 = i27;
                    }
                }
                com.tencent.stubs.logger.Log.i(f366655u, java.lang.String.format("zoom:%d,ratio:%d", java.lang.Integer.valueOf(i18), zoomRatios.get(i18)));
                this.f366670o = i18;
                parameters.setZoom(i18);
                this.f366656a.setParameters(parameters);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e(f366655u, "zoom scale exception:" + e17.getMessage());
        }
    }
}
