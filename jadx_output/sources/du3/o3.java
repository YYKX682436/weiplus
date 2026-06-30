package du3;

/* loaded from: classes3.dex */
public final class o3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243673d;

    public o3(du3.t3 t3Var) {
        this.f243673d = t3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        l45.q qVar;
        hk0.o oVar = (hk0.o) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "FUNC_CROP >> " + oVar.f281783b);
        if (!oVar.f281783b || (qVar = this.f243673d.f243726p) == null) {
            return;
        }
        new l45.a((l45.n) qVar).a(qk.g6.CROP_PHOTO);
    }
}
