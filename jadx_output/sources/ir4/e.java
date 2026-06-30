package ir4;

/* loaded from: classes10.dex */
public final class e implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f294264d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f294265e;

    public e(java.lang.String str) {
        this.f294264d = str;
        str = str == null ? "" : str;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        this.f294265e = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
    }

    public final java.lang.String getPath() {
        return gm0.j1.u().d() + "w1w_personal_msg/avatar/" + n();
    }

    @Override // ip0.c
    public java.lang.String n() {
        return "w1w_avatar_" + this.f294265e;
    }
}
