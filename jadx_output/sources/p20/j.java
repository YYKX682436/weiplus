package p20;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f351423a;

    public j(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f351423a = url;
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        w20.j jVar = w20.j.f442288a;
        sb6.append((java.lang.String) ((jz5.n) w20.j.f442290c).getValue());
        sb6.append('/');
        sb6.append(b());
        return sb6.toString();
    }

    public final java.lang.String b() {
        return "ecs_" + com.tencent.mm.sdk.platformtools.w2.a(this.f351423a);
    }
}
