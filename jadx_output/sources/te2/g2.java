package te2;

/* loaded from: classes14.dex */
public final class g2 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f418031a;

    public g2(te2.l2 l2Var) {
        this.f418031a = l2Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        te2.l2 l2Var = this.f418031a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play new fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : null);
        com.tencent.mars.xlog.Log.e(str, sb6.toString());
        android.os.Message obtainMessage = l2Var.f418197m.obtainMessage(l2Var.f418193f);
        obtainMessage.arg1 = eVar != null ? eVar.f2487c : 0;
        obtainMessage.sendToTarget();
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        x91.c cVar;
        x91.c cVar2;
        te2.l2 l2Var = this.f418031a;
        java.lang.String str = l2Var.f418192e;
        x91.h hVar = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Playing;
        }
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar2 != null) {
            hVar2.f();
        }
        x91.h hVar3 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar3 != null) {
            hVar3.g();
        }
        x91.h hVar4 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar4 != null) {
            hVar4.f452654h = l2Var.f418198n;
        }
        mm2.c1 c1Var = (mm2.c1) l2Var.f418191d.a(mm2.c1.class);
        x91.h hVar5 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        java.lang.String str2 = null;
        java.lang.String str3 = (hVar5 == null || (cVar2 = hVar5.f452647a) == null) ? null : cVar2.f452639g;
        x91.h hVar6 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar6 != null && (cVar = hVar6.f452647a) != null) {
            str2 = cVar.f452641i;
        }
        c1Var.C4 = new km2.n0(str3, str2);
        te2.c2 c2Var = l2Var.f418196i;
        if (c2Var != null) {
            pm0.v.X(new te2.t2((te2.a3) c2Var, ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f));
        }
        l2Var.f418199o.d();
    }
}
