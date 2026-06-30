package te2;

/* loaded from: classes3.dex */
public final class u6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418473d;

    public u6(te2.p8 p8Var) {
        this.f418473d = p8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.u75 u75Var;
        java.lang.String string;
        r45.h32 h32Var;
        java.lang.String string2;
        int itemId = menuItem.getItemId();
        te2.p8 p8Var = this.f418473d;
        if (itemId == 7) {
            te2.p8.n7(p8Var, 10, 0, 2, null);
            te2.rc rcVar = p8Var.A1;
            r45.h32 h32Var2 = rcVar.f418391b;
            java.lang.Integer valueOf = h32Var2 != null ? java.lang.Integer.valueOf(h32Var2.getInteger(18)) : null;
            r45.h32 h32Var3 = p8Var.f418320p1;
            if (h32Var3 == null) {
                h32Var3 = rcVar.f418391b;
            }
            if (h32Var3 != null) {
                ((com.tencent.mm.plugin.finder.live.widget.c80) ((jz5.n) p8Var.W).getValue()).e0(h32Var3, 1, new te2.g6(valueOf, p8Var));
                return;
            }
            return;
        }
        if (itemId == 1) {
            te2.rc rcVar2 = p8Var.A1;
            if (rcVar2 != null && (h32Var = rcVar2.f418391b) != null) {
                r45.h32 h32Var4 = p8Var.f418320p1;
                if ((h32Var4 != null ? h32Var4.getInteger(5) : 0) > 0) {
                    android.app.Activity context = p8Var.getContext();
                    java.lang.String string3 = p8Var.getContext().getString(com.tencent.mm.R.string.f491722e13);
                    r45.q65 q65Var = (r45.q65) h32Var.getCustom(10);
                    if ((q65Var != null && q65Var.getBoolean(0)) != false) {
                        r45.q65 q65Var2 = (r45.q65) h32Var.getCustom(10);
                        if (!(q65Var2 != null && q65Var2.getInteger(1) == 0)) {
                            string2 = p8Var.getContext().getString(com.tencent.mm.R.string.e18);
                            cf2.h hVar = new cf2.h(context, string3, string2, p8Var.getContext().getString(com.tencent.mm.R.string.f491725e16), p8Var.getContext().getString(com.tencent.mm.R.string.f491723e14));
                            hVar.C();
                            hVar.R = new te2.h6(p8Var, h32Var, hVar);
                        }
                    }
                    string2 = p8Var.getContext().getString(com.tencent.mm.R.string.e17);
                    cf2.h hVar2 = new cf2.h(context, string3, string2, p8Var.getContext().getString(com.tencent.mm.R.string.f491725e16), p8Var.getContext().getString(com.tencent.mm.R.string.f491723e14));
                    hVar2.C();
                    hVar2.R = new te2.h6(p8Var, h32Var, hVar2);
                } else {
                    p8Var.V6(h32Var, null);
                }
            }
            te2.p8.n7(p8Var, 3, 0, 2, null);
            return;
        }
        if (itemId == 8) {
            ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(p8Var.getContext()));
            if (b17 != null) {
                com.tencent.mm.protocal.protobuf.FinderContact i18 = ya2.d.i(b17);
                i95.m c17 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.ub ubVar = (c61.ub) c17;
                android.app.Activity context2 = p8Var.getContext();
                r45.l32 l32Var = p8Var.Z;
                c61.ub.A3(ubVar, context2, null, i18, 1012, false, null, l32Var != null ? (r45.h32) l32Var.getCustom(1) : null, false, null, null, na1.e.CTRL_INDEX, null);
                p8Var.getActivity().finish();
                return;
            }
            return;
        }
        if (itemId == 2) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new te2.k6(p8Var, null), 3, null);
            te2.p8.n7(p8Var, 2, 0, 2, null);
            return;
        }
        if (itemId == 3) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new te2.n6(p8Var, null), 3, null);
            te2.p8.n7(p8Var, 4, 0, 2, null);
            return;
        }
        if (itemId == 4) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new te2.q6(p8Var, null), 3, null);
            return;
        }
        if (itemId == 5) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new te2.t6(p8Var, null), 3, null);
            te2.p8.n7(p8Var, 8, 0, 2, null);
            return;
        }
        if (itemId != 6 || (u75Var = p8Var.f418330x1) == null || (string = u75Var.getString(1)) == null) {
            return;
        }
        if (!(string.length() > 0)) {
            string = null;
        }
        if (string != null) {
            p8Var.m7(6, 1);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", string);
            j45.l.j(p8Var.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
