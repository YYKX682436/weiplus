package ut2;

/* loaded from: classes15.dex */
public final class e3 implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f430868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f430869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk2.e f430870c;

    public e3(kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.c0 c0Var, gk2.e eVar) {
        this.f430868a = g0Var;
        this.f430869b = c0Var;
        this.f430870c = eVar;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        kotlin.jvm.internal.g0 g0Var = this.f430868a;
        if (g0Var.f310121d != -1) {
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt(0);
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt(0);
            ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(e42.c0.clicfg_finder_live_shelf_img_wxam_android, pInt, pInt2);
            y02.v0 a17 = y02.x0.f458634d.a();
            if (a17 != null) {
                bw5.d5 d5Var = bw5.d5.EcsLiveShelfImgLoadResult;
                boolean z17 = this.f430869b.f310112d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"totalTime\":");
                sb6.append(c01.id.c() - g0Var.f310121d);
                sb6.append(", \"size\":");
                sb6.append(eVar != null ? eVar.f282911c : 0);
                sb6.append(", \"liveId\":");
                sb6.append(pm0.v.u(((mm2.e1) this.f430870c.a(mm2.e1.class)).f328988r.getLong(0)));
                sb6.append(", \"groupId\": ");
                sb6.append(pInt2);
                sb6.append('}');
                a17.bb(d5Var, z17 ? 1 : 0, sb6.toString(), bw5.e5.SampleRate_OnePercent);
            }
        }
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
        this.f430868a.f310121d = c01.id.c();
    }
}
