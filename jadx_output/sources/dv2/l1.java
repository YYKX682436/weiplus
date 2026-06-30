package dv2;

/* loaded from: classes8.dex */
public final class l1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.o1 f243889a;

    public l1(dv2.o1 o1Var) {
        this.f243889a = o1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "[checkRealName] end, errType:" + fVar.f70615a + " errCode:" + fVar.f70616b + " last_verify_result:" + ((r45.js2) fVar.f70618d).getInteger(2));
        dv2.o1 o1Var = this.f243889a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = o1Var.f243924n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o1Var.f243924n = null;
        boolean z17 = ((r45.js2) fVar.f70618d).getInteger(2) == 1;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mm.plugin.finder.assist.h9 h9Var = new com.tencent.mm.plugin.finder.assist.h9(true, false, null, 6, null);
            com.tencent.mm.plugin.finder.assist.m8 m8Var = o1Var.f243921h;
            if (m8Var == null) {
                return null;
            }
            o1Var.f243922i = h9Var;
            m8Var.c(h9Var);
        } else {
            db5.t7.g(o1Var.getContext(), o1Var.getString(com.tencent.mm.R.string.ewm));
        }
        return f0Var;
    }
}
