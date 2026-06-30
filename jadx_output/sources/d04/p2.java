package d04;

/* loaded from: classes8.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView f225488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView) {
        super(0);
        this.f225488d = scanProductNewMaskDecorView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object context = this.f225488d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return new androidx.lifecycle.b0((androidx.lifecycle.y) context, true);
    }
}
