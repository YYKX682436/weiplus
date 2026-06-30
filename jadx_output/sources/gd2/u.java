package gd2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f270560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(gd2.x xVar) {
        super(0);
        this.f270560d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int n17 = gm0.j1.d().n();
        if (n17 != 6 && n17 != 4) {
            gd2.x xVar = this.f270560d;
            if (xVar.f270572i == 1) {
                com.tencent.mm.ui.MMActivity mMActivity = xVar.f270564a;
                db5.e1.s(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490500wu), "");
                xVar.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
