package lm3;

/* loaded from: classes10.dex */
public final class m implements rm3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.d0 f319495a;

    public m(com.tencent.mm.plugin.mv.ui.uic.d0 d0Var) {
        this.f319495a = d0Var;
    }

    @Override // rm3.a
    public void a(java.lang.Long l17, java.lang.String str, long j17) {
        rm3.a aVar = this.f319495a.f151093d;
        if (aVar != null) {
            aVar.a(l17, str, j17);
        }
    }

    @Override // rm3.a
    public void b(java.lang.Long l17, java.lang.String str, long j17) {
        rm3.a aVar = this.f319495a.f151093d;
        if (aVar != null) {
            aVar.b(l17, str, j17);
        }
    }

    @Override // rm3.a
    public void c(long j17, java.lang.String nonceId) {
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        rm3.a aVar = this.f319495a.f151093d;
        if (aVar != null) {
            aVar.c(j17, nonceId);
        }
    }
}
