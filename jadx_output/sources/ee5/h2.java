package ee5;

/* loaded from: classes9.dex */
public final class h2 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f251919r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ee5.g3 g3Var = (ee5.g3) holder;
        ae5.l lVar = (ae5.l) getItem(i17);
        int i19 = lVar.f4398b;
        mn2.g1 g1Var = mn2.g1.f329975a;
        android.widget.ImageView imageView = g3Var.f251891m;
        if (i19 == 111) {
            vo0.d g17 = g1Var.g();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            g17.c(ya2.l.f460502a.e(lVar.f4427k, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329962p));
        } else {
            vo0.d f17 = g1Var.f();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            f17.c(ya2.l.f460502a.e(lVar.f4427k, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329962p));
        }
        java.lang.String str = lVar.f4426j;
        android.widget.TextView textView = g3Var.f251892n;
        textView.setText(str);
        zd5.n nVar = this.f251919r;
        holder.i(textView, nVar != null ? nVar.f471702g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.o49), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f251919r == null) {
            this.f251919r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f251919r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 12;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "onItemClick");
        U6();
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(item.f4405i, item.f4400d);
        de5.a.e(de5.a.f229396a, 12, 0, 0, 6, null);
        int i18 = item.f4398b;
        if (i18 == 82) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "click product item");
            java.lang.Object context = v17.getContext();
            kotlinx.coroutines.l.d(new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.FTSMultiItemShopProductUIC", context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, 0, 4, null), null, null, new ee5.c2(v17, item, n17, null), 3, null);
        } else {
            if (i18 != 111) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FTSMultiItemShopProductUIC", "unknown item clicked");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "click SHOP item");
            java.lang.Object context2 = v17.getContext();
            kotlinx.coroutines.l.d(new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.FTSMultiItemShopProductUIC", context2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context2 : null, 0, 4, null), null, null, new ee5.b2(v17, item, n17, null), 3, null);
        }
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(item.f4405i, item.f4400d);
        de5.a.f229396a.c(14, 12);
        new com.tencent.mm.ui.tools.s6(v17.getContext()).a(v17, new ee5.d2(this, v17), new ee5.e2(n17, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.g3(inflate);
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
