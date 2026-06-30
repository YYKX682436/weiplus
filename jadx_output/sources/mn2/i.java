package mn2;

/* loaded from: classes2.dex */
public final class i extends mn2.j4 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f330017e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.mb4 f330018f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f330019g;

    public i(java.lang.String audioUrl) {
        kotlin.jvm.internal.o.g(audioUrl, "audioUrl");
        this.f330017e = audioUrl;
        r45.mb4 mb4Var = new r45.mb4();
        mb4Var.set(0, audioUrl);
        java.lang.String string = mb4Var.getString(0);
        string = string == null ? "" : string;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()));
        this.f330018f = mb4Var;
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128355e;
        this.f330019g = e9Var.k("img_bgm", mb4Var.getString(9), mb4Var.getString(0));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xy2.c.e(context);
    }

    @Override // mn2.j4
    public int b() {
        return -1;
    }

    @Override // mn2.j4
    public int c() {
        return -1;
    }

    @Override // mn2.j4
    public boolean d() {
        return false;
    }

    @Override // mn2.j4
    public r45.mb4 e() {
        return this.f330018f;
    }

    @Override // mn2.j4
    public r45.vf2 f() {
        return null;
    }

    @Override // mn2.j4
    public java.lang.String g() {
        return "audio";
    }

    @Override // mn2.h3
    public com.tencent.mm.plugin.finder.storage.y90 getMediaType() {
        return com.tencent.mm.plugin.finder.storage.y90.Y;
    }

    @Override // mn2.h3
    public java.lang.String getPath() {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102140i + n();
    }

    @Override // mn2.h3
    public java.lang.String getUrl() {
        return this.f330017e;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String i() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String l() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        return this.f330019g;
    }
}
