package sc2;

/* loaded from: classes2.dex */
public final class p3 extends ad2.h {
    public final r45.wf6 G(xc2.p0 p0Var) {
        java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
        java.lang.Object obj = null;
        if (style == null) {
            return null;
        }
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.wf6) next).getInteger(2) == 44) {
                obj = next;
                break;
            }
        }
        return (r45.wf6) obj;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        r45.nt ntVar;
        java.lang.String string;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        r45.wf6 G = G(infoEx);
        if (G == null || (ntVar = (r45.nt) G.getCustom(53)) == null || (string = ntVar.getString(1)) == null) {
            return false;
        }
        return string.length() > 0;
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String str;
        r45.nt ntVar;
        java.lang.String string;
        r45.nt ntVar2;
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
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484490te2);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f484489te1);
        r45.wf6 G = G(infoEx);
        if (G == null || (ntVar2 = (r45.nt) G.getCustom(53)) == null || (str = ntVar2.getString(1)) == null) {
            str = "";
        }
        textView.setText(str);
        com.tencent.mm.ui.fk.b(textView);
        if (G == null || (ntVar = (r45.nt) G.getCustom(53)) == null || (string = ntVar.getString(0)) == null) {
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e));
        sc2.o3 o3Var = sc2.o3.f406119a;
        a17.getClass();
        a17.f447873d = o3Var;
        kotlin.jvm.internal.o.d(weImageView);
        a17.c(weImageView);
    }
}
