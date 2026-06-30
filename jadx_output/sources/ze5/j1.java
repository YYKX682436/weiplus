package ze5;

/* loaded from: classes9.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f472024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(kotlin.jvm.internal.h0 h0Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f472024d = h0Var;
        this.f472025e = dVar;
        this.f472026f = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        ze5.g1 holder = (ze5.g1) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.modelmulti.WxaInfo g17 = te5.e2.g((ot0.q) this.f472024d.f310123d);
        com.tencent.mm.pluginsdk.ui.chat.ca caVar = new com.tencent.mm.pluginsdk.ui.chat.ca();
        caVar.f190246a = g17;
        yb5.d dVar = this.f472025e;
        caVar.f190247b = dVar.x();
        caVar.f190248c = te5.e2.d(this.f472026f);
        com.tencent.mm.ui.chatting.w5.q(dVar, holder.f471934c, caVar);
        android.widget.LinearLayout linearLayout = holder.f471934c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.TextView textView = holder.f471935d;
        if (textView != null) {
            android.app.Activity g18 = dVar.g();
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (g17 == null || (str = g17.f71262e) == null) {
                str = "";
            }
            objArr[0] = str;
            textView.setText(g18.getString(com.tencent.mm.R.string.epp, objArr));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f471936e;
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.app_brand_source_view_icon);
        }
        return jz5.f0.f302826a;
    }
}
