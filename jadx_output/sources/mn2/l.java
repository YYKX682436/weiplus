package mn2;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.n f330040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mn2.n nVar) {
        super(0);
        this.f330040d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_avatar_");
        java.lang.String str = this.f330040d.f330060e;
        if (str == null) {
            str = "";
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        return sb6.toString();
    }
}
