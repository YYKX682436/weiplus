package df2;

/* loaded from: classes10.dex */
public final class zw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jx f232003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(df2.jx jxVar) {
        super(0);
        this.f232003d = jxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        df2.jx jxVar = this.f232003d;
        return new bi2.b(context, jxVar.f230512u, jxVar.f230513v);
    }
}
