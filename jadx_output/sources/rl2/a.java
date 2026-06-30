package rl2;

/* loaded from: classes3.dex */
public final class a extends be2.a {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f397180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l75.k0 db6) {
        super(db6, ce2.a.f40773p, "FinderLiveActionRecord", dm.j4.f237778g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = ce2.a.f40773p;
        this.f397180e = db6;
    }

    public final java.lang.String y0(java.lang.String str, qs5.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        sb6.append('_');
        sb6.append(eVar.ordinal());
        return sb6.toString();
    }
}
