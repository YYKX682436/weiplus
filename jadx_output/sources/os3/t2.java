package os3;

/* loaded from: classes8.dex */
public class t2 extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f348209d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f348210e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f348211f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f348212g;

    /* renamed from: h, reason: collision with root package name */
    public os3.r2 f348213h;

    public t2(android.content.Context context, java.util.List list) {
        this.f348211f = context;
        this.f348209d = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f348209d.size();
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f348213h == null) {
            this.f348213h = new os3.r2(this, null);
        }
        return this.f348213h;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (ks3.u) this.f348209d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        android.content.Context context = this.f348211f;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.cbh, null);
            os3.s2 s2Var = new os3.s2(this, null);
            s2Var.f348194a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ldx);
            s2Var.f348195b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ldu);
            s2Var.f348196c = (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.ldy);
            view2.setTag(s2Var);
        } else {
            view2 = (android.view.ViewGroup) view;
        }
        ks3.u uVar = (ks3.u) this.f348209d.get(i17);
        os3.s2 s2Var2 = (os3.s2) view2.getTag();
        s2Var2.f348194a.setText(uVar.f311750e);
        s2Var2.f348195b.setText(uVar.f311751f);
        s2Var2.f348196c.setVisibility(8);
        view2.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
        return view2;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
