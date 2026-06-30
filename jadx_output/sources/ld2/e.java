package ld2;

/* loaded from: classes3.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f318086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f318088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml2.l1 f318089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f318090e;

    public e(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, yz5.p pVar, ml2.l1 l1Var, gk2.e eVar) {
        this.f318086a = mMActivity;
        this.f318087b = str;
        this.f318088c = pVar;
        this.f318089d = l1Var;
        this.f318090e = eVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70616b == 0 && fVar.f70615a == 0) {
            ya2.b2 b17 = ya2.h.f460484a.b(this.f318087b);
            com.tencent.mm.protocal.protobuf.FinderContact i17 = b17 != null ? ya2.d.i(b17) : null;
            yz5.p pVar = this.f318088c;
            if (i17 == null) {
                pVar.invoke(com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction.NONE, null);
            } else {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                y4Var.getClass();
                ml2.l1 l1Var = this.f318089d;
                kotlin.jvm.internal.o.g(l1Var, "<set-?>");
                y4Var.f328295e0 = l1Var;
                i95.m c17 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.ui.MMActivity mMActivity = this.f318086a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
                c61.ub.A3((c61.ub) c17, mMActivity, intent, i17, 0, false, java.lang.Boolean.valueOf(((mm2.c1) this.f318090e.a(mm2.c1.class)).a8()), null, true, (r45.j01) fVar.f70618d, new ld2.d(pVar), 80, null);
            }
        } else {
            db5.t7.makeText(this.f318086a, com.tencent.mm.R.string.msg_net_error, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
