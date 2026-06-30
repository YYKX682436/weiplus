package mi5;

/* loaded from: classes9.dex */
public final class a1 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.e1 f326794a;

    /* renamed from: b, reason: collision with root package name */
    public oe5.a f326795b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.e1 e1Var = this.f326794a;
        android.view.View view = e1Var != null ? e1Var.f254277a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehx, (android.view.ViewGroup) null);
        this.f326794a = new em.e1(inflate);
        c(null, this.f326795b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        oe5.a aVar = (oe5.a) pVar;
        oe5.a aVar2 = this.f326795b;
        this.f326795b = aVar;
        c(aVar2, aVar);
    }

    public final void c(oe5.a aVar, oe5.a aVar2) {
        e15.k j17;
        e15.i j18;
        em.e1 e1Var = this.f326794a;
        if (aVar2 == null || e1Var == null || (j17 = aVar2.j()) == null || (j18 = j17.j()) == null) {
            return;
        }
        android.view.View view = e1Var.f254277a;
        android.content.Context context = view.getContext();
        e15.j j19 = j18.j();
        bw5.o50 v17 = il4.d.v(j19 != null ? j19.j() : null);
        e15.j j27 = j18.j();
        bw5.v70 w17 = il4.d.w(j27 != null ? j27.k() : null);
        if (e1Var.f254278b == null) {
            e1Var.f254278b = (com.tencent.mm.plugin.ting.widget.TingChatRoomView) view.findViewById(com.tencent.mm.R.id.srq);
        }
        e1Var.f254278b.setContainerBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100));
        if (e1Var.f254278b == null) {
            e1Var.f254278b = (com.tencent.mm.plugin.ting.widget.TingChatRoomView) view.findViewById(com.tencent.mm.R.id.srq);
        }
        com.tencent.mm.plugin.ting.widget.TingChatRoomView tingChatRoomView = e1Var.f254278b;
        r45.lm6 lm6Var = new r45.lm6();
        lm6Var.f379637d = j18.getString(j18.f368365d + 2);
        lm6Var.f379638e = context.getString(com.tencent.mm.R.string.n3s);
        if (v17 != null) {
            bw5.mc0 b17 = v17.b();
            lm6Var.f379639f = b17 != null ? b17.b() : null;
            bw5.mc0 b18 = v17.b();
            lm6Var.f379641h = b18 != null ? b18.getNickname() : null;
        }
        if (w17 != null) {
            lm6Var.f379644n.add(w17.f());
        }
        tingChatRoomView.c(lm6Var);
        view.setOnClickListener(new mi5.z0(v17));
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326795b;
    }
}
