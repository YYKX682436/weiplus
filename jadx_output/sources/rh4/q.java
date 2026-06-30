package rh4;

/* loaded from: classes8.dex */
public final class q extends lh4.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        getContainerView().setOnClickListener(new rh4.p(callback));
    }

    @Override // lh4.h
    public java.lang.String f() {
        return "";
    }
}
