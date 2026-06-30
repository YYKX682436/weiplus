package o;

/* loaded from: classes15.dex */
public class m extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public int f341745d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o.n f341746e;

    public m(o.n nVar) {
        this.f341746e = nVar;
        a();
    }

    public void a() {
        o.r rVar = this.f341746e.f341750f;
        o.u uVar = rVar.B;
        if (uVar != null) {
            rVar.i();
            java.util.ArrayList arrayList = rVar.f341789p;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (((o.u) arrayList.get(i17)) == uVar) {
                    this.f341745d = i17;
                    return;
                }
            }
        }
        this.f341745d = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.u getItem(int i17) {
        o.n nVar = this.f341746e;
        o.r rVar = nVar.f341750f;
        rVar.i();
        java.util.ArrayList arrayList = rVar.f341789p;
        nVar.getClass();
        int i18 = i17 + 0;
        int i19 = this.f341745d;
        if (i19 >= 0 && i18 >= i19) {
            i18++;
        }
        return (o.u) arrayList.get(i18);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        o.n nVar = this.f341746e;
        o.r rVar = nVar.f341750f;
        rVar.i();
        int size = rVar.f341789p.size();
        nVar.getClass();
        int i17 = size + 0;
        return this.f341745d < 0 ? i17 : i17 - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f341746e.f341749e.inflate(com.tencent.mm.R.layout.f487893au, viewGroup, false);
        }
        ((o.h0) view).a(getItem(i17), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
