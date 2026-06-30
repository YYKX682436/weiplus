package yt3;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f465657d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465658e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f465659f;

    public s(android.view.View view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465657d = view;
        this.f465658e = status;
        this.f465659f = "MicroMsg.EditFinishPlugin";
        view.setOnClickListener(this);
        android.widget.Button button = view instanceof android.widget.Button ? (android.widget.Button) view : null;
        if (button != null) {
            button.setTextSize(0, i65.a.f(view.getContext(), com.tencent.mm.R.dimen.f479897ia) * i65.a.m(view.getContext()));
        }
    }

    public final void a(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.Integer num3) {
        int intValue;
        com.tencent.mars.xlog.Log.i(this.f465659f, str + ' ' + num3);
        android.view.View view = this.f465657d;
        if (num != null && num.intValue() != 0) {
            view.setBackgroundResource(num.intValue());
        }
        if (num3 != null && (intValue = num3.intValue()) > 0) {
            view.getLayoutParams().height = intValue;
        }
        if (num2 != null && num2.intValue() != 0 && (view instanceof android.widget.TextView)) {
            android.widget.TextView textView = (android.widget.TextView) view;
            textView.setTextColor(b3.l.getColor(textView.getContext(), num2.intValue()));
        }
        if ((str == null || str.length() == 0) || !(view instanceof android.widget.TextView)) {
            return;
        }
        ((android.widget.TextView) view).setText(str);
    }

    @Override // yt3.r2
    public void onAttach() {
        android.view.View view = this.f465657d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(this.f465659f, "on click edit finish");
        nu3.i.f340218a.b(12);
        nu3.i.f340221d.f60874i = java.lang.System.currentTimeMillis();
        ut3.f fVar = ut3.f.f431176c;
        android.content.Context context = this.f465657d.getContext();
        yt3.r rVar = new yt3.r(this);
        ut3.d dVar = fVar.f431177a;
        if (!(dVar != null ? dVar.c5(context, fVar.f431178b, rVar) : false)) {
            ju3.d0.k(this.f465658e, ju3.c0.B1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onDetach() {
        android.view.View view = this.f465657d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/EditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
