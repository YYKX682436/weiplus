package mn2;

/* loaded from: classes2.dex */
public final class u0 extends mn2.c1 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f330125h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ u0(r45.mb4 r1, com.tencent.mm.plugin.finder.storage.y90 r2, java.lang.String r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.lang.String r3 = c01.z1.r()
            java.lang.String r4 = "getUsernameFromUserInfo(...)"
            kotlin.jvm.internal.o.f(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn2.u0.<init>(r45.mb4, com.tencent.mm.plugin.finder.storage.y90, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // mn2.c1, ip0.d
    public android.graphics.Matrix a(float f17, float f18) {
        return null;
    }

    @Override // mn2.c1, mn2.h3
    public java.lang.String l() {
        r45.mb4 mb4Var = this.f329923e;
        java.lang.String string = mb4Var.getString(25);
        if (string == null || string.length() == 0) {
            return super.l();
        }
        java.lang.String string2 = mb4Var.getString(25);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    @Override // mn2.c1, mn2.h3
    public java.lang.String m() {
        r45.mb4 mb4Var = this.f329923e;
        java.lang.String string = mb4Var.getString(26);
        if (string == null || string.length() == 0) {
            return super.m();
        }
        java.lang.String string2 = mb4Var.getString(26);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    @Override // mn2.c1, ip0.c
    public java.lang.String n() {
        return this.f330125h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r45.mb4 mediaObj, com.tencent.mm.plugin.finder.storage.y90 type, java.lang.String username) {
        super(mediaObj, type, username, null, 8, null);
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_image_");
        sb6.append(type.f128374d);
        sb6.append('_');
        java.lang.String l17 = l();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(l17.getBytes()));
        this.f330125h = sb6.toString();
    }
}
