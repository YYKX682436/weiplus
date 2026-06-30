package wx0;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f450466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.content.Context context) {
        super(0);
        this.f450466d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = android.view.LayoutInflater.from(this.f450466d).inflate(com.tencent.mm.R.layout.dwq, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        return inflate;
    }
}
