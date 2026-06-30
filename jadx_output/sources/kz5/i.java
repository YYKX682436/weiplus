package kz5;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kz5.j f313976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kz5.j jVar) {
        super(1);
        this.f313976d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kz5.j jVar = this.f313976d;
        jVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object key = it.getKey();
        sb6.append(key == jVar ? "(this Map)" : java.lang.String.valueOf(key));
        sb6.append('=');
        java.lang.Object value = it.getValue();
        sb6.append(value != jVar ? java.lang.String.valueOf(value) : "(this Map)");
        return sb6.toString();
    }
}
