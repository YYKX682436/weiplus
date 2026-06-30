package pg2;

/* loaded from: classes3.dex */
public final class t extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f354184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f354185g;

    public t(pg2.j0 j0Var, yz5.p pVar, long j17) {
        this.f354183e = j0Var;
        this.f354184f = pVar;
        this.f354185g = j17;
    }

    @Override // ug5.h
    public void a(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.a(animation, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.e();
        }
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f354185g));
        this.f354184f.invoke(java.lang.Boolean.TRUE, intent);
    }

    @Override // ug5.h
    public void b(ug5.v performer) {
        kotlin.jvm.internal.o.g(performer, "performer");
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f354185g));
        this.f354184f.invoke(java.lang.Boolean.FALSE, intent);
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.c(animation, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.f(240L);
        }
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.e(context, z17, performer);
        pg2.j0.Ai(this.f354183e, performer, z17);
    }

    @Override // ug5.h
    public void f() {
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.g(context, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.d();
        }
        pg2.j0 j0Var = this.f354183e;
        j0Var.getClass();
        java.lang.Object d17 = performer.d("liveUrl");
        java.lang.String str = d17 instanceof java.lang.String ? (java.lang.String) d17 : null;
        if (!(str == null || str.length() == 0)) {
            java.lang.Object d18 = performer.d("playerInfoData");
            mn0.l0 l0Var = d18 instanceof mn0.l0 ? (mn0.l0) d18 : null;
            java.lang.Object d19 = performer.d("liveSdkChannelParams");
            r45.ka4 ka4Var = d19 instanceof r45.ka4 ? (r45.ka4) d19 : null;
            int X = nn0.c.X(false);
            nn0.c cVar = new nn0.c(context, (X == 5 || X == 6) ? 2 : 0, false);
            cVar.K(mn0.d0.f329711g, 2);
            cVar.f(true);
            cVar.F(com.tencent.mm.plugin.finder.live.util.n2.b(com.tencent.mm.plugin.finder.live.util.n2.f115640a, "FinderLiveSurfaceViewService", true, null, ka4Var, 0, 0, 52, null));
            cVar.G(true);
            cVar.Q(0);
            cVar.J(new pg2.a0(performer, str, cVar, ka4Var, j0Var, context, l0Var));
            java.lang.String a17 = qg2.e.f362799a.a(str, ka4Var);
            if (l0Var != null) {
                cVar.N(l0Var);
            }
            mn0.b0.D(cVar, a17, 1, ka4Var, j0Var.Ui(context, l0Var != null ? l0Var.f329773d : 0L, l0Var != null ? l0Var.f329772c : 0L), false, false, 48, null);
            r2 = cVar;
        }
        performer.f("key_player", r2);
    }
}
