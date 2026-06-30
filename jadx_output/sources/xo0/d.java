package xo0;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final ep0.h f455744a = new ap0.a();

    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        java.lang.String str = opts.f464098c;
        if (str != null) {
            str.length();
        }
        if (str == null || str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(np0.b.f338790b);
            sb6.append('/');
            kotlin.jvm.internal.o.d(this.f455744a);
            sb6.append(!com.tencent.mm.sdk.platformtools.t8.K0(url.toString()) ? kk.k.g(url.toString().getBytes()) : null);
            str = sb6.toString();
        }
        return (str == null || str.length() == 0) ? "" : str;
    }

    public abstract boolean b(ip0.a aVar, yo0.i iVar, vo0.h hVar);

    public abstract jp0.f c(ip0.a aVar, yo0.i iVar, vo0.h hVar);

    public abstract boolean d(ip0.a aVar, hp0.g gVar, yo0.i iVar, vo0.h hVar);

    public abstract boolean e(ip0.a aVar, hp0.i iVar, hp0.g gVar, yo0.i iVar2, vo0.h hVar);

    public abstract boolean f(ip0.a aVar, hp0.i iVar, hp0.g gVar, hp0.g gVar2, yo0.i iVar2, vo0.h hVar);
}
