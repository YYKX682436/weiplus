package e23;

/* loaded from: classes11.dex */
public class s1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f246958q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f246959r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f246960s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f246961t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f246962u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f246963v;

    /* renamed from: w, reason: collision with root package name */
    public final e23.r1 f246964w;

    /* renamed from: x, reason: collision with root package name */
    public final e23.q1 f246965x;

    public s1(int i17) {
        super(2, i17);
        this.f246964w = new e23.r1(this);
        this.f246965x = new e23.q1(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f246960s = this.f246958q.f351187e;
        this.f246959r = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f246960s, true);
        try {
            o(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSWXChatroomDataItem", e17, "format text exception", new java.lang.Object[0]);
            if (this.f246961t == null) {
                this.f246961t = o13.n.d(this.f246959r.d1());
            }
        }
    }

    @Override // u13.g
    public int g() {
        java.util.List list;
        p13.y yVar = this.f246958q;
        if (yVar.f351185c != 38 || (list = yVar.f351196n) == null || list.size() <= 0) {
            return 0;
        }
        return ((p13.l) list.get(0)).f351111b;
    }

    @Override // u13.g
    public int j() {
        return this.f246958q.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246964w;
    }

    @Override // u13.g
    public boolean m() {
        return this.f246958q.f351201s;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e23.s1.o(android.content.Context):void");
    }
}
