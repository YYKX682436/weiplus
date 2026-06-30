package vp3;

/* loaded from: classes12.dex */
public final class e implements lr0.c {

    /* renamed from: d, reason: collision with root package name */
    public static final vp3.e f438983d = new vp3.e();

    @Override // lr0.c
    public boolean a(boolean z17, int i17, yz5.l lVar) {
        boolean z18;
        vp3.c cVar;
        if (!ih.a.f(e42.d0.clicfg_matrix_memory_trigger_mem_hook_enable, true)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z17) {
                z18 = false;
                cVar = (vp3.c) tp3.a.INSTANCE.a(vp3.c.class);
                if (cVar.f438973g.e() || !z18) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.triggers.MemoryHook", "MemoryHookTrigger: ");
                cVar.y(i17);
                return true;
            }
        }
        z18 = true;
        cVar = (vp3.c) tp3.a.INSTANCE.a(vp3.c.class);
        if (cVar.f438973g.e()) {
        }
        return false;
    }
}
