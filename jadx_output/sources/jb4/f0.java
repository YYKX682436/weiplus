package jb4;

/* loaded from: classes4.dex */
public abstract class f0 {
    public static int a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        int glCreateShader = android.opengl.GLES20.glCreateShader(35632);
        int glCreateShader2 = android.opengl.GLES20.glCreateShader(35633);
        android.opengl.GLES20.glShaderSource(glCreateShader2, "attribute vec4 aPosition;attribute vec2 aTextureCoord;uniform mat4 uProjectMatrix;varying vec2 vTextureCoord;void main(){gl_Position = uProjectMatrix * aPosition;\nvTextureCoord = aTextureCoord;\n}");
        android.opengl.GLES20.glShaderSource(glCreateShader, "precision mediump float;varying vec2 vTextureCoord;uniform sampler2D uTexture;void main(){gl_FragColor = texture2D(uTexture, vTextureCoord);}");
        android.opengl.GLES20.glCompileShader(glCreateShader2);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        return glCreateProgram;
    }

    public static int b(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.i("SphereImageView.Utils", "initTexture, bmp==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return 0;
        }
        com.tencent.mars.xlog.Log.i("SphereImageView.Utils", "initTexture, bmp.w=" + bitmap.getWidth() + ", bmp.h=" + bitmap.getHeight());
        try {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            int i17 = iArr[0];
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9728.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9728.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return i17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SphereImageView.Utils", "initTexture exp:" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return 0;
        }
    }
}
