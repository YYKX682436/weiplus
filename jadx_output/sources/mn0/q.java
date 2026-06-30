package mn0;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.y f329792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(mn0.y yVar) {
        super(0);
        this.f329792d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(this.f329792d.f329805d);
        return java.lang.Integer.valueOf(b17.x * b17.y);
    }
}
