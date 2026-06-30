package dz4;

/* loaded from: classes12.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f245198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.i3 f245199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f245200f;

    public d3(java.util.ArrayList arrayList, dz4.i3 i3Var, kotlin.jvm.internal.h0 h0Var) {
        this.f245198d = arrayList;
        this.f245199e = i3Var;
        this.f245200f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.i3 i3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f245198d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i3Var = this.f245199e;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            kotlin.jvm.internal.o.d(str);
            arrayList.add(i3Var.a(str));
        }
        kotlin.jvm.internal.h0 h0Var = this.f245200f;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f310123d = null;
        dz4.n0 n0Var = i3Var.f245306b;
        if (n0Var != null) {
            n0Var.a(arrayList);
        }
    }
}
