package jf5;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        super(0);
        this.f299478d = nativeSelectableLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout.W;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299478d;
        nativeSelectableLayout.B();
        nativeSelectableLayout.f204662f.invalidate();
        if (!nativeSelectableLayout.f204660d.d()) {
            nativeSelectableLayout.k();
        } else if (nativeSelectableLayout.f204673t == null) {
            nativeSelectableLayout.z();
        }
        return jz5.f0.f302826a;
    }
}
