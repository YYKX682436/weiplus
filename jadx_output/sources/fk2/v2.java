package fk2;

/* loaded from: classes3.dex */
public final class v2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263501m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
        this.f263501m = "https://channels.weixin.qq.com/platform/live/liveBuild";
    }

    @Override // we2.o
    public yz5.l c(dk2.zf msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new fk2.t2(this);
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        java.lang.String j17 = msg.j();
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        mMNeat7extView.b(j17);
        java.lang.String string = context.getString(com.tencent.mm.R.string.m6z);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.m6y, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        if (L >= 0 && string.length() + L <= string2.length()) {
            spannableString.setSpan(new fk2.u2(context, this), L, string.length() + L, 33);
        }
        mMNeat7extView.b(spannableString);
        android.view.View view = holder.f21930h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemShopMsgAnchorTips", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemShopMsgAnchorTips", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.cu_));
    }

    @Override // we2.o
    public int n() {
        return com.tencent.thumbplayer.utils.TPGlobalEventNofication.EVENT_ID_UPC_CHANGED;
    }
}
