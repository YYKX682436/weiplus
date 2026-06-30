package qe2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362035a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f362036b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f362037c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f362038d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderAuthInfo f362039e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f362040f;

    public c(java.lang.String username, java.lang.String nickname, java.lang.String headUrl, boolean z17, boolean z18, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        z18 = (i17 & 16) != 0 ? false : z18;
        finderAuthInfo = (i17 & 32) != 0 ? null : finderAuthInfo;
        z19 = (i17 & 64) != 0 ? false : z19;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(headUrl, "headUrl");
        this.f362035a = username;
        this.f362036b = nickname;
        this.f362037c = headUrl;
        this.f362038d = z18;
        this.f362039e = finderAuthInfo;
        this.f362040f = z19;
    }
}
