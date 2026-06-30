package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class a0 implements mv2.v0 {
    @Override // mv2.v0
    public void a(long j17, boolean z17) {
        java.lang.Object obj;
        try {
            java.util.Iterator it = com.tencent.mm.plugin.finder.report.b0.f124962b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.tencent.mm.plugin.finder.storage.x80) obj).field_localId == j17) {
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.finder.storage.x80 x80Var = (com.tencent.mm.plugin.finder.storage.x80) obj;
            if (x80Var != null) {
                com.tencent.mm.plugin.finder.report.b0.f124961a.b(x80Var.t0(), false);
                com.tencent.mm.plugin.finder.report.p2.f125237a.J(false, x80Var);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // mv2.v0
    public void onPostOk(long j17, long j18) {
        java.lang.Object obj;
        try {
            java.util.Iterator it = com.tencent.mm.plugin.finder.report.b0.f124962b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.tencent.mm.plugin.finder.storage.x80) obj).field_localId == j17) {
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.finder.storage.x80 x80Var = (com.tencent.mm.plugin.finder.storage.x80) obj;
            if (x80Var != null) {
                com.tencent.mm.plugin.finder.report.b0.f124961a.b(x80Var.t0(), true);
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                x80Var.field_objectId = j18;
                p2Var.J(true, x80Var);
                com.tencent.mm.plugin.finder.report.p2.t(p2Var, null, null, new com.tencent.mm.plugin.finder.report.j2("saveSucc", null), 3, null);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
