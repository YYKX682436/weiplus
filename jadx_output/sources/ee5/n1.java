package ee5;

/* loaded from: classes9.dex */
public final class n1 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f251978r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ee5.o2 o2Var = (ee5.o2) holder;
        ae5.f fVar = (ae5.f) getItem(i17);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap m07 = m11.b1.Di().m0(null, fVar.f4396l, i65.a.g(getActivity()), false);
        android.widget.ImageView imageView = o2Var.f251989m;
        if (m07 == null || m07.isRecycled()) {
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(fVar.f4394j, 1, i65.a.g(getActivity()));
            if (Di == null || Di.isRecycled()) {
                imageView.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_webpage);
            } else {
                imageView.setImageBitmap(Di);
            }
        } else {
            imageView.setImageBitmap(m07);
        }
        java.lang.String str = fVar.f4395k;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = o2Var.f251990n;
        textView.setText(str);
        zd5.n nVar = this.f251978r;
        holder.i(textView, nVar != null ? nVar.f471702g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemMusicUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.fgu), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f251978r == null) {
            this.f251978r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f251978r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 4;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemMusicUIC", "onItemClick");
        U6();
        de5.a.e(de5.a.f229396a, 4, 0, 0, 6, null);
        if (com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(v17.getContext(), null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemMusicUIC", "go to music " + item.f4400d);
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(item.f4405i, item.f4400d);
            com.tencent.mm.ui.chatting.o6.f202065a.d(getActivity(), n17, ot0.q.v(n17.j()));
        }
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemMusicUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(v17.getContext());
        de5.a.f229396a.c(14, 4);
        s6Var.a(v17, new ee5.j1(this, v17), new ee5.k1(item, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.o2(inflate);
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
