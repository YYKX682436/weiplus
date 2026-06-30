package eq4;

/* loaded from: classes12.dex */
public final class b extends xm1.k {

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f255903k;

    /* renamed from: l, reason: collision with root package name */
    public fp.e f255904l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f255905m;

    public b(yz5.l onStartRecord) {
        kotlin.jvm.internal.o.g(onStartRecord, "onStartRecord");
        this.f255903k = onStartRecord;
        i();
        ym1.f.f463134h.h(this, "record");
    }

    public final void C(boolean z17) {
        if (!z17) {
            q("record");
            ym1.f.f463134h.o("record");
        }
        fp.e eVar = this.f255904l;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // xm1.h
    public void o(int i17) {
        super.o(i17);
        if (this.f255905m) {
            return;
        }
        this.f255905m = true;
        q("record");
        ym1.f.f463134h.o("record");
        this.f255903k.invoke(java.lang.Boolean.TRUE);
    }
}
