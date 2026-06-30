package sc2;

/* loaded from: classes2.dex */
public final class u4 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406283w = "FeedAdPosJumperObserver";

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406283w;
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindView] hashCode:");
        sb6.append(hashCode());
        sb6.append("holder: ");
        sb6.append(holder.hashCode());
        sb6.append(" holder position: ");
        sb6.append(holder.getPosition());
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(this.f3145f));
        sb6.append(" showPosition=");
        sb6.append(infoEx.f453256r);
        sb6.append(" showStyle=");
        sb6.append(infoEx.f453257s);
        sb6.append(" businessType=");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        sb6.append(finderJumpInfo.getBusiness_type());
        sb6.append(" jumpType=");
        sb6.append(finderJumpInfo.getJumpinfo_type());
        sb6.append(" title=");
        sb6.append(finderJumpInfo.getRecommend_reason());
        sb6.append('|');
        sb6.append(finderJumpInfo.getWording());
        sb6.append(" icon_url=");
        sb6.append(finderJumpInfo.getIcon_url());
        sb6.append(" ext_info=");
        sb6.append(finderJumpInfo.getExt_info());
        sb6.append(' ');
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f406283w;
        com.tencent.mars.xlog.Log.i(str, sb7);
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.nq6);
        if (textView != null) {
            textView.setText(finderJumpInfo.getWording());
            textView.setAlpha((finderJumpInfo.getBanner_type() == 1 || finderJumpInfo.getBanner_type() == 2) ? 0.5f : 1.0f);
            com.tencent.mars.xlog.Log.i(str, "onBindView: wording = " + finderJumpInfo.getWording() + ", banner_type = " + finderJumpInfo.getBanner_type());
        }
        if (jumpView.getVisibility() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(jumpView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            jumpView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(jumpView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            jumpView.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            jumpView.animate().alpha(1.0f).setDuration(280L).start();
        }
    }
}
