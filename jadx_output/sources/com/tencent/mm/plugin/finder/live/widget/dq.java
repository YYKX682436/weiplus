package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class dq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118136d;

    /* renamed from: e, reason: collision with root package name */
    public int f118137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nq f118138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f118139g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(com.tencent.mm.plugin.finder.live.widget.nq nqVar, r45.z53 z53Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118138f = nqVar;
        this.f118139g = z53Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.dq(this.f118138f, this.f118139g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.dq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        com.tencent.mm.plugin.finder.live.widget.nq nqVar;
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118137e;
        com.tencent.mm.plugin.finder.live.widget.nq nqVar2 = this.f118138f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f118136d = nqVar2;
            this.f118137e = 1;
            nqVar2.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveGetUserGameConfig name=");
            r45.z53 z53Var = this.f118139g;
            sb6.append(z53Var.getString(1));
            com.tencent.mars.xlog.Log.i(nqVar2.H, sb6.toString());
            java.lang.String string = z53Var.getString(0);
            if (string == null) {
                string = "";
            }
            ke2.y yVar = new ke2.y(string, 0, false, null, false, null, 60, null);
            android.content.Context context = nqVar2.f118183e;
            yVar.t(context, context.getResources().getString(com.tencent.mm.R.string.f9y), 0L);
            pq5.g l17 = yVar.l();
            l17.f((com.tencent.mm.ui.MMActivity) context);
            l17.K(new com.tencent.mm.plugin.finder.live.widget.kq(nqVar2, nVar, z53Var));
            a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
            nqVar = nqVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqVar = (com.tencent.mm.plugin.finder.live.widget.nq) this.f118136d;
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        r45.n73 n73Var = (r45.n73) a17;
        un0.h hVar = un0.s.f429418b;
        if (hVar != null) {
            nqVar.getClass();
            yz5.l lVar = hVar.f429365n;
            if (lVar != null) {
                lVar.invoke("FinderLivePostGameChoosePanel-notifyGameSelected");
            }
        }
        java.lang.String str = nqVar.H;
        if (n73Var == null) {
            com.tencent.mars.xlog.Log.i(str, "#notifyGameSelected gameInfo is null. return");
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#notifyGameSelected name=");
            r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
            sb7.append(z53Var2 != null ? z53Var2.getString(1) : null);
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("#notifyGameSelected support_live_type=");
            r45.z53 z53Var3 = (r45.z53) n73Var.getCustom(1);
            sb8.append((z53Var3 == null || (list = z53Var3.getList(19)) == null) ? null : kz5.n0.g0(list, ",", null, null, 0, null, null, 62, null));
            com.tencent.mars.xlog.Log.i(str, sb8.toString());
            r45.z53 z53Var4 = (r45.z53) n73Var.getCustom(1);
            java.lang.String string2 = z53Var4 != null ? z53Var4.getString(0) : null;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 13);
            gVar.h("game_id", string2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
            r45.q12 q12Var = new r45.q12();
            q12Var.set(0, 3);
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.g1 g1Var = (mm2.g1) efVar.i(mm2.g1.class);
            kotlinx.coroutines.flow.j2 j2Var = g1Var != null ? g1Var.f329068f : null;
            if (j2Var != null) {
                ((kotlinx.coroutines.flow.h3) j2Var).k(q12Var);
            }
            mm2.o2 o2Var = (mm2.o2) efVar.i(mm2.o2.class);
            if (o2Var != null) {
                o2Var.N6(n73Var);
            }
            mm2.g1 g1Var2 = (mm2.g1) efVar.i(mm2.g1.class);
            kotlinx.coroutines.flow.j2 j2Var2 = g1Var2 != null ? g1Var2.f329071i : null;
            if (j2Var2 != null) {
                ((kotlinx.coroutines.flow.h3) j2Var2).k(n73Var);
            }
            mm2.s1 s1Var = (mm2.s1) efVar.i(mm2.s1.class);
            if (s1Var != null) {
                s1Var.S6(q12Var);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(nqVar2, false, 1, null);
        return jz5.f0.f302826a;
    }
}
