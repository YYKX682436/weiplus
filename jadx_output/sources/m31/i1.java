package m31;

/* loaded from: classes9.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.a1 f323153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f323154e;

    public i1(m31.a1 a1Var, m31.p1 p1Var) {
        this.f323153d = a1Var;
        this.f323154e = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$addSingleVoiceTmpMode$acceptWithVoiceView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String url = this.f323153d.f323118e;
        kotlin.jvm.internal.o.g(url, "url");
        long nanoTime = java.lang.System.nanoTime();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.msgsubscription.voice.PlayVoiceData(nanoTime, url, 0), p31.e.class, p31.a.f351448d);
        this.f323154e.f323179J = new m31.h1(nanoTime);
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$addSingleVoiceTmpMode$acceptWithVoiceView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
