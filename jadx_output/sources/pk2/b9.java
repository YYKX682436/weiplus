package pk2;

/* loaded from: classes3.dex */
public final class b9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f355587e;

    public b9(pk2.o9 o9Var, pk2.d9 d9Var) {
        this.f355586d = o9Var;
        this.f355587e = d9Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.nw1 liveInfo;
        o25.y1 y1Var;
        pk2.a9 a9Var = new pk2.a9(this.f355587e);
        pk2.o9 o9Var = this.f355586d;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
        if (finderObject != null) {
            pk2.d9 d9Var = o9Var.f356082f;
            if (d9Var != null && (y1Var = d9Var.f355666i) != null) {
                kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                ((com.tencent.mm.pluginsdk.forward.m) y1Var).aj((db5.h4) menuItem, new pk2.hb(o9Var, a9Var, finderObject, menuItem));
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f327970o, null, null, null, null, null, false, 126, null);
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.t1 t1Var = ml2.t1.f327973p;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("share_scene", java.lang.String.valueOf(zl2.r4.f473950a.Z0()));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
            hashMap.put("liveid", pm0.v.u((finderObject2 == null || (liveInfo = finderObject2.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0)));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
            hashMap.put("feedid", pm0.v.u(finderObject3 != null ? finderObject3.getId() : 0L));
            zy2.zb.T8(zbVar, t1Var, hashMap, null, null, null, null, false, 124, null);
        }
    }
}
