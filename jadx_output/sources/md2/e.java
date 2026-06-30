package md2;

/* loaded from: classes2.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f325837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md2.f f325840d;

    public e(android.app.Activity activity, yz5.l lVar, java.lang.String str, md2.f fVar) {
        this.f325837a = activity;
        this.f325838b = lVar;
        this.f325839c = str;
        this.f325840d = fVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        yz5.l lVar = this.f325838b;
        if (i17 == 0 && fVar.f70615a == 0) {
            ya2.b2 b17 = ya2.h.f460484a.b(this.f325839c);
            com.tencent.mm.protocal.protobuf.FinderContact i18 = b17 != null ? ya2.d.i(b17) : null;
            if (i18 == null) {
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
            } else {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                ml2.l1 l1Var = ml2.l1.f327690q;
                y4Var.getClass();
                y4Var.f328295e0 = l1Var;
                i95.m c17 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                android.app.Activity activity = this.f325837a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
                c61.ub.A3((c61.ub) c17, activity, intent, i18, 0, false, java.lang.Boolean.valueOf(((mm2.c1) this.f325840d.f325841d.a(mm2.c1.class)).a8()), null, true, (r45.j01) fVar.f70618d, new md2.d(lVar), 80, null);
            }
        } else {
            db5.t7.makeText(this.f325837a, com.tencent.mm.R.string.msg_net_error, 0).show();
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
        }
        return jz5.f0.f302826a;
    }
}
