package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public static final boolean a(com.tencent.mm.plugin.profile.ui.mod.components.a aVar, com.tencent.mm.storage.z3 z3Var, java.lang.String str) {
        aVar.getClass();
        z3Var.d3(str);
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
        if (z07 == null || com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(z3Var.J0())) {
                z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.J0());
            }
            java.lang.String str2 = z07 != null ? z07.field_encryptUsername : null;
            if (str2 == null || r26.n0.N(str2)) {
                z07 = new com.tencent.mm.storage.ya(z3Var.d1(), z3Var.w0());
            }
        }
        if (z07 != null) {
            z07.field_conDescription = str;
            ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).replace(z07);
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var.d1(), z3Var);
        return true;
    }
}
