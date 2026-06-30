package com.tencent.mm.plugin.pwdgroup.ui.widget;

/* loaded from: classes15.dex */
public class MMCallBackScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public int f154774d;

    /* renamed from: e, reason: collision with root package name */
    public int f154775e;

    /* renamed from: f, reason: collision with root package name */
    public gs3.b f154776f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f154777g;

    public MMCallBackScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154775e = 0;
        this.f154777g = new gs3.a(this);
    }

    public final void a(int i17) {
        gs3.b bVar = this.f154776f;
        if (bVar == null || this.f154775e == i17) {
            return;
        }
        this.f154775e = i17;
        android.view.View view = ((fs3.d) bVar).f266301a.F;
        if (view != null) {
            if (i17 == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onScrollStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.f154774d = getScrollY();
        int action = motionEvent.getAction();
        if (action == 1) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f154777g;
            if (n3Var != null) {
                n3Var.sendMessageDelayed(n3Var.obtainMessage(), 5L);
            }
        } else if (action == 2) {
            a(1);
        }
        return onTouchEvent;
    }

    public void setMMOnScrollListener(gs3.b bVar) {
        this.f154776f = bVar;
    }

    public MMCallBackScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f154775e = 0;
        this.f154777g = new gs3.a(this);
    }
}
