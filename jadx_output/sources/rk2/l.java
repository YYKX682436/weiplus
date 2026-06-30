package rk2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk2.q f396462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rk2.q qVar) {
        super(0);
        this.f396462d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        r45.la4 la4Var;
        rk2.q qVar = this.f396462d;
        int w17 = qVar.f396474e.w();
        int y17 = qVar.f396474e.y();
        com.tencent.mars.xlog.Log.i("MultiStreamWidget", "firstVisiblePos:" + w17 + " lastVisiblePos:" + y17);
        if (w17 == y17) {
            uk2.b x17 = qVar.f396473d.x(w17);
            java.lang.String str = (x17 == null || (la4Var = x17.f428522b) == null) ? null : la4Var.f379274e;
            if (str == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onItemChecked curLiveId:" + str + " selectedLiveId:" + qVar.f396481l);
            if (!kotlin.jvm.internal.o.b(str, "") && !kotlin.jvm.internal.o.b(str, qVar.f396481l)) {
                qVar.f396481l = str;
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
