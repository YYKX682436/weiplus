package defpackage;

/* loaded from: classes2.dex */
public final class k extends ad2.h {
    public final r45.f60 G(xc2.p0 p0Var) {
        java.lang.Object obj;
        r45.wf6 wf6Var = this.f3149m;
        if (wf6Var == null) {
            java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
            if (style != null) {
                java.util.Iterator<T> it = style.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r45.wf6) obj).getInteger(2) == 42) {
                        break;
                    }
                }
                wf6Var = (r45.wf6) obj;
            } else {
                wf6Var = null;
            }
        }
        if (wf6Var != null) {
            return (r45.f60) wf6Var.getCustom(50);
        }
        return null;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return !com.tencent.mm.sdk.platformtools.t8.K0(G(infoEx) != null ? r2.getString(0) : null);
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.c77);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f483941t05);
        r45.f60 G = G(infoEx);
        textView.setText(G != null ? G.getString(0) : null);
    }
}
