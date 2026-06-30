package zw;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f476491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f476492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f476493f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476494g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f476495h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.widget.dialog.u3 u3Var, long j17, java.util.LinkedList linkedList, yz5.l lVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476491d = u3Var;
        this.f476492e = j17;
        this.f476493f = linkedList;
        this.f476494g = lVar;
        this.f476495h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zw.c(this.f476491d, this.f476492e, this.f476493f, this.f476494g, this.f476495h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zw.c cVar = (zw.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f476491d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "handleMultiMediaResult finished, total cost: " + (java.lang.System.currentTimeMillis() - this.f476492e) + "ms, processed " + this.f476493f.size() + " items");
        java.util.LinkedList linkedList = this.f476493f;
        zw.o oVar = zw.o.f476536a;
        int i17 = this.f476495h;
        if (i17 != 1) {
            if (i17 == 2) {
                j17 = 1;
            } else if (i17 == 3) {
                j17 = 2;
            }
            this.f476494g.invoke(new com.tencent.pigeon.biz.BizImageSelectInfo(linkedList, null, null, new java.lang.Long(j17), 6, null));
            return jz5.f0.f302826a;
        }
        j17 = 0;
        this.f476494g.invoke(new com.tencent.pigeon.biz.BizImageSelectInfo(linkedList, null, null, new java.lang.Long(j17), 6, null));
        return jz5.f0.f302826a;
    }
}
