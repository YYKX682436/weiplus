package pk2;

/* loaded from: classes3.dex */
public final class ya implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f356404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.za f356405b;

    public ya(java.lang.Integer num, pk2.za zaVar) {
        this.f356404a = num;
        this.f356405b = zaVar;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        pk2.f8.f355747a.b(4, 0, 1, z17 ? 2 : 3, this.f356404a);
        zl2.r4.f473950a.V2(z17);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f327978q;
        jz5.l[] lVarArr = new jz5.l[1];
        lVarArr[0] = new jz5.l("button_click_type", z17 ? "1" : "0");
        zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), null, null, null, null, false, 124, null);
        qk2.f.f(this.f356405b, false, 1, null);
    }
}
