package kr4;

/* loaded from: classes11.dex */
public final class g extends dm.wb {

    /* renamed from: l1, reason: collision with root package name */
    public static final l75.e0 f311505l1 = dm.wb.initAutoDBInfo(kr4.g.class);
    public com.tencent.mm.storage.z3 Z;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.CharSequence f311506p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f311507x0;

    /* renamed from: y0, reason: collision with root package name */
    public kr4.f f311508y0;

    public g() {
    }

    @Override // dm.wb, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f311505l1;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final boolean t0() {
        java.lang.CharSequence i17;
        if (this.f311508y0 == null) {
            return false;
        }
        if (kotlin.jvm.internal.o.b(this.field_sessionId, "w1wsayhisessionholder@w1wmsg")) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.pgt);
            this.f311507x0 = string;
            this.f311506p0 = string;
            return true;
        }
        java.lang.String str = this.f311507x0;
        kr4.k Ai = ((fr4.g0) i95.n0.c(fr4.g0.class)).Ai();
        java.lang.String field_talkerUserName = this.field_talkerUserName;
        kotlin.jvm.internal.o.f(field_talkerUserName, "field_talkerUserName");
        kr4.e y07 = Ai.y0(field_talkerUserName);
        com.tencent.mm.storage.z3 t07 = y07 != null ? y07.t0() : null;
        this.Z = t07;
        this.f311507x0 = t07 != null ? t07.g2() : null;
        com.tencent.mm.storage.z3 z3Var = this.Z;
        if (z3Var == null || (i17 = z3Var.J2) == null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str2 = this.f311507x0;
            ((ke0.e) xVar).getClass();
            i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2);
        }
        this.f311506p0 = i17;
        return true ^ kotlin.jvm.internal.o.b(this.f311507x0, str);
    }

    public java.lang.String toString() {
        java.lang.String str = this.f311507x0;
        return str == null ? "" : str;
    }

    public g(kr4.f opDelegator) {
        kotlin.jvm.internal.o.g(opDelegator, "opDelegator");
        this.f311508y0 = opDelegator;
    }
}
