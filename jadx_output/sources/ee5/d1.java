package ee5;

/* loaded from: classes9.dex */
public final class d1 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f251854r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ee5.c cVar = (ee5.c) holder;
        ae5.d dVar = (ae5.d) getItem(i17);
        cVar.f251838m.setImageResource(dVar.f4391k);
        java.lang.String str = dVar.f4390j;
        android.widget.TextView textView = cVar.f251839n;
        textView.setText(str);
        zd5.n nVar = this.f251854r;
        holder.i(textView, nVar != null ? nVar.f471702g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemGiftUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.o48), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f251854r == null) {
            this.f251854r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f251854r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 13;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemGiftUIC", "onItemClick");
        U6();
        de5.a.e(de5.a.f229396a, 13, 0, 0, 6, null);
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(item.f4405i, item.f4400d);
        ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).uj(v17.getContext(), n17, null);
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemGiftUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(v17.getContext());
        de5.a.f229396a.c(14, 13);
        s6Var.a(v17, new ee5.z0(this, v17), new ee5.a1(item, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.c(inflate);
    }

    @Override // zd5.q
    public int getCount() {
        return this.f252054m.size();
    }

    @Override // zd5.q
    public ae5.g getItem(int i17) {
        java.lang.Object obj = this.f252054m.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (ae5.g) obj;
    }
}
