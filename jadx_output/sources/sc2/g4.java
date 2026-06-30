package sc2;

/* loaded from: classes2.dex */
public final class g4 extends ad2.h {
    public final r45.wf6 G(xc2.p0 infoEx) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 29) {
                break;
            }
        }
        return (r45.wf6) obj;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        r45.wy3 wy3Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        r45.wf6 G = G(infoEx);
        if (G == null || (wy3Var = (r45.wy3) G.getCustom(37)) == null || (string = wy3Var.getString(1)) == null) {
            return false;
        }
        return string.length() > 0;
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String str;
        r45.wy3 wy3Var;
        java.lang.String string;
        r45.wy3 wy3Var2;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.tencent.mars.xlog.Log.i("FeedJumperObserver", "bind");
        if (!o(holder, infoEx.f453234a)) {
            D(8);
            com.tencent.mars.xlog.Log.i("FeedJumperObserver", "[onBindView] priority not ok");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.qjg);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.qje);
        r45.wf6 G = G(infoEx);
        if (G == null || (wy3Var2 = (r45.wy3) G.getCustom(37)) == null || (str = wy3Var2.getString(1)) == null) {
            str = "";
        }
        textView.setText(str);
        if (G == null || (wy3Var = (r45.wy3) G.getCustom(37)) == null || (string = wy3Var.getString(0)) == null) {
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e));
        sc2.f4 f4Var = sc2.f4.f405886a;
        a17.getClass();
        a17.f447873d = f4Var;
        kotlin.jvm.internal.o.d(imageView);
        a17.c(imageView);
    }
}
