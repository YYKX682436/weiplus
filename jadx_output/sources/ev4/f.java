package ev4;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev4.j f256946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f256947e;

    public f(ev4.j jVar, android.os.Bundle bundle) {
        this.f256946d = jVar;
        this.f256947e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tg0.c2 c2Var;
        tg0.y1 y1Var;
        ev4.d dVar = this.f256946d.f256953a.f267012f;
        if (dVar != null) {
            android.os.Bundle res = this.f256947e;
            kotlin.jvm.internal.o.g(res, "res");
            java.lang.String string = res.getString("fts_key_req_id");
            java.lang.String string2 = res.getString("fts_key_json_data");
            boolean z17 = res.getBoolean("fts_key_new_query", true);
            fv4.i iVar = dVar.f256944b;
            if (iVar == null || (c2Var = iVar.f267009c) == null || (y1Var = c2Var.f419052g) == null) {
                return;
            }
            if (string2 == null) {
                string2 = "";
            }
            if (string == null) {
                string = "";
            }
            ((ch0.n) y1Var).f41243a.b0(string2, z17, string);
        }
    }
}
