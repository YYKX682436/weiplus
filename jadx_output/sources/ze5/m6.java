package ze5;

/* loaded from: classes9.dex */
public final class m6 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView f472091b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f472092c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f472093d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f472094e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f472095f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f472096g;

    public final com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view, boolean z17) {
        if (view == null) {
            return this;
        }
        super.create(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.timeTV = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bkm);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f472091b = (com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.bkf);
        this.checkBox = findViewById3 instanceof android.widget.CheckBox ? (android.widget.CheckBox) findViewById3 : null;
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.bky);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f472093d = findViewById4;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.sq9);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f472094e = findViewById5;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.bkz);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f472095f = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.sq_);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f472096g = (android.widget.TextView) findViewById7;
        android.widget.ImageView imageView = this.f472095f;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("captureTipsIcon");
            throw null;
        }
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.emoticonstore_capture_icon, view.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100)));
        android.widget.TextView textView = this.f472096g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("captureTipsTV");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        if (z17) {
            android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.brc);
            this.userTV = findViewById8 instanceof android.widget.TextView ? (android.widget.TextView) findViewById8 : null;
        } else {
            android.view.View findViewById9 = view.findViewById(com.tencent.mm.R.id.ott);
            this.uploadingPB = findViewById9 instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) findViewById9 : null;
            android.view.View findViewById10 = view.findViewById(com.tencent.mm.R.id.bqx);
            this.stateIV = findViewById10 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById10 : null;
            android.view.View findViewById11 = view.findViewById(com.tencent.mm.R.id.bqz);
            kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
            this.f472092c = (android.widget.ImageView) findViewById11;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.sru);
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View a17 = ((io.t) T6).a(context);
        linearLayout.addView(a17);
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = 8388613;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = a17.findViewById(com.tencent.mm.R.id.uw8).getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.gravity = 8388613;
            }
        }
        lf5.g.a(a17, true, z17);
        setQuoteView(T6);
        return this;
    }

    public final android.view.View b() {
        android.view.View view = this.f472093d;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("captureTipsView");
        throw null;
    }

    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView c() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView chattingEmojiMvvmView = this.f472091b;
        if (chattingEmojiMvvmView != null) {
            return chattingEmojiMvvmView;
        }
        kotlin.jvm.internal.o.o("emojiView");
        throw null;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return c();
    }
}
