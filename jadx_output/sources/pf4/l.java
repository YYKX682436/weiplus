package pf4;

/* loaded from: classes4.dex */
public abstract class l extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView f353874d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f353875e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f353876f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f353877g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f353878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pf4.q f353879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pf4.q qVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f353879i = qVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.nkz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f353874d = (com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.nl8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f353875e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f487124nl2);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f353876f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f487122nl0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f353877g = findViewById4;
        this.f353878h = i();
    }

    public abstract android.view.View i();

    public void j(int i17, gf4.a comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        android.view.View view = this.itemView;
        if (view instanceof com.tencent.mm.plugin.story.ui.view.CommentItemView) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.CommentItemView");
            ((com.tencent.mm.plugin.story.ui.view.CommentItemView) view).setComment(comment);
        }
        android.view.View view2 = this.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder", "onBind", "(ILcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder", "onBind", "(ILcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.itemView.post(new pf4.i(this));
        this.f353877g.setOnClickListener(new pf4.j(this.f353879i));
        if (this.itemView instanceof com.tencent.mm.plugin.story.ui.view.CommentItemView) {
            boolean z17 = comment.f271335f;
            android.view.View view3 = this.f353878h;
            if (z17) {
                view3.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(this.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f478522a3), android.graphics.PorterDuff.Mode.SRC_ATOP));
            } else {
                view3.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(this.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.a7g), android.graphics.PorterDuff.Mode.SRC_ATOP));
            }
        }
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = comment.f271330a;
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = this.f353875e;
        android.content.Context context = textView.getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        java.lang.CharSequence j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize);
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(comment.f271339j, true);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        java.lang.String g28 = n18 != null ? n18.g2() : null;
        java.lang.String str2 = g28 != null ? g28 : "";
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str2, textSize2);
        if (comment.f271341l != 0) {
            j17 = ((java.lang.Object) j17) + ' ' + textView.getContext().getResources().getString(com.tencent.mm.R.string.f490541y0) + ' ' + ((java.lang.Object) j18);
        }
        textView.setText(j17);
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView2 = this.f353876f;
        android.content.Context context3 = textView2.getContext();
        float textSize3 = textView2.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, comment.f271331b, textSize3));
        com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
        com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView commentAvatarImageView = this.f353874d;
        wVar.Ni(commentAvatarImageView, str);
        ef4.w.f252468t.g().P0(str).t0();
        commentAvatarImageView.getClass();
        if (!android.text.TextUtils.equals(commentAvatarImageView.f171880d, str)) {
            commentAvatarImageView.f171880d = str;
        }
        commentAvatarImageView.setHintBg(comment.f271336g ? commentAvatarImageView.getResources().getColor(com.tencent.mm.R.color.a7g) : 0);
        commentAvatarImageView.setOnClickListener(new pf4.k(comment, this));
    }
}
