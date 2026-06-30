package cw0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f222655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f222656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlinx.coroutines.y0 y0Var, java.util.ArrayList arrayList) {
        super(1);
        this.f222655d = y0Var;
        this.f222656e = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ex0.q vm6 = (ex0.q) obj;
        kotlin.jvm.internal.o.g(vm6, "vm");
        if (!(!(vm6.f257164s.length == 0))) {
            this.f222656e.add(kotlinx.coroutines.l.b(this.f222655d, null, null, new cw0.l(vm6, null), 3, null));
        }
        return jz5.f0.f302826a;
    }
}
