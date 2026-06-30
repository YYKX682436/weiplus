package m0;

/* loaded from: classes14.dex */
public final class g implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.w f322466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f322467e;

    public g(m0.w wVar, kotlinx.coroutines.y0 y0Var) {
        this.f322466d = wVar;
        this.f322467e = y0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        z.v2 v2Var;
        z.v2 v2Var2;
        c0.m interaction = (c0.m) obj;
        boolean z17 = interaction instanceof c0.r;
        kotlinx.coroutines.y0 scope = this.f322467e;
        m0.w wVar = this.f322466d;
        if (z17) {
            wVar.e((c0.r) interaction, scope);
        } else if (interaction instanceof c0.s) {
            wVar.g(((c0.s) interaction).f36944a);
        } else if (interaction instanceof c0.q) {
            wVar.g(((c0.q) interaction).f36942a);
        } else {
            wVar.getClass();
            kotlin.jvm.internal.o.g(interaction, "interaction");
            kotlin.jvm.internal.o.g(scope, "scope");
            m0.d0 d0Var = wVar.f322523d;
            d0Var.getClass();
            boolean z18 = interaction instanceof c0.i;
            java.util.List list = d0Var.f322458d;
            if (z18) {
                ((java.util.ArrayList) list).add(interaction);
            } else if (interaction instanceof c0.j) {
                ((java.util.ArrayList) list).remove(((c0.j) interaction).f36935a);
            } else if (interaction instanceof c0.d) {
                ((java.util.ArrayList) list).add(interaction);
            } else if (interaction instanceof c0.e) {
                ((java.util.ArrayList) list).remove(((c0.e) interaction).f36929a);
            } else if (interaction instanceof c0.b) {
                ((java.util.ArrayList) list).add(interaction);
            } else if (interaction instanceof c0.c) {
                ((java.util.ArrayList) list).remove(((c0.c) interaction).f36928a);
            } else if (interaction instanceof c0.a) {
                ((java.util.ArrayList) list).remove(((c0.a) interaction).f36927a);
            }
            c0.m mVar = (c0.m) kz5.n0.k0(list);
            if (!kotlin.jvm.internal.o.b(d0Var.f322459e, mVar)) {
                z.i0 i0Var = z.i0.f468696a;
                if (mVar != null) {
                    n0.e5 e5Var = d0Var.f322456b;
                    float f17 = z18 ? ((m0.j) e5Var.getValue()).f322477c : interaction instanceof c0.d ? ((m0.j) e5Var.getValue()).f322476b : interaction instanceof c0.b ? ((m0.j) e5Var.getValue()).f322475a : 0.0f;
                    z.v2 v2Var3 = m0.x.f322524a;
                    if (!(mVar instanceof c0.i)) {
                        if (mVar instanceof c0.d) {
                            z.h0 h0Var = z.j0.f468704a;
                            v2Var2 = new z.v2(45, 0, i0Var, 2, null);
                        } else if (mVar instanceof c0.b) {
                            z.h0 h0Var2 = z.j0.f468704a;
                            v2Var2 = new z.v2(45, 0, i0Var, 2, null);
                        }
                        kotlinx.coroutines.l.d(scope, null, null, new m0.b0(d0Var, f17, v2Var2, null), 3, null);
                    }
                    v2Var2 = m0.x.f322524a;
                    kotlinx.coroutines.l.d(scope, null, null, new m0.b0(d0Var, f17, v2Var2, null), 3, null);
                } else {
                    c0.m mVar2 = d0Var.f322459e;
                    z.v2 v2Var4 = m0.x.f322524a;
                    if ((mVar2 instanceof c0.i) || (mVar2 instanceof c0.d) || !(mVar2 instanceof c0.b)) {
                        v2Var = m0.x.f322524a;
                    } else {
                        z.h0 h0Var3 = z.j0.f468704a;
                        v2Var = new z.v2(150, 0, i0Var, 2, null);
                    }
                    kotlinx.coroutines.l.d(scope, null, null, new m0.c0(d0Var, v2Var, null), 3, null);
                }
                d0Var.f322459e = mVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
