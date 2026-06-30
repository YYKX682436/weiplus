package o;

/* loaded from: classes15.dex */
public class o extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final o.r f341773d;

    /* renamed from: e, reason: collision with root package name */
    public int f341774e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f341775f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f341776g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.LayoutInflater f341777h;

    /* renamed from: i, reason: collision with root package name */
    public final int f341778i;

    public o(o.r rVar, android.view.LayoutInflater layoutInflater, boolean z17, int i17) {
        this.f341776g = z17;
        this.f341777h = layoutInflater;
        this.f341773d = rVar;
        this.f341778i = i17;
        a();
    }

    public void a() {
        o.r rVar = this.f341773d;
        o.u uVar = rVar.B;
        if (uVar != null) {
            rVar.i();
            java.util.ArrayList arrayList = rVar.f341789p;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (((o.u) arrayList.get(i17)) == uVar) {
                    this.f341774e = i17;
                    return;
                }
            }
        }
        this.f341774e = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.u getItem(int i17) {
        java.util.ArrayList l17;
        boolean z17 = this.f341776g;
        o.r rVar = this.f341773d;
        if (z17) {
            rVar.i();
            l17 = rVar.f341789p;
        } else {
            l17 = rVar.l();
        }
        int i18 = this.f341774e;
        if (i18 >= 0 && i17 >= i18) {
            i17++;
        }
        return (o.u) l17.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList l17;
        boolean z17 = this.f341776g;
        o.r rVar = this.f341773d;
        if (z17) {
            rVar.i();
            l17 = rVar.f341789p;
        } else {
            l17 = rVar.l();
        }
        return this.f341774e < 0 ? l17.size() : l17.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f341777h.inflate(this.f341778i, viewGroup, false);
        }
        int i18 = getItem(i17).f341805e;
        int i19 = i17 - 1;
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f341773d.m() && i18 != (i19 >= 0 ? getItem(i19).f341805e : i18));
        o.h0 h0Var = (o.h0) view;
        if (this.f341775f) {
            listMenuItemView.setForceShowIcon(true);
        }
        h0Var.a(getItem(i17), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
