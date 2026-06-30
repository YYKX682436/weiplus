package cr1;

/* loaded from: classes10.dex */
public final class a implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221832d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221833e;

    public a(java.lang.String str) {
        this.f221832d = str;
        str = str == null ? "" : str;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        this.f221833e = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
    }

    public final java.lang.String getPath() {
        return gm0.j1.u().d() + "bizfans/avatar/" + n();
    }

    @Override // ip0.c
    public java.lang.String n() {
        return "bizfans_avatar_" + this.f221833e;
    }
}
