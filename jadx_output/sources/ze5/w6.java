package ze5;

/* loaded from: classes9.dex */
public class w6 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView f472283b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView f472284c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f472285d;

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f472283b = (com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView) view.findViewById(com.tencent.mm.R.id.srn);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f472284c = (com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView) view.findViewById(com.tencent.mm.R.id.sqi);
        this.f472285d = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f485998ui2);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.otv);
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.view.View a17 = ((io.t) T6).a(view.getContext());
        linearLayout.addView(a17);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) a17.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        if (z17) {
            layoutParams.gravity = 3;
        } else {
            layoutParams.gravity = 5;
        }
        a17.setLayoutParams(layoutParams);
        setQuoteView(T6);
        lf5.g.a(a17, true, z17);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f472284c.getMainContentIv();
    }
}
