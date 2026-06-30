package ml5;

/* loaded from: classes10.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.TouchEventLayout f328434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.ui.widget.cropview.TouchEventLayout touchEventLayout) {
        super(0);
        this.f328434d = touchEventLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.cropview.TouchEventLayout touchEventLayout = this.f328434d;
        return new android.view.GestureDetector(touchEventLayout.getContext(), touchEventLayout);
    }
}
