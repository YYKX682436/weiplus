package or1;

/* loaded from: classes9.dex */
public class s1 extends android.widget.BaseAdapter implements l75.q0, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f347571d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f347572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI f347573f;

    public s1(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI, android.content.Context context) {
        this.f347573f = enterpriseBizEntranceListUI;
        this.f347571d = context;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange1 %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new or1.q1(this));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f347572e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (or1.v1) this.f347572e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        or1.r1 r1Var;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            r1Var = new or1.r1(this);
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f488740a91, null);
            r1Var.f347565a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5l);
            r1Var.f347566b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5r);
            view2.setTag(r1Var);
        } else {
            view2 = view;
            r1Var = (or1.r1) view.getTag();
        }
        or1.v1 v1Var = (or1.v1) this.f347572e.get(i17);
        if (v1Var == null) {
            r1Var.a();
            return view2;
        }
        r1Var.a();
        int paddingBottom = view2.getPaddingBottom();
        int paddingTop = view2.getPaddingTop();
        int paddingRight = view2.getPaddingRight();
        int paddingLeft = view2.getPaddingLeft();
        view2.setBackgroundDrawable(i65.a.i(context, com.tencent.mm.R.drawable.f481306q2));
        view2.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        r45.d67 d67Var = v1Var.f347589a;
        java.lang.String str = d67Var.f372186e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = r1Var.f347566b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = r1Var.f347566b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        r1Var.f347566b.setVisibility(0);
        r1Var.f347565a.setVisibility(0);
        n11.a b17 = n11.a.b();
        java.lang.String str2 = d67Var.f372187f;
        android.widget.ImageView imageView = r1Var.f347565a;
        int i18 = v1Var.f347590b;
        if (i18 == 0) {
            i18 = com.tencent.mm.R.raw.default_avatar;
        }
        b17.h(str2, imageView, or1.v1.a(context, i18));
        return view2;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange2 %s", str);
        com.tencent.mm.sdk.platformtools.u3.h(new or1.q1(this));
    }
}
