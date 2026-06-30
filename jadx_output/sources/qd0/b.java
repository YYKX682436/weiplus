package qd0;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f361527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, java.util.LinkedList linkedList) {
        super(0);
        this.f361526d = str;
        this.f361527e = linkedList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ti3.c cVar = ti3.c.f419579a;
        java.lang.String msgTalker = this.f361526d;
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        java.util.LinkedList recentAtRecord = this.f361527e;
        kotlin.jvm.internal.o.g(recentAtRecord, "recentAtRecord");
        g15.b a17 = cVar.a(msgTalker);
        if (a17 == null) {
            a17 = new g15.b();
        }
        a17.r(recentAtRecord);
        cVar.b().a(msgTalker, a17.toXml(), false);
        return jz5.f0.f302826a;
    }
}
