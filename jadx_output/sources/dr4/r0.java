package dr4;

/* loaded from: classes14.dex */
public final class r0 extends dr4.r1 {
    public boolean Q;
    public cr4.b R;
    public cr4.b S;

    public r0(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, int i37, kotlin.jvm.internal.i iVar) {
        super(i17, i18, (i37 & 4) != 0 ? i17 : i19, (i37 & 8) != 0 ? i18 : i27, (i37 & 16) != 0 ? 1 : i28, (i37 & 32) != 0 ? 2 : i29);
        this.Q = z17;
        G();
    }

    @Override // dr4.r1
    public android.util.Size A() {
        int i17 = this.f348005n;
        return (i17 == 0 || i17 == 180) ? new android.util.Size(this.f347992a, this.f347993b) : new android.util.Size(this.f347993b, this.f347992a);
    }

    @Override // dr4.r1
    public void F(boolean z17) {
        if (this.Q != z17) {
            this.Q = z17;
            G();
        }
    }

    public final void G() {
        if (this.Q) {
            if (this.R == null) {
                this.R = new cr4.b(true);
            }
        } else if (this.S == null) {
            this.S = new cr4.b(false);
        }
    }

    @Override // dr4.r1, os0.a
    public void n() {
        cr4.b bVar = this.R;
        if (bVar != null) {
            android.opengl.GLES20.glDeleteProgram(bVar.f221985b);
        }
        cr4.b bVar2 = this.S;
        if (bVar2 != null) {
            android.opengl.GLES20.glDeleteProgram(bVar2.f221985b);
        }
        super.n();
    }

    @Override // dr4.r1, os0.a
    public void p() {
        super.p();
        boolean z17 = this.Q;
        float[] fArr = this.f348003l;
        java.nio.FloatBuffer floatBuffer = this.f347998g;
        java.nio.FloatBuffer floatBuffer2 = this.f347999h;
        if (z17) {
            cr4.b bVar = this.R;
            if (bVar != null) {
                bVar.a(floatBuffer2, floatBuffer, this.C, fArr);
                return;
            }
            return;
        }
        cr4.b bVar2 = this.S;
        if (bVar2 != null) {
            bVar2.a(floatBuffer2, floatBuffer, this.C, fArr);
        }
    }
}
