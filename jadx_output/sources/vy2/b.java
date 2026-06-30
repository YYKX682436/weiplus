package vy2;

/* loaded from: classes2.dex */
public final class b extends gy2.b {
    public b(int i17) {
        super(i17, 0);
    }

    @Override // gy2.b, zx2.k, zx2.i
    public void e(boolean z17) {
        int i17;
        int i18 = z17 ? com.tencent.mm.R.color.a0c : com.tencent.mm.R.color.f478873jj;
        if (z17) {
            if (this.f477051i == com.tencent.mm.R.string.ery) {
                r("", true);
            }
            i17 = com.tencent.mm.R.raw.icons_filled_channels_like_bold;
        } else {
            i17 = com.tencent.mm.R.raw.icons_filled_channels_like_thick;
        }
        int i19 = i17;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.CharSequence i27 = i(context);
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.CharSequence k17 = hc2.x0.k(i27, context2, '#', i19, i18, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            textView.setText(k17);
            k(z17);
            j(z17);
        }
    }

    @Override // gy2.b, zx2.k
    public void f(android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.f(tabView);
        com.tencent.mars.xlog.Log.i("Finder.FinderWxNotifyTab", "onTabSelected real");
        if (this.f477051i == com.tencent.mm.R.string.ery) {
            r("", true);
        }
    }

    @Override // gy2.b, zx2.k
    public void g(android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        com.tencent.mars.xlog.Log.i("Finder.FinderWxNotifyTab", "onTabUnSelected real");
        r("", false);
    }

    @Override // gy2.b
    public void r(java.lang.String str, boolean z17) {
        if (this.f277542l != null) {
            int i17 = this.f477051i;
            if (i17 == com.tencent.mm.R.string.ery) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageLike");
                q(str, z17, I0 != null && I0.f373887d == 2);
            } else if (i17 == com.tencent.mm.R.string.erv) {
                r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageComment");
                q(str, z17, I02 != null && I02.f373887d == 2);
            }
        }
    }
}
