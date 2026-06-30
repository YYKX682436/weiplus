package fh4;

/* loaded from: classes4.dex */
public class g extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f262694d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f262695e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f262696f;

    public g(android.content.Context context) {
        this.f262695e = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f262694d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f262694d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fh4.f fVar;
        java.lang.String str = (java.lang.String) this.f262694d.get(i17);
        if (view == null) {
            view = android.view.View.inflate(this.f262695e, com.tencent.mm.R.layout.cxp, null);
            fVar = new fh4.f(this);
            fVar.f262692a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hke);
            fVar.f262693b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oog);
            view.setTag(fVar);
        } else {
            fVar = (fh4.f) view.getTag();
        }
        fVar.f262692a.setBackgroundResource(str.equals(this.f262696f) ? com.tencent.mm.R.drawable.bnl : 0);
        fVar.f262693b.setVisibility(8);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(fVar.f262692a, str, true);
        return view;
    }
}
