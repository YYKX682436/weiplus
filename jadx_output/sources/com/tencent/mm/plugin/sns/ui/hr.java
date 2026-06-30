package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hr extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f168529o;

    /* renamed from: p, reason: collision with root package name */
    public final android.app.Activity f168530p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI f168531q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI, android.app.Activity activity) {
        super(activity, new com.tencent.mm.plugin.sns.storage.v1());
        this.f168531q = snsStrangerCommentDetailUI;
        this.f168529o = new com.tencent.mm.plugin.sns.ui.er(this);
        this.f168530p = activity;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        com.tencent.mm.plugin.sns.storage.v1 v1Var = (com.tencent.mm.plugin.sns.storage.v1) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        if (v1Var == null) {
            v1Var = new com.tencent.mm.plugin.sns.storage.v1();
        }
        v1Var.convertFrom(cursor);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        return v1Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.gr grVar;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        android.app.Activity activity = this.f168530p;
        if (view == null) {
            grVar = new com.tencent.mm.plugin.sns.ui.gr(this);
            view2 = android.view.View.inflate(activity, com.tencent.mm.R.layout.ctt, null);
            grVar.f168456a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n76);
            grVar.f168459d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n7a);
            grVar.f168457b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n7e);
            grVar.f168460e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n7f);
            grVar.f168458c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n7g);
            grVar.f168461f = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n7b);
            view2.setTag(grVar);
        } else {
            grVar = (com.tencent.mm.plugin.sns.ui.gr) view.getTag();
            view2 = view;
        }
        com.tencent.mm.plugin.sns.storage.v1 v1Var = (com.tencent.mm.plugin.sns.storage.v1) getItem(i17);
        try {
            r45.k76 k76Var = (r45.k76) new r45.k76().parseFrom(v1Var.field_curActionBuf);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(grVar.f168456a, k76Var.f378458d, pc4.d.f353410a.l());
            grVar.f168456a.setTag(k76Var.f378458d);
            grVar.f168456a.setOnClickListener(this.f168529o);
            java.lang.String str = k76Var.f378460f;
            if (str == null) {
                str = ((com.tencent.mm.plugin.sns.storage.v1) this.f212607d).field_talker;
            }
            grVar.f168457b.setTag(k76Var.f378458d);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = grVar.f168457b.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(activity, str, textSize);
            j17.setSpan(new com.tencent.mm.plugin.sns.ui.fr(this, activity, k76Var.f378458d, null), 0, str.length(), 33);
            grVar.f168457b.setText(j17, android.widget.TextView.BufferType.SPANNABLE);
            grVar.f168457b.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.p5());
            if (v1Var.field_type == 3) {
                grVar.f168459d.setVisibility(0);
                grVar.f168461f.setVisibility(8);
                com.tencent.mm.plugin.sns.ui.os.d(activity, k76Var.f378464m * 1000);
                grVar.f168459d.setText(k76Var.f378465n + " ");
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(grVar.f168459d, 2);
                grVar.f168459d.setVisibility(0);
            } else {
                grVar.f168459d.setVisibility(8);
                grVar.f168461f.setVisibility(0);
            }
            if (c01.z1.r().equals(k76Var.f378458d)) {
                grVar.f168460e.setVisibility(8);
            } else {
                grVar.f168460e.setVisibility(0);
                t(grVar.f168460e, k76Var.f378463i);
            }
            grVar.f168458c.setText("" + com.tencent.mm.plugin.sns.ui.os.d(activity, k76Var.f378464m * 1000));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsStrangerCommentDetailUI", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        int i17 = com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.f167423y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f168531q;
        java.lang.String str = snsStrangerCommentDetailUI.f167435r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        long j17 = snsStrangerCommentDetailUI.f167431n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        Aj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStrangerCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from SnsComment where talker = ");
        Aj.P0();
        sb6.append(d95.b0.O(str));
        sb6.append(" and  snsID = ");
        sb6.append(j17);
        sb6.append(" and ( type = 3 or type = 5 )");
        android.database.Cursor B = Aj.f166156d.B(sb6.toString(), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStrangerCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        s(B);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
    }

    public final void t(android.widget.TextView textView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        android.app.Activity activity = this.f168530p;
        com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f168531q;
        if (i17 != 18) {
            switch (i17) {
                case 22:
                case 23:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                    textView.setText(snsStrangerCommentDetailUI.getString(com.tencent.mm.R.string.jac));
                    textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.tencent.mm.R.drawable.bld), (android.graphics.drawable.Drawable) null);
                    break;
                case 25:
                    textView.setText(snsStrangerCommentDetailUI.getString(com.tencent.mm.R.string.ja_));
                    textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.tencent.mm.R.drawable.bl_), (android.graphics.drawable.Drawable) null);
                    break;
                case 30:
                    textView.setText(snsStrangerCommentDetailUI.getString(com.tencent.mm.R.string.jab));
                    textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.tencent.mm.R.drawable.bla), (android.graphics.drawable.Drawable) null);
                    break;
                default:
                    textView.setText(snsStrangerCommentDetailUI.getString(com.tencent.mm.R.string.jad));
                    textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.tencent.mm.R.drawable.blc), (android.graphics.drawable.Drawable) null);
                    break;
            }
        } else {
            textView.setText(snsStrangerCommentDetailUI.getString(com.tencent.mm.R.string.jaa));
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(activity, com.tencent.mm.R.drawable.blb), (android.graphics.drawable.Drawable) null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
    }
}
