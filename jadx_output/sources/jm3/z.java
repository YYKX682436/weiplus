package jm3;

/* loaded from: classes10.dex */
public final class z implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f300369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300370e;

    public z(com.tencent.mm.plugin.mv.ui.uic.c3 c3Var, com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI) {
        this.f300369d = c3Var;
        this.f300370e = musicMvMakerUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.HashSet hashSet = (java.util.HashSet) obj;
        boolean z17 = false;
        if (!(hashSet instanceof java.util.Collection) || !hashSet.isEmpty()) {
            java.util.Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((gm3.c) it.next()).f273544e != 0) {
                    z17 = true;
                    break;
                }
            }
        }
        if (this.f300369d.P6()) {
            int i17 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
            this.f300370e.c7(z17);
        }
        return jz5.f0.f302826a;
    }
}
