package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f202905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e1 f202906h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(java.util.List list, java.util.List list2, java.util.List list3, com.tencent.mm.ui.chatting.view.e2 e2Var, com.tencent.mm.ui.chatting.view.e1 e1Var) {
        super(0);
        this.f202902d = list;
        this.f202903e = list2;
        this.f202904f = list3;
        this.f202905g = e2Var;
        this.f202906h = e1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (jz5.l lVar : this.f202902d) {
            com.tencent.mm.ui.chatting.view.d1 d1Var = (com.tencent.mm.ui.chatting.view.d1) lVar.f302833d;
            jz5.l lVar2 = (jz5.l) lVar.f302834e;
            android.view.View view = (android.view.View) lVar2.f302833d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startExpandAnim$6", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startExpandAnim$6", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = (android.view.View) lVar2.f302833d;
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            android.view.View view3 = (android.view.View) this.f202906h.f202910b.get(d1Var.f202900a);
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startExpandAnim$6", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startExpandAnim$6", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setTranslationX(0.0f);
                view3.setTranslationY(0.0f);
            }
        }
        for (android.view.View view4 : this.f202903e) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startExpandAnim$6", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startExpandAnim$6", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setTranslationX(0.0f);
            view4.setTranslationY(0.0f);
        }
        for (android.view.View view5 : this.f202904f) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startExpandAnim$6", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$startExpandAnim$6", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setTranslationX(0.0f);
            view5.setTranslationY(0.0f);
        }
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f202905g;
        e2Var.f202912i = null;
        e2Var.f202913j.clear();
        e2Var.J();
        return jz5.f0.f302826a;
    }
}
