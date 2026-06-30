package hr3;

/* loaded from: classes11.dex */
public class w0 extends com.tencent.mm.ui.contact.o4 {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f284124m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f284125n;

    /* renamed from: o, reason: collision with root package name */
    public p13.c f284126o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f284127p;

    /* renamed from: q, reason: collision with root package name */
    public final o13.x f284128q;

    public w0(com.tencent.mm.ui.contact.l4 l4Var, int i17, com.tencent.mm.storage.z3 z3Var) {
        super(l4Var, false, i17);
        this.f284125n = new com.tencent.mm.sdk.platformtools.n3();
        this.f284128q = new hr3.v0(this);
        this.f284124m = z3Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f284127p;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.item.r rVar = new com.tencent.mm.ui.contact.item.r(i17, this.f284124m);
        rVar.f(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(((p13.y) this.f284127p.get(i17)).f351187e, true));
        return rVar;
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void r() {
        if (this.f284126o != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f284126o);
        }
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        p13.u uVar = new p13.u();
        uVar.f351141c = str;
        uVar.f351152n = this.f284125n;
        uVar.f351151m = this.f284128q;
        uVar.f351142d = this.f284124m.d1();
        uVar.f351140b = 7;
        this.f284126o = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }
}
