package db5;

/* loaded from: classes8.dex */
public class e9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.TalkRoomPopupNav f228330e;

    public e9(com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav, java.lang.String str) {
        this.f228330e = talkRoomPopupNav;
        this.f228329d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/TalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f228330e;
        talkRoomPopupNav.k(300L);
        db5.i9 i9Var = talkRoomPopupNav.f197687d;
        if (i9Var != null) {
            i9Var.a(this.f228329d);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/TalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
