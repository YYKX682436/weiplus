package fd2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq.b f261264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fd2.j f261265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dq.b bVar, fd2.j jVar) {
        super(1);
        this.f261264d = bVar;
        this.f261265e = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            dq.b bVar = this.f261264d;
            if (bVar.a("dislike_edu_tips")) {
                fd2.j jVar = this.f261265e;
                jVar.f261276g = kotlinx.coroutines.l.d(jVar.f261277h, null, null, new fd2.c(jVar, bVar, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
