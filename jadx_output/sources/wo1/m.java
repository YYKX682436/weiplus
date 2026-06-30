package wo1;

/* loaded from: classes3.dex */
public abstract class m extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public int f447988d;

    public abstract java.lang.String[] a();

    public abstract void c(int i17, java.util.List list);

    @Override // android.widget.Adapter
    public int getCount() {
        return a().length;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return a()[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (view == null) {
            view = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489535dx2, (android.view.ViewGroup) null);
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o3b)).setText(a()[i17]);
        ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5n)).setVisibility(i17 == this.f447988d ? 0 : 8);
        return view;
    }
}
