package e00;

/* loaded from: classes9.dex */
public final class z implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00.b0 f245835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.oe0 f245836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f245837c;

    public z(e00.b0 b0Var, bw5.oe0 oe0Var, long j17) {
        this.f245835a = b0Var;
        this.f245836b = oe0Var;
        this.f245837c = j17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("RequestProductCardTask", "batchRequestProductCardInfo: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        java.util.ArrayList arrayList = null;
        bw5.re0 re0Var = fVar instanceof bw5.re0 ? (bw5.re0) fVar : null;
        e00.b0 b0Var = this.f245835a;
        if ((re0Var == null || (linkedList = re0Var.f32500d) == null || linkedList.size() != b0Var.c()) ? false : true) {
            yz5.l lVar = b0Var.f245743d;
            if (lVar != null) {
                java.util.LinkedList linkedList2 = re0Var.f32500d;
                if (linkedList2 != null) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : linkedList2) {
                        if (((bw5.qe0) obj).f32061f == 0) {
                            arrayList.add(obj);
                        }
                    }
                }
                lVar.invoke(arrayList);
            }
        } else {
            yz5.l lVar2 = b0Var.f245743d;
            if (lVar2 != null) {
                lVar2.invoke(null);
            }
        }
        e00.g.f245772a.h(this.f245836b, java.lang.System.currentTimeMillis() - this.f245837c, i18 == 0 && i17 == 0 ? bw5.f6.RESULT_SUCCESS : bw5.f6.RESULT_FAILED);
    }
}
