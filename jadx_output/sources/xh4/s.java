package xh4;

/* loaded from: classes.dex */
public final class s implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f454629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f454630b;

    public s(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, kotlinx.coroutines.q qVar) {
        this.f454629a = mMFragmentActivity;
        this.f454630b = qVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        kotlinx.coroutines.q qVar = this.f454630b;
        if (i17 != -1) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(xh4.l.f454614g));
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this.f454629a, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
        intent2.putExtra("intent_process", 4);
        intent2.addFlags(67108864);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f454629a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMFragmentActivity, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/utils/TeenModeUtil$checkTeenPwd$2$1$2", "onActivityResult", "(ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFragmentActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMFragmentActivity, "com/tencent/mm/plugin/teenmode/utils/TeenModeUtil$checkTeenPwd$2$1$2", "onActivityResult", "(ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(xh4.l.f454611d));
    }
}
