package pi4;

/* loaded from: classes11.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.error.TopicErrorLayout f354823d;

    public b(com.tencent.mm.plugin.textstatus.convert.topic.error.TopicErrorLayout topicErrorLayout) {
        this.f354823d = topicErrorLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/error/TopicErrorLayout$update$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mj4.h hVar = (mj4.h) view.getTag();
        java.lang.Integer valueOf = hVar != null ? java.lang.Integer.valueOf(((mj4.k) hVar).f327067b.field_state) : null;
        if (valueOf != null && valueOf.intValue() == 5) {
            oj4.j.f345815a.d(hVar);
        }
        this.f354823d.removeView(view);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/error/TopicErrorLayout$update$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
