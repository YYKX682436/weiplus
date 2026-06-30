package fk2;

/* loaded from: classes3.dex */
public final class s1 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263472m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
        this.f263472m = "CommentItemLocalLocation";
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf zfVar, int i17) {
        dk2.zf msg = zfVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        jz5.f0 f0Var = null;
        if (!(msg instanceof dk2.ja)) {
            msg = null;
        }
        if (msg != null) {
            dk2.ja jaVar = (dk2.ja) msg;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = context.getString(com.tencent.mm.R.string.doj) + ' ' + jaVar.j();
            ((ke0.e) xVar).getClass();
            com.tencent.mm.pluginsdk.ui.span.f0 f0Var2 = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f273498f, q(), 0.0f, 0.0f, 6, null);
            java.lang.String q17 = q();
            float f17 = gm2.w.f273511k;
            f0Var2.c(new gm2.v(a17, new gm2.w(q17, f17, f17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8), gm2.w.f273509i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9), gm2.w.f273510j, 0.0f, 128, null)), 0, q().length() + 0, 33);
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
            mMNeat7extView.b(f0Var2);
            mMNeat7extView.setTextSize(this.f445247h);
            mMNeat7extView.setVisibility(0);
            holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
            android.view.View view = holder.f21930h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalLocation", "onBinderLocationMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalLocation", "onBinderLocationMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewParent parent = mMNeat7extView.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
            relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
            mMNeat7extView.setMaxLines(1);
            mMNeat7extView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            mMNeat7extView.setTag(com.tencent.mm.R.id.e68, context.getString(com.tencent.mm.R.string.doj));
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Bk(1, jaVar);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(this.f263472m, "[onBinderLocationMsg]  msg is not location");
        }
    }

    @Override // we2.o
    public dk2.zf f(r45.t12 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        r45.ze2 i17 = this.f445240a.i();
        if (i17 != null) {
            return new dk2.ja(msg, i17);
        }
        return null;
    }

    @Override // we2.o
    public int n() {
        return 10018;
    }

    public final java.lang.String q() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.doj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
