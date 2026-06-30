package ox1;

/* loaded from: classes11.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349610d;

    public o(ox1.s sVar) {
        this.f349610d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "bold");
        this.f349610d.p();
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
