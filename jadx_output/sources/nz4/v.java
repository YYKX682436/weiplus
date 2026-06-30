package nz4;

/* loaded from: classes11.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341639d;

    public v(nz4.y yVar) {
        this.f341639d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("NoteSelectManager", "unbold");
        this.f341639d.p();
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
