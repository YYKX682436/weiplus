package fk2;

/* loaded from: classes3.dex */
public class f2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final we2.a f263381m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f263382n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f263383o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f263384p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(we2.a liveBuContext) {
        super(liveBuContext);
        kotlin.jvm.internal.o.g(liveBuContext, "liveBuContext");
        this.f263381m = liveBuContext;
        this.f263382n = jz5.h.b(fk2.b2.f263317d);
        this.f263383o = "(.*?)<_wc_custom_img_.+?src\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*.*?/>(.*?)";
        this.f263384p = jz5.h.b(new fk2.e2(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    @Override // we2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r25, bm2.h1 r26, dk2.zf r27, int r28) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk2.f2.d(android.content.Context, bm2.h1, dk2.zf, int):void");
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.k5(msg);
    }

    @Override // we2.o
    public int n() {
        return 20074;
    }

    @Override // we2.o
    public void p(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(payloads, "payloads");
    }

    public final void q(android.content.Context context, bm2.h1 h1Var, dk2.zf zfVar, boolean z17) {
        android.view.View view = h1Var.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify", "specialBindNotifyMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify", "specialBindNotifyMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.xn1 r17 = zfVar.r();
        java.util.LinkedList list = r17 != null ? r17.getList(11) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("badgeInfo size = ");
        sb6.append(list != null ? list.size() : 0);
        com.tencent.mars.xlog.Log.i("CommentItemNotify", sb6.toString());
        ((fk2.y2) ((jz5.n) this.f263384p).getValue()).r(zfVar, context, h1Var, zfVar.j(), z17 ? list : null);
    }
}
