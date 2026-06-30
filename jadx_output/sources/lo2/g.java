package lo2;

/* loaded from: classes2.dex */
public final class g extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f320122d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f320123e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f320124f;

    public g(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f320122d = context;
        this.f320123e = new java.util.ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f320123e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.lang.Object obj = this.f320123e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (r45.ag2) obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        android.app.Activity activity = this.f320122d;
        if (view == null) {
            view = android.view.View.inflate(activity, com.tencent.mm.R.layout.agt, null);
            view.setTag(new lo2.e());
        }
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI.MemberFansListAdapter.FansViewHolder");
        lo2.e eVar = (lo2.e) tag;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        eVar.f320113a = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.kbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        eVar.f320114b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.ag6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        java.lang.Object obj = this.f320123e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.ag2 ag2Var = (r45.ag2) obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = ag2Var.f369989d;
        if (finderContact == null || (str = finderContact.getHeadUrl()) == null) {
            str = "";
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d l17 = g1Var.l();
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.widget.ImageView imageView = eVar.f320113a;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("avatarIv");
            throw null;
        }
        l17.c(nVar, imageView, g1Var.h(mn2.f1.f329961o));
        android.widget.TextView textView = eVar.f320114b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nicknameTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = ag2Var.f369989d;
        java.lang.String username = finderContact2 != null ? finderContact2.getUsername() : null;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = ag2Var.f369989d;
        java.lang.String md6 = c61.yb.md(ybVar, username, finderContact3 != null ? finderContact3.getNickname() : null, false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, md6));
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.f484307ds5);
        findViewById4.setOnClickListener(new lo2.f(this, findViewById4, i17));
        return view;
    }
}
