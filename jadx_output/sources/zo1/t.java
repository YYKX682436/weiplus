package zo1;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.w f474769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zo1.w wVar, java.lang.String str, android.content.Context context) {
        super(0);
        this.f474769d = wVar;
        this.f474770e = str;
        this.f474771f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zo1.w wVar = this.f474769d;
        java.util.HashMap hashMap = wVar.f474809i;
        oo1.g gVar = oo1.g.f347143a;
        android.content.Context context = this.f474771f;
        java.lang.String str = this.f474770e;
        hashMap.put(str, gVar.a(context, str));
        java.lang.Integer num = (java.lang.Integer) wVar.f474808h.get(str);
        if (num != null) {
            wVar.notifyItemChanged(num.intValue());
        }
        return jz5.f0.f302826a;
    }
}
