package tx4;

/* loaded from: classes7.dex */
public class q extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f422707f = lp0.b.D() + "Game/HvMenu/";

    /* renamed from: d, reason: collision with root package name */
    public db5.g4 f422708d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f422709e;

    public q(android.content.Context context) {
        this.f422709e = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        db5.g4 g4Var = this.f422708d;
        if (g4Var == null) {
            return 0;
        }
        return g4Var.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (db5.h4) ((java.util.ArrayList) this.f422708d.f228344d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f422709e).inflate(com.tencent.mm.R.layout.f489151bh0, viewGroup, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h5n);
        db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) this.f422708d.f228344d).get(i17);
        if (h4Var == null) {
            inflate.setTag(null);
        } else if (h4Var.f228366g == -1) {
            inflate.setTag(null);
        } else {
            java.lang.String charSequence = h4Var.getTitle().toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
                inflate.setTag(null);
            } else {
                java.lang.String[] split = charSequence.split("__", 2);
                if (split.length == 1) {
                    textView.setText(split[0]);
                } else {
                    textView.setText(split[0]);
                    java.lang.String str = split[1];
                    if (str.startsWith("http")) {
                        java.lang.String str2 = f422707f + kk.k.g(str.getBytes());
                        o11.f fVar = new o11.f();
                        fVar.f342078b = true;
                        fVar.f342082f = str2;
                        n11.a.b().h(str, imageView, fVar.a());
                    } else {
                        imageView.setImageResource(com.tencent.mm.sdk.platformtools.x2.f193075e.getIdentifier(str, "drawable", com.tencent.mm.sdk.platformtools.x2.f193072b));
                    }
                }
                inflate.setTag(h4Var);
            }
        }
        return inflate;
    }
}
