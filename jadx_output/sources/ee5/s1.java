package ee5;

/* loaded from: classes9.dex */
public final class s1 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f252042r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ee5.u2 u2Var = (ee5.u2) holder;
        ae5.h hVar = (ae5.h) getItem(i17);
        u2Var.f252068m.s(hVar.f4407k, com.tencent.mm.R.color.FG_2);
        java.lang.String str = hVar.f4406j;
        android.widget.TextView textView = u2Var.f252069n;
        textView.setText(str);
        zd5.n nVar = this.f252042r;
        holder.i(textView, nVar != null ? nVar.f471702g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemNoteUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.f493773p05), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f252042r == null) {
            this.f252042r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f252042r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 11;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemNoteUIC", "onItemClick");
        U6();
        de5.a.e(de5.a.f229396a, 11, 0, 0, 6, null);
        ot0.q v18 = ot0.q.v(pt0.f0.f358209b1.n(item.f4405i, item.f4400d).j());
        com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
        openNoteFromSessionEvent.f54599g.f7906c = v17.getContext();
        am.sn snVar = openNoteFromSessionEvent.f54599g;
        snVar.f7904a = item.f4400d;
        snVar.f7909f = item.f4405i;
        snVar.f7907d = false;
        snVar.f7905b = v18 != null ? v18.f348663h0 : null;
        snVar.f7910g = 6;
        openNoteFromSessionEvent.e();
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemNoteUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(v17.getContext());
        de5.a.f229396a.c(14, 11);
        s6Var.a(v17, new ee5.o1(this, v17), new ee5.p1(item, this), null);
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.efn, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.u2(inflate);
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
