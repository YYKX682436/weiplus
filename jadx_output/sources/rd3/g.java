package rd3;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rd3.j f394242a;

    public g(rd3.j jVar) {
        this.f394242a = jVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.valueOf(z17));
        hashMap.put("cancel", java.lang.Boolean.TRUE);
        rd3.j jVar = this.f394242a;
        jVar.s().invoke(jVar.l(hashMap));
    }
}
