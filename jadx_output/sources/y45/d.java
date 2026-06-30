package y45;

/* loaded from: classes12.dex */
public class d extends y45.f {
    @Override // d55.s
    public void a() {
        java.util.List list = this.f226611a;
        ((java.util.ArrayList) list).add(new d55.p(".cmd.diagnostic.MemoryHook.$enable", false));
        ((java.util.ArrayList) list).add(new d55.p(".cmd.diagnostic.PthreadHook.$enable", false));
        ((java.util.ArrayList) list).add(new d55.q(".cmd.diagnostic.MemoryHook.crash", Integer.MAX_VALUE));
        ((java.util.ArrayList) list).add(new d55.q(".cmd.diagnostic.PthreadHook.crash", Integer.MAX_VALUE));
    }
}
