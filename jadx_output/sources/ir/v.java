package ir;

/* loaded from: classes12.dex */
public final class v extends ir.r {

    /* renamed from: b, reason: collision with root package name */
    public final ir.t f293908b;

    /* renamed from: c, reason: collision with root package name */
    public final ir.u f293909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ir.t groupInfo, ir.u setInfo) {
        super(0);
        kotlin.jvm.internal.o.g(groupInfo, "groupInfo");
        kotlin.jvm.internal.o.g(setInfo, "setInfo");
        this.f293908b = groupInfo;
        this.f293909c = setInfo;
    }

    @Override // ir.r
    public boolean b(java.lang.Object obj) {
        if (super.b(obj) && (obj instanceof ir.v)) {
            ir.v vVar = (ir.v) obj;
            if (this.f293908b.b(vVar.f293908b) && this.f293909c.b(vVar.f293909c)) {
                return true;
            }
        }
        return false;
    }

    @Override // ir.r
    public java.lang.String c() {
        return this.f293908b.c();
    }

    @Override // ir.r
    public java.lang.String d() {
        return this.f293908b.d();
    }

    @Override // ir.r
    public java.lang.String e() {
        return this.f293908b.e();
    }
}
