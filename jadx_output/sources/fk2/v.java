package fk2;

/* loaded from: classes3.dex */
public abstract class v extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263494m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
        this.f263494m = "CommentItemBaseEmoji";
    }

    public static final void q(fk2.v vVar, android.content.Context context, android.view.View view) {
        if (vVar.l()) {
            view.setPadding(0, 0, 0, 0);
        } else {
            view.setPadding(context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479671c8), 0, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479648bn), context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479648bn));
        }
    }

    public final void r(java.lang.String str, com.tencent.mm.protobuf.g gVar, android.view.View view) {
        df2.ih ihVar;
        com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView finderLiveEmojiView = (com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView) view.findViewById(com.tencent.mm.R.id.ua_);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.uaa);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ual);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.uaj);
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.uak);
        com.tencent.mm.plugin.finder.live.view.k0 p17 = this.f445240a.p();
        if (p17 != null && (ihVar = (df2.ih) p17.getController(df2.ih.class)) != null) {
            java.lang.Integer num = ihVar.f230405v;
            if (num != null) {
                int intValue = num.intValue();
                finderLiveEmojiView.setEmojiMaxSize(intValue);
                findViewById.getLayoutParams().width = intValue;
                findViewById.getLayoutParams().height = intValue;
                findViewById.requestLayout();
            }
            java.lang.Integer num2 = ihVar.f230406w;
            if (num2 != null) {
                finderLiveEmojiView.setEmojiMinSize(num2.intValue());
            }
        }
        com.tencent.mm.api.IEmojiInfo Bi = ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class))).Bi(str, gVar);
        finderLiveEmojiView.setEmojiInfo(Bi);
        finderLiveEmojiView.requestLayout();
        com.tencent.mars.xlog.Log.i(this.f263494m, "[loadEmoji] md5=" + ((com.tencent.mm.storage.emotion.EmojiInfo) Bi).getMd5());
        finderLiveEmojiView.setStatusListener(new fk2.u(Bi, findViewById, this, findViewById2, findViewById3, findViewById4));
    }

    public final void s(android.content.Context context, bm2.h1 holder, dk2.zf msg) {
        jz5.l q17;
        df2.ih ihVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = msg instanceof dk2.fg;
        dk2.fg fgVar = z17 ? (dk2.fg) msg : null;
        java.lang.String b17 = fgVar != null ? fgVar.b() : null;
        if (b17 == null || b17.length() == 0) {
            dk2.fg fgVar2 = z17 ? (dk2.fg) msg : null;
            if (fgVar2 == null || (q17 = fgVar2.q()) == null) {
                return;
            }
            java.lang.String str = (java.lang.String) q17.f302833d;
            com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) q17.f302834e;
            if (str == null || gVar == null) {
                return;
            }
            com.tencent.mm.plugin.finder.live.view.k0 p17 = this.f445240a.p();
            boolean z18 = (p17 == null || (ihVar = (df2.ih) p17.getController(df2.ih.class)) == null || !ihVar.f230407x) ? false : true;
            android.widget.FrameLayout frameLayout = z18 ? holder.f21934o : holder.f21933n;
            frameLayout.setVisibility(0);
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e9v, (android.view.ViewGroup) frameLayout, false);
            frameLayout.addView(inflate);
            com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView finderLiveEmojiView = (com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView) inflate.findViewById(com.tencent.mm.R.id.ua_);
            r(str, gVar, inflate);
            q(this, context, frameLayout);
            if (z18) {
                holder.f21929g.post(new fk2.t(holder, inflate, this, finderLiveEmojiView, str, gVar, context));
            }
        }
    }
}
