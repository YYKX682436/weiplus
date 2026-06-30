package sc2;

/* loaded from: classes2.dex */
public class g2 extends sc2.f2 {

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f405906z = "FeedBigCardJumperObserver";

    public final r45.su Y(xc2.p0 p0Var) {
        java.lang.Object obj;
        r45.wf6 wf6Var = this.f3149m;
        if (wf6Var == null) {
            java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator<T> it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.wf6) obj).getInteger(2) == 6) {
                    break;
                }
            }
            wf6Var = (r45.wf6) obj;
        }
        if (wf6Var != null) {
            return (r45.su) wf6Var.getCustom(9);
        }
        return null;
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f405906z;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return !com.tencent.mm.sdk.platformtools.t8.K0(Y(infoEx) != null ? r2.getString(1) : null);
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.Object obj = holder.f293125i;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        if (j5Var != null) {
            long itemId = j5Var.getItemId();
            if (infoEx.f453234a.getBusiness_type() == 2) {
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
                if (finderDescPanelUIC != null) {
                    finderDescPanelUIC.d7(itemId, 128);
                }
            }
        }
        J(feed, holder, jumpView, infoEx, source, Y(infoEx), false);
    }
}
