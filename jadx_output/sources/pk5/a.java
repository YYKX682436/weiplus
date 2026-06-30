package pk5;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.fragment.VASBaseFragment f356544d;

    public a(com.tencent.mm.ui.vas.fragment.VASBaseFragment vASBaseFragment) {
        this.f356544d = vASBaseFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.vas.fragment.VASBaseFragment vASBaseFragment = this.f356544d;
        com.tencent.mars.xlog.Log.i(vASBaseFragment.getF211132d(), "[onViewFocused] " + vASBaseFragment.getClass().getSimpleName() + '@' + vASBaseFragment.hashCode() + " focusState=" + vASBaseFragment.f211133e);
        java.util.Iterator it = vASBaseFragment.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onUserVisibleFocused();
        }
    }
}
