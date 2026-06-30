package go2;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.g f273972d;

    public f(go2.g gVar) {
        this.f273972d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        go2.g gVar = this.f273972d;
        intent.setClass(gVar.getContext(), com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI.class);
        intent.putExtra("key_author_finder_name", gVar.B);
        android.app.Activity context = gVar.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(1000);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaActionBarUIC$onCreate$1", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
