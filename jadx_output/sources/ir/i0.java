package ir;

/* loaded from: classes12.dex */
public final class i0 extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final ir.r f293866b;

    /* renamed from: c, reason: collision with root package name */
    public r45.v75 f293867c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f293868d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f293869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ir.r groupInfo) {
        super(2);
        kotlin.jvm.internal.o.g(groupInfo, "groupInfo");
        this.f293866b = groupInfo;
    }

    @Override // ir.u0
    public boolean a(java.lang.Object obj) {
        if (equals(obj) && (obj instanceof ir.i0)) {
            ir.i0 i0Var = (ir.i0) obj;
            r45.v75 v75Var = i0Var.f293867c;
            java.lang.Integer valueOf = v75Var != null ? java.lang.Integer.valueOf(v75Var.f387964d) : null;
            r45.v75 v75Var2 = this.f293867c;
            if (kotlin.jvm.internal.o.b(valueOf, v75Var2 != null ? java.lang.Integer.valueOf(v75Var2.f387964d) : null)) {
                r45.v75 v75Var3 = i0Var.f293867c;
                java.lang.String str = v75Var3 != null ? v75Var3.f387965e : null;
                r45.v75 v75Var4 = this.f293867c;
                if (kotlin.jvm.internal.o.b(str, v75Var4 != null ? v75Var4.f387965e : null)) {
                    r45.v75 v75Var5 = i0Var.f293867c;
                    java.lang.String str2 = v75Var5 != null ? v75Var5.f387966f : null;
                    r45.v75 v75Var6 = this.f293867c;
                    if (kotlin.jvm.internal.o.b(str2, v75Var6 != null ? v75Var6.f387966f : null)) {
                        r45.v75 v75Var7 = i0Var.f293867c;
                        java.lang.String str3 = v75Var7 != null ? v75Var7.f387967g : null;
                        r45.v75 v75Var8 = this.f293867c;
                        if (kotlin.jvm.internal.o.b(str3, v75Var8 != null ? v75Var8.f387967g : null)) {
                            r45.v75 v75Var9 = i0Var.f293867c;
                            java.lang.String str4 = v75Var9 != null ? v75Var9.f387969i : null;
                            r45.v75 v75Var10 = this.f293867c;
                            if (kotlin.jvm.internal.o.b(str4, v75Var10 != null ? v75Var10.f387969i : null)) {
                                r45.v75 v75Var11 = i0Var.f293867c;
                                java.lang.String str5 = v75Var11 != null ? v75Var11.f387970m : null;
                                r45.v75 v75Var12 = this.f293867c;
                                if (kotlin.jvm.internal.o.b(str5, v75Var12 != null ? v75Var12.f387970m : null) && i0Var.f293868d == this.f293868d) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ir.u0
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj) && (obj instanceof ir.i0) && kotlin.jvm.internal.o.b(((ir.i0) obj).f293866b.c(), this.f293866b.c());
    }
}
