package dz4;

/* loaded from: classes12.dex */
public final class y implements dz4.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f245460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245461b;

    public y(long j17, dz4.j0 j0Var) {
        this.f245460a = j17;
        this.f245461b = j0Var;
    }

    public void a(java.util.ArrayList arrayList) {
        boolean z17 = arrayList == null || arrayList.isEmpty();
        long j17 = this.f245460a;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openFileSelectorAsync: model null, taskId: " + j17);
        } else {
            com.tencent.wechat.aff.wenote.i iVar = this.f245461b.f245310b;
            if (iVar != null) {
                iVar.D1(j17, arrayList);
            }
        }
    }
}
