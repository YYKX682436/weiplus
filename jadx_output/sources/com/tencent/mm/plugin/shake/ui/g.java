package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class g extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f162264o;

    /* renamed from: p, reason: collision with root package name */
    public int f162265p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.storage.qa f162266q;

    /* renamed from: r, reason: collision with root package name */
    public db5.f6 f162267r;

    /* renamed from: s, reason: collision with root package name */
    public db5.b6 f162268s;

    /* renamed from: t, reason: collision with root package name */
    public db5.e6 f162269t;

    /* renamed from: u, reason: collision with root package name */
    public final db5.c6 f162270u;

    public g(android.content.Context context, com.tencent.mm.storage.qa qaVar, int i17) {
        super(context, new com.tencent.mm.storage.pa());
        this.f162265p = -1;
        this.f162270u = com.tencent.mm.ui.base.MMSlideDelView.getItemStatusCallBack();
        this.f162264o = (com.tencent.mm.ui.MMActivity) context;
        this.f162265p = i17;
        this.f162266q = qaVar;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.pa paVar = (com.tencent.mm.storage.pa) obj;
        if (paVar == null) {
            paVar = new com.tencent.mm.storage.pa();
        }
        paVar.convertFrom(cursor);
        return paVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.shake.ui.f fVar;
        android.view.View view2;
        com.tencent.mm.storage.pa paVar = (com.tencent.mm.storage.pa) getItem(i17);
        com.tencent.mm.ui.MMActivity mMActivity = this.f162264o;
        if (view == null) {
            com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView = (com.tencent.mm.ui.base.MMSlideDelView) android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.f488194k4, null);
            fVar = new com.tencent.mm.plugin.shake.ui.f();
            android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.chi, null);
            fVar.f162260c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.cfv);
            fVar.f162258a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.d0q);
            fVar.f162259b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m_4);
            fVar.f162261d = mMSlideDelView.findViewById(com.tencent.mm.R.id.f486958n04);
            mMSlideDelView.setView(inflate);
            mMSlideDelView.setPerformItemClickListener(this.f162267r);
            mMSlideDelView.setGetViewPositionCallback(this.f162268s);
            mMSlideDelView.setItemStatusCallBack(this.f162270u);
            mMSlideDelView.setEnable(false);
            mMSlideDelView.setTag(fVar);
            view2 = mMSlideDelView;
        } else {
            fVar = (com.tencent.mm.plugin.shake.ui.f) view.getTag();
            view2 = view;
        }
        fVar.f162261d.setTag(java.lang.Long.valueOf(paVar.field_svrid));
        fVar.f162261d.setOnClickListener(new com.tencent.mm.plugin.shake.ui.e(this));
        com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(paVar.field_content);
        android.widget.TextView textView = fVar.f162258a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String b17 = f17.b();
        float textSize = fVar.f162258a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(mMActivity, b17, textSize));
        fVar.f162259b.setText(paVar.field_sayhicontent);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(fVar.f162260c, paVar.field_sayhiuser, null);
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        int i17 = this.f162265p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT * FROM ");
        com.tencent.mm.storage.qa qaVar = this.f162266q;
        sb6.append(qaVar.getTableName());
        sb6.append(" where isSend = 0 ORDER BY createtime desc LIMIT ");
        sb6.append(i17);
        s(qaVar.f195251d.B(sb6.toString(), null));
        notifyDataSetChanged();
    }
}
