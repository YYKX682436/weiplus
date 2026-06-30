package r21;

/* loaded from: classes5.dex */
public class z implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.e9 f368807a;

    public z(r21.a0 a0Var, com.tencent.mm.storage.e9 e9Var) {
        this.f368807a = e9Var;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        com.tencent.mm.storage.e9 e9Var = this.f368807a;
        java.util.Objects.toString(((com.tencent.mm.storage.k4) q17).n(e9Var.f193882x, true));
        com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent = new com.tencent.mm.autogen.events.LbsSayHiEvent();
        java.lang.String str2 = e9Var.f193882x;
        am.ni niVar = lbsSayHiEvent.f54464g;
        niVar.f7426a = str2;
        niVar.f7427b = 1;
        lbsSayHiEvent.e();
    }
}
