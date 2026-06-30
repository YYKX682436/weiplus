package qv0;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv0.f f366924d;

    public c(qv0.f fVar) {
        this.f366924d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel$initToolbarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        qv0.f fVar = this.f366924d;
        if (fVar.E(view)) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q.a(fVar, false, true, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel$initToolbarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
