package sc2;

/* loaded from: classes2.dex */
public final class d4 extends ad2.h {
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
        java.lang.String str;
        java.lang.Object obj;
        r45.p23 p23Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 33) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var != null && (p23Var = (r45.p23) wf6Var.getCustom(42)) != null) {
            str = p23Var.getString(0);
        }
        return !com.tencent.mm.sdk.platformtools.t8.K0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        r45.p23 p23Var;
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
                if (wf6Var3.getInteger(1) == infoEx.f453256r && wf6Var3.getInteger(2) == 33) {
                    break;
                }
            }
            wf6Var2 = wf6Var;
        }
        com.tencent.mars.xlog.Log.i("FeedJumperObserver", "[onBindView] hashCode:" + hashCode() + "holder: " + holder.hashCode() + " holder position: " + holder.getPosition() + " feedId=" + pm0.v.u(this.f3145f) + " showPosition=" + infoEx.f453256r + " showStyle=" + infoEx.f453257s + " businessType=" + finderJumpInfo.getBusiness_type() + " jumpType=" + finderJumpInfo.getJumpinfo_type() + ' ');
        android.view.View findViewById = jumpView.findViewById(com.tencent.mm.R.id.tcc);
        android.widget.ImageView imageView = (android.widget.ImageView) jumpView.findViewById(com.tencent.mm.R.id.tcd);
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.tch);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) jumpView.findViewById(com.tencent.mm.R.id.tcg);
        android.view.View findViewById2 = jumpView.findViewById(com.tencent.mm.R.id.tcf);
        if (imageView == null || findViewById == null || wf6Var2 == null || (p23Var = (r45.p23) wf6Var2.getCustom(42)) == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int integer = p23Var.getInteger(4);
        int integer2 = p23Var.getInteger(5);
        android.content.Context context = holder.f293121e;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479662c0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479654bs);
        if (integer > integer2) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize2;
        } else {
            layoutParams.width = dimensionPixelSize2;
            layoutParams.height = dimensionPixelSize;
        }
        findViewById.requestLayout();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).I).getValue());
        java.lang.String string = p23Var.getString(0);
        if (string == null) {
            string = "";
        }
        d1Var.a(new mn2.j0(string)).c(imageView);
        textView.setText(com.tencent.mm.plugin.finder.assist.w2.o(p23Var.getInteger(3), false));
        if (p23Var.getBoolean(1)) {
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
        } else if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        if (p23Var.getBoolean(2)) {
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotVideoObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotVideoObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (findViewById2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotVideoObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotVideoObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
