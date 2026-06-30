package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f203167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f203168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f203169f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(java.util.List list, java.util.List list2, com.tencent.mm.ui.chatting.view.e2 e2Var) {
        super(0);
        this.f203167d = list;
        this.f203168e = list2;
        this.f203169f = e2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f203167d.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((jz5.l) it.next()).f302834e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startCollapseAnim$8", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startCollapseAnim$8", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.util.Iterator it6 = this.f203168e.iterator();
        while (it6.hasNext()) {
            android.view.View view2 = (android.view.View) ((java.util.Map.Entry) it6.next()).getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startCollapseAnim$8", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startCollapseAnim$8", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f203169f;
        e2Var.f202914k.clear();
        e2Var.f202915l.clear();
        e2Var.J();
        return jz5.f0.f302826a;
    }
}
