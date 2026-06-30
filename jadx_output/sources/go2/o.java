package go2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f274033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(go2.z zVar) {
        super(0);
        this.f274033d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go2.z zVar = this.f274033d;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = zVar.C;
        if (s4Var == null) {
            kotlin.jvm.internal.o.o("moreLiveListWidget");
            throw null;
        }
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) zVar.H.get(zVar.D);
        zy2.ic.a(s4Var, l2Var != null ? l2Var.f123923l : null, null, false, null, 0, 0, null, 126, null);
        return jz5.f0.f302826a;
    }
}
