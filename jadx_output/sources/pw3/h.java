package pw3;

/* loaded from: classes8.dex */
public class h extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f358704d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f358705e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f358706f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f358707g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Filter f358708h;

    public h(android.content.Context context, java.util.List list) {
        this.f358707g = context;
        this.f358704d = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f358705e.size();
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f358708h == null) {
            this.f358708h = new pw3.f(this, null);
        }
        return this.f358708h;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f358705e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f358707g;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488184ju, viewGroup, false);
            pw3.g gVar = new pw3.g(this, null);
            gVar.f358701a = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.f483471az2);
            gVar.f358702b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483473az4);
            gVar.f358703c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483472az3);
            view.setTag(gVar);
        }
        pw3.g gVar2 = (pw3.g) view.getTag();
        com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) getItem(i17);
        android.util.Pair pair = (android.util.Pair) ((java.util.ArrayList) this.f358706f).get(i17);
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        android.text.SpannableString spannableString = new android.text.SpannableString(transferRecordParcel.f156475i);
        spannableString.setSpan(foregroundColorSpan, ((java.lang.Integer) pair.first).intValue(), ((java.lang.Integer) pair.second).intValue(), 18);
        gVar2.f358701a.setUrl(transferRecordParcel.f156472f);
        gVar2.f358702b.setText(spannableString);
        gVar2.f358703c.setText(context.getString(com.tencent.mm.R.string.aev, transferRecordParcel.f156473g, transferRecordParcel.f156471e));
        return view;
    }
}
