package hi4;

/* loaded from: classes11.dex */
public final class a extends rj4.c {

    /* renamed from: x1, reason: collision with root package name */
    public static final l75.e0 f281539x1 = rj4.c.initAutoDBInfo(hi4.a.class);

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f281540l1;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f281541p1;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.CharSequence f281542y0;

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof hi4.a) && ((hi4.a) obj).systemRowid == this.systemRowid;
    }

    @Override // rj4.c, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f281539x1;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public int hashCode() {
        return (int) this.systemRowid;
    }

    public final void t0() {
        if (kotlin.jvm.internal.o.b(this.field_sessionId, "textstatussayhisessionholder")) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jw9);
            this.f281540l1 = string;
            this.f281542y0 = string;
            return;
        }
        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(this.field_sessionId);
        this.f281540l1 = Ai != null ? Ai.field_nickname : null;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = this.f281540l1;
        ((ke0.e) xVar).getClass();
        this.f281542y0 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
    }
}
