package nz4;

/* loaded from: classes11.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341638d;

    public u(nz4.y yVar) {
        this.f341638d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("NoteSelectManager", "bold");
        this.f341638d.p();
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
