package wc5;

/* loaded from: classes10.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f444638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444639e;

    public s0(wc5.y0 y0Var, java.lang.String str) {
        this.f444638d = y0Var;
        this.f444639e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc5.y0 y0Var = this.f444638d;
        java.lang.String sugTextList = this.f444639e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int N3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).N3(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) y0Var.U6()).j7());
            qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
            java.lang.String j76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) y0Var.U6()).j7();
            c61.ec ecVar = (c61.ec) x7Var;
            ecVar.getClass();
            kotlin.jvm.internal.o.g(sugTextList, "sugTextList");
            f65.o.f259913b = j76;
            f65.o.f259915d = -1;
            f65.o.f259916e = sugTextList;
            f65.o.f259919h = N3;
            ecVar.Bi(1);
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
