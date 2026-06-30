package s24;

/* loaded from: classes.dex */
public abstract class b extends a24.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a24.i
    public boolean X6() {
        return false;
    }

    @Override // a24.i
    public int Z6() {
        return 6;
    }

    @Override // a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return -1;
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    public abstract void x7(in5.s0 s0Var, int i17, int i18);
}
