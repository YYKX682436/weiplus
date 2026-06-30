package yr3;

/* loaded from: classes11.dex */
public final class l1 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yr3.n1 f464925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.u5 f464926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464927c;

    public l1(yr3.n1 n1Var, r45.u5 u5Var, java.lang.String str) {
        this.f464925a = n1Var;
        this.f464926b = u5Var;
        this.f464927c = str;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        yr3.n1 n1Var = this.f464925a;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i(n1Var.f464955f, "query fail, liveId = 0");
        }
        r45.u5 u5Var = this.f464926b;
        if (!u5Var.f387031f.equals(n1Var.f464957h.getTag(com.tencent.mm.R.id.bph))) {
            com.tencent.mars.xlog.Log.i(n1Var.f464955f, "recycled");
            return;
        }
        java.lang.String str = "";
        if (obj != null && (obj instanceof r45.l71)) {
            r45.l71 l71Var = (r45.l71) obj;
            if (!x51.t1.b(l71Var.getString(4))) {
                str = java.lang.String.valueOf(l71Var.getString(4));
            }
        }
        if (x51.t1.b(str)) {
            n1Var.f464958i.setVisibility(8);
        } else {
            n1Var.f464958i.setVisibility(0);
            n1Var.f464958i.setText(str);
        }
        if (obj == null || !(obj instanceof r45.l71)) {
            return;
        }
        r45.l71 l71Var2 = (r45.l71) obj;
        if (((r45.nw1) l71Var2.getCustom(1)) != null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(u5Var.f387031f, (r45.nw1) l71Var2.getCustom(1));
            eq1.h hVar = eq1.h.f255812a;
            r45.nw1 nw1Var = (r45.nw1) l71Var2.getCustom(1);
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = n1Var.f464957h;
            kotlin.jvm.internal.o.f(mMNeat7extView, "<get-leftTextTv>(...)");
            hVar.k(nw1Var, mMNeat7extView, this.f464927c);
        }
    }
}
