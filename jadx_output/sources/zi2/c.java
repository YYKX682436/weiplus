package zi2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f473101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473102e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.ViewGroup viewGroup, zi2.w wVar) {
        super(0);
        this.f473101d = viewGroup;
        this.f473102e = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f473101d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new ni2.w(context, this.f473102e);
    }
}
