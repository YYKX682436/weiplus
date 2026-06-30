package fr3;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr3.f f265787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fr3.f fVar) {
        super(1);
        this.f265787d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List usernameList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        fr3.f fVar = this.f265787d;
        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(fVar), null, null, new fr3.b(fVar, usernameList, null), 3, null);
        return jz5.f0.f302826a;
    }
}
