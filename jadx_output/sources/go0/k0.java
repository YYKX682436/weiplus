package go0;

/* loaded from: classes14.dex */
public final class k0 extends os0.e {
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f273793J;
    public int K;
    public int L;
    public int M;
    public final java.lang.String N;
    public final boolean O;
    public final java.lang.String P;
    public final jz5.g Q;

    public k0(int i17, int i18, int i19, int i27) {
        super(i17, i18, i19, i27, 1, 2);
        this.N = rs0.n.f399306d.e();
        this.O = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_live_render_use_direct, 0) == 1;
        this.P = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_voip_render_use_direct_lists, "QUALCOMM Adreno(TM) 750$QUALCOMM Adreno(TM) 732$QUALCOMM Adreno(TM) 735", true);
        this.Q = jz5.h.b(new go0.j0(this));
    }

    @Override // os0.a
    public void g() {
        if (((java.lang.Boolean) this.Q.getValue()).booleanValue()) {
            android.opengl.GLES20.glEnable(36784);
            android.opengl.GLES20.glHint(36784, 36787);
        }
        if (java.lang.System.currentTimeMillis() - 0 <= 0) {
            float currentTimeMillis = (((float) (java.lang.System.currentTimeMillis() - 0)) * 1.0f) / 0;
            int i17 = this.I;
            float f17 = 0.0f + currentTimeMillis;
            int i18 = (int) (i17 * f17);
            this.f347994c = i18;
            int i19 = this.f273793J;
            int i27 = (int) (i19 * f17);
            this.f347995d = i27;
            if (i18 > i17) {
                this.f347994c = i17;
            }
            if (i27 > i19) {
                this.f347994c = i19;
            }
            this.K = (i17 - this.f347994c) / 2;
            this.L = (i19 - i27) / 2;
        }
        float[] fArr = this.f348003l;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        yz5.l lVar = this.f348004m;
        if (lVar != null) {
            lVar.invoke(fArr);
        }
        android.opengl.Matrix.rotateM(this.f348003l, 0, this.f348005n, 0.0f, 0.0f, -1.0f);
        if (this.f348007p) {
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        if (this.f347997f == 5) {
            i(this.f347994c / this.f347995d, this.f347992a / this.f347993b);
        }
        m();
        v();
        android.opengl.GLES20.glViewport(this.K, this.L, this.f347994c, this.f347995d);
        int i28 = this.M;
        if (i28 > 0) {
            this.M = i28 - 1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cubeBuffer:[");
            java.nio.FloatBuffer floatBuffer = this.f347999h;
            sb6.append(floatBuffer.get(0));
            sb6.append(", ");
            sb6.append(floatBuffer.get(1));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(2));
            sb6.append(", ");
            sb6.append(floatBuffer.get(3));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(4));
            sb6.append(", ");
            sb6.append(floatBuffer.get(5));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(6));
            sb6.append(", ");
            sb6.append(floatBuffer.get(7));
            sb6.append("]\ntextureCoordBuff:[");
            java.nio.FloatBuffer floatBuffer2 = this.f347998g;
            sb6.append(floatBuffer2.get(0));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(1));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(2));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(3));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(4));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(5));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(6));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(7));
            sb6.append("]\n");
            com.tencent.mars.xlog.Log.i("LiveScreenRenderProc", sb6.toString());
        }
    }

    @Override // os0.a
    public void u(int i17, int i18) {
        super.u(i17, i18);
        this.I = i17;
        this.f273793J = i18;
    }
}
