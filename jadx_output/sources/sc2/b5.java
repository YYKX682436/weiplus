package sc2;

/* loaded from: classes2.dex */
public class b5 extends ad2.h {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.Map f405781y = new java.util.LinkedHashMap();

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f405782w = "Finder.FeedJumperNextLiveNoticeObserver";

    /* renamed from: x, reason: collision with root package name */
    public kotlinx.coroutines.r2 f405783x;

    public static final void G(sc2.b5 b5Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17) {
        b5Var.getClass();
        f405781y.put(java.lang.Long.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getId()), java.lang.Boolean.valueOf(z17));
    }

    public final boolean H(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        return kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) f405781y).get(java.lang.Long.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getId())), java.lang.Boolean.TRUE);
    }

    public final void I(android.view.View view, boolean z17) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.toz);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f484818tp1);
        if (z17) {
            textView.setText(com.tencent.mm.R.string.nkl);
            weImageView.setVisibility(0);
        } else {
            textView.setText(com.tencent.mm.R.string.nkj);
            weImageView.setVisibility(8);
        }
    }

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? gs2.a.f275052h : gs2.a.f275060s;
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f405782w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.String str2 = this.f405782w;
        com.tencent.mars.xlog.Log.i(str2, "#onBindView");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        r45.gw4 gw4Var = null;
        if (style != null) {
            java.util.Iterator<T> it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.wf6) obj).getInteger(2) == 37) {
                        break;
                    }
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var != null) {
                gw4Var = (r45.gw4) wf6Var.getCustom(46);
            }
        }
        if (gw4Var == null) {
            D(8);
            com.tencent.mars.xlog.Log.i(str2, "return because styleData is null");
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (str = feedObject.getUserName()) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i(str2, "show now. wording=" + gw4Var.getString(0) + " anchor=" + str);
        ym5.a1.h(jumpView, new sc2.v4(str, jumpView));
        I(jumpView, H(feed));
        ((android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.f484820tp3)).setText(gw4Var.getString(0));
        jumpView.findViewById(com.tencent.mm.R.id.f484817tp0).setOnClickListener(new sc2.a5(this, feed, jumpView, str));
    }
}
