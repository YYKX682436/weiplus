package el2;

/* loaded from: classes3.dex */
public final class s1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253908d;

    public s1(el2.c2 c2Var) {
        this.f253908d = c2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        byte[] g17;
        r45.y42 y42Var = (r45.y42) obj;
        el2.c2 c2Var = this.f253908d;
        java.lang.String str = c2Var.f253763f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive info = ");
        sb6.append(y42Var != null ? pm0.b0.g(y42Var) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) c2Var.f253764g).getValue();
        android.view.ViewGroup viewGroup = c2Var.f253761d;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(viewGroup.getContext(), com.tencent.mm.R.raw.link_filled, 0));
        java.lang.Integer valueOf = y42Var != null ? java.lang.Integer.valueOf(y42Var.getInteger(1)) : null;
        bf2.c cVar = bf2.c.f19598a;
        if (valueOf != null && valueOf.intValue() == 4) {
            kotlin.jvm.internal.o.d(y42Var);
            r45.k92 k92Var = new r45.k92();
            com.tencent.mm.protobuf.g byteString = y42Var.getByteString(2);
            g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    k92Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            bf2.c.c(cVar, c2Var.l(), 1, 4, pm0.v.u(k92Var.getLong(0)), 0, null, 0, 2, null, 0, nd1.y0.CTRL_INDEX, null);
            viewGroup.setOnClickListener(new el2.w1(c2Var, k92Var, y42Var));
        } else {
            if (((valueOf != null && valueOf.intValue() == 999) || (valueOf != null && valueOf.intValue() == 15)) || (valueOf != null && valueOf.intValue() == 18)) {
                kotlin.jvm.internal.o.d(y42Var);
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                com.tencent.mm.protobuf.g byteString2 = y42Var.getByteString(2);
                g17 = byteString2 != null ? byteString2.g() : null;
                if (g17 != null) {
                    try {
                        finderJumpInfo.parseFrom(g17);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                    }
                }
                cm2.b0 b0Var = new cm2.b0(finderJumpInfo, y42Var.getInteger(1));
                b0Var.f43397s = y42Var.getByteString(5);
                b0Var.f43398t = y42Var.getByteString(6);
                java.lang.String string = y42Var.getString(4);
                if (string == null) {
                    string = "";
                }
                b0Var.f43387f = string;
                java.lang.Integer g18 = b0Var.g();
                if (g18 != null) {
                    int intValue = g18.intValue();
                    gk2.e l17 = c2Var.l();
                    java.lang.String jump_id = b0Var.f43331v.getJump_id();
                    bf2.c.c(cVar, l17, 1, intValue, jump_id == null ? "" : jump_id, 0, null, 0, 2, null, 0, nd1.y0.CTRL_INDEX, null);
                }
                viewGroup.setOnClickListener(new el2.a2(b0Var, c2Var, y42Var));
            } else {
                viewGroup.setVisibility(8);
                viewGroup.setOnClickListener(null);
            }
        }
        jf2.k0 k0Var = (jf2.k0) c2Var.f253762e.U0(jf2.k0.class);
        if (k0Var != null) {
            k0Var.a7("promoteEntranceInfo", false);
        }
    }
}
