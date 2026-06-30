package mn2;

/* loaded from: classes2.dex */
public class r3 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f330104e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.y90 f330105f;

    public r3(r45.mb4 mediaObj, com.tencent.mm.plugin.finder.storage.y90 type, java.lang.String username) {
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.f(c01.z1.r(), "getUsernameFromUserInfo(...)");
        this.f330104e = mediaObj;
        this.f330105f = type;
        if (mediaObj.getString(0) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaObj.url == null ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            java.lang.String sb7 = sb6.toString();
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("FinderVideoCover", sb7, null);
        }
    }

    @Override // mn2.h3
    public com.tencent.mm.plugin.finder.storage.y90 getMediaType() {
        return this.f330105f;
    }

    @Override // mn2.h3
    public java.lang.String getPath() {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102139h + n();
    }

    @Override // mn2.h3
    public java.lang.String getUrl() {
        java.lang.String string = this.f330104e.getString(16);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        java.lang.String string = this.f330104e.getString(17);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String i() {
        java.lang.String string = this.f330104e.getString(20);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String l() {
        java.lang.String string = this.f330104e.getString(16);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        java.lang.String string = this.f330104e.getString(20);
        return string == null ? "" : string;
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_video_cover_");
        sb6.append(this.f330105f.f128374d);
        sb6.append('_');
        java.lang.String string = this.f330104e.getString(16);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()));
        return sb6.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ r3(r45.mb4 r1, com.tencent.mm.plugin.finder.storage.y90 r2, java.lang.String r3, int r4, kotlin.jvm.internal.i r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: mn2.r3.<init>(r45.mb4, com.tencent.mm.plugin.finder.storage.y90, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
