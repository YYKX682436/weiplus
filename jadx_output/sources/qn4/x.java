package qn4;

/* loaded from: classes12.dex */
public final class x implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f365299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f365301c;

    public x(java.lang.StringBuilder sb6, java.lang.String str, kotlin.jvm.internal.f0 f0Var) {
        this.f365299a = sb6;
        this.f365300b = str;
        this.f365301c = f0Var;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.f0 f0Var = this.f365301c;
        int i19 = f0Var.f310116d;
        java.lang.StringBuilder sb6 = this.f365299a;
        java.lang.String str = this.f365300b;
        sb6.append((java.lang.CharSequence) str, i19, i17);
        if (item instanceof com.tencent.mm.smiley.h1) {
            java.lang.String substring = str.substring(i17, i18);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.lang.String a07 = r26.n0.a0(substring, "[", "]");
            sb6.append(" ");
            sb6.append(a07);
            sb6.append(" ");
        } else if (item instanceof com.tencent.mm.smiley.b2) {
            java.lang.String substring2 = str.substring(i17, i18);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            java.lang.String a08 = r26.n0.a0(substring2, "[", "]");
            sb6.append(" ");
            sb6.append(a08);
            sb6.append(" ");
        } else {
            sb6.append((java.lang.CharSequence) str, i17, i18);
        }
        f0Var.f310116d = i18;
        return false;
    }
}
