package st2;

/* loaded from: classes3.dex */
public final class d0 implements com.tencent.mm.plugin.finder.view.nd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412252a;

    public d0(st2.h1 h1Var) {
        this.f412252a = h1Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.nd
    public void a(cm2.k0 item, com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView view) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(view, "view");
        st2.h1 h1Var = this.f412252a;
        boolean w17 = h1Var.w();
        dk2.xf xfVar = h1Var.f412336g;
        android.view.ViewGroup viewGroup = h1Var.f412333d;
        java.lang.String str = item.f43362x;
        if (w17) {
            boolean z17 = !item.G;
            if (h1Var.x()) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).sj(1, 4, 0);
            } else {
                st2.s2.f412456a.a(h1Var.f412335f, z17);
            }
            az2.c cVar = az2.f.f16125d;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            az2.f a17 = az2.c.a(cVar, context, null, 0L, null, 14, null);
            a17.a();
            if (xfVar != null) {
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context2;
                java.lang.String str2 = str == null ? "" : str;
                int i17 = z17 ? 1 : 2;
                int i18 = item.f43360v.getInteger(26) == 1 ? 1 : 0;
                r45.n90 n90Var = (r45.n90) item.f43360v.getCustom(24);
                ((dk2.r4) xfVar).Z(mMActivity, str2, i17, i18, n90Var != null ? n90Var.getLong(0) : 0L, new st2.a0(a17, h1Var, z17, item));
                return;
            }
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Fj((ml2.r0) c17, ml2.f4.f327447u, item, null, null, 12, null);
        if (((bw5.x7) item.f43360v.getCustom(36)) != null) {
            bw5.x7 x7Var = (bw5.x7) item.f43360v.getCustom(36);
            if (x7Var != null) {
                i95.m c18 = i95.n0.c(pq.q.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                pq.q qVar = (pq.q) c18;
                android.content.Context context3 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                pq.q.Lb(qVar, new pq.a(context3), x7Var, null, 4, null);
                return;
            }
            return;
        }
        int integer = item.f43360v.getInteger(21);
        if (integer == 1) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = h1Var.f412337h;
            if (lVar != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                com.tencent.mm.plugin.finder.live.util.y.m(lVar, kotlinx.coroutines.internal.b0.f310484a, null, new st2.b0(h1Var, item, null), 2, null);
                return;
            }
            return;
        }
        if (integer != 2) {
            if (integer != 3) {
                return;
            }
            h1Var.t(true, true);
            i95.m c19 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            ml2.r0.Fj((ml2.r0) c19, ml2.f4.D, item, "0", null, 8, null);
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context4 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        r4Var.h3(context4, true);
        if (xfVar != null) {
            android.content.Context context5 = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context5, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) context5;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str != null ? str : "");
            ((dk2.r4) xfVar).m0(mMActivity2, linkedList, true, new st2.c0(h1Var, item, view));
        }
    }
}
