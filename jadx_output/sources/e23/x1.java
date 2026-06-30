package e23;

/* loaded from: classes12.dex */
public class x1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f246988q;

    /* renamed from: r, reason: collision with root package name */
    public long f246989r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f246990s;

    /* renamed from: t, reason: collision with root package name */
    public h45.v f246991t;

    /* renamed from: u, reason: collision with root package name */
    public final e23.v1 f246992u;

    /* renamed from: v, reason: collision with root package name */
    public final e23.w1 f246993v;

    public x1(int i17) {
        super(16, i17);
        this.f246991t = null;
        this.f246992u = new e23.v1(this, this.f423765h);
        this.f246993v = new e23.w1(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        p13.y yVar = this.f246988q;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(yVar.f351187e, yVar.f351186d);
        h45.v a17 = h45.v.a(Li.j());
        this.f246991t = a17;
        int i17 = a17.f278955b;
        java.util.List list = a17.f278965l;
        if (i17 == 0) {
            h45.u uVar = new h45.u();
            uVar.f278951a = "";
            uVar.f278952b = a17.f278956c;
            ((java.util.ArrayList) list).add(uVar);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f278963j)) {
            h45.u uVar2 = new h45.u();
            uVar2.f278951a = context.getString(com.tencent.mm.R.string.ie7);
            uVar2.f278952b = a17.f278963j;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.size() <= 0 || !((h45.u) arrayList.get(0)).f278953c) {
                arrayList.add(0, uVar2);
            } else {
                arrayList.add(1, uVar2);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f278964k)) {
            h45.u uVar3 = new h45.u();
            uVar3.f278951a = context.getString(com.tencent.mm.R.string.f492951ie4);
            uVar3.f278952b = a17.f278964k;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            if (arrayList2.size() <= 0 || !((h45.u) arrayList2.get(0)).f278953c) {
                arrayList2.add(0, uVar3);
            } else {
                arrayList2.add(1, uVar3);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f278962i)) {
            h45.u uVar4 = new h45.u();
            uVar4.f278951a = context.getString(com.tencent.mm.R.string.ie6);
            uVar4.f278952b = a17.f278962i;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
            if (arrayList3.size() <= 0 || !((h45.u) arrayList3.get(0)).f278953c) {
                arrayList3.add(0, uVar4);
            } else {
                arrayList3.add(1, uVar4);
            }
        }
        this.f246989r = Li.getMsgId();
        this.f246990s = k35.m1.f(context, this.f246988q.f351188f, true, false);
    }

    @Override // u13.g
    public int j() {
        return this.f246988q.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246992u;
    }
}
