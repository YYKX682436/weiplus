package com.tencent.rtmp.video;

/* loaded from: classes6.dex */
public class TXScreenCapture {

    /* loaded from: classes13.dex */
    public static class TXScreenCaptureAssistantActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {
        private static final int REQUEST_CODE = 100;
        private static final java.lang.String TAG = "TXScreenCaptureAssistantActivity";
        private android.media.projection.MediaProjectionManager mMediaProjectionManager;

        private void createOnePixelActivity() {
            android.view.Window window = getWindow();
            window.setGravity(8388659);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = 0;
            attributes.height = 1;
            attributes.width = 1;
            window.setAttributes(attributes);
        }

        @Override // android.app.Activity
        public void onActivityResult(int i17, int i18, android.content.Intent intent) {
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "onActivityResult " + this + ", resultCode:" + i18 + ", data:" + intent);
            android.media.projection.MediaProjection mediaProjection = null;
            if (intent == null) {
                com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(this).a((android.media.projection.MediaProjection) null);
                finish();
                return;
            }
            if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 26) {
                com.tencent.liteav.base.util.LiteavLog.i(TAG, "startForegroundService");
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.rtmp.video.ScreenCaptureService.class);
                intent2.putExtra("code", i18);
                intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, intent);
                startForegroundService(intent2);
            } else {
                try {
                    mediaProjection = this.mMediaProjectionManager.getMediaProjection(i18, intent);
                } catch (java.lang.Throwable th6) {
                    com.tencent.liteav.base.util.LiteavLog.e(TAG, "onActivityResult mMediaProjectionManager.getMediaProjection fail.", th6);
                }
                com.tencent.liteav.base.util.LiteavLog.i(TAG, "ProjectionManger get mediaProjection:".concat(java.lang.String.valueOf(mediaProjection)));
                com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(this).a(mediaProjection);
            }
            finish();
        }

        @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "onCreate ".concat(java.lang.String.valueOf(this)));
            requestWindowFeature(1);
            createOnePixelActivity();
            android.media.projection.MediaProjectionManager mediaProjectionManager = (android.media.projection.MediaProjectionManager) getSystemService("media_projection");
            this.mMediaProjectionManager = mediaProjectionManager;
            try {
                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 100);
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "Start permission activity failed. ".concat(java.lang.String.valueOf(th6)));
                com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(this).a((android.media.projection.MediaProjection) null);
                finish();
            }
        }

        @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
        public void onDestroy() {
            super.onDestroy();
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "onDestroy ".concat(java.lang.String.valueOf(this)));
        }
    }
}
