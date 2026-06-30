package gk5;

/* loaded from: classes9.dex */
public final class s0 extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new dc5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        l15.c k17 = ((dc5.a) c7()).k();
        return (k17 == null || (xml = k17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        gk5.r0 r0Var = (gk5.r0) pf5.z.f353948a.a(activity).a(gk5.r0.class);
        java.lang.String d76 = d7();
        dc5.a aVar = (dc5.a) c7();
        long j17 = aVar.getLong(aVar.f43702d + 0);
        dc5.a aVar2 = (dc5.a) c7();
        r0Var.U6(d76, j17, aVar2.getString(aVar2.f43702d + 1), ((dc5.a) c7()).getScene() == 1, com.tencent.mm.ui.chatting.hd.d(action.f454741b));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        ot0.q Z6 = Z6();
        if (Z6 != null) {
            ((ez.w0) ot0.j1.a()).wi(Z6, Z6.f348646d, Z6.H, toUser, "", null, true);
        }
    }
}
