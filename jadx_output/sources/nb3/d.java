package nb3;

/* loaded from: classes9.dex */
public class d extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f336043e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.LayoutInflater f336044f;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f336042d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final int f336045g = 1;

    public d(android.content.Context context) {
        this.f336043e = context;
        this.f336044f = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f336042d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.vu3) this.f336042d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        nb3.c cVar;
        if (view == null) {
            view = this.f336044f.inflate(com.tencent.mm.R.layout.bv7, viewGroup, false);
            cVar = new nb3.c(this);
            cVar.f336033a = view.findViewById(com.tencent.mm.R.id.m7g);
            cVar.f336034b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.j6l);
            cVar.f336035c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6p);
            cVar.f336036d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6q);
            cVar.f336037e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6j);
            cVar.f336038f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6k);
            cVar.f336039g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6r);
            cVar.f336040h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.j6m);
            cVar.f336041i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j6n);
            view.setTag(cVar);
        } else {
            cVar = (nb3.c) view.getTag();
        }
        r45.vu3 vu3Var = (r45.vu3) this.f336042d.get(i17);
        com.tencent.mm.plugin.luckymoney.model.m5.b(cVar.f336034b, vu3Var.f388581g, vu3Var.f388583i);
        cVar.f336038f.setVisibility(8);
        android.widget.TextView textView = cVar.f336035c;
        java.lang.String str = vu3Var.f388580f;
        android.content.Context context = this.f336043e;
        com.tencent.mm.plugin.luckymoney.model.m5.E(context, textView, str);
        cVar.f336037e.setText(context.getString(com.tencent.mm.R.string.gna, com.tencent.mm.wallet_core.ui.r1.o(vu3Var.f388578d / 100.0d)));
        cVar.f336036d.setText(com.tencent.mm.plugin.luckymoney.model.m5.f(context, vu3Var.f388579e * 1000));
        cVar.f336036d.setVisibility(0);
        cVar.f336039g.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(vu3Var.f388584m)) {
            cVar.f336040h.setVisibility(8);
            cVar.f336041i.setVisibility(8);
        } else {
            cVar.f336041i.setText(vu3Var.f388584m);
            if (this.f336045g == 2) {
                cVar.f336040h.setImageResource(com.tencent.mm.R.drawable.c_a);
            } else {
                cVar.f336040h.setImageResource(com.tencent.mm.R.drawable.c99);
            }
            cVar.f336040h.setVisibility(0);
            cVar.f336041i.setVisibility(0);
        }
        return view;
    }
}
