package fi5;

/* loaded from: classes3.dex */
public final class g extends lf3.n implements qf3.b, wf3.a {

    /* renamed from: d, reason: collision with root package name */
    public qf3.a f263079d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.f f263080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f263080e = new mf3.f();
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f263079d = listener;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("remark_image_path");
        int intExtra = intent.getIntExtra("selected_item", 0);
        if (stringArrayListExtra == null) {
            return false;
        }
        int size = stringArrayListExtra.size();
        if (intExtra >= size) {
            intExtra = java.lang.Math.max(size - 1, 0);
        }
        java.lang.String str = stringArrayListExtra.get(intExtra);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
        for (java.lang.String str2 : stringArrayListExtra) {
            kotlin.jvm.internal.o.d(str2);
            arrayList.add(new fi5.k(str2));
        }
        mf3.f fVar = this.f263080e;
        fVar.addAll(arrayList);
        kotlin.jvm.internal.o.d(str);
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar, true);
        listener.T3(intExtra);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        if (getIntent().getBooleanExtra("view_only", true)) {
            super.onBeforeFinish(intent);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<E> it = this.f263080e.iterator();
        while (it.hasNext()) {
            java.lang.String g17 = ((mf3.k) it.next()).g();
            if (g17 != null) {
                arrayList.add(g17);
            }
        }
        intent2.putExtra("remark_image_path", new java.util.ArrayList(arrayList));
        getActivity().setResult(-1, intent2);
        super.onBeforeFinish(intent2);
    }
}
