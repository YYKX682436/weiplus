package com.tencent.mm.plugin.ipcall;

/* loaded from: classes.dex */
public abstract class k {
    public static boolean a() {
        if (gm0.j1.a()) {
            if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WCOEntranceSwitch", 0) > 0) {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, java.lang.Boolean.TRUE);
                return true;
            }
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, java.lang.Boolean.FALSE);
        }
        return false;
    }
}
