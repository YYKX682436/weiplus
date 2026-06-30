package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class v7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117483f;

    public v7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, java.lang.String str, java.lang.String str2) {
        this.f117481d = b8Var;
        this.f117482e = str;
        this.f117483f = str2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String str;
        kotlinx.coroutines.flow.j2 j2Var;
        r45.n73 n73Var;
        r45.z53 z53Var;
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f117481d.f116937e;
            if (lVar == null || (j2Var = ((mm2.g1) lVar.P0(mm2.g1.class)).f329071i) == null || (n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null || (str = z53Var.getString(20)) == null) {
                str = "";
            }
            boolean z17 = str.length() == 0;
            java.lang.String str2 = this.f117482e;
            if (z17) {
                g4Var.f(1, str2);
            } else {
                g4Var.o(1, str2, str);
            }
            g4Var.f(2, this.f117483f);
        }
    }
}
