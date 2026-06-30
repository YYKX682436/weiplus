package fx1;

/* loaded from: classes12.dex */
public class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final nx1.z f267110d;

    /* renamed from: e, reason: collision with root package name */
    public final gx1.e f267111e = new gx1.e();

    public b(nx1.z zVar) {
        this.f267110d = zVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return nx1.d.q().B() + 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        int i18 = i17 - 0;
        ix1.a l17 = nx1.d.q().l(i18);
        if (l17 != null) {
            return l17.b();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.EditorAdapter", "getItemViewType, item is null, position is %d", java.lang.Integer.valueOf(i18));
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        gx1.a aVar = (gx1.a) k3Var;
        synchronized (this) {
            int i18 = i17 - 0;
            ix1.a l17 = nx1.d.q().l(i18);
            if (l17 == null || l17.b() != aVar.i()) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Boolean.valueOf(l17 == null);
                objArr[1] = java.lang.Integer.valueOf(i18);
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorAdapter", "onBindViewHolder, item is null %b, position is %d", objArr);
            } else {
                aVar.j(l17, i18, l17.b());
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        if (i17 == Integer.MAX_VALUE) {
            return null;
        }
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(this.f267111e.f277296a.get(i17), viewGroup, false);
        nx1.z zVar = this.f267110d;
        switch (i17) {
            case -1:
                return new gx1.n(inflate, zVar);
            case 0:
                return new gx1.t(inflate, zVar);
            case 1:
                return new gx1.s(inflate, zVar);
            case 2:
                return new gx1.d(inflate, zVar);
            case 3:
                return new gx1.g(inflate, zVar);
            case 4:
                return new gx1.b0(inflate, zVar);
            case 5:
                return new gx1.b(inflate, zVar);
            case 6:
                return new gx1.y(inflate, zVar);
            default:
                return null;
        }
    }
}
