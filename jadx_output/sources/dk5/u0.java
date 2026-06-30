package dk5;

/* loaded from: classes11.dex */
public class u0 extends com.tencent.mm.ui.contact.o4 {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.transmit.MMCreateChatroomUI f234921m;

    /* renamed from: n, reason: collision with root package name */
    public p13.c f234922n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f234923o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f234924p;

    /* renamed from: q, reason: collision with root package name */
    public p13.v f234925q;

    /* renamed from: r, reason: collision with root package name */
    public final o13.x f234926r;

    public u0(com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI, int i17) {
        super(mMCreateChatroomUI, false, i17);
        this.f234923o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f234926r = new dk5.t0(this);
        this.f234921m = mMCreateChatroomUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list;
        p13.v vVar = this.f234925q;
        if (vVar == null || (list = vVar.f351160e) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.item.d dVar;
        p13.y yVar = (p13.y) this.f234925q.f351160e.get(i17);
        if (yVar.f351187e.equals("no_result\u200b")) {
            dVar = new com.tencent.mm.ui.contact.item.x0(i17);
        } else {
            com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
            uVar.C = yVar;
            uVar.A = this.f234925q.f351159d;
            uVar.f206836e = this.f207078f;
            uVar.f206855x = true;
            uVar.f206854w = i17 + 1;
            int i18 = yVar.f351184b;
            int i19 = yVar.f351185c;
            uVar.f206853v = i18;
            uVar.f206852u = i19;
            dVar = uVar;
        }
        dVar.f206848q = this.f234924p;
        dVar.f206851t = this.f207080h;
        dVar.f206836e = false;
        return dVar;
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void r() {
        if (this.f234922n != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f234922n);
        }
        this.f234924p = null;
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        this.f234924p = str;
        p13.u uVar = new p13.u();
        uVar.f351152n = this.f234923o;
        uVar.f351151m = this.f234926r;
        uVar.f351141c = str;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351145g = new int[]{131072};
        uVar.f351148j.add("filehelper");
        uVar.f351148j.add(c01.z1.r());
        uVar.f351148j.addAll(this.f234921m.F.t());
        uVar.f351148j.addAll(com.tencent.mm.ui.contact.i5.c());
        this.f234922n = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }
}
