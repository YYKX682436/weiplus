package gm0;

/* loaded from: classes12.dex */
public final /* synthetic */ class b0$$b implements l75.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm0.b0 f273167a;

    public /* synthetic */ b0$$b(gm0.b0 b0Var) {
        this.f273167a = b0Var;
    }

    public final void a() {
        com.tencent.mm.storage.cb cbVar = this.f273167a.f273156i;
        if (cbVar != null) {
            cbVar.f193825d.A("TablesVersion", "delete from TablesVersion");
        } else {
            com.tencent.mars.xlog.Log.e("MMKernel.CoreStorage", "tablesVersionStorage is null");
        }
    }
}
