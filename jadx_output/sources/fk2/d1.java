package fk2;

/* loaded from: classes3.dex */
public final class d1 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public static final fk2.c1 f263344m = new fk2.c1(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.view.View view = holder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemHighlightComment", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemHighlightComment", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        kotlin.jvm.internal.o.e(mMNeat7extView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView) mMNeat7extView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        fk2.c1 c1Var = f263344m;
        sb6.append(c1Var.a());
        sb6.append(' ');
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            j17 = "";
        }
        sb6.append(j17);
        java.lang.String sb7 = sb6.toString();
        we2.a aVar = this.f445240a;
        int f17 = aVar.f();
        boolean h17 = aVar.h(i17);
        android.view.ViewParent parent = finderLiveFoldTextView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        finderLiveFoldTextView.setTextSize(this.f445247h);
        finderLiveFoldTextView.setVisibility(0);
        if (f17 > 0) {
            finderLiveFoldTextView.o(sb7, 5, f17, h17, new fk2.b1(1), true, true);
        } else {
            finderLiveFoldTextView.b(c1Var.b(sb7, 1));
        }
        kotlinx.coroutines.y0 y0Var = holder.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new fk2.a1(finderLiveFoldTextView, sb7, viewGroup, f17, h17, null), 2, null);
        }
        holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        mMNeat7extView.setTag(com.tencent.mm.R.id.e68, c1Var.a());
    }

    @Override // we2.o
    public dk2.zf f(r45.t12 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.mf(msg);
    }

    @Override // we2.o
    public int n() {
        return 100004;
    }
}
