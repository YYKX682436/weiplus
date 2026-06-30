package rb2;

/* loaded from: classes2.dex */
public final class i2 implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f393651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393654e;

    public i2(so2.y0 y0Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3) {
        this.f393650a = y0Var;
        this.f393651b = viewGroup;
        this.f393652c = view;
        this.f393653d = view2;
        this.f393654e = view3;
    }

    @Override // sr.b
    public void a(int i17) {
        so2.y0 y0Var = this.f393650a;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = y0Var.f410714r;
        boolean z17 = iEmojiInfo != null && iEmojiInfo.E0();
        android.view.ViewGroup viewGroup = this.f393651b;
        if (z17 || i17 == 1) {
            viewGroup.setVisibility(8);
            return;
        }
        if (i17 == 0) {
            viewGroup.setVisibility(0);
            android.view.View view = this.f393652c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f393653d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f393654e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = pm0.v.u(y0Var.f410703d.t0());
            objArr[1] = java.lang.Integer.valueOf(i17);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = y0Var.f410714r;
            java.lang.String md52 = iEmojiInfo2 != null ? iEmojiInfo2.getMd5() : null;
            objArr[2] = md52 != null ? md52 : "";
            com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "commendId %s emojiStatus %d md5 %s", objArr);
            return;
        }
        if (i17 != -1) {
            com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = y0Var.f410714r;
            if ((iEmojiInfo3 == null || iEmojiInfo3.E0()) ? false : true) {
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                objArr2[0] = pm0.v.u(y0Var.f410703d.t0());
                objArr2[1] = java.lang.Integer.valueOf(i17);
                com.tencent.mm.api.IEmojiInfo iEmojiInfo4 = y0Var.f410714r;
                java.lang.String md53 = iEmojiInfo4 != null ? iEmojiInfo4.getMd5() : null;
                objArr2[2] = md53 != null ? md53 : "";
                com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "commendId %s emojiStatus %d md5 %s not Exist", objArr2);
                return;
            }
            return;
        }
        viewGroup.setVisibility(0);
        android.view.View view4 = this.f393652c;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f393653d;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f393654e;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object[] objArr3 = new java.lang.Object[3];
        objArr3[0] = pm0.v.u(y0Var.f410703d.t0());
        objArr3[1] = java.lang.Integer.valueOf(i17);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo5 = y0Var.f410714r;
        java.lang.String md54 = iEmojiInfo5 != null ? iEmojiInfo5.getMd5() : null;
        objArr3[2] = md54 != null ? md54 : "";
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "commendId %s emojiStatus %d md5 %s", objArr3);
    }
}
