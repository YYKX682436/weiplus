package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.j.class)
/* loaded from: classes9.dex */
public final class p0 extends com.tencent.mm.ui.chatting.component.a implements yn.e, sb5.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f199659e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f199660f = new java.util.LinkedHashMap();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        ((java.util.LinkedHashMap) this.f199659e).clear();
        ((java.util.LinkedHashMap) this.f199660f).clear();
    }

    public rd5.d m0(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        if (this.f198580d.g() instanceof androidx.appcompat.app.AppCompatActivity) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((java.util.LinkedHashMap) this.f199659e).get(this.f198580d.x());
            rd5.d dVar = concurrentHashMap != null ? (rd5.d) concurrentHashMap.get(kz5.n0.g0(kz5.c0.i(java.lang.String.valueOf(msgInfo.Q0()), java.lang.String.valueOf(msgInfo.getMsgId()), java.lang.String.valueOf(msgInfo.T1())), "||", null, null, 0, null, null, 62, null)) : null;
            if (dVar != null && rd5.e.a(dVar.f394254d.f445300b, msgInfo)) {
                return dVar;
            }
        }
        java.lang.Object clone = msgInfo.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type com.tencent.mm.storage.MsgInfo");
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) clone;
        yb5.d mChattingContext = this.f198580d;
        kotlin.jvm.internal.o.f(mChattingContext, "mChattingContext");
        com.tencent.mm.ui.chatting.viewitems.dr a17 = com.tencent.mm.ui.chatting.viewitems.xr.a(mChattingContext);
        yb5.d mChattingContext2 = this.f198580d;
        kotlin.jvm.internal.o.f(mChattingContext2, "mChattingContext");
        java.lang.Object d17 = ((com.tencent.mm.ui.chatting.viewitems.wr) a17).d(((com.tencent.mm.ui.chatting.viewitems.wr) com.tencent.mm.ui.chatting.viewitems.xr.a(mChattingContext2)).c(msgInfo));
        if (d17 instanceof we5.b) {
            yb5.d mChattingContext3 = this.f198580d;
            kotlin.jvm.internal.o.f(mChattingContext3, "mChattingContext");
            return ((we5.b) d17).b(new we5.a(mChattingContext3, f9Var));
        }
        yb5.d mChattingContext4 = this.f198580d;
        kotlin.jvm.internal.o.f(mChattingContext4, "mChattingContext");
        return new rd5.d(new we5.a(mChattingContext4, f9Var));
    }
}
