package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class o implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137641d;

    public o(com.tencent.mm.plugin.fts.logic.l lVar) {
        this.f137641d = lVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137641d;
        if (!lVar.f342207d || str.equals("*") || str.equals("chatroomname") || lVar.f137591m.containsKey(str)) {
            return;
        }
        ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.e0(lVar, str));
    }
}
