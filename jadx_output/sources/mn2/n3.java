package mn2;

/* loaded from: classes2.dex */
public final class n3 extends mn2.r3 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n3(r45.mb4 r1, com.tencent.mm.plugin.finder.storage.y90 r2, java.lang.String r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.lang.String r3 = c01.z1.r()
            java.lang.String r4 = "getUsernameFromUserInfo(...)"
            kotlin.jvm.internal.o.f(r3, r4)
        Ld:
            java.lang.String r4 = "mediaObj"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "type"
            kotlin.jvm.internal.o.g(r2, r4)
            java.lang.String r4 = "username"
            kotlin.jvm.internal.o.g(r3, r4)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn2.n3.<init>(r45.mb4, com.tencent.mm.plugin.finder.storage.y90, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // mn2.r3, mn2.h3
    public java.lang.String getUrl() {
        java.lang.String string = this.f330104e.getString(1);
        return string == null ? "" : string;
    }

    @Override // mn2.r3, mn2.h3
    public java.lang.String i() {
        java.lang.String string = this.f330104e.getString(19);
        return string == null ? "" : string;
    }

    @Override // mn2.r3, mn2.h3
    public java.lang.String l() {
        java.lang.String string = this.f330104e.getString(1);
        return string == null ? "" : string;
    }

    @Override // mn2.r3, mn2.h3
    public java.lang.String m() {
        java.lang.String string = this.f330104e.getString(19);
        return string == null ? "" : string;
    }

    @Override // mn2.r3, ip0.c
    public java.lang.String n() {
        return super.n() + "_cover_thumb";
    }
}
