package lh4;

/* loaded from: classes8.dex */
public final class i extends lh4.h {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f318716m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489554cy4, (android.view.ViewGroup) getContainerView(), false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f484226dg0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f318716m = (android.widget.TextView) findViewById;
        a(inflate);
    }

    @Override // lh4.h
    public java.lang.String f() {
        return "";
    }
}
