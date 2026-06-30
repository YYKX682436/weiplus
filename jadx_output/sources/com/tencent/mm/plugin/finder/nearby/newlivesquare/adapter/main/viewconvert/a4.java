package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f121572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f121571d = str;
        this.f121572e = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList list;
        r45.dl2 dl2Var;
        r45.nw1 nw1Var;
        java.util.LinkedList list2;
        r45.dl2 dl2Var2;
        r45.nw1 nw1Var2;
        java.util.LinkedList list3;
        r45.dl2 dl2Var3;
        r45.nw1 nw1Var3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestAndRefreshActivityIcon errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(" feedId:");
        sb6.append(this.f121571d);
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", sb6.toString());
        kotlin.coroutines.Continuation continuation = this.f121572e;
        if (fVar != null && fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.ov0 ov0Var = (r45.ov0) fVar.f70618d;
            int integer = (ov0Var == null || (list3 = ov0Var.getList(1)) == null || (dl2Var3 = (r45.dl2) kz5.n0.a0(list3, 0)) == null || (nw1Var3 = (r45.nw1) dl2Var3.getCustom(1)) == null) ? 0 : nw1Var3.getInteger(10);
            r45.ov0 ov0Var2 = (r45.ov0) fVar.f70618d;
            boolean z17 = ((ov0Var2 == null || (list2 = ov0Var2.getList(1)) == null || (dl2Var2 = (r45.dl2) kz5.n0.a0(list2, 0)) == null || (nw1Var2 = (r45.nw1) dl2Var2.getCustom(1)) == null) ? 1 : nw1Var2.getInteger(2)) == 1;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#requestAndRefreshActivityIcon participantCount=");
            sb7.append(integer);
            sb7.append(", liveStatus=");
            r45.ov0 ov0Var3 = (r45.ov0) fVar.f70618d;
            sb7.append((ov0Var3 == null || (list = ov0Var3.getList(1)) == null || (dl2Var = (r45.dl2) kz5.n0.a0(list, 0)) == null || (nw1Var = (r45.nw1) dl2Var.getCustom(1)) == null) ? null : java.lang.Integer.valueOf(nw1Var.getInteger(2)));
            sb7.append(" interval=");
            r45.ov0 ov0Var4 = (r45.ov0) fVar.f70618d;
            sb7.append(ov0Var4 != null ? java.lang.Integer.valueOf(ov0Var4.getInteger(3)) : null);
            com.tencent.mars.xlog.Log.i("Finder.LivingConvert", sb7.toString());
            r45.ov0 ov0Var5 = (r45.ov0) fVar.f70618d;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k2(true, ov0Var5 != null ? ov0Var5.getInteger(3) : 0, integer, z17)));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k2(false, 0, 0, true)));
        }
        return jz5.f0.f302826a;
    }
}
