package z53;

/* loaded from: classes8.dex */
public final class i extends dm.n5 {
    public static final l75.e0 I = dm.n5.initAutoDBInfo(z53.i.class);
    public y53.m F;
    public java.lang.CharSequence G;
    public java.lang.String H;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(z53.i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.conversation.GameLifeConversation");
        return kotlin.jvm.internal.o.b(this.field_sessionId, ((z53.i) obj).field_sessionId);
    }

    @Override // dm.n5, l75.f0
    public l75.e0 getDBInfo() {
        return I;
    }

    public int hashCode() {
        java.lang.String str = this.field_sessionId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final long t0() {
        return u0() ? 103L : 101L;
    }

    public java.lang.String toString() {
        return "GameLifeConversation(talker:" + this.field_talker + " sessionId:" + this.field_sessionId + " self:" + this.field_selfUserName + " nickname:" + this.H + ')';
    }

    public final boolean u0() {
        return kotlin.jvm.internal.o.b(this.field_sessionId, "@gamelifehistory");
    }
}
