package dz4;

/* loaded from: classes12.dex */
public final class i0 implements dz4.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f245302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245303b;

    public i0(long j17, dz4.j0 j0Var) {
        this.f245302a = j17;
        this.f245303b = j0Var;
    }

    @Override // dz4.n0
    public void a(java.util.ArrayList arrayList) {
        boolean z17 = arrayList == null || arrayList.isEmpty();
        long j17 = this.f245302a;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "takePhotoAsync: model null, taskId: " + j17);
        } else {
            com.tencent.wechat.aff.wenote.i iVar = this.f245303b.f245310b;
            if (iVar != null) {
                iVar.J0(j17, (com.tencent.wechat.aff.favorites.j) kz5.n0.X(arrayList));
            }
        }
    }
}
