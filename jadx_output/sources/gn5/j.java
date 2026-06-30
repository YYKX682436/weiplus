package gn5;

/* loaded from: classes12.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.popview.EmojiPopView f273678d;

    public j(com.tencent.mm.view.popview.EmojiPopView emojiPopView) {
        this.f273678d = emojiPopView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/popview/EmojiPopView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.view.popview.EmojiPopView emojiPopView = this.f273678d;
        int i18 = emojiPopView.f213688x;
        if (i18 == 1) {
            nr.f.f339044a.a(4);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPopView", "delete: %s， %s, %s", emojiPopView.f213684t, java.lang.Integer.valueOf(emojiPopView.f213683s), java.lang.Boolean.valueOf(emojiPopView.f213689y));
            if (!emojiPopView.f213689y && ((i17 = emojiPopView.f213683s) == 0 || i17 == 1)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPopView", "showLoading");
                emojiPopView.f213689y = true;
                emojiPopView.postDelayed(emojiPopView.A, 100L);
                emojiPopView.f213687w = new z12.g(emojiPopView.f213683s, 2, java.util.Collections.singletonList(emojiPopView.f213684t), null);
                gm0.j1.n().f273288b.g(emojiPopView.f213687w);
            }
        } else if (i18 == 2) {
            nr.f.f339044a.a(2);
            com.tencent.mm.view.popview.EmojiPopView.e(emojiPopView);
        } else {
            nr.f.f339044a.a(5);
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = emojiPopView.f213685u;
            if (emojiInfo != null) {
                java.lang.String str = emojiInfo.field_groupId;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                qk.c0 c0Var = new qk.c0(str);
                c0Var.f364198g = 3;
                c0Var.f364155a = 16;
                c0Var.f364205n = true;
                com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                if (p6Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiPopView", "emoticon liteapp service not found");
                } else {
                    ((com.tencent.mm.feature.emoji.f4) p6Var).wi(emojiPopView.getContext(), c0Var);
                }
            }
            emojiPopView.a();
        }
        yj0.a.h(this, "com/tencent/mm/view/popview/EmojiPopView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
