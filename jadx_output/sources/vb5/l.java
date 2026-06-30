package vb5;

@yn.c(exportInterface = vb5.m.class)
/* loaded from: classes5.dex */
public final class l extends com.tencent.mm.ui.chatting.component.a implements vb5.m {

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.ref.WeakReference f434855q;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f434856e = "MicroMsg.ChattingTipsBarComponent" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f434857f;

    /* renamed from: g, reason: collision with root package name */
    public long f434858g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f434859h;

    /* renamed from: i, reason: collision with root package name */
    public long f434860i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f434861m;

    /* renamed from: n, reason: collision with root package name */
    public int f434862n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f434863o;

    /* renamed from: p, reason: collision with root package name */
    public final l75.q0 f434864p;

    public l() {
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        arrayList.add(new yj5.c0());
        arrayList.add(new yj5.d());
        arrayList.add(new yj5.b());
        arrayList.add(new yj5.t());
        arrayList.add(new yj5.k());
        arrayList.add(new yj5.p());
        arrayList.add(new yj5.r());
        arrayList.add(new yj5.v());
        arrayList.add(new yj5.a0());
        arrayList.add(new yj5.s());
        this.f434859h = arrayList;
        this.f434862n = 8;
        this.f434863o = new java.util.ArrayList();
        this.f434864p = new vb5.i(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        if (com.tencent.mm.storage.z3.p4(this.f198580d.x())) {
            pm0.v.M(this.f434856e, false, new vb5.g(this), 2, null);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        java.util.Iterator it = this.f434859h.iterator();
        while (it.hasNext()) {
            ((yj5.a) it.next()).I();
        }
        if (gm0.j1.b().m()) {
            c01.d9.b().l().remove(this.f434864p);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        n0();
        this.f434858g = 0L;
        f434855q = null;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        if (gm0.j1.b().m()) {
            c01.d9.b().l().remove(this.f434864p);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        java.util.Iterator it = this.f434859h.iterator();
        while (it.hasNext()) {
            ((yj5.a) it.next()).L(dVar);
        }
    }

    @Override // yn.d
    public void V(long j17, java.lang.String str) {
        q0();
    }

    @Override // yn.d
    public void X() {
        if (this.f434861m) {
            this.f434861m = false;
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f434857f;
            if (chatTipsBarGroup == null) {
                return;
            }
            chatTipsBarGroup.setVisibility(this.f434862n);
        }
    }

    public java.util.Map m0(com.tencent.mm.storage.f9 f9Var) {
        xj5.a aVar = null;
        if (f9Var == null) {
            return null;
        }
        for (xj5.a aVar2 : this.f434863o) {
            if ((aVar2 instanceof xj5.n) && ((xj5.n) aVar2).f454916v.getMsgId() == f9Var.getMsgId()) {
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            return aVar.b();
        }
        return kz5.c1.m(xj5.n.f454914w.a(f9Var), kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_list_length", java.lang.Integer.valueOf(this.f434863o.size()))), com.tencent.mm.ui.tipsbar.s.a(this.f198580d.v())));
    }

    public final void n0() {
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            o0();
        } else {
            this.f198580d.q().postUI(new vb5.a(this));
        }
    }

    public final void o0() {
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f434857f;
        if (chatTipsBarGroup != null) {
            chatTipsBarGroup.b();
        }
        this.f434863o = new java.util.ArrayList();
        java.util.Iterator it = this.f434859h.iterator();
        while (it.hasNext()) {
            ((yj5.a) it.next()).n0();
        }
    }

    public final void p0(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.chatting.component.rf rfVar = (com.tencent.mm.ui.chatting.component.rf) ((sb5.a1) this.f198580d.f460708c.a(sb5.a1.class));
            rfVar.f199837p |= 1;
            if (rfVar.f199838q) {
                rfVar.F0();
            }
        }
    }

    public final void q0() {
        if (this.f434861m) {
            return;
        }
        this.f434861m = true;
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f434857f;
        this.f434862n = chatTipsBarGroup != null ? chatTipsBarGroup.getVisibility() : 8;
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup2 = this.f434857f;
        if (chatTipsBarGroup2 == null) {
            return;
        }
        chatTipsBarGroup2.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        this.f434860i = java.lang.System.currentTimeMillis();
        ym5.a1.f(new vb5.k(this, com.tencent.mm.ui.tipsbar.e.f209930e, true));
        f434855q = new java.lang.ref.WeakReference(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f434858g = java.lang.System.currentTimeMillis();
        f434855q = new java.lang.ref.WeakReference(this);
        c01.d9.b().l().add(this.f434864p);
    }
}
