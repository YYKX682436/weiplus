package e00;

/* loaded from: classes9.dex */
public final class c0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00.e0 f245747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.te0 f245748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f245749c;

    public c0(e00.e0 e0Var, bw5.te0 te0Var, long j17) {
        this.f245747a = e0Var;
        this.f245748b = te0Var;
        this.f245749c = j17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("RequestShopCardTask", "batchRequestShopCardInfo: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        bw5.ve0 ve0Var = fVar instanceof bw5.ve0 ? (bw5.ve0) fVar : null;
        e00.e0 e0Var = this.f245747a;
        if ((ve0Var == null || (linkedList = ve0Var.f34343d) == null || linkedList.size() != e0Var.c()) ? false : true) {
            java.util.LinkedList linkedList2 = ve0Var.f34343d;
            kotlin.jvm.internal.o.f(linkedList2, "getShops(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList2) {
                if (((bw5.ue0) obj).f33873f == 0) {
                    arrayList.add(obj);
                }
            }
            yz5.l lVar = e0Var.f245759d;
            if (lVar != null) {
                lVar.invoke(arrayList);
            }
        } else {
            yz5.l lVar2 = e0Var.f245759d;
            if (lVar2 != null) {
                lVar2.invoke(null);
            }
        }
        e00.g.f245772a.i(this.f245748b, java.lang.System.currentTimeMillis() - this.f245749c, i18 == 0 && i17 == 0 ? bw5.f6.RESULT_SUCCESS : bw5.f6.RESULT_FAILED);
    }
}
