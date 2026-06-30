package re5;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f394582d;

    public l(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f394582d = mMActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerActionBarUIC$initActionBar$1$3$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f394582d.finish();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerActionBarUIC$initActionBar$1$3$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
