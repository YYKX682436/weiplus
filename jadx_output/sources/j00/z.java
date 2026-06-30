package j00;

/* loaded from: classes4.dex */
public final class z implements mh0.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296955b;

    public z(java.lang.String str, yz5.l lVar) {
        this.f296954a = str;
        this.f296955b = lVar;
    }

    @Override // mh0.o
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "callAppPay resultCode:" + i17 + ", resultMsg:" + str);
        int i18 = i17 != 0 ? i17 != 2 ? 2 : 3 : 1;
        bw5.q8 q8Var = new bw5.q8();
        java.lang.String str2 = this.f296954a;
        q8Var.f31991d = str2;
        boolean[] zArr = q8Var.f31993f;
        zArr[1] = true;
        q8Var.f31992e = i18;
        zArr[2] = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterPlugin", "handleAppPayResp, orderId:" + str2 + ", paymentAction:" + i18);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f296955b.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ecs.EcsAppPayResult(0L, "", q8Var.toByteArray()))));
    }
}
