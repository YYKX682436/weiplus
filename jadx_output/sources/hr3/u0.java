package hr3;

/* loaded from: classes11.dex */
public class u0 extends com.tencent.mm.ui.contact.a5 implements o13.x {

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f284037n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f284038o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f284039p;

    public u0(com.tencent.mm.ui.contact.l4 l4Var, int i17, com.tencent.mm.storage.z3 z3Var) {
        super(l4Var, (java.util.List) new java.util.ArrayList(), true, false, i17);
        this.f284038o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f284037n = z3Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        if (vVar.f351158c == 0) {
            this.f284039p = vVar.f351160e;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f284039p;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.item.r rVar = new com.tencent.mm.ui.contact.item.r(i17, this.f284037n);
        rVar.f(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(((p13.y) this.f284039p.get(i17)).f351187e, true));
        return rVar;
    }
}
