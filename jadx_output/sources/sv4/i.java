package sv4;

/* loaded from: classes12.dex */
public final class i implements jv4.h, sv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f413400a;

    /* renamed from: b, reason: collision with root package name */
    public rv4.z f413401b;

    /* renamed from: c, reason: collision with root package name */
    public jv4.i f413402c;

    public i(java.lang.ref.WeakReference settingDelegate, mv4.h session) {
        kotlin.jvm.internal.o.g(settingDelegate, "settingDelegate");
        kotlin.jvm.internal.o.g(session, "session");
        this.f413400a = settingDelegate;
    }

    @Override // jv4.h
    public androidx.recyclerview.widget.k3 a(android.view.ViewGroup parent, jv4.m type) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 6) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489130eg3, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new sv4.l(inflate);
        }
        if (ordinal != 7) {
            return new jv4.g(new android.view.View(parent.getContext()));
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489131eg4, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new sv4.q(inflate2);
    }

    @Override // jv4.h
    public java.util.List b() {
        rv4.z zVar = this.f413401b;
        if (zVar == null) {
            return kz5.p0.f313996d;
        }
        java.util.List list = zVar.f400563a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new tv4.b(this.f413400a, this, (rv4.a0) it.next()));
        }
        return kz5.n0.t0(kz5.b0.c(new tv4.f()), arrayList);
    }

    @Override // jv4.h
    public void c(jv4.i iVar) {
        this.f413402c = iVar;
    }
}
