package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class ya extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f206051b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f206052c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f206053d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f206054e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f206055f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.AnimImageView f206056g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f206057h;

    /* renamed from: i, reason: collision with root package name */
    public rl5.r f206058i;

    /* renamed from: j, reason: collision with root package name */
    public wl5.x f206059j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.y f206060k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.LinearLayout f206061l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f206062m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f206063n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewStub f206064o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate f206065p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f206066q;

    public static void b(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.ya yaVar, yb5.d dVar, java.lang.Boolean bool) {
        if (yaVar == null) {
            return;
        }
        if (f9Var.getMsgId() == ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).f199060f) {
            yaVar.f206057h.setVisibility(0);
            if (bool.booleanValue()) {
                yaVar.f206051b.setBackgroundResource(com.tencent.mm.R.drawable.bzq);
            } else {
                yaVar.f206051b.setBackgroundResource(com.tencent.mm.R.drawable.bzw);
            }
        } else {
            yaVar.f206057h.setVisibility(8);
            if (bool.booleanValue()) {
                yaVar.f206051b.setBackgroundResource(com.tencent.mm.R.drawable.f481181mh);
            } else {
                yaVar.f206051b.setBackgroundResource(com.tencent.mm.R.drawable.o_);
            }
        }
        if (f9Var.getMsgId() == ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) dVar.f460708c.a(sb5.i2.class))).f199059e) {
            yaVar.f206056g.setVisibility(0);
            yaVar.f206056g.b();
        } else {
            yaVar.f206056g.setVisibility(8);
            yaVar.f206056g.c();
        }
    }

    public com.tencent.mm.ui.chatting.viewitems.ya a(android.view.View view, boolean z17) {
        super.create(view);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.bkl);
        this.f206051b = mMNeat7extView;
        mMNeat7extView.setMaxWidth((int) (i65.a.f(mMNeat7extView.getContext(), com.tencent.mm.R.dimen.f480241sa) / j65.f.f297943g));
        this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        this.f206052c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bjp);
        this.f206055f = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.jts);
        this.f206053d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.jtt);
        this.f206054e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.jtx);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.clickArea = view.findViewById(com.tencent.mm.R.id.lgx);
        this.f206066q = view.findViewById(com.tencent.mm.R.id.lgy);
        this.f206063n = view.findViewById(com.tencent.mm.R.id.bkj);
        this.f206064o = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.ojd);
        this.f206060k = new com.tencent.mm.pluginsdk.ui.span.y(this.f206051b, new com.tencent.mm.pluginsdk.ui.span.y0(this.f206051b.getContext()));
        com.tencent.mm.ui.base.AnimImageView animImageView = (com.tencent.mm.ui.base.AnimImageView) view.findViewById(com.tencent.mm.R.id.bqu);
        this.f206056g = animImageView;
        animImageView.setType(3);
        this.f206061l = (android.widget.LinearLayout) this.convertView.findViewById(com.tencent.mm.R.id.spx);
        this.f206062m = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.spy);
        if (z17) {
            this.f206056g.setFromVoice(true);
        } else {
            this.f206056g.setFromVoice(false);
        }
        this.f206057h = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.neo);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f206051b;
    }
}
