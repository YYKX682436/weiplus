package fk2;

/* loaded from: classes3.dex */
public final class n0 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263439m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(we2.a liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f263439m = "CommentItemGameJump";
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = msg instanceof dk2.s9;
        java.lang.String str = this.f263439m;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "#onBinderGameLiveJumpMsg msg is not an gameJump info");
            return;
        }
        int integer = ((dk2.s9) msg).f234070k.getInteger(2);
        if (integer == 1) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = context.getString(com.tencent.mm.R.string.dlr) + ' ' + msg.j();
            ((ke0.e) xVar).getClass();
            f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
            android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f273498f, q(), 0.0f, 0.0f, 6, null);
            java.lang.String q17 = q();
            float f17 = gm2.w.f273511k;
            f0Var.c(new gm2.v(a17, new gm2.w(q17, f17, f17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8), gm2.w.f273509i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9), gm2.w.f273510j, 0.0f, 128, null)), 0, q().length() + 0, 33);
        } else {
            if (integer != 2) {
                com.tencent.mars.xlog.Log.e(str, "onBinderGameLiveJumpMsg failed,wrong type");
                return;
            }
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = context.getString(com.tencent.mm.R.string.dlu) + ' ' + msg.j();
            ((ke0.e) xVar2).getClass();
            f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3));
            android.graphics.drawable.Drawable a18 = gm2.u.a(gm2.v.f273498f, r(), 0.0f, 0.0f, 6, null);
            java.lang.String r17 = r();
            float f18 = gm2.w.f273511k;
            f0Var.c(new gm2.v(a18, new gm2.w(r17, f18, f18, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8), gm2.w.f273509i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9), gm2.w.f273510j, 0.0f, 128, null)), 0, r().length() + 0, 33);
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        mMNeat7extView.b(f0Var);
        mMNeat7extView.setTextSize(this.f445247h);
        mMNeat7extView.setVisibility(0);
        holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        android.view.View view = holder.f21930h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemGameJump", "onBinderGameLiveJumpMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemGameJump", "onBinderGameLiveJumpMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewParent parent = mMNeat7extView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        mMNeat7extView.setMaxLines(1);
        mMNeat7extView.setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    @Override // we2.o
    public int n() {
        return 20040;
    }

    public final java.lang.String q() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dlr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String r() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dlu);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
