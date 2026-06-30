package nj2;

/* loaded from: classes10.dex */
public final class u implements pj2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nj2.z f337861a;

    public u(nj2.z zVar) {
        this.f337861a = zVar;
    }

    @Override // pj2.a
    public void a() {
        android.view.View view = this.f337861a.f337877t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomLinkPanel$inviteWidget$2", "notifyLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomLinkPanel$inviteWidget$2", "notifyLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // pj2.a
    public boolean b() {
        return this.f337861a.q();
    }

    @Override // pj2.a
    public void c(boolean z17, int i17, r45.il4 il4Var) {
        android.view.View view = this.f337861a.f337877t;
        int i18 = i17 > 0 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomLinkPanel$inviteWidget$2", "notifyResponse", "(ZILcom/tencent/mm/protocal/protobuf/MicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomLinkPanel$inviteWidget$2", "notifyResponse", "(ZILcom/tencent/mm/protocal/protobuf/MicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
