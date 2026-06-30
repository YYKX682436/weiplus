package k71;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f304678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f304679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17) {
        super(1);
        this.f304678d = appCompatActivity;
        this.f304679e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.Button it = (android.widget.Button) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).fj(this.f304678d);
        int i17 = this.f304679e;
        v61.d.g("export_chat_history_login", i17);
        if (i17 > 0) {
            v61.d.f(i17);
        }
        return jz5.f0.f302826a;
    }
}
