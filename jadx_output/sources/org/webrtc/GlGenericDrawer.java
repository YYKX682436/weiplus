package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class GlGenericDrawer implements org.webrtc.RendererCommon.GlDrawer {
    private static final java.lang.String DEFAULT_VERTEX_SHADER_STRING = "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private static final java.nio.FloatBuffer FULL_RECTANGLE_BUFFER = org.webrtc.GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final java.nio.FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = org.webrtc.GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private static final java.lang.String INPUT_TEXTURE_COORDINATE_NAME = "in_tc";
    private static final java.lang.String INPUT_VERTEX_COORDINATE_NAME = "in_pos";
    private static final java.lang.String TEXTURE_MATRIX_NAME = "tex_mat";
    private org.webrtc.GlShader currentShader;
    private org.webrtc.GlGenericDrawer.ShaderType currentShaderType;
    private final java.lang.String genericFragmentSource;
    private int inPosLocation;
    private int inTcLocation;
    private final org.webrtc.GlGenericDrawer.ShaderCallbacks shaderCallbacks;
    private int texMatrixLocation;
    private final java.lang.String vertexShader;

    /* loaded from: classes14.dex */
    public interface ShaderCallbacks {
        void onNewShader(org.webrtc.GlShader glShader);

        void onPrepareShader(org.webrtc.GlShader glShader, float[] fArr, int i17, int i18, int i19, int i27);
    }

    /* loaded from: classes14.dex */
    public enum ShaderType {
        OES,
        RGB,
        YUV
    }

    public GlGenericDrawer(java.lang.String str, org.webrtc.GlGenericDrawer.ShaderCallbacks shaderCallbacks) {
        this(DEFAULT_VERTEX_SHADER_STRING, str, shaderCallbacks);
    }

    public static java.lang.String createFragmentShaderString(java.lang.String str, org.webrtc.GlGenericDrawer.ShaderType shaderType) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        org.webrtc.GlGenericDrawer.ShaderType shaderType2 = org.webrtc.GlGenericDrawer.ShaderType.OES;
        if (shaderType == shaderType2) {
            sb6.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb6.append("precision mediump float;\nvarying vec2 tc;\n");
        if (shaderType == org.webrtc.GlGenericDrawer.ShaderType.YUV) {
            sb6.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nvec4 sample(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
            sb6.append(str);
        } else {
            java.lang.String str2 = shaderType == shaderType2 ? "samplerExternalOES" : "sampler2D";
            sb6.append("uniform ");
            sb6.append(str2);
            sb6.append(" tex;\n");
            sb6.append(str.replace("sample(", "texture2D(tex, "));
        }
        return sb6.toString();
    }

    private void prepareShader(org.webrtc.GlGenericDrawer.ShaderType shaderType, float[] fArr, int i17, int i18, int i19, int i27) {
        org.webrtc.GlShader glShader;
        if (shaderType.equals(this.currentShaderType)) {
            glShader = this.currentShader;
        } else {
            this.currentShaderType = null;
            org.webrtc.GlShader glShader2 = this.currentShader;
            if (glShader2 != null) {
                glShader2.release();
                this.currentShader = null;
            }
            org.webrtc.GlShader createShader = createShader(shaderType);
            this.currentShaderType = shaderType;
            this.currentShader = createShader;
            createShader.useProgram();
            if (shaderType == org.webrtc.GlGenericDrawer.ShaderType.YUV) {
                android.opengl.GLES20.glUniform1i(createShader.getUniformLocation("y_tex"), 0);
                android.opengl.GLES20.glUniform1i(createShader.getUniformLocation("u_tex"), 1);
                android.opengl.GLES20.glUniform1i(createShader.getUniformLocation("v_tex"), 2);
            } else {
                android.opengl.GLES20.glUniform1i(createShader.getUniformLocation("tex"), 0);
            }
            org.webrtc.GlUtil.checkNoGLES2Error("Create shader");
            this.shaderCallbacks.onNewShader(createShader);
            this.texMatrixLocation = createShader.getUniformLocation(TEXTURE_MATRIX_NAME);
            this.inPosLocation = createShader.getAttribLocation(INPUT_VERTEX_COORDINATE_NAME);
            this.inTcLocation = createShader.getAttribLocation(INPUT_TEXTURE_COORDINATE_NAME);
            glShader = createShader;
        }
        glShader.useProgram();
        android.opengl.GLES20.glEnableVertexAttribArray(this.inPosLocation);
        android.opengl.GLES20.glVertexAttribPointer(this.inPosLocation, 2, 5126, false, 0, (java.nio.Buffer) FULL_RECTANGLE_BUFFER);
        android.opengl.GLES20.glEnableVertexAttribArray(this.inTcLocation);
        android.opengl.GLES20.glVertexAttribPointer(this.inTcLocation, 2, 5126, false, 0, (java.nio.Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        android.opengl.GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        this.shaderCallbacks.onPrepareShader(glShader, fArr, i17, i18, i19, i27);
        org.webrtc.GlUtil.checkNoGLES2Error("Prepare shader");
    }

    public org.webrtc.GlShader createShader(org.webrtc.GlGenericDrawer.ShaderType shaderType) {
        return new org.webrtc.GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, shaderType));
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawOes(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37) {
        prepareShader(org.webrtc.GlGenericDrawer.ShaderType.OES, fArr, i18, i19, i29, i37);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, i17);
        android.opengl.GLES20.glViewport(i27, i28, i29, i37);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37) {
        prepareShader(org.webrtc.GlGenericDrawer.ShaderType.RGB, fArr, i18, i19, i29, i37);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES20.glViewport(i27, i28, i29, i37);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i17, int i18, int i19, int i27, int i28, int i29) {
        prepareShader(org.webrtc.GlGenericDrawer.ShaderType.YUV, fArr, i17, i18, i28, i29);
        for (int i37 = 0; i37 < 3; i37++) {
            android.opengl.GLES20.glActiveTexture(33984 + i37);
            android.opengl.GLES20.glBindTexture(3553, iArr[i37]);
        }
        android.opengl.GLES20.glViewport(i19, i27, i28, i29);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        for (int i38 = 0; i38 < 3; i38++) {
            android.opengl.GLES20.glActiveTexture(i38 + 33984);
            android.opengl.GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void release() {
        org.webrtc.GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }

    public GlGenericDrawer(java.lang.String str, java.lang.String str2, org.webrtc.GlGenericDrawer.ShaderCallbacks shaderCallbacks) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
    }
}
