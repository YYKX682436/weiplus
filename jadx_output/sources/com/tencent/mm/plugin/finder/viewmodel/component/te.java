package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class te extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f136015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f136016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f136018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f136019h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar, boolean z17, androidx.recyclerview.widget.f2 f2Var, java.util.List list) {
        super(2, continuation);
        this.f136015d = hVar;
        this.f136016e = yeVar;
        this.f136017f = z17;
        this.f136018g = f2Var;
        this.f136019h = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.te(this.f136015d, continuation, this.f136016e, this.f136017f, this.f136018g, this.f136019h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.te teVar = (com.tencent.mm.plugin.finder.viewmodel.component.te) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        teVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0335, code lost:
    
        if (r14.getBoolean(2) == false) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d4 A[LOOP:5: B:121:0x029c->B:131:0x02d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03db A[EDGE_INSN: B:158:0x03db->B:159:0x03db BREAK  A[LOOP:6: B:149:0x03b4->B:188:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[LOOP:6: B:149:0x03b4->B:188:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016b A[LOOP:2: B:38:0x0135->B:48:0x016b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b8 A[EDGE_INSN: B:49:0x01b8->B:50:0x01b8 BREAK  A[LOOP:2: B:38:0x0135->B:48:0x016b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.te.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
