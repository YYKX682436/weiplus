package tf5;

/* loaded from: classes.dex */
public final class d0 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f418963d;

    public d0(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f418963d = mvvmAddressUIFragment;
    }

    @Override // db5.o9
    public final void Q0(java.lang.String str) {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f418963d;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 35) {
                if (hashCode != 8593) {
                    if (hashCode == 9734 && str.equals("☆")) {
                        mvvmAddressUIFragment.A0(32);
                        return;
                    }
                } else if (str.equals("↑")) {
                    com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = mvvmAddressUIFragment.K;
                    if (wxLinearLayoutManager != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(wxLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment$onTabCreate$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        wxLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                        yj0.a.f(wxLinearLayoutManager, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment$onTabCreate$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        return;
                    }
                    return;
                }
            } else if (str.equals("#")) {
                mvvmAddressUIFragment.A0(123);
                return;
            }
        }
        kotlin.jvm.internal.o.d(str);
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
        java.lang.Character R = kz5.z.R(charArray, 0);
        if (R != null) {
            mvvmAddressUIFragment.A0(R.charValue());
        }
    }
}
