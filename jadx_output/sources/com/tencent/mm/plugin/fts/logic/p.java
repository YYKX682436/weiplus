package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class p implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137646d;

    public p(com.tencent.mm.plugin.fts.logic.l lVar) {
        this.f137646d = lVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.String[] split = str.split(" ");
        if (split.length == 0) {
            return;
        }
        boolean equals = split[0].equals("update");
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137646d;
        if (equals) {
            for (int i17 = 1; i17 < split.length; i17++) {
                ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.h0(lVar, com.tencent.mm.sdk.platformtools.t8.V(split[i17], 0L)));
            }
        }
        if (split[0].equals("insert")) {
            for (int i18 = 1; i18 < split.length; i18++) {
                ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.b0(lVar, com.tencent.mm.sdk.platformtools.t8.V(split[i18], 0L)));
            }
        }
        if (split[0].equals("delete")) {
            for (int i19 = 1; i19 < split.length; i19++) {
                ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.z(lVar, com.tencent.mm.sdk.platformtools.t8.V(split[i19], 0L)));
            }
        }
    }
}
