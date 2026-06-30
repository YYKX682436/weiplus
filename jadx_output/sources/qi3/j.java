package qi3;

/* loaded from: classes12.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f363728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f363729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, long j17, java.lang.Long l17, java.lang.String str2) {
        super(1);
        this.f363727d = str;
        this.f363728e = j17;
        this.f363729f = l17;
        this.f363730g = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.fr pack = (r45.fr) obj;
        kotlin.jvm.internal.o.g(pack, "pack");
        r45.jr jrVar = new r45.jr();
        jrVar.f378065d = this.f363730g;
        pack.f374562n = jrVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r()));
        java.lang.String str = this.f363727d;
        sb6.append(str);
        sb6.append(this.f363728e);
        sb6.append('_');
        java.lang.Long l17 = this.f363729f;
        sb6.append((l17 != null ? l17.longValue() : c01.w9.o(str)) / 1000);
        pack.f374558g = sb6.toString();
        return jz5.f0.f302826a;
    }
}
