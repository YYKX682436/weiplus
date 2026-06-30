package mu1;

/* loaded from: classes15.dex */
public class i extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f331380g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f331381h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f331382i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f331383j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f331384k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f331385l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f331386m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f331387n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f331388o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f331389p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f331390q;

    @Override // mu1.a
    public void g() {
        this.f331380g = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.bcg);
        this.f331381h = this.f331336c.findViewById(com.tencent.mm.R.id.b88);
        this.f331382i = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.o7b);
        this.f331383j = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.o7a);
        this.f331384k = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.o7_);
        this.f331385l = this.f331336c.findViewById(com.tencent.mm.R.id.o7d);
        this.f331386m = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.o7f);
        this.f331387n = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.o7e);
        this.f331388o = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.o7c);
        this.f331389p = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.o79);
    }

    @Override // mu1.a
    public void h() {
        if (this.f331334a.s0().X != null && !android.text.TextUtils.isEmpty(this.f331334a.s0().X.f388878d)) {
            this.f331338e.setText(this.f331334a.s0().X.f388878d);
        } else if (android.text.TextUtils.isEmpty(this.f331334a.s0().f388552m)) {
            this.f331338e.setText("");
        } else {
            this.f331338e.setText(this.f331334a.s0().f388552m);
        }
        if (this.f331334a.s0().X == null || android.text.TextUtils.isEmpty(this.f331334a.s0().X.f388879e)) {
            this.f331380g.setText("");
            this.f331380g.setVisibility(8);
        } else {
            this.f331380g.setText(this.f331334a.s0().X.f388879e);
            this.f331380g.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetTicket", "updateContentView()");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f331334a.s0().C)) {
            lu1.g0.d(this.f331335b, this.f331382i, com.tencent.mm.R.drawable.bz6, lu1.a0.d(this.f331334a.s0().f388555p));
        } else {
            lu1.g0.c(this.f331335b, this.f331382i, this.f331334a.s0().C, this.f331335b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480203r9), com.tencent.mm.R.drawable.bz6, false, lu1.a0.d(this.f331334a.s0().f388555p));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (this.f331334a.s0().f388560s != null && this.f331334a.s0().f388560s.size() >= 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetTicket", "primary_fields length is >= 2");
            r45.w50 w50Var = (r45.w50) this.f331334a.s0().f388560s.get(0);
            r45.w50 w50Var2 = (r45.w50) this.f331334a.s0().f388560s.get(1);
            sb6.append(w50Var.f388878d);
            sb6.append(" - ");
            sb6.append(w50Var2.f388878d);
            if (!android.text.TextUtils.isEmpty(w50Var.f388880f) && !android.text.TextUtils.isEmpty(w50Var2.f388880f)) {
                sb7.append(w50Var.f388880f);
                sb7.append(" ");
                sb7.append(w50Var.f388879e);
                sb7.append(" - ");
                sb7.append(w50Var2.f388880f);
                sb7.append(" ");
                sb7.append(w50Var2.f388879e);
            }
        } else if (this.f331334a.s0().f388560s != null && this.f331334a.s0().f388560s.size() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetTicket", "primary_fields length is == 1");
            r45.w50 w50Var3 = (r45.w50) this.f331334a.s0().f388560s.get(0);
            sb6.append(w50Var3.f388878d);
            sb7.append(w50Var3.f388879e);
        }
        if (android.text.TextUtils.isEmpty(sb6.toString())) {
            this.f331383j.setText("");
        } else {
            this.f331383j.setText(sb6.toString());
        }
        if (!android.text.TextUtils.isEmpty(sb7.toString())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetTicket", "sub_title_builder is not empty!");
            this.f331384k.setText(sb7.toString());
            this.f331384k.setVisibility(0);
        } else if (android.text.TextUtils.isEmpty(this.f331334a.s0().K)) {
            this.f331384k.setVisibility(8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetTicket", "primary_sub_title is not empty!");
            this.f331384k.setText(this.f331334a.s0().K);
            this.f331384k.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CardWidgetTicket", "updateShopView(), shop_count:" + this.f331334a.s0().f388565x);
        if (this.f331334a.s0().f388565x <= 0) {
            android.view.View view = this.f331385l;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f331389p.setVisibility(8);
        } else {
            android.view.View view2 = this.f331385l;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f331385l.setOnClickListener(this.f331339f);
            lu1.g0.d(this.f331335b, this.f331388o, com.tencent.mm.R.drawable.bz7, lu1.a0.d(this.f331334a.s0().f388555p));
            java.util.ArrayList arrayList3 = this.f331390q;
            r45.nu nuVar = (arrayList3 == null || arrayList3.size() < 1) ? null : (r45.nu) this.f331390q.get(0);
            if (this.f331334a.s0().f388565x == 1 && nuVar != null) {
                this.f331386m.setText(nuVar.f381672d);
                android.widget.TextView textView = this.f331387n;
                android.content.Context context = this.f331335b;
                textView.setText(context.getString(com.tencent.mm.R.string.avi, lu1.a0.D(context, nuVar.f381679n), nuVar.f381678m));
                this.f331389p.setVisibility(8);
                this.f331385l.setTag(nuVar.f381672d);
            } else if (this.f331334a.s0().f388565x > 1 && nuVar != null) {
                this.f331386m.setText(nuVar.f381672d);
                android.widget.TextView textView2 = this.f331387n;
                android.content.Context context2 = this.f331335b;
                textView2.setText(context2.getString(com.tencent.mm.R.string.avi, lu1.a0.D(context2, nuVar.f381679n), nuVar.f381678m));
                this.f331389p.setVisibility(0);
                this.f331389p.setOnClickListener(this.f331339f);
                this.f331385l.setTag(nuVar.f381672d);
            } else if (this.f331334a.s0().f388565x >= 1) {
                this.f331386m.setText(com.tencent.mm.R.string.arn);
                this.f331387n.setText(this.f331335b.getString(com.tencent.mm.R.string.f490812aw4, java.lang.Integer.valueOf(this.f331334a.s0().f388565x)));
                this.f331389p.setVisibility(8);
                this.f331389p.setOnClickListener(null);
                this.f331385l.setTag(this.f331335b.getString(com.tencent.mm.R.string.arn));
            }
        }
        if (this.f331334a.z()) {
            android.view.View view3 = this.f331381h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f331381h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
