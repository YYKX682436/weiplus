package ze5;

/* loaded from: classes9.dex */
public final class y2 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f472308b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f472309c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f472310d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f472311e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNewFileMvvmView f472312f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView f472313g;

    public final ze5.y2 a(android.view.View view, boolean z17) {
        if (view == null) {
            return this;
        }
        super.create(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.sqb);
        this.f472312f = findViewById instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNewFileMvvmView ? (com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNewFileMvvmView) findViewById : null;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ott);
        this.uploadingPB = findViewById2 instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) findViewById2 : null;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.bqx);
        this.stateIV = findViewById3 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById3 : null;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.brc);
        this.userTV = findViewById4 instanceof android.widget.TextView ? (android.widget.TextView) findViewById4 : null;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.bkf);
        this.checkBox = findViewById5 instanceof android.widget.CheckBox ? (android.widget.CheckBox) findViewById5 : null;
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.a1l);
        this.f472308b = findViewById6 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) findViewById6 : null;
        com.tencent.mm.ui.chatting.w5.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f472309c = (android.widget.LinearLayout) this.convertView.findViewById(com.tencent.mm.R.id.f483679sr2);
        this.f472310d = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483681sr4);
        this.f472311e = (com.tencent.mm.ui.widget.imageview.WeImageView) this.convertView.findViewById(com.tencent.mm.R.id.f483680sr3);
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.sro);
        this.f472313g = findViewById7 instanceof com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView ? (com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView) findViewById7 : null;
        return this;
    }
}
