package o50;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.j f343062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o50.j jVar) {
        super(0);
        this.f343062d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object a17 = ok5.d.a(this.f343062d.getIntent(), "ForwardParams_ContentClick");
        if (a17 instanceof com.tencent.mm.ui.widget.dialog.i) {
            return (com.tencent.mm.ui.widget.dialog.i) a17;
        }
        return null;
    }
}
