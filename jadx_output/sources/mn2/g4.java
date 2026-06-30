package mn2;

/* loaded from: classes10.dex */
public final class g4 extends mn2.j4 {

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f330002e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.y90 f330003f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f330004g;

    /* renamed from: h, reason: collision with root package name */
    public final int f330005h;

    /* renamed from: i, reason: collision with root package name */
    public final int f330006i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f330007m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.vf2 f330008n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f330009o;

    public g4(r45.mb4 mediaObj, com.tencent.mm.plugin.finder.storage.y90 type, java.lang.String str, int i17, int i18, java.lang.String username, boolean z17, r45.vf2 vf2Var, int i19, kotlin.jvm.internal.i iVar) {
        if ((i19 & 8) != 0) {
            if (cw2.l5.f223835a.e()) {
                i17 = 3;
            } else {
                ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
                i17 = d11.s.Di(4) ? 2 : 1;
            }
        }
        i18 = (i19 & 16) != 0 ? 0 : i18;
        if ((i19 & 32) != 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            username = xy2.c.e(context);
        }
        z17 = (i19 & 64) != 0 ? false : z17;
        vf2Var = (i19 & 128) != 0 ? null : vf2Var;
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(username, "username");
        this.f330002e = mediaObj;
        this.f330003f = type;
        this.f330004g = str;
        this.f330005h = i17;
        this.f330006i = i18;
        this.f330007m = z17;
        this.f330008n = vf2Var;
    }

    @Override // mn2.j4
    public int b() {
        return this.f330005h;
    }

    @Override // mn2.j4
    public int c() {
        return this.f330006i;
    }

    @Override // mn2.j4
    public boolean d() {
        return this.f330007m;
    }

    @Override // mn2.j4
    public r45.mb4 e() {
        return this.f330002e;
    }

    @Override // mn2.j4
    public r45.vf2 f() {
        return this.f330008n;
    }

    @Override // mn2.j4
    public java.lang.String g() {
        java.lang.String str = this.f330004g;
        if (!android.text.TextUtils.isEmpty(str)) {
            kotlin.jvm.internal.o.d(str);
            return str;
        }
        com.tencent.mars.xlog.Log.e("FinderVideoLoadData", "invalid specFormat:" + str);
        com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128355e;
        return "xV99";
    }

    @Override // mn2.h3
    public com.tencent.mm.plugin.finder.storage.y90 getMediaType() {
        return this.f330003f;
    }

    @Override // mn2.h3
    public java.lang.String getPath() {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102140i + n();
    }

    @Override // mn2.h3
    public java.lang.String getUrl() {
        java.lang.String string = this.f330002e.getString(0);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        java.lang.String string = this.f330002e.getString(17);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String i() {
        java.lang.String string = this.f330002e.getString(18);
        return string == null ? "" : string;
    }

    public final java.lang.String j() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102140i);
        sb6.append('_');
        sb6.append(k());
        return sb6.toString();
    }

    public final java.lang.String k() {
        return n() + "_storage";
    }

    @Override // mn2.h3
    public java.lang.String l() {
        java.lang.String string = this.f330002e.getString(1);
        return string == null ? "" : string;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        java.lang.String string = this.f330002e.getString(19);
        return string == null ? "" : string;
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String str = this.f330009o;
        if (str != null) {
            return str;
        }
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        java.lang.String g17 = g();
        r45.mb4 mb4Var = this.f330002e;
        java.lang.String k17 = e9Var.k(g17, mb4Var.getString(9), mb4Var.getString(0));
        this.f330009o = k17;
        return k17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mb4 mb4Var = this.f330002e;
        sb6.append(mb4Var.getString(9));
        sb6.append(" url=");
        sb6.append(mb4Var.getString(0));
        return sb6.toString();
    }
}
