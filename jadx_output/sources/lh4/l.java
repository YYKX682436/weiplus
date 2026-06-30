package lh4;

/* loaded from: classes8.dex */
public final class l extends lh4.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.epv, (android.view.ViewGroup) getContainerView(), false);
        kotlin.jvm.internal.o.d(inflate);
        a(inflate);
        inflate.setOnClickListener(new lh4.j(this));
    }

    @Override // lh4.h
    public java.lang.String f() {
        return "";
    }
}
