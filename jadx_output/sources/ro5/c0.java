package ro5;

/* loaded from: classes14.dex */
public final class c0 {
    public c0(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(ro5.c0 c0Var, bp5.h hVar, boolean z17) {
        c0Var.getClass();
        if (hVar != null && hVar.getImpellerEnabled()) {
            if (z17) {
                return;
            }
            hVar.setNeedRecreate(true);
        } else {
            if (hVar == null) {
                return;
            }
            hVar.setNeedRecreate(true ^ z17);
        }
    }
}
