package io;

/* loaded from: classes10.dex */
public final class g implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.p0 f293396a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f293397b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f293398c;

    /* renamed from: d, reason: collision with root package name */
    public long f293399d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f293400e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.y4 f293401f;

    /* renamed from: g, reason: collision with root package name */
    public cc5.a f293402g;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f293396a == null) {
            this.f293396a = new em.p0(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489197dn5, (android.view.ViewGroup) null));
            c(null, this.f293402g);
        }
        em.p0 p0Var = this.f293396a;
        kotlin.jvm.internal.o.d(p0Var);
        android.view.View view = p0Var.f254696a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        cc5.a aVar = (cc5.a) pVar;
        cc5.a aVar2 = this.f293402g;
        this.f293402g = aVar;
        c(aVar2, aVar);
    }

    public final void c(cc5.a aVar, cc5.a aVar2) {
        em.p0 p0Var;
        android.view.View.OnLongClickListener onLongClickListener;
        android.view.View view;
        android.view.View.OnClickListener onClickListener;
        em.p0 p0Var2;
        java.lang.CharSequence charSequence;
        em.p0 p0Var3;
        android.view.View view2;
        if (aVar2 == null || (p0Var = this.f293396a) == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView = p0Var.f254697b;
        android.view.View view3 = p0Var.f254696a;
        if (rTChattingEmojiView == null) {
            p0Var.f254697b = (com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView) view3.findViewById(com.tencent.mm.R.id.r1j);
        }
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView2 = p0Var.f254697b;
        kotlin.jvm.internal.o.f(rTChattingEmojiView2, "getVEmojiView(...)");
        java.lang.String str = aVar2.f40487f;
        long j17 = aVar2.f40485d;
        boolean z17 = aVar2.f40486e;
        com.tencent.mm.storage.y4 y4Var = aVar2.f40488g;
        java.lang.CharSequence charSequence2 = aVar2.f40489h;
        android.view.View.OnClickListener onClickListener2 = aVar2.f40490i;
        android.view.View.OnLongClickListener onLongClickListener2 = aVar2.f40491m;
        if (str == null) {
            p0Var3 = p0Var;
            view = view3;
        } else {
            if (!this.f293397b) {
                this.f293397b = true;
                rTChattingEmojiView2.a();
                rTChattingEmojiView2.addView(rTChattingEmojiView2.f190826m, new android.widget.FrameLayout.LayoutParams(-2, -2));
            }
            if (kotlin.jvm.internal.o.b(str, this.f293398c) && j17 == this.f293399d && z17 == this.f293400e) {
                java.lang.String d17 = y4Var != null ? y4Var.d() : null;
                if (d17 == null) {
                    d17 = "";
                }
                com.tencent.mm.storage.y4 y4Var2 = this.f293401f;
                java.lang.String d18 = y4Var2 != null ? y4Var2.d() : null;
                if (d18 == null) {
                    d18 = "";
                }
                if (kotlin.jvm.internal.o.b(d17, d18)) {
                    com.tencent.mars.xlog.Log.i("ChattingEmoticonView", "updateEmojiView, emoticon is the same,emoticonMd5: " + str + ", sessionId: " + j17 + ", isSend: " + z17 + ", emojiContent: " + y4Var);
                    onLongClickListener = onLongClickListener2;
                    p0Var2 = p0Var;
                    view = view3;
                    onClickListener = onClickListener2;
                    charSequence = charSequence2;
                    this.f293398c = str;
                    this.f293399d = j17;
                    this.f293400e = z17;
                    this.f293401f = y4Var;
                    rTChattingEmojiView2.setContentDescription(charSequence);
                    rTChattingEmojiView2.setOnClickListener(onClickListener);
                    rTChattingEmojiView2.setOnLongClickListener(onLongClickListener);
                    p0Var3 = p0Var2;
                }
            }
            com.tencent.mm.feature.emoji.api.j6 j6Var = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
            com.tencent.mm.storage.y4 y4Var3 = y4Var == null ? new com.tencent.mm.storage.y4("") : y4Var;
            ((com.tencent.mm.feature.emoji.h2) j6Var).getClass();
            onLongClickListener = onLongClickListener2;
            view = view3;
            onClickListener = onClickListener2;
            p0Var2 = p0Var;
            charSequence = charSequence2;
            rTChattingEmojiView2.c(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str), j17, z17, y4Var3.f196355c);
            this.f293398c = str;
            this.f293399d = j17;
            this.f293400e = z17;
            this.f293401f = y4Var;
            rTChattingEmojiView2.setContentDescription(charSequence);
            rTChattingEmojiView2.setOnClickListener(onClickListener);
            rTChattingEmojiView2.setOnLongClickListener(onLongClickListener);
            p0Var3 = p0Var2;
        }
        if (p0Var3.f254699d == null) {
            view2 = view;
            p0Var3.f254699d = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.qzb);
        } else {
            view2 = view;
        }
        android.widget.LinearLayout linearLayout = p0Var3.f254699d;
        kotlin.jvm.internal.o.f(linearLayout, "getLlEmoticonCaptureTipsContainer(...)");
        int i17 = aVar2.f40492n;
        android.view.View.OnClickListener onClickListener3 = aVar2.f40493o;
        if (p0Var3.f254698c == null) {
            p0Var3.f254698c = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f485398qz3);
        }
        android.widget.ImageView imageView = p0Var3.f254698c;
        kotlin.jvm.internal.o.f(imageView, "getIvEmoticonCaptureTipsIcon(...)");
        android.graphics.drawable.Drawable drawable = aVar2.f40494p;
        linearLayout.setVisibility(i17);
        linearLayout.setOnClickListener(onClickListener3);
        imageView.setImageDrawable(drawable);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293402g;
    }
}
