package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class x implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f183358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f183359b;

    public x(java.util.concurrent.CountDownLatch countDownLatch, android.os.Bundle bundle) {
        this.f183358a = countDownLatch;
        this.f183359b = bundle;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartPickWordHelper", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.util.concurrent.CountDownLatch countDownLatch = this.f183358a;
        if (i17 != 0 || i18 != 0) {
            countDownLatch.countDown();
            return;
        }
        r45.w66 w66Var = (r45.w66) oVar.f70711b.f70700a;
        java.lang.String str2 = w66Var.f388908d;
        android.os.Bundle bundle = this.f183359b;
        bundle.putString("PickedWord", str2);
        bundle.putInt("PrefixOffset", w66Var.f388909e);
        bundle.putInt("SuffixOffset", w66Var.f388910f);
        bundle.putString("PrefixText", w66Var.f388911g);
        bundle.putString("SuffixText", w66Var.f388912h);
        bundle.putInt("IsMainOrSub", w66Var.f388913i);
        java.lang.String str3 = w66Var.f388908d;
        com.tencent.mm.plugin.webview.modeltools.y.f183364a = str3;
        com.tencent.mm.plugin.webview.modeltools.y.f183366c = w66Var.f388915n;
        com.tencent.mm.plugin.webview.modeltools.y.f183365b = w66Var.f388914m;
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartPickWordHelper", "response: PrefixText: %s, PickedWord: %s, SuffixText: %s, %d, %d, %d", w66Var.f388911g, str3, w66Var.f388912h, java.lang.Integer.valueOf(w66Var.f388909e), java.lang.Integer.valueOf(w66Var.f388910f), java.lang.Integer.valueOf(w66Var.f388913i));
        countDownLatch.countDown();
    }
}
