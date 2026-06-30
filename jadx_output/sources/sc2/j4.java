package sc2;

/* loaded from: classes2.dex */
public final class j4 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f405991w = "Finder.FeedJumperJumpButtonObserver";

    public final r45.wf6 G(xc2.p0 infoEx) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        r45.wf6 wf6Var = this.f3149m;
        if (wf6Var != null) {
            return wf6Var;
        }
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 30) {
                break;
            }
        }
        return (r45.wf6) obj;
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f405991w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        r45.d34 d34Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        r45.wf6 G = G(infoEx);
        java.lang.String string = (G == null || (d34Var = (r45.d34) G.getCustom(38)) == null) ? null : d34Var.getString(2);
        return !(string == null || string.length() == 0);
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String str;
        r45.d34 d34Var;
        r45.d34 d34Var2;
        r45.d34 d34Var3;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.tencent.mars.xlog.Log.i(this.f405991w, "bind");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.qpk);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f484446qp0);
        r45.wf6 G = G(infoEx);
        if (G == null || (d34Var3 = (r45.d34) G.getCustom(38)) == null || (str = d34Var3.getString(2)) == null) {
            str = "";
        }
        textView.setText(str);
        java.lang.String str2 = null;
        if (com.tencent.mm.ui.bk.C()) {
            if (G != null && (d34Var2 = (r45.d34) G.getCustom(38)) != null) {
                str2 = d34Var2.getString(1);
            }
        } else if (G != null && (d34Var = (r45.d34) G.getCustom(38)) != null) {
            str2 = d34Var.getString(0);
        }
        if (str2 != null) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128355e));
            sc2.i4 i4Var = sc2.i4.f405968a;
            a17.getClass();
            a17.f447873d = i4Var;
            kotlin.jvm.internal.o.d(imageView);
            a17.c(imageView);
        }
    }
}
