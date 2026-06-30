package dk5;

/* loaded from: classes.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f234696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f234697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f234698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f234700h;

    public k0(com.tencent.mm.ui.widget.dialog.u3 u3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, boolean z17, java.lang.String str, int i17) {
        this.f234696d = u3Var;
        this.f234697e = appCompatActivity;
        this.f234698f = z17;
        this.f234699g = str;
        this.f234700h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f234696d.dismiss();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f234697e;
        appCompatActivity.finish();
        if (this.f234698f) {
            android.content.Intent intent = new android.content.Intent(appCompatActivity, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
            intent.addFlags(67108864);
            intent.putExtra("Chat_User", this.f234699g);
            intent.putExtra("scene_from", this.f234700h);
            androidx.appcompat.app.AppCompatActivity appCompatActivity2 = this.f234697e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(appCompatActivity2, arrayList.toArray(), "com/tencent/mm/ui/transmit/ImgRetransmitLogic$Companion$processImageShareFromSystemGallery$1$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appCompatActivity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(appCompatActivity2, "com/tencent/mm/ui/transmit/ImgRetransmitLogic$Companion$processImageShareFromSystemGallery$1$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
