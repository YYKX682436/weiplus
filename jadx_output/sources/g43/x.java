package g43;

/* loaded from: classes5.dex */
public final class x extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.i0 f268794d = new androidx.lifecycle.i0();

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f268795e = new androidx.lifecycle.j0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f268796f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f268797g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f268798h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f268799i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f268800m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f268801n;

    public x() {
        jz5.i iVar = jz5.i.f302831f;
        this.f268798h = jz5.h.a(iVar, g43.w.f268793d);
        this.f268799i = new java.util.ArrayList();
        this.f268800m = jz5.h.a(iVar, g43.p.f268774d);
        this.f268801n = jz5.h.a(iVar, new g43.n(this));
    }

    public static final void N6(g43.x xVar, w33.e eVar, boolean z17) {
        xVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a6k);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            arrayList.add(new w33.c(null, new w33.e(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL, string, ""), false, 601, 5, null));
        }
        if (eVar != null) {
            arrayList.add(new w33.c(null, eVar, false, 602, 5, null));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        xVar.f268794d.postValue(w33.b.a(xVar.O6(), arrayList, null, null, null, 14, null));
    }

    public final w33.b O6() {
        w33.b bVar = (w33.b) this.f268794d.getValue();
        if (bVar != null) {
            return bVar;
        }
        kz5.p0 p0Var = kz5.p0.f313996d;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new w33.b(p0Var, new jz5.l(bool, p0Var), new jz5.l(bool, p0Var), new jz5.l(bool, p0Var));
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        java.lang.String str = this.f268796f;
        if (str != null) {
            g43.m mVar = g43.m.f268766d;
            mVar.c().remove(str);
            mVar.b().remove(str);
        }
        com.tencent.stubs.logger.Log.i("GameChatRoom.ChatroomMemberViewModel", "onCleared");
        super.onCleared();
    }
}
