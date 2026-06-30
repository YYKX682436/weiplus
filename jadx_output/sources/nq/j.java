package nq;

/* loaded from: classes8.dex */
public abstract class j implements nq.n {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f338882a;

    public j(com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView, int[] iArr) {
        int i17 = gameGLSurfaceView.f64890q;
        if (i17 == 2 || i17 == 3) {
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i18 = length - 1;
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i18);
            iArr2[i18] = 12352;
            if (gameGLSurfaceView.f64890q == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            iArr = iArr2;
        }
        this.f338882a = iArr;
    }
}
