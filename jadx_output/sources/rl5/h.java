package rl5;

/* loaded from: classes4.dex */
public class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.n4 f397317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f397318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rl5.r f397319f;

    public h(rl5.r rVar, db5.n4 n4Var, android.view.View view) {
        this.f397319f = rVar;
        this.f397317d = n4Var;
        this.f397318e = view;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view long click", new java.lang.Object[0]);
        rl5.r rVar = this.f397319f;
        rVar.f397356z.clear();
        rVar.f397338f = view;
        this.f397317d.a(rVar.f397356z, view, null);
        int[] iArr = new int[2];
        this.f397318e.getLocationInWindow(iArr);
        int width = iArr[0] + ((int) (r2.getWidth() / 2.0f));
        int i17 = iArr[1];
        if (width == 0 && i17 == 0) {
            rVar.m();
        } else {
            rVar.n(width, i17);
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
