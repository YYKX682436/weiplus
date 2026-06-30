package ee5;

/* loaded from: classes9.dex */
public final class i1 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f251926r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ee5.n2 n2Var = (ee5.n2) holder;
        ae5.e eVar = (ae5.e) getItem(i17);
        n2Var.f251979m.setImageResource(eVar.f4393k);
        java.lang.String str = eVar.f4392j;
        android.widget.TextView textView = n2Var.f251980n;
        textView.setText(str);
        zd5.n nVar = this.f251926r;
        holder.i(textView, nVar != null ? nVar.f471702g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemLocationUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.f493772p04), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f251926r == null) {
            this.f251926r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f251926r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 10;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemLocationUIC", "onItemClick");
        U6();
        de5.a.e(de5.a.f229396a, 10, 0, 0, 6, null);
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(item.f4405i, item.f4400d);
        o15.b bVar = new o15.b();
        java.lang.String j17 = n17.j();
        if (j17 == null) {
            j17 = "";
        }
        bVar.fromXml(j17);
        o15.a j18 = bVar.j();
        if (j18 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("map_view_type", 1);
            intent.putExtra("kwebmap_slat", j18.u());
            intent.putExtra("kwebmap_lng", j18.w());
            intent.putExtra("kPoiName", j18.s());
            intent.putExtra("Kwebmap_locaion", j18.l());
            intent.putExtra("kShowshare", false);
            intent.putExtra("key_is_forward_preview", true);
            j45.l.j(v17.getContext(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
        }
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemLocationUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(v17.getContext());
        de5.a.f229396a.c(14, 10);
        s6Var.a(v17, new ee5.e1(this, v17), new ee5.f1(item, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.n2(inflate);
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
