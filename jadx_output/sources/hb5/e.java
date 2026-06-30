package hb5;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String[] f280158o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f280159p;

    /* renamed from: q, reason: collision with root package name */
    public final s01.h f280160q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f280161r;

    /* renamed from: s, reason: collision with root package name */
    public o11.g f280162s;

    public e(android.content.Context context, s01.a0 a0Var, s01.h hVar, java.lang.String[] strArr, java.util.List list) {
        super(context, a0Var);
        this.f280162s = null;
        this.f280160q = hVar;
        this.f280158o = strArr;
        this.f280159p = list;
        o11.f fVar = new o11.f();
        fVar.f342083g = s01.r.k(hVar.field_brandUserName);
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
        this.f280162s = fVar.a();
        com.tencent.mm.sdk.platformtools.x.K0(context.getResources().getDrawable(com.tencent.mm.R.raw.at_all_avater));
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s01.a0 a0Var = new s01.a0();
        a0Var.convertFrom(cursor);
        return a0Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        hb5.f fVar;
        if (view == null) {
            view = android.view.View.inflate(this.f212608e, com.tencent.mm.R.layout.f488158iq, null);
            fVar = new hb5.f(null);
            fVar.f280184a = (com.tencent.mm.ui.base.MaskLayout) view.findViewById(com.tencent.mm.R.id.a5y);
            fVar.f280185b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a5z);
            view.setTag(fVar);
        } else {
            fVar = (hb5.f) view.getTag();
        }
        if (i17 == 0 && com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI.f197886o) {
            fVar.getClass();
            throw null;
        }
        s01.a0 a0Var = (s01.a0) getItem(i17 - (com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI.f197886o ? 1 : 0));
        fVar.f280185b.setTextColor(i65.a.e(this.f212608e, com.tencent.mm.R.color.f479413yk));
        n11.a.b().h(a0Var.field_headImageUrl, (android.widget.ImageView) fVar.f280184a.getContentView(), this.f280162s);
        fVar.f280184a.setMaskDrawable(null);
        java.lang.String str = a0Var.field_userId;
        s01.h hVar = this.f280160q;
        java.lang.String v07 = hVar != null ? hVar.v0(str) : null;
        android.widget.TextView textView = fVar.f280185b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f212608e;
        float textSize = fVar.f280185b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, v07, textSize));
        return view;
    }

    @Override // com.tencent.mm.ui.z9
    public int m() {
        return com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI.f197886o ? 1 : 0;
    }

    @Override // com.tencent.mm.ui.z9
    public /* bridge */ /* synthetic */ java.lang.Object n() {
        return null;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public boolean p(int i17) {
        return false;
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        java.lang.String str;
        java.lang.String str2;
        c();
        s01.d0 Vi = r01.q3.Vi();
        java.lang.String str3 = this.f280161r;
        Vi.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *  from BizChatUserInfo where ");
        java.lang.String[] strArr = this.f280158o;
        java.lang.String str4 = "";
        if (strArr == null || strArr.length == 0) {
            str = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" 1=1 ");
            java.util.List list = this.f280159p;
            if (list == null || list.size() <= 0) {
                str2 = "";
            } else {
                java.util.Iterator it = list.iterator();
                str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + " and userId != '" + ((java.lang.String) it.next()) + "'";
                }
            }
            sb7.append(str2);
            sb7.append(" and userId in(");
            for (int i17 = 0; i17 < strArr.length; i17++) {
                if (i17 > 0) {
                    sb7.append(" , ");
                }
                sb7.append(" '");
                sb7.append(strArr[i17]);
                sb7.append("' ");
            }
            sb7.append(" )");
            str = sb7.toString();
        }
        sb6.append(str);
        if (str3 != null && !str3.equals("")) {
            str4 = " and (userName like '%" + str3 + "%' )";
        }
        sb6.append(str4);
        sb6.append(" order by  case when length(BizChatUserInfo.userNamePY) > 0 then upper(BizChatUserInfo.userNamePY)  else upper(BizChatUserInfo.userName) end asc,  upper(BizChatUserInfo.userNamePY) asc,  upper(BizChatUserInfo.userName) asc ");
        s(Vi.f401859e.B(sb6.toString(), null));
        notifyDataSetChanged();
    }
}
