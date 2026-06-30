package qb2;

/* loaded from: classes10.dex */
public final class t extends dm.a4 {
    public static final l75.e0 H1 = dm.a4.initAutoDBInfo(qb2.t.class);
    public qb2.s C1;
    public com.tencent.mm.storage.z3 D1;
    public java.lang.CharSequence E1;
    public java.lang.String F1;
    public java.lang.String G1;

    public t(qb2.s opDelegator) {
        kotlin.jvm.internal.o.g(opDelegator, "opDelegator");
        this.C1 = opDelegator;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof qb2.t) && ((qb2.t) obj).systemRowid == this.systemRowid;
    }

    @Override // dm.a4, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = H1;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public int hashCode() {
        return (int) this.systemRowid;
    }

    public final java.lang.CharSequence t0() {
        if (this.C1 == null) {
            return "";
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = this.field_editingMsg;
        if (str == null || r26.n0.N(str)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = this.field_digest;
            ((ke0.e) xVar).getClass();
            return com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.enp));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479482a31)), 0, spannableStringBuilder.length(), 33);
        android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str3 = this.field_editingMsg;
        ((ke0.e) xVar2).getClass();
        append.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3));
        return spannableStringBuilder;
    }

    public final void u0() {
        java.lang.CharSequence Vi;
        if (this.C1 != null) {
            java.lang.String str = this.field_sessionId;
            if (kotlin.jvm.internal.o.b(str, "findersayhisessionholder")) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.eo7);
                this.F1 = string;
                this.E1 = string;
            } else {
                if (kotlin.jvm.internal.o.b(str, "finderaliassessionholder")) {
                    java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.enm, ya2.h.f460484a.f().w0());
                    this.F1 = string2;
                    this.E1 = string2;
                    return;
                }
                com.tencent.mm.storage.z3 m17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(this.field_sessionId);
                this.D1 = m17;
                this.F1 = m17 != null ? m17.g2() : null;
                com.tencent.mm.storage.z3 z3Var = this.D1;
                if (z3Var == null || (Vi = z3Var.J2) == null) {
                    Vi = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Vi(com.tencent.mm.sdk.platformtools.x2.f193071a, this.F1);
                }
                this.E1 = Vi;
            }
        }
    }

    public t() {
    }
}
