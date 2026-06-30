package nn0;

/* loaded from: classes10.dex */
public class c extends mn0.y {
    public int Y;
    public final boolean Z;

    public c(android.content.Context context, int i17, boolean z17) {
        super(context.getApplicationContext());
        this.Z = false;
        this.U = true;
        this.Z = z17;
        this.Y = i17;
        this.H = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int X(boolean r27) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn0.c.X(boolean):int");
    }

    @Override // mn0.y, mn0.b0
    public void A(int i17, int i18) {
        nn0.o oVar = ((nn0.i) p()).f338584b;
        if (oVar != null) {
            oVar.u(i17, i18);
        }
    }

    @Override // mn0.y, mn0.b0
    public void I(java.lang.String str) {
        super.I(str);
    }

    public nn0.a W() {
        nn0.o oVar = ((nn0.i) p()).f338584b;
        if (oVar != null) {
            return oVar.pg();
        }
        return null;
    }

    public void Y(android.graphics.RectF rectF) {
        nn0.o oVar = ((nn0.i) p()).f338584b;
        if (oVar != null) {
            oVar.he(rectF);
        }
    }

    @Override // mn0.y, mn0.b0
    public void callExperimentalAPI(java.lang.String str) {
        super.callExperimentalAPI(str);
    }

    @Override // mn0.y
    public com.tencent.rtmp.TXLivePlayer e(android.content.Context context) {
        return this.Z ? new nn0.x(context, this.U, this.Y, this) : new nn0.n(context, this.U, this.Y);
    }

    @Override // mn0.y, mn0.b0
    public void v(android.view.Surface surface, int i17, int i18) {
        nn0.o oVar = ((nn0.i) p()).f338584b;
        if (oVar != null) {
            oVar.v(surface, i17, i18);
        }
    }

    @Override // mn0.y, mn0.b0
    public void z(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18) {
        nn0.o oVar = ((nn0.i) p()).f338584b;
        if (oVar != null) {
            oVar.z(tXCloudVideoView, i17, i18);
        }
    }
}
