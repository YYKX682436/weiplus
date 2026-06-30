package sc4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f406556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f406557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f406558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f406559g;

    public b(byte[] bArr, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17, boolean z18) {
        this.f406556d = bArr;
        this.f406557e = timeLineObject;
        this.f406558f = z17;
        this.f406559g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper$checkClearOldVideo$1");
        byte[] bArr = this.f406556d;
        if (bArr == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper$checkClearOldVideo$1");
            return;
        }
        try {
            com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.TimeLineObject().parseFrom(bArr);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineObject");
            timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) parseFrom;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMultiSpecVideoHelper", "error get snsinfo timeline!");
            timeLineObject = null;
        }
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper$checkClearOldVideo$1");
            return;
        }
        int i17 = timeLineObject.ContentObj.f369837e;
        sc4.c cVar = sc4.c.f406560a;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = this.f406557e;
        if (i17 == 15 && timeLineObject2.ContentObj.f369837e == 15 && this.f406558f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "clear video " + timeLineObject.Id);
            java.util.LinkedList MediaObjList = timeLineObject.ContentObj.f369840h;
            kotlin.jvm.internal.o.f(MediaObjList, "MediaObjList");
            r45.jj4 jj4Var = (r45.jj4) kz5.n0.Z(MediaObjList);
            java.util.LinkedList MediaObjList2 = timeLineObject2.ContentObj.f369840h;
            kotlin.jvm.internal.o.f(MediaObjList2, "MediaObjList");
            sc4.c.a(cVar, jj4Var, (r45.jj4) kz5.n0.Z(MediaObjList2));
        }
        if (timeLineObject.ContentObj.f369837e == 54 && timeLineObject2.ContentObj.f369837e == 54 && this.f406559g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "clear LivePhoto " + timeLineObject.Id);
            int size = timeLineObject.ContentObj.f369840h.size();
            for (int i18 = 0; i18 < size; i18++) {
                r45.jj4 jj4Var2 = (r45.jj4) timeLineObject.ContentObj.f369840h.get(i18);
                java.util.LinkedList MediaObjList3 = timeLineObject2.ContentObj.f369840h;
                kotlin.jvm.internal.o.f(MediaObjList3, "MediaObjList");
                r45.jj4 jj4Var3 = (r45.jj4) kz5.n0.a0(MediaObjList3, i18);
                if (jj4Var2.X != null) {
                    if ((jj4Var3 != null ? jj4Var3.X : null) != null) {
                        sc4.c.a(cVar, jj4Var2, jj4Var3);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper$checkClearOldVideo$1");
    }
}
