package hb5;

/* loaded from: classes9.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f280192a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f280193b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f280194c;

    public g0(hb5.a0 a0Var) {
    }

    public final void a(boolean z17, boolean z18, boolean z19) {
        android.view.View view = this.f280192a;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f280193b;
        int i18 = z18 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f280194c;
        int i19 = z19 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
