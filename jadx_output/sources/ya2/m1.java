package ya2;

/* loaded from: classes10.dex */
public final class m1 implements zy2.tb {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.m1 f460511a = new ya2.m1();

    public final bw5.bu b(r45.nw6 nw6Var) {
        com.tencent.mm.protocal.protobuf.FinderContact i17;
        java.util.LinkedList<r45.ow6> list;
        java.lang.String U = g92.b.f269769e.U();
        bw5.bu buVar = new bw5.bu();
        if (U.length() == 0) {
            return buVar;
        }
        bw5.ae aeVar = new bw5.ae();
        if (nw6Var == null || (i17 = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0)) == null) {
            ya2.b2 b17 = ya2.h.f460484a.b(U);
            i17 = b17 != null ? ya2.d.i(b17) : null;
        }
        aeVar.parseFrom(i17 != null ? i17.toByteArray() : null);
        buVar.f25845d = aeVar;
        boolean[] zArr = buVar.f25848g;
        zArr[1] = true;
        l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int Bi = ((k40.f) eVar).Bi(context, U);
        buVar.f25846e = Bi == 2 || Bi == 3;
        zArr[2] = true;
        if (nw6Var != null && (list = nw6Var.getList(6)) != null) {
            for (r45.ow6 ow6Var : list) {
                java.util.LinkedList linkedList = buVar.f25847f;
                bw5.au auVar = new bw5.au();
                auVar.f25434d = ow6Var.getString(0);
                boolean[] zArr2 = auVar.f25438h;
                zArr2[1] = true;
                auVar.f25435e = ow6Var.getInteger(1);
                zArr2[2] = true;
                auVar.f25436f = ow6Var.getString(2);
                zArr2[3] = true;
                auVar.f25437g = ow6Var.getInteger(3);
                zArr2[4] = true;
                linkedList.add(auVar);
            }
        }
        return buVar;
    }

    public void c(android.widget.ImageView view, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        android.graphics.drawable.Drawable drawable = view.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(null);
        }
        int authIconType = finderAuthInfo != null ? finderAuthInfo.getAuthIconType() : 0;
        java.lang.String authIconUrl = finderAuthInfo != null ? finderAuthInfo.getAuthIconUrl() : null;
        com.tencent.mars.xlog.Log.i("FinderUserApi", "[setAuthIcon] authType:" + authIconType + " authIconUrl:" + authIconUrl);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (authIconType == 1) {
            view.setVisibility(0);
            if (!(authIconUrl == null || authIconUrl.length() == 0)) {
                g1Var.e().c(new mn2.q3(authIconUrl, com.tencent.mm.plugin.finder.storage.y90.f128355e), view, g1Var.h(mn2.f1.B));
                return;
            } else if (i17 == 0) {
                view.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_sold);
                return;
            } else {
                view.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_star_identify, i65.a.d(view.getContext(), com.tencent.mm.R.color.a0m)));
                return;
            }
        }
        if (authIconType != 2) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (!(authIconUrl == null || authIconUrl.length() == 0)) {
            g1Var.e().c(new mn2.q3(authIconUrl, com.tencent.mm.plugin.finder.storage.y90.f128355e), view, g1Var.h(mn2.f1.B));
        } else if (i17 == 0) {
            view.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_enterprise_sold);
        } else {
            view.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_enterprise);
        }
    }

    public void d(android.widget.TextView nickNameView, int i17, android.widget.ImageView authIconView, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(nickNameView, "nickNameView");
        kotlin.jvm.internal.o.g(authIconView, "authIconView");
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
        finderAuthInfo.setAuthIconType(i18);
        finderAuthInfo.setAuthIconUrl(str);
        zy2.tb.a(this, authIconView, finderAuthInfo, 0, 4, null);
        android.view.ViewGroup.LayoutParams layoutParams = nickNameView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        if (i18 == 1 || i18 == 2) {
            marginLayoutParams.setMarginEnd(i17);
        } else {
            marginLayoutParams.setMarginEnd(0);
        }
        nickNameView.setLayoutParams(marginLayoutParams);
    }
}
