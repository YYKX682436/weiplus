package z4;

/* loaded from: classes13.dex */
public class d0 extends z4.d {
    @Override // z4.j
    public boolean b() {
        if (!super.b() || !y4.n.a("MULTI_PROCESS")) {
            return false;
        }
        int i17 = y4.m.f459277a;
        if (z4.e0.f470063e.b()) {
            return z4.g0.f470067a.getStatics().isMultiProcessEnabled();
        }
        throw z4.e0.a();
    }
}
