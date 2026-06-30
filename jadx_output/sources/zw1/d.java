package zw1;

/* loaded from: classes9.dex */
public class d extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f476599d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f476600e = new java.util.ArrayList();

    public d(android.content.Context context) {
        this.f476599d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f476600e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (ww1.n1) ((java.util.ArrayList) this.f476600e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f476599d;
        if (view == null) {
            view = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488633z3, viewGroup, false);
            view.setTag(new zw1.c(view));
        }
        zw1.c cVar = (zw1.c) view.getTag();
        ww1.n1 n1Var = (ww1.n1) ((java.util.ArrayList) this.f476600e).get(i17);
        cVar.f476590a.setText(ww1.d0.a(context, n1Var.f450249b, n1Var.f450248a));
        cVar.f476591b.setText(ww1.d0.b(n1Var.f450251d));
        cVar.f476592c.setText(context.getString(com.tencent.mm.R.string.b9s, java.lang.Integer.valueOf(n1Var.f450250c)));
        return view;
    }
}
