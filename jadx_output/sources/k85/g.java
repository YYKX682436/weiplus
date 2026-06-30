package k85;

/* loaded from: classes5.dex */
public final class g implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f305400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f305403d;

    public g(kotlin.jvm.internal.c0 c0Var, android.app.Activity activity, d85.g0 g0Var, kotlin.jvm.internal.c0 c0Var2) {
        this.f305400a = c0Var;
        this.f305401b = activity;
        this.f305402c = g0Var;
        this.f305403d = c0Var2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        java.util.LinkedList linkedList;
        if (this.f305400a.f310112d) {
            return;
        }
        k85.t tVar = k85.t.f305439a;
        java.util.HashMap hashMap = k85.t.f305440b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.app.Activity activity = this.f305401b;
        sb6.append(activity);
        sb6.append('_');
        d85.g0 g0Var = this.f305402c;
        sb6.append(g0Var.f227192d);
        jz5.l lVar = (jz5.l) hashMap.get(sb6.toString());
        if (lVar != null && (linkedList = (java.util.LinkedList) lVar.f302834e) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((yz5.l) it.next()).invoke(java.lang.Boolean.valueOf(this.f305403d.f310112d));
            }
        }
        k85.t tVar2 = k85.t.f305439a;
        k85.t.f305440b.remove(activity + '_' + g0Var.f227192d);
    }
}
