package h31;

/* loaded from: classes9.dex */
public final class k implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.r f278417a;

    public k(h31.r rVar) {
        this.f278417a = rVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.e("MicroMsg.BrandSubscribeMsgRequestController", "getSubscribeMsgTemplateList onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        h31.r rVar = this.f278417a;
        h31.a aVar = rVar.f278434h;
        if (aVar != null) {
            int i19 = rVar.f278428b;
            if (!(errMsg.length() > 0)) {
                errMsg = "get subscribe msg list failed";
            }
            ((m31.y1) aVar).a(i19, 10002, errMsg);
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.ArrayList arrayList = result.f71785h;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "getSubscribeMsgTemplateList onSuccess bizUsername: %s, size: %d", bizUsername, java.lang.Integer.valueOf(arrayList.size()));
        h31.r rVar = this.f278417a;
        int i17 = rVar.f278428b;
        rVar.getClass();
        if (result.f71797w == 0 && arrayList.isEmpty()) {
            rVar.f278435i = arrayList;
            rVar.f278442p = result.f71792r;
            rVar.f278428b = 2;
            h31.s.f278446a.c(rVar);
            return;
        }
        java.lang.ref.WeakReference weakReference = rVar.f278427a;
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            return;
        }
        rVar.a(context, i17, result);
    }
}
