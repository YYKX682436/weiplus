package db5;

/* loaded from: classes8.dex */
public class d9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.TalkRoomPopupNav f228320d;

    public d9(com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav) {
        this.f228320d = talkRoomPopupNav;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/TalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.i9 i9Var = this.f228320d.f197687d;
        if (i9Var != null) {
            i9Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/TalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
