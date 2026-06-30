package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes4.dex */
public class h7 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.i f204089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204091d;

    public h7(com.tencent.mm.ui.chatting.viewitems.i7 i7Var, yb5.d dVar, zy2.i iVar, java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f204088a = dVar;
        this.f204089b = iVar;
        this.f204090c = str;
        this.f204091d = f9Var;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        return this.f204091d.getMsgId() + view.hashCode();
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        if (z17) {
            zy2.eb ebVar = (zy2.eb) i95.n0.c(zy2.eb.class);
            r45.qt2 wi6 = ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(this.f204088a.g());
            zy2.i iVar = this.f204089b;
            ((vr2.f) ebVar).Bi(pm0.v.Z(iVar.f477411b.getString(0)), iVar.f477411b.getString(8), 4, wi6, null, false, null);
            com.tencent.mm.storage.f9 f9Var = this.f204091d;
            boolean R4 = com.tencent.mm.storage.z3.R4(f9Var.Q0());
            java.lang.String str = this.f204090c;
            if (R4) {
                str = str + "-" + f9Var.Q0();
            }
            java.lang.String str2 = str;
            int i17 = R4 ? 2 : com.tencent.mm.storage.z3.p4(f9Var.Q0()) ? 58 : 1;
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.tencent.mm.plugin.finder.report.m0.f125120d.c(i17, 1, str2, null, iVar.f477411b.getString(0), iVar.f477411b.getInteger(29), this.f204090c, null, f9Var.getCreateTime(), pm0.v.u(f9Var.I0()));
        }
    }
}
