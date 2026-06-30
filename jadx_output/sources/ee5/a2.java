package ee5;

/* loaded from: classes9.dex */
public final class a2 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f251814r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ee5.f3 f3Var = (ee5.f3) holder;
        ae5.k kVar = (ae5.k) getItem(i17);
        boolean z17 = kVar.f4423j;
        android.widget.ImageView imageView = f3Var.f251879m;
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.f4425l)) {
                imageView.setImageResource(com.tencent.mm.R.drawable.bgo);
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, kVar.f4425l);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.f4425l)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, kVar.f4425l, null);
        }
        int i19 = kVar.f4424k;
        android.widget.TextView textView = f3Var.f251880n;
        textView.setText(i19);
        zd5.n nVar = this.f251814r;
        holder.i(textView, nVar != null ? nVar.f471702g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.f493774p06), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f251814r == null) {
            this.f251814r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f251814r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 9;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "onItemClick");
        U6();
        de5.a.e(de5.a.f229396a, 9, 0, 0, 6, null);
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(item.f4405i, item.f4400d);
        android.content.Context context = v17.getContext();
        java.lang.String V1 = n17.V1();
        if (V1 == null) {
            V1 = n17.y0();
        }
        java.lang.String str = V1;
        java.lang.String j17 = n17.j();
        if (j17 == null) {
            j17 = "";
        }
        com.tencent.mm.ui.chatting.viewitems.wg.a(context, str, j17, com.tencent.mm.storage.z3.R4(n17.Q0()), n17.A0() == 0, n17);
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(v17.getContext());
        de5.a.f229396a.c(14, 9);
        s6Var.a(v17, new ee5.w1(this, v17), new ee5.x1(item, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.f3(inflate);
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
