package ey2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.b0 f257563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ey2.b0 b0Var) {
        super(0);
        this.f257563d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ey2.b0 b0Var = this.f257563d;
        android.content.res.Resources resources = b0Var.getContext().getResources();
        com.tencent.mm.plugin.finder.view.s8 s8Var = com.tencent.mm.plugin.finder.view.s8.f133027a;
        androidx.appcompat.app.AppCompatActivity activity = b0Var.getActivity();
        java.lang.String string = resources.getString(com.tencent.mm.R.string.ocy);
        com.tencent.mm.plugin.finder.view.i8 i8Var = com.tencent.mm.plugin.finder.view.i8.f132293d;
        com.tencent.mm.plugin.finder.view.d8 d8Var = com.tencent.mm.plugin.finder.view.d8.f131880d;
        java.lang.String string2 = resources.getString(com.tencent.mm.R.string.ocz);
        java.lang.String string3 = resources.getString(com.tencent.mm.R.string.od6);
        in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(b0Var.getActivity());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Lj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Lj : null;
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        lVarArr[1] = new jz5.l("session_buffer", baseFinderFeed != null ? baseFinderFeed.g0() : null);
        lVarArr[2] = new jz5.l("ref_commentscene", java.lang.Integer.valueOf(b0Var.getIntent().getIntExtra("KEY_OPEN_FINDER_ENTRANCE_REF_COMMENT_SCENE", 0)));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        kotlin.jvm.internal.o.d(string);
        kotlin.jvm.internal.o.d(string2);
        kotlin.jvm.internal.o.d(string3);
        s8Var.c(activity, new com.tencent.mm.plugin.finder.view.h8(string, i8Var, d8Var, string2, string3, ey2.y.f257578d, new ey2.z(b0Var), new ey2.a0(b0Var), "open_entrance_know", "open_entrance_set", "open_entrance_popup", k17));
        return jz5.f0.f302826a;
    }
}
