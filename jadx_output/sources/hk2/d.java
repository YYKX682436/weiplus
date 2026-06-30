package hk2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final hk2.d f281885a = new hk2.d();

    public final void a(gk2.e liveBuContext, xs2.m0 holder, dk2.zf finderLiveMsg) {
        jz5.l q17;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(liveBuContext, "liveBuContext");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(finderLiveMsg, "finderLiveMsg");
        com.tencent.mars.xlog.Log.i("DanmakuItemEmoji", "fillItem emoji msg: " + finderLiveMsg.hashCode());
        holder.f456356h.setVisibility(8);
        android.view.View view = holder.f456358j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemEmoji", "fillItem", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender$BulletViewHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemEmoji", "fillItem", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuRender$BulletViewHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hk2.b.f281879a.c(finderLiveMsg, holder.f456359k);
        android.view.View view2 = holder.f456352d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2.findViewById(com.tencent.mm.R.id.f484612ti3);
        com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView finderLiveEmojiView = (com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView) view2.findViewById(com.tencent.mm.R.id.f484611ti2);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f484613ti4);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view2.findViewById(com.tencent.mm.R.id.f484614ti5);
        if (viewGroup == null || finderLiveEmojiView == null) {
            com.tencent.mars.xlog.Log.e("DanmakuItemEmoji", "emojiContainer or emojiView is null");
            return;
        }
        viewGroup.setVisibility(0);
        dk2.fg fgVar = finderLiveMsg instanceof dk2.fg ? (dk2.fg) finderLiveMsg : null;
        if (fgVar == null || (q17 = fgVar.q()) == null || (obj = q17.f302833d) == null || (obj2 = q17.f302834e) == null) {
            return;
        }
        com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) obj2;
        java.lang.String str = (java.lang.String) obj;
        android.content.Context context = finderLiveEmojiView.getContext();
        kotlin.jvm.internal.o.d(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        java.lang.Integer num = ((mm2.j2) liveBuContext.a(mm2.j2.class)).E;
        if (num != null) {
            dimensionPixelSize = num.intValue();
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = dimensionPixelSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = dimensionPixelSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = dimensionPixelSize;
        }
        viewGroup.requestLayout();
        if (linearLayout != null) {
            linearLayout.requestLayout();
        }
        com.tencent.mm.feature.emoji.api.n6 n6Var = (com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
        com.tencent.mm.api.IEmojiInfo Bi = n6Var != null ? ((com.tencent.mm.feature.emoji.t2) n6Var).Bi(str, gVar) : null;
        if (Bi == null) {
            com.tencent.mars.xlog.Log.e("DanmakuItemEmoji", "emojiInfo is null");
            return;
        }
        finderLiveEmojiView.setEmojiInfo(Bi);
        finderLiveEmojiView.setEmojiMaxSize(dimensionPixelSize);
        finderLiveEmojiView.setEmojiMinSize(0);
        finderLiveEmojiView.requestLayout();
        finderLiveEmojiView.setStatusListener(new hk2.c(Bi, linearLayout, progressBar));
        com.tencent.mars.xlog.Log.i("DanmakuItemEmoji", "loadEmoji: md5=" + str + ", emojiMaxSize=" + dimensionPixelSize);
    }
}
