package sc2;

/* loaded from: classes2.dex */
public final class o extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406109w = "CNYFeedButtonJumperObserver";

    @Override // ad2.h
    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        f(600L, jumpView, z17, aVar);
        e(true, z17);
    }

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? info.getExt_type() == 3 ? gs2.a.f275052h : gs2.a.f275054m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406109w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void n(android.view.View jumpView, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        g(600L, jumpView, z17, aVar);
        e(false, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        r45.fq fqVar;
        r45.wf6 wf6Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        if (!o(holder, finderJumpInfo)) {
            D(8);
            com.tencent.mars.xlog.Log.i("Finder.FeedCardJumperObserver", "[onBindView] priority not ok");
            return;
        }
        r45.wf6 wf6Var2 = this.f3149m;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                } else {
                    wf6Var = it.next();
                    if (((r45.wf6) wf6Var).getInteger(2) == 12) {
                        break;
                    }
                }
            }
            wf6Var2 = wf6Var;
        }
        if (wf6Var2 != null && (fqVar = (r45.fq) wf6Var2.getCustom(18)) != null) {
            android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.eez);
            android.view.View findViewById = jumpView.findViewById(com.tencent.mm.R.id.eey);
            if (textView != null) {
                textView.setText(fqVar.getString(0));
            }
            if (findViewById != null) {
                try {
                    findViewById.setBackgroundColor(android.graphics.Color.parseColor(fqVar.getString(2)));
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("CNYFeedButtonJumper", th6, "parse color crash, bg_color=" + fqVar.getString(2) + "， font_color=" + fqVar.getString(1), new java.lang.Object[0]);
                }
            }
            if (textView != null) {
                textView.setTextColor(android.graphics.Color.parseColor(fqVar.getString(1)));
            }
        }
        gs2.c.f275072a.e(holder, jumpView, j(finderJumpInfo), false);
    }
}
