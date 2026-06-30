package hd2;

/* loaded from: classes10.dex */
public final class t implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f280530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f280531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f280534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f280535f;

    public t(android.view.ViewGroup viewGroup, so2.y0 y0Var, android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, android.widget.ImageView imageView) {
        this.f280530a = viewGroup;
        this.f280531b = y0Var;
        this.f280532c = view;
        this.f280533d = view2;
        this.f280534e = finderEmojiView;
        this.f280535f = imageView;
    }

    @Override // sr.b
    public void a(int i17) {
        android.view.ViewGroup viewGroup = this.f280530a;
        so2.y0 y0Var = this.f280531b;
        if (i17 == 1) {
            viewGroup.setVisibility(8);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = y0Var.f410714r;
            if (iEmojiInfo != null) {
                com.tencent.mm.feature.emoji.api.w5 w5Var = (com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class);
                hd2.s sVar = new hd2.s(this.f280534e, this.f280535f);
                ((com.tencent.mm.feature.emoji.m0) w5Var).getClass();
                zq.h.f474972a.c((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, sVar);
                return;
            }
            return;
        }
        if (i17 != 0 && i17 != -1) {
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = y0Var.f410714r;
            if ((iEmojiInfo2 == null || iEmojiInfo2.E0()) ? false : true) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = pm0.v.u(y0Var.f410703d.t0());
                objArr[1] = java.lang.Integer.valueOf(i17);
                com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = y0Var.f410714r;
                java.lang.String md52 = iEmojiInfo3 != null ? iEmojiInfo3.getMd5() : null;
                objArr[2] = md52 != null ? md52 : "";
                com.tencent.mars.xlog.Log.i("FinderCommentShareDialogFragment", "commendId %s emojiStatus %d md5 %s not Exist", objArr);
                return;
            }
            return;
        }
        viewGroup.setVisibility(0);
        android.view.View view = this.f280532c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$setCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$setCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f280533d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$setCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$setCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = pm0.v.u(y0Var.f410703d.t0());
        objArr2[1] = java.lang.Integer.valueOf(i17);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo4 = y0Var.f410714r;
        java.lang.String md53 = iEmojiInfo4 != null ? iEmojiInfo4.getMd5() : null;
        objArr2[2] = md53 != null ? md53 : "";
        com.tencent.mars.xlog.Log.i("FinderCommentShareDialogFragment", "commendId %s emojiStatus %d md5 %s", objArr2);
    }
}
