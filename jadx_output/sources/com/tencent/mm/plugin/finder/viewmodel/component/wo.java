package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class wo implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm.pd f136355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.yo f136356b;

    public wo(dm.pd pdVar, com.tencent.mm.plugin.finder.viewmodel.component.yo yoVar) {
        this.f136355a = pdVar;
        this.f136356b = yoVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.wj4 wj4Var;
        r45.wj4 wj4Var2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        dm.pd pdVar = this.f136355a;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "result == null id " + pdVar.field_id + " content " + com.tencent.mm.sdk.platformtools.t8.G1(pdVar.field_content));
        } else {
            int i17 = fVar.f70615a;
            com.tencent.mm.plugin.finder.viewmodel.component.yo yoVar = this.f136356b;
            if (i17 == 0 && fVar.f70616b == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get mega video detail success, id = ");
                db2.n4 n4Var = yoVar.f136600h;
                sb6.append(n4Var != null ? java.lang.Long.valueOf(n4Var.f228099t) : null);
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
                r45.xf2 xf2Var = new r45.xf2();
                com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                xf2Var.set(0, (r45.oj4) ((r45.tj4) fVar2).getCustom(1));
                com.tencent.mm.protobuf.f fVar3 = fVar.f70618d;
                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                xf2Var.set(1, (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.tj4) fVar3).getCustom(2));
                int i18 = yoVar.f136596d == 1 ? 7 : 5;
                r45.oj4 oj4Var = (r45.oj4) xf2Var.getCustom(0);
                if (oj4Var != null && (wj4Var = (r45.wj4) oj4Var.getCustom(18)) != null) {
                    long j17 = wj4Var.getLong(0);
                    r45.oj4 oj4Var2 = (r45.oj4) xf2Var.getCustom(0);
                    java.lang.String string = (oj4Var2 == null || (wj4Var2 = (r45.wj4) oj4Var2.getCustom(18)) == null) ? null : wj4Var2.getString(1);
                    int i19 = yoVar.f136596d;
                    android.app.Activity context = yoVar.getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    db2.g4 g4Var = new db2.g4(j17, string, i18, i19, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
                    yoVar.f136599g = g4Var;
                    g4Var.l().h(new com.tencent.mm.plugin.finder.viewmodel.component.vo(pdVar, yoVar));
                }
            } else {
                com.tencent.mm.plugin.finder.viewmodel.component.yo.O6(yoVar, fVar.f70616b);
            }
        }
        return jz5.f0.f302826a;
    }
}
