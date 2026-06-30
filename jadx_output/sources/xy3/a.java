package xy3;

/* loaded from: classes14.dex */
public class a extends qt5.c {
    public void q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", java.lang.String.format("closeFlash, camera: %s, isPreviewing: %s", this.f366656a, java.lang.Boolean.valueOf(this.f366658c)));
        if (this.f366656a == null || !this.f366658c) {
            return;
        }
        try {
            this.f366668m = false;
            android.hardware.Camera.Parameters parameters = this.f366656a.getParameters();
            java.util.List<java.lang.String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes == null || !supportedFlashModes.contains("off")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "camera not support close flash!!");
            } else {
                parameters.setFlashMode("off");
                this.f366656a.setParameters(parameters);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "close flash");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxScanCamera", "closeFlash error: " + e17.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x0014, B:12:0x0020, B:15:0x0028, B:17:0x002e, B:23:0x0037, B:25:0x004d, B:26:0x0056, B:28:0x0065, B:29:0x007c, B:31:0x0068, B:33:0x0076, B:34:0x0054, B:36:0x00a8), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x0014, B:12:0x0020, B:15:0x0028, B:17:0x002e, B:23:0x0037, B:25:0x004d, B:26:0x0056, B:28:0x0065, B:29:0x007c, B:31:0x0068, B:33:0x0076, B:34:0x0054, B:36:0x00a8), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x0014, B:12:0x0020, B:15:0x0028, B:17:0x002e, B:23:0x0037, B:25:0x004d, B:26:0x0056, B:28:0x0065, B:29:0x007c, B:31:0x0068, B:33:0x0076, B:34:0x0054, B:36:0x00a8), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x0014, B:12:0x0020, B:15:0x0028, B:17:0x002e, B:23:0x0037, B:25:0x004d, B:26:0x0056, B:28:0x0065, B:29:0x007c, B:31:0x0068, B:33:0x0076, B:34:0x0054, B:36:0x00a8), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(boolean r10) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.WxScanCamera"
            android.hardware.Camera r1 = r9.f366656a     // Catch: java.lang.Exception -> Lae
            if (r1 == 0) goto Lc4
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = "zoom-supported"
            java.lang.String r2 = r1.get(r2)     // Catch: java.lang.Exception -> Lae
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1d
            int r5 = r2.length()     // Catch: java.lang.Exception -> Lae
            if (r5 != 0) goto L1b
            goto L1d
        L1b:
            r5 = r3
            goto L1e
        L1d:
            r5 = r4
        L1e:
            if (r5 != 0) goto La8
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.Exception -> Lae
            if (r2 != 0) goto L28
            goto La8
        L28:
            java.util.List r1 = r1.getZoomRatios()     // Catch: java.lang.Exception -> Lae
            if (r1 == 0) goto La7
            int r2 = r1.size()     // Catch: java.lang.Exception -> Lae
            if (r2 > 0) goto L35
            goto La7
        L35:
            if (r10 == 0) goto L54
            int r10 = r1.size()     // Catch: java.lang.Exception -> Lae
            int r10 = r10 / 5
            r9.f366671p = r10     // Catch: java.lang.Exception -> Lae
            java.lang.Object r10 = r1.get(r10)     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Exception -> Lae
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> Lae
            r2 = 150(0x96, float:2.1E-43)
            if (r10 <= r2) goto L56
            int r10 = r9.h(r1, r2)     // Catch: java.lang.Exception -> Lae
            r9.f366671p = r10     // Catch: java.lang.Exception -> Lae
            goto L56
        L54:
            r9.f366671p = r3     // Catch: java.lang.Exception -> Lae
        L56:
            int r10 = r1.size()     // Catch: java.lang.Exception -> Lae
            double r5 = (double) r10     // Catch: java.lang.Exception -> Lae
            r7 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r5 = r5 / r7
            int r10 = (int) r5     // Catch: java.lang.Exception -> Lae
            r9.f366672q = r10     // Catch: java.lang.Exception -> Lae
            int r2 = r9.f366671p     // Catch: java.lang.Exception -> Lae
            if (r10 >= r2) goto L68
            r9.f366672q = r2     // Catch: java.lang.Exception -> Lae
            goto L7c
        L68:
            java.lang.Object r10 = r1.get(r10)     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Exception -> Lae
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> Lae
            r2 = 400(0x190, float:5.6E-43)
            if (r10 <= r2) goto L7c
            int r10 = r9.h(r1, r2)     // Catch: java.lang.Exception -> Lae
            r9.f366672q = r10     // Catch: java.lang.Exception -> Lae
        L7c:
            java.lang.String r10 = "default zoom:%d,default ratio:%d,max zoom:%d,max ratio:%d"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lae
            int r5 = r9.f366671p     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> Lae
            r2[r3] = r5     // Catch: java.lang.Exception -> Lae
            int r3 = r9.f366671p     // Catch: java.lang.Exception -> Lae
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> Lae
            r2[r4] = r3     // Catch: java.lang.Exception -> Lae
            int r3 = r9.f366672q     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lae
            r4 = 2
            r2[r4] = r3     // Catch: java.lang.Exception -> Lae
            int r3 = r9.f366672q     // Catch: java.lang.Exception -> Lae
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> Lae
            r3 = 3
            r2[r3] = r1     // Catch: java.lang.Exception -> Lae
            com.tencent.mars.xlog.Log.i(r0, r10, r2)     // Catch: java.lang.Exception -> Lae
            goto Lc4
        La7:
            return
        La8:
            java.lang.String r10 = "not support zoom"
            com.tencent.mars.xlog.Log.i(r0, r10)     // Catch: java.lang.Exception -> Lae
            return
        Lae:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "init zoom exception! "
            r1.<init>(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.tencent.mars.xlog.Log.e(r0, r10)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xy3.a.r(boolean):void");
    }

    public boolean s() {
        int i17;
        java.util.List<java.lang.String> supportedFlashModes;
        if (this.f366669n < 0) {
            if (this.f366656a != null && this.f366658c) {
                try {
                    supportedFlashModes = this.f366656a.getParameters().getSupportedFlashModes();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxScanCamera", "isFlashSupported error: " + e17.getMessage());
                }
                if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "camera not support flash!!");
                } else {
                    i17 = 1;
                    this.f366669n = i17;
                }
            }
            i17 = 0;
            this.f366669n = i17;
        }
        return this.f366669n == 1;
    }

    public void t() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", java.lang.String.format("openFlash, camera: %s, isPreviewing: %s", this.f366656a, java.lang.Boolean.valueOf(this.f366658c)));
        if (this.f366656a == null || !this.f366658c) {
            return;
        }
        try {
            this.f366668m = true;
            android.hardware.Camera.Parameters parameters = this.f366656a.getParameters();
            java.util.List<java.lang.String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "camera not support flash!!");
            } else {
                parameters.setFlashMode("torch");
                this.f366656a.setParameters(parameters);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "open flash");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxScanCamera", "openFlash error: " + e17.getMessage());
        }
    }

    public void u() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxScanCamera", "set picture focus");
            android.hardware.Camera.Parameters parameters = this.f366656a.getParameters();
            if (parameters == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxScanCamera", "camera parameters is null");
                return;
            }
            java.util.List<java.lang.String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                supportedFocusModes.size();
                for (java.lang.String str : supportedFocusModes) {
                }
                if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                } else if (supportedFocusModes.contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                }
                this.f366656a.setParameters(parameters);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxScanCamera", "setPictureFocus error: %s", e17.getMessage());
        }
    }
}
