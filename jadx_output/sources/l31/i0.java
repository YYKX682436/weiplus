package l31;

/* loaded from: classes9.dex */
public final class i0 extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final k31.a f315363e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String username, java.util.List templateList, k31.a aVar, e31.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        super(username);
        aVar = (i17 & 4) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(templateList, "templateList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f315364f = arrayList;
        this.f315363e = aVar;
        arrayList.addAll(templateList);
    }

    @Override // l31.u
    public void run() {
        l31.h0 h0Var = new l31.h0(this);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            h0Var.invoke();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new l31.g0(h0Var));
    }
}
