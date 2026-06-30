package jf5;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        super(0);
        this.f299442d = nativeSelectableLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299442d;
        if (nativeSelectableLayout.f204669p && nativeSelectableLayout.f204673t == null) {
            java.lang.Runnable runnable = nativeSelectableLayout.H;
            nativeSelectableLayout.removeCallbacks(runnable);
            nativeSelectableLayout.postDelayed(runnable, 100L);
        }
        return jz5.f0.f302826a;
    }
}
