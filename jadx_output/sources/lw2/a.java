package lw2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.m f321563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lw2.m mVar) {
        super(0);
        this.f321563d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f321563d.f321576a.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (androidx.appcompat.app.AppCompatActivity) context;
    }
}
