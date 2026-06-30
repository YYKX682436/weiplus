package yq4;

/* loaded from: classes14.dex */
public class a implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq4.b f464559d;

    public a(yq4.b bVar) {
        this.f464559d = bVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        int i17;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "onPreviewFrame");
        yq4.b bVar = this.f464559d;
        if (bArr == null || bArr.length <= 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(159L, 0L, 1L, false);
            g0Var.idkeyStat(159L, 3L, 1L, false);
            xq4.d dVar = bVar.f464573t;
            if (dVar != null) {
                dVar.o();
                return;
            }
            return;
        }
        if (bVar.f464565i == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "onPreviewFrame mSize is null");
            return;
        }
        if (bVar.f464573t != null) {
            byte[] bArr2 = bVar.A;
            if (bArr2 == null || bArr2.length != bArr.length) {
                bVar.A = new byte[bArr.length];
            }
            boolean z18 = false;
            java.lang.System.arraycopy(bArr, 0, bVar.A, 0, bArr.length);
            if (bVar.f464560d) {
                i17 = xq4.e.f456116d;
                wo.e eVar = wo.v1.f447822b;
                if (eVar.f447665j) {
                    wo.d dVar2 = eVar.f447664i;
                    if (dVar2.f447646d != 0) {
                        int i18 = dVar2.f447647e;
                        z17 = true;
                    }
                }
                z17 = false;
            } else {
                i17 = xq4.e.f456117e;
                wo.e eVar2 = wo.v1.f447822b;
                if (eVar2.f447667l) {
                    wo.d dVar3 = eVar2.f447666k;
                    if (dVar3.f447646d != 0) {
                        int i19 = dVar3.f447647e;
                        z17 = true;
                    }
                }
                z17 = false;
            }
            int i27 = i17 > 0 ? 32 : 0;
            if (!z17 && i17 > 0) {
                z18 = true;
            }
            bVar.f464561e = z18;
            wo.q1 q1Var = bVar.f464565i;
            int i28 = q1Var.f447790a;
            int i29 = q1Var.f447791b;
            if (z17) {
                bVar.getClass();
            }
            xq4.d dVar4 = bVar.f464573t;
            byte[] bArr3 = bVar.A;
            long length = bArr3.length;
            wo.q1 q1Var2 = bVar.f464565i;
            dVar4.v(bArr3, length, q1Var2.f447790a, q1Var2.f447791b, bVar.f464566m, i27, 0.0d);
            r45.n27 n27Var = vq4.p0.f439374a;
            wo.d1 d1Var = bVar.f464563g;
            if (d1Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "the camera is null and has been release");
            } else if (d1Var != null) {
                d1Var.a(bArr);
            }
        }
    }
}
