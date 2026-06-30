package ug3;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.o f427569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427570e;

    public n(ug3.o oVar, java.lang.String str) {
        this.f427569d = oVar;
        this.f427570e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = com.tencent.mm.ui.LauncherUI.f196826y;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
        intent.addFlags(268435456).addFlags(67108864);
        this.f427569d.b(intent, this.f427570e);
    }
}
