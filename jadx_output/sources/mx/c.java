package mx;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lr4 f331808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizMinimizeInfo f331809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx.e f331810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f331811g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.lr4 lr4Var, com.tencent.pigeon.biz_base.BizMinimizeInfo bizMinimizeInfo, mx.e eVar, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331808d = lr4Var;
        this.f331809e = bizMinimizeInfo;
        this.f331810f = eVar;
        this.f331811g = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx.c(this.f331808d, this.f331809e, this.f331810f, this.f331811g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx.c cVar = (mx.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        ak3.c cVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cs1.a aVar2 = cs1.b.f222057a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.pigeon.biz_base.BizMinimizeInfo bizMinimizeInfo = this.f331809e;
        java.lang.Long itemShowType = bizMinimizeInfo.getItemShowType();
        int longValue = itemShowType != null ? (int) itemShowType.longValue() : 0;
        java.lang.String userName = bizMinimizeInfo.getUserName();
        if (userName == null) {
            userName = "";
        }
        java.lang.String title = bizMinimizeInfo.getTitle();
        java.lang.String a17 = aVar2.a(context, longValue, userName, title != null ? title : "");
        r45.lr4 lr4Var = this.f331808d;
        lr4Var.set(1, a17);
        android.graphics.Bitmap bitmap2 = null;
        try {
            bitmap = com.tencent.mm.sdk.platformtools.x.G(bizMinimizeInfo.getAnimatedImage());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizMultiTaskHelper", e17, "onMinimizeArticle", new java.lang.Object[0]);
            bitmap = null;
        }
        try {
            bitmap2 = com.tencent.mm.sdk.platformtools.x.G(bizMinimizeInfo.getCoverImage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizMultiTaskHelper", e18, "onMinimizeArticle", new java.lang.Object[0]);
        }
        com.tencent.pigeon.biz_base.BizRect animatedImageRect = bizMinimizeInfo.getAnimatedImageRect();
        mx.e eVar = this.f331810f;
        if (animatedImageRect != null && bitmap != null && (cVar = eVar.f300111d) != null) {
            com.tencent.pigeon.biz_base.BizRect animatedImageRect2 = bizMinimizeInfo.getAnimatedImageRect();
            kotlin.jvm.internal.o.d(animatedImageRect2);
            java.lang.Double left = animatedImageRect2.getLeft();
            int doubleValue = left != null ? (int) left.doubleValue() : 0;
            com.tencent.pigeon.biz_base.BizRect animatedImageRect3 = bizMinimizeInfo.getAnimatedImageRect();
            kotlin.jvm.internal.o.d(animatedImageRect3);
            java.lang.Double top = animatedImageRect3.getTop();
            int doubleValue2 = top != null ? (int) top.doubleValue() : 0;
            com.tencent.pigeon.biz_base.BizRect animatedImageRect4 = bizMinimizeInfo.getAnimatedImageRect();
            kotlin.jvm.internal.o.d(animatedImageRect4);
            java.lang.Double right = animatedImageRect4.getRight();
            int doubleValue3 = right != null ? (int) right.doubleValue() : 0;
            com.tencent.pigeon.biz_base.BizRect animatedImageRect5 = bizMinimizeInfo.getAnimatedImageRect();
            kotlin.jvm.internal.o.d(animatedImageRect5);
            java.lang.Double bottom = animatedImageRect5.getBottom();
            ((ak3.i) cVar).s(new android.graphics.Rect(doubleValue, doubleValue2, doubleValue3, bottom != null ? (int) bottom.doubleValue() : 0), bitmap);
        }
        eVar.f300117j = new mx.b(eVar, bitmap2);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = eVar.f300077a;
        if (multiTaskInfo != null) {
            multiTaskInfo.field_data = this.f331811g;
        }
        if (multiTaskInfo != null) {
            multiTaskInfo.field_showData = lr4Var;
        }
        eVar.V(true, 9, jk3.c.f300081e);
        return jz5.f0.f302826a;
    }
}
