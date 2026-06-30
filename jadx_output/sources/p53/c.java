package p53;

/* loaded from: classes8.dex */
public class c extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f352052d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.GameTabData f352053e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f352054f;

    public c(android.content.Context context) {
        this.f352052d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.game.model.GameTabData gameTabData = this.f352053e;
        if (gameTabData == null) {
            return 0;
        }
        return ((java.util.ArrayList) gameTabData.a()).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.game.model.GameTabData.TabItem) ((java.util.ArrayList) this.f352053e.a()).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f352052d).inflate(com.tencent.mm.R.layout.bhx, viewGroup, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.avt);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.avq);
        com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem = (com.tencent.mm.plugin.game.model.GameTabData.TabItem) ((java.util.ArrayList) this.f352053e.a()).get(i17);
        if (tabItem != null) {
            textView.setText(tabItem.f140156e);
            java.lang.String str = this.f352054f;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (str.equalsIgnoreCase(tabItem.f140155d)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(tabItem.f140163o)) {
                    java.lang.String str2 = com.tencent.mm.plugin.game.model.a3.f140200f + kk.k.g(tabItem.f140163o.getBytes());
                    o11.f fVar = new o11.f();
                    fVar.f342078b = true;
                    fVar.f342082f = str2;
                    n11.a.b().h(tabItem.f140163o, imageView, fVar.a());
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(tabItem.f140162n)) {
                java.lang.String str3 = com.tencent.mm.plugin.game.model.a3.f140200f + kk.k.g(tabItem.f140162n.getBytes());
                o11.f fVar2 = new o11.f();
                fVar2.f342078b = true;
                fVar2.f342082f = str3;
                n11.a.b().h(tabItem.f140162n, imageView, fVar2.a());
            }
        }
        inflate.setTag(tabItem);
        return inflate;
    }
}
