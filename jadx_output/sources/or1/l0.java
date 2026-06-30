package or1;

/* loaded from: classes9.dex */
public class l0 implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView f347525a;

    public l0(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView) {
        this.f347525a = enterpriseBizContactListView;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        or1.u0 u0Var;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView = this.f347525a;
        android.content.Context context = enterpriseBizContactListView.getContext();
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488741a92, (android.view.ViewGroup) null);
            u0Var = new or1.u0();
            u0Var.f347582e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bdd);
            u0Var.f347581d = view.findViewById(com.tencent.mm.R.id.cgr);
            u0Var.f347584g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483083w4);
            u0Var.f347583f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.k9j);
            u0Var.f347585h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.awx);
            u0Var.f347586i = view.findViewById(com.tencent.mm.R.id.mkr);
            view.setTag(u0Var);
        } else {
            u0Var = (or1.u0) view.getTag();
        }
        r45.co coVar = (r45.co) nVar.f260898b;
        if (coVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.EnterpriseBizContactListView", "should not be empty");
            return view;
        }
        boolean F0 = coVar.f371678f.F0();
        if (!enterpriseBizContactListView.f197872p || !z17) {
            u0Var.f347582e.setVisibility(8);
        } else if (nVar.f260897a.equals("!2")) {
            u0Var.f347582e.setText(enterpriseBizContactListView.getContext().getString(com.tencent.mm.R.string.c1m));
            u0Var.f347582e.setVisibility(0);
        } else if (nVar.f260897a.equals("!1")) {
            u0Var.f347582e.setVisibility(8);
        } else {
            u0Var.f347582e.setText(nVar.f260897a);
            u0Var.f347582e.setVisibility(0);
        }
        u0Var.f347580c = null;
        if (F0) {
            u0Var.f347578a = coVar.f371676d;
            u0Var.f347584g.setImageResource(com.tencent.mm.R.raw.enterprise_chat_entry_avatar);
            java.lang.String string = enterpriseBizContactListView.getResources().getString(com.tencent.mm.R.string.f491124c13);
            android.widget.TextView textView = u0Var.f347585h;
            com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.h(enterpriseBizContactListView, textView, context, string, (int) textView.getTextSize());
        } else {
            if (coVar instanceof or1.n0) {
                or1.n0 n0Var = (or1.n0) coVar;
                if (n0Var.f347541g) {
                    r45.d67 d67Var = n0Var.f347542h;
                    u0Var.f347580c = d67Var;
                    u0Var.f347579b = d67Var.f372187f;
                    n11.a.b().h(u0Var.f347579b, u0Var.f347584g, or1.v1.a(context, com.tencent.mm.R.raw.enterprise_chat_entry_avatar));
                    android.widget.TextView textView2 = u0Var.f347585h;
                    com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.h(enterpriseBizContactListView, textView2, context, u0Var.f347580c.f372186e, (int) textView2.getTextSize());
                }
            }
            java.lang.String str = coVar.f371676d;
            u0Var.f347578a = str;
            u0Var.f347579b = coVar.f371678f.field_brandIconURL;
            u0Var.f347584g.setTag(str);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(u0Var.f347584g, u0Var.f347578a, null);
            java.lang.String g27 = coVar.f371677e.g2();
            android.widget.TextView textView3 = u0Var.f347585h;
            com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.h(enterpriseBizContactListView, textView3, context, g27, (int) textView3.getTextSize());
        }
        int i19 = coVar.f371678f.field_status;
        u0Var.f347583f.setVisibility(coVar.f371678f.field_status != 1 ? 8 : 0);
        if (enterpriseBizContactListView.getMode() == 0 && z18) {
            u0Var.f347586i.setBackground(null);
        } else {
            u0Var.f347586i.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
        }
        if (enterpriseBizContactListView.f197873q) {
            android.view.View view2 = u0Var.f347581d;
            view2.setPadding(view2.getPaddingLeft(), u0Var.f347581d.getPaddingTop(), (int) enterpriseBizContactListView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479561d), u0Var.f347581d.getPaddingBottom());
        } else {
            android.view.View view3 = u0Var.f347581d;
            view3.setPadding(view3.getPaddingLeft(), u0Var.f347581d.getPaddingTop(), (int) enterpriseBizContactListView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.i_), u0Var.f347581d.getPaddingBottom());
        }
        android.os.SystemClock.elapsedRealtime();
        return view;
    }
}
