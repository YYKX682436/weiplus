package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes14.dex */
public class YtCameraSetting {
    private static final java.lang.String TAG = "YtCameraSetting";
    public static int mCameraFacing = 1;
    static int mDesiredPreviewHeight = 480;
    static int mDesiredPreviewWidth = 640;
    public static int mRotate;

    private static int chooseFixedPreviewFps(android.hardware.Camera.Parameters parameters, int i17) {
        int parseInt;
        java.util.Iterator<int[]> it = parameters.getSupportedPreviewFpsRange().iterator();
        while (true) {
            if (!it.hasNext()) {
                int[] iArr = new int[2];
                parameters.getPreviewFpsRange(iArr);
                int i18 = iArr[0];
                int i19 = iArr[1];
                if (i18 != i19) {
                    if (i17 > i19) {
                        i17 = i19;
                    }
                    if (i17 >= i18) {
                        i18 = i17;
                    }
                }
                java.lang.String str = parameters.get("preview-frame-rate-values");
                if (!android.text.TextUtils.isEmpty(str)) {
                    if (!str.contains("" + (i18 / 1000))) {
                        java.lang.String[] split = str.split(",");
                        for (java.lang.String str2 : split) {
                            int parseInt2 = java.lang.Integer.parseInt(str2) * 1000;
                            if (i18 < parseInt2) {
                                parameters.setPreviewFrameRate(parseInt2 / 1000);
                                return parseInt2;
                            }
                        }
                        if (split.length > 0 && i18 > (parseInt = java.lang.Integer.parseInt(split[split.length - 1]) * 1000)) {
                            i18 = parseInt;
                        }
                    }
                }
                parameters.setPreviewFrameRate(i18 / 1000);
                return i18;
            }
            int[] next = it.next();
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "entry: " + next[0] + " - " + next[1]);
            int i27 = next[0];
            int i28 = next[1];
            if (i27 == i28 && i27 == i17) {
                parameters.setPreviewFpsRange(i27, i28);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "use preview fps range: " + next[0] + " " + next[1]);
                return next[0];
            }
        }
    }

    public static int getDesiredPreviewHeight() {
        return mDesiredPreviewHeight;
    }

    public static int getDesiredPreviewWidth() {
        return mDesiredPreviewWidth;
    }

    private static android.hardware.Camera.Size getOptimalPreviewSize(java.util.List<android.hardware.Camera.Size> list, int i17, int i18) {
        android.hardware.Camera.Size size = null;
        if (list == null) {
            return null;
        }
        int max = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        double d17 = max / min;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "sizes size=" + list.size());
        double d18 = Double.MAX_VALUE;
        double d19 = Double.MAX_VALUE;
        for (android.hardware.Camera.Size size2 : list) {
            if (java.lang.Math.abs((size2.width / size2.height) - d17) <= 0.001d && java.lang.Math.abs(size2.height - min) < d19) {
                d19 = java.lang.Math.abs(size2.height - min);
                size = size2;
            }
        }
        if (size == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "No preview size match the aspect ratio");
            for (android.hardware.Camera.Size size3 : list) {
                if (java.lang.Math.abs(size3.height - min) < d18) {
                    d18 = java.lang.Math.abs(size3.height - min);
                    size = size3;
                }
            }
        }
        return size;
    }

    public static int getRotate(android.content.Context context, int i17, int i18) {
        return getRotateTag(getVideoRotate(context, i17), i18);
    }

    public static int getRotateTag(int i17, int i18) {
        int i19;
        if (i17 == 90) {
            i19 = 7;
        } else if (i17 == 180) {
            i19 = 3;
        } else if (i17 == 270) {
            i19 = 5;
        } else {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "camera rotate not 90degree or 180degree, input: " + i17);
            i19 = 1;
        }
        return i18 == 1 ? i19 : transBackFacingCameraRatateTag(i19);
    }

    public static int getVideoRotate(android.content.Context context, int i17) {
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        android.hardware.Camera.getCameraInfo(i17, cameraInfo);
        int rotation = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i18 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i18 = 90;
            } else if (rotation == 2) {
                i18 = 180;
            } else if (rotation == 3) {
                i18 = 270;
            }
        }
        int i19 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i18) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1)) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 : ((cameraInfo.orientation - i18) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "debug camera orientation is " + cameraInfo.orientation + " ui degrees is " + i18);
        return i19;
    }

    public static int initCamera(android.content.Context context, android.hardware.Camera camera, int i17) {
        initCamera(context, camera, i17, 4);
        return 0;
    }

    public static void setCameraFacing(int i17) {
        mCameraFacing = i17;
    }

    public static void setCameraRotate(int i17) {
        mRotate = i17;
    }

    public static void setVideoSize(android.hardware.Camera.Parameters parameters, android.media.CamcorderProfile camcorderProfile) {
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (parameters.getSupportedVideoSizes() == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "video size from profile is : " + camcorderProfile.videoFrameWidth + " " + camcorderProfile.videoFrameHeight);
            if (getOptimalPreviewSize(supportedPreviewSizes, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) == null) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "do not find proper preview size, use default");
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        java.util.List<android.hardware.Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            boolean z17 = false;
            for (int i17 = 0; i17 < supportedVideoSizes.size(); i17++) {
                android.hardware.Camera.Size size = supportedVideoSizes.get(i17);
                if (size.width == camcorderProfile.videoFrameWidth && size.height == camcorderProfile.videoFrameHeight) {
                    z17 = true;
                }
            }
            if (!z17) {
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "select video size camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
    }

    public static int transBackFacingCameraRatateTag(int i17) {
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 2) {
            return 1;
        }
        if (i17 == 3) {
            return 4;
        }
        if (i17 == 4) {
            return 3;
        }
        if (i17 == 5) {
            return 8;
        }
        if (i17 == 6) {
            return 7;
        }
        if (i17 == 7) {
            return 6;
        }
        if (i17 == 8) {
            return 5;
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.w(TAG, "[YtCameraSetting.transBackFacingCameraRatateTag] unsurported rotateTag: " + i17);
        return 0;
    }

    /* JADX WARN: Finally extract failed */
    public static int initCamera(android.content.Context context, android.hardware.Camera camera, int i17, int i18) {
        android.media.CamcorderProfile camcorderProfile;
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            java.util.List<java.lang.String> supportedFocusModes = parameters.getSupportedFocusModes();
            for (int i19 = 0; i19 < supportedFocusModes.size(); i19++) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "suporrtedFocusModes " + i19 + " :" + supportedFocusModes.get(i19));
            }
            if (supportedFocusModes.indexOf("continuous-video") >= 0) {
                parameters.setFocusMode("continuous-video");
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "set camera focus mode continuous video");
            } else if (supportedFocusModes.indexOf("auto") >= 0) {
                parameters.setFocusMode("auto");
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "set camera focus mode auto");
            } else {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "NOT set camera focus mode");
            }
            try {
                try {
                    camera.setParameters(parameters);
                } catch (java.lang.Throwable th6) {
                    camera.getParameters();
                    throw th6;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Camera.setParameters.setPreviewSize failed!!: " + e17.getLocalizedMessage());
            }
            android.hardware.Camera.Parameters parameters2 = camera.getParameters();
            int videoRotate = getVideoRotate(context, i17);
            camera.setDisplayOrientation(videoRotate);
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "videoOrietation is" + videoRotate);
            if (android.media.CamcorderProfile.hasProfile(i17, i18)) {
                camcorderProfile = android.media.CamcorderProfile.get(i17, i18);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "custom camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
            } else if (android.media.CamcorderProfile.hasProfile(i17, 4)) {
                camcorderProfile = android.media.CamcorderProfile.get(i17, 4);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "480P camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
            } else if (android.media.CamcorderProfile.hasProfile(i17, 5)) {
                camcorderProfile = android.media.CamcorderProfile.get(i17, 5);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "720P camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
            } else {
                camcorderProfile = android.media.CamcorderProfile.get(i17, 1);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "High camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
            }
            java.util.List<android.hardware.Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
            java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            for (int i27 = 0; i27 < supportedPictureSizes.size(); i27++) {
                android.hardware.Camera.Size size = supportedPictureSizes.get(i27);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i("pictureSize", size.width + " x " + size.height);
            }
            for (int i28 = 0; i28 < supportedPreviewSizes.size(); i28++) {
                android.hardware.Camera.Size size2 = supportedPreviewSizes.get(i28);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i("previewSize", size2.width + " x " + size2.height);
            }
            setVideoSize(parameters2, camcorderProfile);
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "mDesiredPreviewWidth: " + mDesiredPreviewWidth + ", mDesiredPreviewHeight: " + mDesiredPreviewHeight);
            parameters2.setPreviewSize(mDesiredPreviewWidth, mDesiredPreviewHeight);
            parameters2.setPreviewFormat(17);
            try {
                camera.setParameters(parameters2);
            } catch (java.lang.Exception e18) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Camera.setParameters.setPreviewSize failed!!: " + e18.getLocalizedMessage());
            }
            android.hardware.Camera.Parameters parameters3 = camera.getParameters();
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "choose camera fps is : " + chooseFixedPreviewFps(parameters3, 30000));
            try {
                camera.setParameters(parameters3);
            } catch (java.lang.Exception e19) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Camera.setParameters.preview fps failed!!: " + e19.getLocalizedMessage());
            }
            android.hardware.Camera.Parameters parameters4 = camera.getParameters();
            int[] iArr = new int[2];
            parameters4.getPreviewFpsRange(iArr);
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "after set parameters getPreviewFpsRange=" + iArr[0] + "-" + iArr[1] + " ;after set parameter fps=" + parameters4.getPreviewFrameRate());
            android.hardware.Camera.Size previewSize = parameters4.getPreviewSize();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("camera preview size is ");
            sb6.append(previewSize.width);
            sb6.append(" ");
            sb6.append(previewSize.height);
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, sb6.toString());
            return 0;
        } catch (java.lang.Exception unused) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "get camera parameters failed. 1. Check Camera.getParameters() interface. 2. Get logs for more detail.");
            return 1;
        }
    }
}
