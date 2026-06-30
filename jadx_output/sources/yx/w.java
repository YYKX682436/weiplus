package yx;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n0.v2 v2Var, n0.v2 v2Var2) {
        super(1);
        this.f467091d = v2Var;
        this.f467092e = v2Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float f17 = ((p2.h) obj).f351380d;
        if (((java.lang.Boolean) this.f467091d.getValue()).booleanValue()) {
            this.f467092e.setValue(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
