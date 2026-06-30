package sc2;

/* loaded from: classes2.dex */
public final class c5 extends ad2.h {
    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.d(holder, jumpView, infoEx, z17, aVar);
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        r45.cd5 cd5Var;
        com.tencent.mm.protobuf.g byteString;
        r45.wf6 wf6Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.wf6 wf6Var2 = this.f3149m;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                }
                wf6Var = it.next();
                r45.wf6 wf6Var3 = (r45.wf6) wf6Var;
                boolean z17 = true;
                if (wf6Var3.getInteger(1) != infoEx.f453256r || wf6Var3.getInteger(2) != 34) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            wf6Var2 = wf6Var;
        }
        com.tencent.mars.xlog.Log.i("FeedJumperObserver", "[onBindView] hashCode:" + hashCode() + "holder: " + holder.hashCode() + " holder position: " + holder.getPosition() + " feedId=" + pm0.v.u(this.f3145f) + " showPosition=" + infoEx.f453256r + " showStyle=" + infoEx.f453257s + " businessType=" + finderJumpInfo.getBusiness_type() + " jumpType=" + finderJumpInfo.getJumpinfo_type() + ' ');
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) jumpView.findViewById(com.tencent.mm.R.id.tc_);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (wf6Var2 == null || (cd5Var = (r45.cd5) wf6Var2.getCustom(43)) == null || (byteString = cd5Var.getByteString(0)) == null) {
            return;
        }
        r45.rg0 rg0Var = new r45.rg0();
        rg0Var.parseFrom(byteString.g());
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.view.ECProductCardView eCProductCardView = new com.tencent.mm.plugin.finder.view.ECProductCardView(context);
        eCProductCardView.b(rg0Var);
        if (frameLayout != null) {
            frameLayout.addView(eCProductCardView, new android.widget.FrameLayout.LayoutParams(-1, -2));
        }
    }
}
