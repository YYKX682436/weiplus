package ee5;

/* loaded from: classes9.dex */
public final class n0 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f251976r;

    /* renamed from: s, reason: collision with root package name */
    public final o11.g f251977s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.app_brand_app_default_icon_for_tail;
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
        fVar.f342086j = b17;
        fVar.f342087k = b18;
        fVar.f342077a = true;
        this.f251977s = fVar.a();
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        ot0.a aVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        ae5.a aVar2 = (ae5.a) getItem(i17);
        ee5.a aVar3 = (ee5.a) holder;
        ot0.q qVar = aVar2.f4382k;
        if (qVar != null && (aVar = (ot0.a) qVar.y(ot0.a.class)) != null && aVar.f348366v == 1) {
            aVar3.f251790n.setVisibility(0);
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f4384m);
        o11.g gVar = this.f251977s;
        android.widget.ImageView imageView = aVar3.f251789m;
        android.widget.TextView textView = aVar3.f251791o;
        if (K0) {
            textView.setVisibility(8);
            n11.a.b().h(aVar2.f4385n, imageView, gVar);
            return;
        }
        textView.setVisibility(0);
        textView.setText(aVar2.f4399c);
        holder.f471695h.setText(aVar2.f4384m);
        zd5.n nVar = this.f251976r;
        holder.i(textView, nVar != null ? nVar.f471702g : null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f4386o)) {
            n11.a.b().h(aVar2.f4385n, imageView, gVar);
        } else {
            l01.d0.f314761a.n(new ee5.i0(holder, aVar2, this), aVar2.f4386o, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(45, 45));
        }
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("FTSMultiItemAppBrandUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.fgs), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f251976r == null) {
            this.f251976r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f251976r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f9  */
    @Override // zd5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W2(android.view.View r22, int r23, ae5.g r24) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.n0.W2(android.view.View, int, ae5.g):void");
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("FTSMultiItemAppBrandUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        de5.a.f229396a.c(14, 6);
        new com.tencent.mm.ui.tools.s6(v17.getContext()).a(v17, new ee5.j0(this, v17), new ee5.k0(item, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.a(inflate);
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
