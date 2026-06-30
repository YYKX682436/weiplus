package dz4;

/* loaded from: classes12.dex */
public final class b0 implements dz4.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f245167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245168b;

    public b0(long j17, dz4.j0 j0Var) {
        this.f245167a = j17;
        this.f245168b = j0Var;
    }

    @Override // dz4.n0
    public void a(java.util.ArrayList arrayList) {
        boolean z17 = arrayList == null || arrayList.isEmpty();
        long j17 = this.f245167a;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openPhotoSelectorAsync: model null, taskId: " + j17);
        } else {
            com.tencent.wechat.aff.wenote.i iVar = this.f245168b.f245310b;
            if (iVar != null) {
                iVar.r0(j17, arrayList);
            }
        }
    }
}
