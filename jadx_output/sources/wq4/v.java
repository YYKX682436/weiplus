package wq4;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.OpenGlRender f448694d;

    public v(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender) {
        this.f448694d = openGlRender;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
        com.tencent.mars.xlog.Log.i("OpenGlRender", "onSurfaceDestroyed release renderer");
        ar4.b bVar = this.f448694d.f177063k;
        if (bVar != null) {
            synchronized (bVar) {
                if (bVar.f13400d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FilterRenderer", "%s do destroy", java.lang.Integer.valueOf(bVar.hashCode()));
                    bVar.getClass();
                    os0.e eVar = bVar.f13399c;
                    if (eVar != null) {
                        eVar.n();
                        bVar.f13399c = null;
                    }
                    is0.c[] cVarArr = {null, null, null, null, null};
                    for (int i18 = 0; i18 < 5; i18++) {
                        is0.c cVar = cVarArr[i18];
                        if (cVar != null) {
                            cVar.close();
                        }
                    }
                    android.opengl.GLES20.glDeleteProgram(0);
                    android.opengl.GLES20.glDeleteProgram(0);
                    bVar.getClass();
                    android.opengl.GLES20.glBindTexture(3553, 0);
                    android.opengl.GLES20.glBindFramebuffer(36160, 0);
                    android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    android.opengl.GLES20.glClear(16640);
                    android.opengl.GLES20.glFinish();
                    java.nio.ByteBuffer byteBuffer = bVar.f13397a;
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                    java.nio.ByteBuffer byteBuffer2 = bVar.f13398b;
                    if (byteBuffer2 != null) {
                        byteBuffer2.clear();
                    }
                    bVar.f13397a = null;
                    bVar.f13398b = null;
                    bVar.f13400d = false;
                }
            }
        }
        br4.g gVar = this.f448694d.f177064l;
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipRenderer", "%s do destroy", java.lang.Integer.valueOf(gVar.hashCode()));
            if (gVar.f23722a != null) {
                gVar.f23722a.f();
            }
            if (gVar.f23723b != null) {
                br4.b bVar2 = gVar.f23723b;
                synchronized (bVar2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLHProgram", "%s do destroy", java.lang.Integer.valueOf(bVar2.hashCode()));
                    android.opengl.GLES20.glDeleteProgram(bVar2.f23687a);
                    bVar2.f23687a = -1;
                }
            }
            gVar.f23722a = null;
            gVar.f23723b = null;
        }
        p05.l4 l4Var = this.f448694d.f177065m;
        if (l4Var != null) {
            l4Var.o();
            this.f448694d.f177065m = null;
        }
    }
}
