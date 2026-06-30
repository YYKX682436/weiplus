package fq5;

/* loaded from: classes5.dex */
public final class b implements aq5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265660a;

    public b(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC) {
        this.f265660a = transferFileUIC;
    }

    @Override // aq5.q0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.TransferFileUIC", "onConnected() called");
    }

    @Override // aq5.q0
    public void b(int i17, byte[] data, r45.y77 fileInfo) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
        com.tencent.mars.xlog.Log.w("MicroMsg.WeDrop.TransferFileUIC", "onReceiveFile() called");
    }

    @Override // aq5.q0
    public void c(bw5.ge0 userInfo) {
        kotlin.jvm.internal.o.g(userInfo, "userInfo");
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265660a;
        transferFileUIC.getClass();
        transferFileUIC.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.TransferFileUIC", "goToTransferPage() called");
        transferFileUIC.f214279h = true;
        gh0.e eVar = (gh0.e) i95.n0.c(gh0.e.class);
        android.app.Activity context = transferFileUIC.getContext();
        zp5.f fVar = (zp5.f) eVar;
        fVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(fVar.f474963d, "startWeDropReceiveUI() called");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        intent.putExtra("isSender", false);
        intent.putExtra("toUserNick", userInfo.getNickName());
        intent.putExtra("toUserHeadUrl", userInfo.getHeadImgUrl());
        pf5.j0.a(intent, hq5.i.class);
        pf5.j0.a(intent, hq5.a0.class);
        pf5.j0.a(intent, hq5.k0.class);
        pf5.j0.a(intent, hq5.w.class);
        pf5.j0.a(intent, gq5.p.class);
        pf5.j0.a(intent, gq5.i.class);
        pf5.j0.a(intent, hq5.m.class);
        lk5.s.e(intent, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/wedrop/WeDropFeatureService", "startWeDropReceiveUI", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/MigrateMsgUserInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/wedrop/WeDropFeatureService", "startWeDropReceiveUI", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/MigrateMsgUserInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // aq5.q0
    public void d() {
    }

    @Override // aq5.q0
    public void e(int i17, byte[] data, r45.y77 fileInfo) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
        com.tencent.mars.xlog.Log.w("MicroMsg.WeDrop.TransferFileUIC", "onSendFile() called");
    }

    @Override // aq5.q0
    public void f(r45.b87 prepareSendRequest, int i17) {
        kotlin.jvm.internal.o.g(prepareSendRequest, "prepareSendRequest");
        com.tencent.mars.xlog.Log.w("MicroMsg.WeDrop.TransferFileUIC", "onPrepareSend() called prepareErrorCode:" + i17);
    }

    @Override // aq5.q0
    public void g(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.TransferFileUIC", "onDisconnect() called errCode:" + i17);
        this.f265660a.V6(5);
    }
}
