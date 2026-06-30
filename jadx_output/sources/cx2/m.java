package cx2;

/* loaded from: classes9.dex */
public class m extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f224547d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f224548e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f224549f;

    public m(android.content.Context context, java.util.List list, java.util.List list2) {
        this.f224547d = context;
        this.f224548e = list2;
        this.f224549f = list;
    }

    public final cx2.l a(android.view.View view) {
        cx2.l lVar = new cx2.l(null);
        lVar.f224545a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bgw);
        lVar.f224546b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bgz);
        view.setTag(lVar);
        return lVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f224548e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f224548e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        cx2.l lVar;
        android.content.Context context = this.f224547d;
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.f488401sa, null);
            lVar = a(view);
        } else {
            lVar = (cx2.l) view.getTag();
            if (lVar == null) {
                lVar = a(view);
            }
        }
        java.util.List list = this.f224548e;
        int size = list.size() % 4;
        if (i17 >= 0 && i17 < list.size()) {
            java.util.List list2 = this.f224549f;
            if (i17 < list2.size()) {
                lVar.f224545a.setVisibility(0);
                lVar.f224546b.setVisibility(0);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(lVar.f224545a, (java.lang.String) list2.get(i17), null);
                lVar.f224546b.setText((java.lang.CharSequence) list.get(i17));
                lVar.f224546b.setText(((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, (java.lang.CharSequence) list.get(i17)));
                if (list.size() <= 12 || i17 < list.size() - size) {
                    lVar.f224546b.setPadding(0, 0, 0, 0);
                } else {
                    lVar.f224546b.setPadding(0, 0, 0, i65.a.h(context, com.tencent.mm.R.dimen.f479629b4));
                }
            }
        }
        return view;
    }
}
