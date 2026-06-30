package dz4;

/* loaded from: classes11.dex */
public final class z implements dz4.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f245472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245473b;

    public z(long j17, dz4.j0 j0Var) {
        this.f245472a = j17;
        this.f245473b = j0Var;
    }

    public void a(dz4.e eVar) {
        long j17 = this.f245472a;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openLocationSelectorAsync: model null, taskId: " + j17);
            return;
        }
        com.tencent.wechat.aff.favorites.f fVar = new com.tencent.wechat.aff.favorites.f();
        fVar.f216759d = (float) eVar.f245212e;
        boolean[] zArr = fVar.f216765m;
        zArr[1] = true;
        fVar.f216760e = (float) eVar.f245213f;
        zArr[2] = true;
        fVar.f216761f = (int) eVar.f245214g;
        zArr[3] = true;
        fVar.f216762g = eVar.f245215h;
        zArr[4] = true;
        fVar.f216763h = eVar.f245210c;
        zArr[5] = true;
        fVar.f216764i = eVar.f245216i;
        zArr[6] = true;
        com.tencent.wechat.aff.wenote.i iVar = this.f245473b.f245310b;
        if (iVar != null) {
            iVar.U0(j17, fVar);
        }
    }
}
