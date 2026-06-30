package yv1;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f466112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, long j17) {
        super(1);
        this.f466111d = str;
        this.f466112e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.p it = (yz5.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.invoke(this.f466111d, java.lang.Long.valueOf(this.f466112e));
        return java.lang.Boolean.TRUE;
    }
}
