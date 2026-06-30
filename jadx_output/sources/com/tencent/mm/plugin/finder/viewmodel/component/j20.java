package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j20 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f134802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134803e = f50Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.j20(this.f134803e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.j20) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        java.util.LinkedList list;
        java.lang.Object obj2;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.k74 lite_app_info;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f134802d;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134803e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int intExtra = f50Var.getIntent().getIntExtra("key_user_prepare_scene", 8);
            g92.b bVar = g92.b.f269769e;
            this.f134802d = 1;
            x17 = bVar.x1(intExtra, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            x17 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m528isSuccessimpl(x17)) {
            r45.lk2 lk2Var = (r45.lk2) x17;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = com.tencent.mm.plugin.finder.viewmodel.component.f50.f134335y1;
            f50Var.getClass();
            android.widget.ProgressBar progressBar = f50Var.f134340f;
            if (progressBar == null) {
                kotlin.jvm.internal.o.o("progressBar");
                throw null;
            }
            progressBar.setVisibility(8);
            androidx.appcompat.app.AppCompatActivity activity = f50Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((sr2.l5) pf5.z.f353948a.a(activity).a(sr2.l5.class)).O6(0, 0, null, lk2Var);
            boolean z17 = f50Var.f134339e == null;
            f50Var.f134339e = lk2Var;
            if (!f50Var.Y && (list = lk2Var.getList(20)) != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) obj2).getCustom(1);
                    if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, f50Var.f134338d)) {
                        break;
                    }
                }
                r45.ac5 ac5Var = (r45.ac5) obj2;
                if (ac5Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ac5Var.getCustom(56)) != null && (lite_app_info = finderJumpInfo.getLite_app_info()) != null) {
                    f50Var.Y = true;
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((c61.p2) ((c61.yb) c17)).Qj(f50Var.getContext(), lite_app_info);
                }
            }
            if (z17) {
                f50Var.r7();
            }
            ((im2.p4) f50Var.e7()).S6(f50Var.f134339e);
            androidx.appcompat.app.AppCompatActivity activity2 = f50Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.finder.account.component.l) ((zy2.o5) pf5.z.f353948a.a(activity2).c(zy2.o5.class))).O6(lk2Var);
            androidx.appcompat.app.AppCompatActivity activity3 = f50Var.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            ((im2.v4) ((zy2.o8) pf5.z.f353948a.a(activity3).c(zy2.o8.class))).O6(lk2Var.getInteger(26), (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lk2Var.getCustom(32), false);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_LIVE_TOTAL_COUNT_INT, new java.lang.Integer(lk2Var.getInteger(12)));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_MEMBER_TOTAL_COUNT_INT, new java.lang.Integer(lk2Var.getInteger(29)));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_PURCHASE_COURSE_TOTAL_COUNT_INT, new java.lang.Integer(lk2Var.getInteger(33)));
            f50Var.q7(false);
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(x17);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = com.tencent.mm.plugin.finder.viewmodel.component.f50.f134335y1;
            f50Var.getClass();
            rm0.j jVar = m524exceptionOrNullimpl instanceof rm0.j ? (rm0.j) m524exceptionOrNullimpl : null;
            if (jVar != null) {
                android.widget.ProgressBar progressBar2 = f50Var.f134340f;
                if (progressBar2 == null) {
                    kotlin.jvm.internal.o.o("progressBar");
                    throw null;
                }
                progressBar2.setVisibility(8);
                androidx.appcompat.app.AppCompatActivity activity4 = f50Var.getActivity();
                kotlin.jvm.internal.o.g(activity4, "activity");
                ((sr2.l5) pf5.z.f353948a.a(activity4).a(sr2.l5.class)).onSceneEnd(jVar.f397424e, jVar.f397425f, jVar.f397426g, null);
                f50Var.r7();
                db5.t7.makeText(f50Var.getActivity(), com.tencent.mm.R.string.exk, 1).show();
            }
        }
        return jz5.f0.f302826a;
    }
}
