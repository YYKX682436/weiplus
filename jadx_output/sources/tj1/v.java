package tj1;

/* loaded from: classes7.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj1.w f419720d;

    public v(tj1.w wVar) {
        this.f419720d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.u uVar;
        tj1.i iVar = this.f419720d.f419721i;
        if (iVar == null || (uVar = iVar.f419696a) == null) {
            return;
        }
        defpackage.ChangeTranslateLanguageEventListenerProxy.f33d.b(uVar);
    }
}
