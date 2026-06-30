package u85;

/* loaded from: classes10.dex */
public final class m implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u85.n f425717d;

    public m(u85.n nVar) {
        this.f425717d = nVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        u85.n nVar = this.f425717d;
        com.tencent.mars.xlog.Log.i(nVar.f425718h, "result: ");
        nVar.e(((android.os.Bundle) obj).getBoolean("task_result"));
    }
}
