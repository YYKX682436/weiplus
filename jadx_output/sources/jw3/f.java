package jw3;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jw3.i f302321d;

    public f(jw3.i iVar) {
        this.f302321d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jw3.i iVar = this.f302321d;
        r45.sn snVar = iVar.f302324f;
        if (snVar == null) {
            kotlin.jvm.internal.o.o("mHomeContext");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectTextDialog", "startLoadUrl %s", snVar.f385852f);
        zg0.q2 q2Var = iVar.f302326h;
        if (q2Var != null) {
            android.content.Intent intent = new android.content.Intent();
            r45.sn snVar2 = iVar.f302324f;
            if (snVar2 == null) {
                kotlin.jvm.internal.o.o("mHomeContext");
                throw null;
            }
            intent.putExtra("rawUrl", snVar2.f385852f);
            intent.putExtra("useJs", true);
            ((com.tencent.mm.plugin.webview.core.e3) q2Var).j(intent);
        }
    }
}
