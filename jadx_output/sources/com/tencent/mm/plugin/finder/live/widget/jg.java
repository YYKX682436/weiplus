package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f118756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f118757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.bh bhVar) {
        super(2, continuation);
        this.f118756d = hVar;
        this.f118757e = bhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.jg(this.f118756d, continuation, this.f118757e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.jg jgVar = (com.tencent.mm.plugin.finder.live.widget.jg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jgVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.bq1 bq1Var = (r45.bq1) ((xg2.i) this.f118756d).f454393b;
        int size = bq1Var.getList(1).size();
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f118757e;
        if (size > 0) {
            bhVar.f117893x.setText(com.tencent.mm.R.string.f490555ye);
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.n2 n2Var = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var != null && (list = n2Var.f329283n) != null) {
                java.util.LinkedList list2 = bq1Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getCustom_gifts(...)");
                ((java.util.ArrayList) list).addAll(list2);
            }
            mm2.n2 n2Var2 = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var2 != null) {
                n2Var2.f329284o = (r45.gg1) bq1Var.getCustom(2);
            }
        } else {
            bhVar.f117893x.setText(com.tencent.mm.R.string.f491525de1);
        }
        return jz5.f0.f302826a;
    }
}
