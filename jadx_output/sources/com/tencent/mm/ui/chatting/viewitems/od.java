package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class od extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205179b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f205180c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f205181d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.nd f205182e;

    /* renamed from: f, reason: collision with root package name */
    public rl5.r f205183f;

    /* renamed from: g, reason: collision with root package name */
    public wl5.x f205184g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f205185h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f205186i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f205187j;

    public com.tencent.mm.ui.chatting.viewitems.od a(android.view.View view, boolean z17) {
        super.create(view);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.bkl);
        this.f205179b = mMNeat7extView;
        mMNeat7extView.setMaxWidth((int) (mMNeat7extView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480241sa) / j65.f.f297943g));
        this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        this.f205180c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bjp);
        this.f205181d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bix);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f205182e = new com.tencent.mm.ui.chatting.viewitems.nd(this.f205179b, new com.tencent.mm.pluginsdk.ui.span.y0(this.f205179b.getContext()));
        this.f205185h = (android.widget.LinearLayout) this.convertView.findViewById(com.tencent.mm.R.id.f483679sr2);
        this.f205186i = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483681sr4);
        this.f205187j = (com.tencent.mm.ui.widget.imageview.WeImageView) this.convertView.findViewById(com.tencent.mm.R.id.f483680sr3);
        return this;
    }

    public android.view.View.OnTouchListener b(yb5.d dVar) {
        com.tencent.mm.ui.chatting.e6 e6Var = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1;
        if (e6Var == null) {
            return null;
        }
        com.tencent.mm.ui.chatting.viewitems.nd ndVar = this.f205182e;
        ndVar.f204923m = e6Var;
        return ndVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f205179b;
    }
}
