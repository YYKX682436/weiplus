package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class n1 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f152186o;

    /* renamed from: p, reason: collision with root package name */
    public int f152187p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.storage.u8 f152188q;

    /* renamed from: r, reason: collision with root package name */
    public db5.f6 f152189r;

    /* renamed from: s, reason: collision with root package name */
    public db5.b6 f152190s;

    /* renamed from: t, reason: collision with root package name */
    public db5.e6 f152191t;

    /* renamed from: u, reason: collision with root package name */
    public final db5.c6 f152192u;

    public n1(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI, android.content.Context context, com.tencent.mm.storage.u8 u8Var, int i17) {
        super(context, new com.tencent.mm.storage.t8());
        this.f152187p = -1;
        this.f152192u = com.tencent.mm.ui.base.MMSlideDelView.getItemStatusCallBack();
        this.f152186o = (com.tencent.mm.ui.MMActivity) context;
        this.f152187p = i17;
        this.f152188q = u8Var;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.t8 t8Var = (com.tencent.mm.storage.t8) obj;
        if (t8Var == null) {
            t8Var = new com.tencent.mm.storage.t8();
        }
        t8Var.convertFrom(cursor);
        return t8Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.nearby.ui.m1 m1Var;
        com.tencent.mm.storage.t8 t8Var = (com.tencent.mm.storage.t8) getItem(i17);
        com.tencent.mm.ui.MMActivity mMActivity = this.f152186o;
        if (view == null) {
            m1Var = new com.tencent.mm.plugin.nearby.ui.m1(this);
            com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView = (com.tencent.mm.ui.base.MMSlideDelView) android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.f488194k4, null);
            android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.chi, null);
            m1Var.f152183c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.cfv);
            m1Var.f152181a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.d0q);
            m1Var.f152182b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m_4);
            m1Var.f152184d = mMSlideDelView.findViewById(com.tencent.mm.R.id.f486958n04);
            mMSlideDelView.setView(inflate);
            mMSlideDelView.setPerformItemClickListener(this.f152189r);
            mMSlideDelView.setGetViewPositionCallback(this.f152190s);
            mMSlideDelView.setItemStatusCallBack(this.f152192u);
            mMSlideDelView.setEnable(false);
            mMSlideDelView.setTag(m1Var);
            view2 = mMSlideDelView;
        } else {
            view2 = view;
            m1Var = (com.tencent.mm.plugin.nearby.ui.m1) view.getTag();
        }
        java.lang.String str = t8Var.field_flag != 0 ? com.tencent.mm.storage.e9.f(t8Var.field_content).f193861c : t8Var.field_talker;
        android.widget.TextView textView = m1Var.f152181a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = m1Var.f152181a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(mMActivity, str, textSize));
        android.widget.TextView textView2 = m1Var.f152182b;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str2 = t8Var.field_sayhicontent;
        float textSize2 = m1Var.f152182b.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(mMActivity, str2, textSize2));
        m1Var.f152184d.setTag(java.lang.Long.valueOf(t8Var.field_svrid));
        m1Var.f152184d.setOnClickListener(new com.tencent.mm.plugin.nearby.ui.l1(this));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(m1Var.f152183c, t8Var.field_sayhiuser, null);
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        boolean c17 = m25.a.c();
        com.tencent.mm.storage.u8 u8Var = this.f152188q;
        if (c17) {
            int i17 = this.f152187p;
            s(u8Var.f196265d.B("SELECT a.* FROM (" + ("SELECT sayhiencryptuser,max(createtime) createtime FROM " + u8Var.getTableName() + " where isSend = 0 GROUP BY sayhiencryptuser LIMIT " + i17) + ") b left join " + u8Var.getTableName() + " a on b.sayhiencryptuser=a.sayhiencryptuser and b.createtime=a.createtime where a.isSend = 0 ORDER BY a.createtime desc LIMIT " + i17, null));
        } else {
            s(u8Var.f196265d.B("SELECT * FROM " + u8Var.getTableName() + " where isSend = 0 ORDER BY createtime desc LIMIT " + this.f152187p, null));
        }
        notifyDataSetChanged();
    }
}
