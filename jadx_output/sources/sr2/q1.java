package sr2;

/* loaded from: classes10.dex */
public final class q1 extends com.tencent.mm.ui.component.UIComponent implements ya2.r1, zv2.q0, ya2.q1 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f411679d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f411680e;

    /* renamed from: f, reason: collision with root package name */
    public zv2.r0 f411681f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f411682g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411680e = new java.util.LinkedHashMap();
        this.f411682g = jz5.h.b(new sr2.p1(activity));
    }

    public final com.tencent.mm.plugin.finder.view.FinderJumperView O6() {
        return (com.tencent.mm.plugin.finder.view.FinderJumperView) ((jz5.n) this.f411682g).getValue();
    }

    public final zv2.r0 P6(int i17, int i18) {
        zv2.b mVar;
        zv2.b bVar;
        zv2.b f0Var;
        java.util.Map map = this.f411680e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(valueOf);
        java.lang.Object obj2 = obj;
        if (obj == null) {
            if (i17 == 1) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                com.tencent.mm.plugin.finder.view.FinderJumperView O6 = O6();
                kotlin.jvm.internal.o.f(O6, "<get-jumpView>(...)");
                mVar = new zv2.m(activity, O6);
            } else if (i17 == 6) {
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                com.tencent.mm.plugin.finder.view.FinderJumperView O62 = O6();
                kotlin.jvm.internal.o.f(O62, "<get-jumpView>(...)");
                mVar = new zv2.q(activity2, O62);
            } else if (i17 != 13) {
                if (i17 != 34) {
                    if (i17 == 49) {
                        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                        com.tencent.mm.plugin.finder.view.FinderJumperView O63 = O6();
                        kotlin.jvm.internal.o.f(O63, "<get-jumpView>(...)");
                        mVar = new zv2.a0(activity3, O63);
                    } else if (i17 == 52) {
                        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
                        com.tencent.mm.plugin.finder.view.FinderJumperView O64 = O6();
                        kotlin.jvm.internal.o.f(O64, "<get-jumpView>(...)");
                        mVar = new zv2.s(activity4, O64);
                    } else if (i17 != 76) {
                        if (i17 == 123) {
                            androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
                            com.tencent.mm.plugin.finder.view.FinderJumperView O65 = O6();
                            kotlin.jvm.internal.o.f(O65, "<get-jumpView>(...)");
                            mVar = new zv2.p0(activity5, O65);
                        } else if (i17 == 57 || i17 == 58) {
                            androidx.appcompat.app.AppCompatActivity activity6 = getActivity();
                            com.tencent.mm.plugin.finder.view.FinderJumperView O66 = O6();
                            kotlin.jvm.internal.o.f(O66, "<get-jumpView>(...)");
                            f0Var = new zv2.w(activity6, O66, i17);
                            bVar = f0Var;
                            bVar.f476398g = this;
                            linkedHashMap.put(valueOf, bVar);
                            obj2 = bVar;
                        } else if (i18 == 1) {
                            androidx.appcompat.app.AppCompatActivity activity7 = getActivity();
                            com.tencent.mm.plugin.finder.view.FinderJumperView O67 = O6();
                            kotlin.jvm.internal.o.f(O67, "<get-jumpView>(...)");
                            mVar = new zv2.m(activity7, O67);
                        } else {
                            androidx.appcompat.app.AppCompatActivity activity8 = getActivity();
                            com.tencent.mm.plugin.finder.view.FinderJumperView O68 = O6();
                            kotlin.jvm.internal.o.f(O68, "<get-jumpView>(...)");
                            mVar = new zv2.n(activity8, O68);
                        }
                    }
                }
                androidx.appcompat.app.AppCompatActivity activity9 = getActivity();
                com.tencent.mm.plugin.finder.view.FinderJumperView O69 = O6();
                kotlin.jvm.internal.o.f(O69, "<get-jumpView>(...)");
                f0Var = new zv2.f0(activity9, O69, i17);
                bVar = f0Var;
                bVar.f476398g = this;
                linkedHashMap.put(valueOf, bVar);
                obj2 = bVar;
            } else {
                androidx.appcompat.app.AppCompatActivity activity10 = getActivity();
                com.tencent.mm.plugin.finder.view.FinderJumperView O610 = O6();
                kotlin.jvm.internal.o.f(O610, "<get-jumpView>(...)");
                mVar = new zv2.l0(activity10, O610);
            }
            bVar = mVar;
            bVar.f476398g = this;
            linkedHashMap.put(valueOf, bVar);
            obj2 = bVar;
        }
        return (zv2.r0) obj2;
    }

    public final void Q6() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo y07;
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(getActivity()), false, 2, null);
        if (j37 == null || (y07 = j37.y0()) == null) {
            return;
        }
        ((zv2.b) P6(52, 0)).i(y07);
    }

    public final void R6(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, boolean z17) {
        zv2.r0 r0Var = this.f411681f;
        if (r0Var != null) {
            zv2.r0.b(r0Var, null, 1, null);
        }
        if (finderJumpInfo != null) {
            this.f411681f = P6(finderJumpInfo.getBusiness_type(), finderJumpInfo.getBusiness_category());
        }
        zv2.r0 r0Var2 = this.f411681f;
        if (r0Var2 != null) {
            ((zv2.b) r0Var2).i(finderJumpInfo);
        }
        this.f411679d = z17;
    }

    @Override // ya2.q1
    public void n0(ya2.b2 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        zv2.r0 r0Var = this.f411681f;
        ya2.q1 q1Var = r0Var instanceof ya2.q1 ? (ya2.q1) r0Var : null;
        if (q1Var != null) {
            q1Var.n0(contact);
        }
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        zv2.r0 r0Var = this.f411681f;
        ya2.r1 r1Var = r0Var instanceof ya2.r1 ? (ya2.r1) r0Var : null;
        if (r1Var != null) {
            r1Var.w4(account);
        }
    }
}
