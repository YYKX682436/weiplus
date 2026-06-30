package com.tencent.tav.coremedia;

/* loaded from: classes14.dex */
public class TextureInfo {
    public static boolean enableDebugInfo;
    private static final java.util.ArrayList<com.tencent.tav.coremedia.TextureInfo> textureList = new java.util.ArrayList<>();
    private int format;
    private int frameBuffer;
    public final int height;
    private boolean mixAlpha;
    private boolean needRelease;
    public final int preferRotation;
    private boolean released;
    public int surfaceTextureRotation;
    public float[] surfaceTextureTransform;
    public final int textureID;
    private android.graphics.Matrix textureMatrix;
    private android.graphics.Rect textureRect;
    public final int textureType;
    public final int width;

    public TextureInfo(int i17, int i18, int i19, int i27, int i28) {
        this(i17, i18, i19, i27, null, i28);
    }

    private void addTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (enableDebugInfo) {
            java.util.ArrayList<com.tencent.tav.coremedia.TextureInfo> arrayList = textureList;
            synchronized (arrayList) {
                if (!arrayList.contains(textureInfo)) {
                    arrayList.add(textureInfo);
                }
            }
        }
    }

    public static java.lang.String printTextureInfo() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator<com.tencent.tav.coremedia.TextureInfo> it = textureList.iterator();
        float f17 = 0.0f;
        while (it.hasNext()) {
            com.tencent.tav.coremedia.TextureInfo next = it.next();
            sb6.append("id:" + next.textureID);
            sb6.append(",size:" + next.width + "x" + next.height);
            sb6.append("\n");
            f17 += ((((float) (next.width * next.height)) * 3.0f) / 1024.0f) / 1024.0f;
        }
        return java.lang.String.format("size:%d memory:%d info:%s", java.lang.Integer.valueOf(textureList.size()), java.lang.Integer.valueOf((int) f17), sb6.toString());
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof com.tencent.tav.coremedia.TextureInfo ? ((com.tencent.tav.coremedia.TextureInfo) obj).textureID == this.textureID : super.equals(obj);
    }

    public int getFormat() {
        return this.format;
    }

    public int getFrameBuffer() {
        return this.frameBuffer;
    }

    public int getSurfaceTextureRotation() {
        return this.surfaceTextureRotation;
    }

    public float[] getSurfaceTextureTransform() {
        return this.surfaceTextureTransform;
    }

    public android.graphics.Matrix getTextureMatrix() {
        return this.textureMatrix;
    }

    public android.graphics.Rect getTextureRect() {
        return this.textureRect;
    }

    public boolean isMixAlpha() {
        return this.mixAlpha;
    }

    public boolean isNeedRelease() {
        return this.needRelease;
    }

    public boolean isReleased() {
        return this.released;
    }

    public void release() {
        this.released = true;
        int i17 = this.frameBuffer;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.frameBuffer = -1;
        }
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.textureID}, 0);
        if (enableDebugInfo) {
            java.util.ArrayList<com.tencent.tav.coremedia.TextureInfo> arrayList = textureList;
            synchronized (arrayList) {
                arrayList.remove(this);
            }
        }
    }

    public void setFormat(int i17) {
        this.format = i17;
    }

    public void setFrameBuffer(int i17) {
        this.frameBuffer = i17;
    }

    public void setMixAlpha(boolean z17) {
        this.mixAlpha = z17;
    }

    public void setSurfaceTextureRotation(int i17) {
        this.surfaceTextureRotation = i17;
    }

    public void setSurfaceTextureTransform(float[] fArr) {
        this.surfaceTextureTransform = fArr;
    }

    public void setTextureMatrix(android.graphics.Matrix matrix) {
        this.textureMatrix = matrix;
    }

    public void setTextureRect(android.graphics.Rect rect) {
        this.textureRect = rect;
    }

    public java.lang.String toString() {
        return "TextureInfo{textureID=" + this.textureID + ", textureType=" + this.textureType + ", width=" + this.width + ", height=" + this.height + ", preferRotation=" + this.preferRotation + ", textureMatrix=" + this.textureMatrix + ", frameBuffer=" + this.frameBuffer + ", needRelease=" + this.needRelease + ", mixAlpha=" + this.mixAlpha + ", format=" + this.format + '}';
    }

    public TextureInfo(int i17, int i18, int i19, int i27, android.graphics.Matrix matrix, int i28) {
        this(i17, i18, i19, i27, matrix, i28, null);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tav.coremedia.TextureInfo m415clone() {
        com.tencent.tav.coremedia.TextureInfo textureInfo = new com.tencent.tav.coremedia.TextureInfo(this.textureID, this.textureType, this.width, this.height, this.textureMatrix, this.preferRotation, this.surfaceTextureTransform);
        textureInfo.needRelease = true;
        textureInfo.textureRect = this.textureRect;
        textureInfo.surfaceTextureRotation = this.surfaceTextureRotation;
        return textureInfo;
    }

    public TextureInfo(int i17, int i18, int i19, int i27, android.graphics.Matrix matrix, int i28, float[] fArr) {
        this.frameBuffer = -1;
        this.needRelease = false;
        this.textureRect = null;
        this.mixAlpha = true;
        this.format = com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB;
        this.textureMatrix = matrix;
        this.textureID = i17;
        this.textureType = i18;
        this.width = i19;
        this.height = i27;
        this.preferRotation = i28;
        this.surfaceTextureTransform = fArr;
        addTextureInfo(this);
    }
}
