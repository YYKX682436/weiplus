package jq4;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f301127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jq4.y f301128f;

    public c(android.view.View view, android.content.Intent intent, jq4.y yVar) {
        this.f301126d = view;
        this.f301127e = intent;
        this.f301128f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f301126d;
        if (view != null) {
            try {
                android.content.Context context = view.getContext();
                if (context != null) {
                    android.content.Intent intent = this.f301127e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onFullscreen$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$onFullscreen$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("VoipFloatCardManager", "unable to start Activity: " + e17);
            }
            this.f301128f.u(view);
        }
    }
}
