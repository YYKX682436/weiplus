package so4;

/* loaded from: classes10.dex */
public final class d implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f410771a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rm5.v f410772b;

    public d(rm5.v vVar) {
        this.f410772b = vVar;
    }

    @Override // wm5.f
    public void a(long j17) {
        java.lang.Object obj;
        java.lang.String str;
        so4.g gVar = so4.g.f410776a;
        so4.a aVar = so4.g.f410780e;
        if ((aVar != null ? aVar.f410766a : null) != null) {
            java.util.Iterator it = this.f410772b.f397584l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                rm5.j jVar = (rm5.j) obj;
                if (jVar.f397502d <= j17 && jVar.f397503e > j17) {
                    break;
                }
            }
            rm5.j jVar2 = (rm5.j) obj;
            if (kotlin.jvm.internal.o.b(jVar2 != null ? jVar2.f397499a : null, this.f410771a)) {
                return;
            }
            so4.g gVar2 = so4.g.f410776a;
            int a17 = gVar2.a(jVar2 != null ? jVar2.f397499a : null);
            if (((java.util.ArrayList) so4.g.f410784i).contains(java.lang.Integer.valueOf(a17))) {
                gVar2.g(a17);
            }
            if (jVar2 == null || (str = jVar2.f397499a) == null) {
                str = "";
            }
            this.f410771a = str;
        }
    }

    @Override // wm5.f
    public void b() {
    }
}
