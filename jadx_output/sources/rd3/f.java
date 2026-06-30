package rd3;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rd3.j f394241a;

    public f(rd3.j jVar) {
        this.f394241a = jVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.valueOf(z17));
        hashMap.put("cancel", java.lang.Boolean.FALSE);
        rd3.j jVar = this.f394241a;
        jVar.s().invoke(jVar.l(hashMap));
    }
}
