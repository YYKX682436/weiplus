package ox1;

/* loaded from: classes11.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349611d;

    public p(ox1.s sVar) {
        this.f349611d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "unbold");
        this.f349611d.p();
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
