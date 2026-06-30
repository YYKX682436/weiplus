package com.tencent.mm.ui.chatting.component;

/* loaded from: classes4.dex */
public class y6 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.f7 f200284e;

    public y6(com.tencent.mm.ui.chatting.component.f7 f7Var, com.tencent.mm.storage.f9 f9Var) {
        this.f200284e = f7Var;
        this.f200283d = f9Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "ChattingUI.appExposeReport";
    }

    @Override // java.lang.Runnable
    public void run() {
        int t17;
        com.tencent.mm.ui.chatting.component.f7 f7Var = this.f200284e;
        java.util.HashSet hashSet = f7Var.f199018h;
        com.tencent.mm.storage.f9 f9Var = this.f200283d;
        hashSet.add(java.lang.Long.valueOf(f9Var.I0()));
        m21.x xVar = new m21.x();
        xVar.a("20MessageID", f9Var.I0() + ",");
        xVar.a("21MessageInnerType", f9Var.getType() + ",");
        xVar.a("22currChatName", f9Var.Q0() + ",");
        xVar.a("23msgPostUserName", (f9Var.A0() == 1 ? c01.z1.r() : f7Var.f198580d.C() ? (f9Var.j() == null || (t17 = c01.w9.t(f9Var.j())) == -1) ? "" : f9Var.j().substring(0, t17).trim() : f9Var.Q0()) + ",");
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            return;
        }
        xVar.a("24AppId", v17.f348646d + ",");
        if (v17.Y1 != null) {
            r45.td6 td6Var = new r45.td6();
            try {
                td6Var.parseFrom(android.util.Base64.decode(v17.Y1, 0));
            } catch (java.lang.Exception unused) {
            }
            if (td6Var.f386331f != null) {
                xVar.a("25SourceAppId", td6Var.f386331f.f384752d + ",");
            }
        }
        xVar.c();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13634, xVar);
    }
}
