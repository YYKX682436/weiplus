package iq2;

/* loaded from: classes2.dex */
public final class m implements c50.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dq2.d f293754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293755b;

    public m(dq2.d dVar, iq2.d0 d0Var) {
        this.f293754a = dVar;
        this.f293755b = d0Var;
    }

    @Override // c50.n0
    public void a(so2.j5 feed, org.json.JSONObject jsonObject, int i17) {
        r45.s92 s92Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        cq2.r rVar = cq2.r.f221444a;
        android.content.Context context = this.f293754a.f274242a;
        iq2.d0 d0Var = this.f293755b;
        r45.dk2 dk2Var = d0Var.f293736t;
        rVar.a(context, i17, feed, jsonObject, (dk2Var == null || (s92Var = (r45.s92) dk2Var.getCustom(12)) == null) ? 0 : s92Var.getInteger(0), (r21 & 32) != 0 ? 0 : d0Var.f293719c.f301096b, (r21 & 64) != 0 ? 0 : d0Var.f(), (r21 & 128) != 0);
    }
}
