package dz4;

/* loaded from: classes12.dex */
public final class p implements dz4.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f245368b;

    public p(dz4.j0 j0Var, long j17) {
        this.f245367a = j0Var;
        this.f245368b = j17;
    }

    public void a(com.tencent.wechat.aff.favorites.n resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.wechat.aff.wenote.i iVar = this.f245367a.f245310b;
        if (iVar != null) {
            iVar.t1(this.f245368b, resp);
        }
    }
}
