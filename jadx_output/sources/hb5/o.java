package hb5;

/* loaded from: classes11.dex */
public class o extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f280241o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f280242p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.c6 f280243q;

    /* renamed from: r, reason: collision with root package name */
    public o11.g f280244r;

    public o(android.content.Context context, com.tencent.mm.ui.y9 y9Var, java.lang.String str) {
        super(context, new s01.h());
        this.f280243q = com.tencent.mm.ui.base.MMSlideDelView.getItemStatusCallBack();
        this.f280244r = null;
        this.f212611h = y9Var;
        this.f280241o = (com.tencent.mm.ui.MMActivity) context;
        this.f280242p = str;
        o11.f fVar = new o11.f();
        java.lang.String str2 = s01.r.f401924a;
        fVar.f342083g = qk.b.a(str);
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
        this.f280244r = fVar.a();
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s01.h hVar = (s01.h) obj;
        if (hVar == null) {
            hVar = new s01.h();
        }
        hVar.convertFrom(cursor);
        return hVar;
    }

    @Override // com.tencent.mm.ui.z9, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        super.g(i17, a1Var, obj);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        hb5.n nVar;
        s01.h hVar = (s01.h) getItem(i17);
        com.tencent.mm.ui.MMActivity mMActivity = this.f280241o;
        if (view == null) {
            nVar = new hb5.n();
            view2 = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.a98, null);
            nVar.f280236a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a_4);
            nVar.f280237b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k3s);
            view2.setTag(nVar);
        } else {
            view2 = view;
            nVar = (hb5.n) view.getTag();
        }
        n11.a.b().h(hVar.field_headImageUrl, nVar.f280236a, this.f280244r);
        nVar.f280237b.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(mMActivity, hVar.field_chatName, (int) nVar.f280237b.getTextSize()));
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        c();
        s01.m Ui = r01.q3.Ui();
        Ui.getClass();
        s(Ui.f401900d.B("select * from BizChatInfo where brandUserName = '" + this.f280242p + "' and (bitFlag & 8) != 0  order by  case when length(BizChatInfo.chatNamePY) > 0 then upper(BizChatInfo.chatNamePY)  else upper(BizChatInfo.chatName) end asc,  upper(BizChatInfo.chatNamePY) asc,  upper(BizChatInfo.chatName) asc ", null));
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }
}
