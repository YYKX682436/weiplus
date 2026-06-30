package rb5;

/* loaded from: classes11.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.l f393870d;

    public h(rb5.l lVar) {
        this.f393870d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/compat/ChattingCompat$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rb5.l lVar = this.f393870d;
        if (!lVar.f393888o) {
            lVar.f393894u.removeCallbacks(lVar.A);
            wn.r rVar = lVar.f393896w;
            if (rVar != null) {
                rVar.onFinish();
            }
            lVar.f393880d.finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/compat/ChattingCompat$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
