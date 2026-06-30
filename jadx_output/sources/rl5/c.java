package rl5;

/* loaded from: classes4.dex */
public class c implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnCreateContextMenuListener f397308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl5.r f397309e;

    public c(rl5.r rVar, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f397309e = rVar;
        this.f397308d = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view long click", new java.lang.Object[0]);
        rl5.r rVar = this.f397309e;
        rVar.f397356z.clear();
        rVar.f397338f = view;
        this.f397308d.onCreateContextMenu(rVar.f397356z, view, null);
        if (view.getTag(com.tencent.mm.R.id.ohu) instanceof int[]) {
            int[] iArr = (int[]) view.getTag(com.tencent.mm.R.id.ohu);
            if (iArr == null) {
                rVar.m();
            } else {
                rVar.n(iArr[0], iArr[1]);
            }
        } else {
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
