package org.webrtc;

/* loaded from: classes14.dex */
public class GlRectDrawer extends org.webrtc.GlGenericDrawer {
    private static final java.lang.String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    /* loaded from: classes14.dex */
    public static class ShaderCallbacks implements org.webrtc.GlGenericDrawer.ShaderCallbacks {
        private ShaderCallbacks() {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(org.webrtc.GlShader glShader) {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(org.webrtc.GlShader glShader, float[] fArr, int i17, int i18, int i19, int i27) {
        }
    }

    public GlRectDrawer() {
        super(FRAGMENT_SHADER, new org.webrtc.GlRectDrawer.ShaderCallbacks());
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37) {
        super.drawOes(i17, fArr, i18, i19, i27, i28, i29, i37);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37) {
        super.drawRgb(i17, fArr, i18, i19, i27, i28, i29, i37);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i17, int i18, int i19, int i27, int i28, int i29) {
        super.drawYuv(iArr, fArr, i17, i18, i19, i27, i28, i29);
    }

    @Override // org.webrtc.GlGenericDrawer, org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
