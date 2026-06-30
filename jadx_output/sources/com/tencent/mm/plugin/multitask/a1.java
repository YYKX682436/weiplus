package com.tencent.mm.plugin.multitask;

/* loaded from: classes7.dex */
public final class a1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.b f150410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.i1 f150411e;

    public a1(kk3.b bVar, com.tencent.mm.plugin.multitask.i1 i1Var) {
        this.f150410d = bVar;
        this.f150411e = i1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.multitask.MultiTaskListParcel multiTaskListParcel = (com.tencent.mm.plugin.multitask.MultiTaskListParcel) obj;
        java.util.List list = multiTaskListParcel != null ? multiTaskListParcel.f150402d : null;
        kk3.b bVar = this.f150410d;
        if (list != null) {
            java.util.List list2 = multiTaskListParcel.f150402d;
            if ((list2 == null || list2.isEmpty()) ? false : true) {
                if (bVar != null) {
                    bVar.a(multiTaskListParcel.f150402d);
                }
                com.tencent.mm.plugin.multitask.i1 i1Var = this.f150411e;
                com.tencent.mm.ipcinvoker.extension.l.c(i1Var.f150456r);
                i1Var.f150456r = null;
            }
        }
        if (bVar != null) {
            bVar.a(new java.util.ArrayList());
        }
        com.tencent.mm.plugin.multitask.i1 i1Var2 = this.f150411e;
        com.tencent.mm.ipcinvoker.extension.l.c(i1Var2.f150456r);
        i1Var2.f150456r = null;
    }
}
