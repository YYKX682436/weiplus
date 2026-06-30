package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class oa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lk2 f129595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f129596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(r45.lk2 lk2Var, com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129595d = lk2Var;
        this.f129596e = finderModifyNameUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.oa(this.f129595d, this.f129596e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.oa oaVar = (com.tencent.mm.plugin.finder.ui.oa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI;
        java.lang.Object obj2;
        java.lang.String string;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.lk2 lk2Var = this.f129595d;
        java.util.LinkedList list = lk2Var.getList(20);
        kotlin.jvm.internal.o.f(list, "getFinder_list(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            finderModifyNameUI = this.f129596e;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) obj2).getCustom(1);
            java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
            ya2.b2 b2Var = finderModifyNameUI.G;
            if (kotlin.jvm.internal.o.b(username, b2Var != null ? b2Var.field_username : null)) {
                break;
            }
        }
        r45.ac5 ac5Var = (r45.ac5) obj2;
        if (ac5Var != null && (string = ac5Var.getString(19)) != null) {
            if (!(finderModifyNameUI.H == 1)) {
                string = null;
            }
            if (string != null) {
                com.tencent.mm.plugin.finder.ui.FinderModifyNameUI.Q = string;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_NICKNAME_MODIFY_WORD_STRING_SYNC, string);
            }
        }
        if (lk2Var.getInteger(6) > 0) {
            java.lang.String str = com.tencent.mm.plugin.finder.ui.FinderModifyNameUI.Q;
            com.tencent.mm.plugin.finder.ui.FinderModifyNameUI.R = lk2Var.getInteger(6);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_NICKNAME_MODIFY_LIMIT_LENGTH_INT_SYNC, new java.lang.Integer(lk2Var.getInteger(6)));
        }
        if (lk2Var.getInteger(4) > 0) {
            finderModifyNameUI.f128627J = lk2Var.getInteger(4);
        }
        java.lang.String string2 = ac5Var != null ? ac5Var.getString(13) : null;
        if (string2 == null) {
            string2 = "";
        }
        finderModifyNameUI.E = string2;
        finderModifyNameUI.f7();
        return jz5.f0.f302826a;
    }
}
