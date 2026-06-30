package sz4;

/* loaded from: classes12.dex */
public final class o implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f414213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414214e;

    public o(int i17, int i18) {
        this.f414213d = i17;
        this.f414214e = i18;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = this.f414213d + 1;
        nz4.y h17 = nz4.y.h();
        int i18 = this.f414214e;
        h17.y(i18, i17, i18, i17);
        nz4.y.h().w();
        yj0.a.i(true, this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
