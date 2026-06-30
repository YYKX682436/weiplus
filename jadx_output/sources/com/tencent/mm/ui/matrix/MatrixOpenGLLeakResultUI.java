package com.tencent.mm.ui.matrix;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI;", "Lcom/tencent/mm/ui/matrix/MatrixBaseLeakResultUI;", "<init>", "()V", "nh5/s", "nh5/c0", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MatrixOpenGLLeakResultUI extends com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f209113g = jz5.h.b(new nh5.d0(this));

    public int getLayoutId() {
        return com.tencent.mm.R.layout.bxa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("OpenGL Leak");
        oh5.l lVar = (oh5.l) oh5.l.f345505g.remove(java.lang.Integer.valueOf(getIntent().getIntExtra("KEY_COUNTER", 0)));
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixOpenGLLeakResultUI", "helper = " + lVar);
        jz5.g gVar = this.f209113g;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        if (lVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixOpenGLLeakResultUI", "list = " + lVar.d());
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((androidx.recyclerview.widget.RecyclerView) value2).setAdapter(new nh5.s(lVar.d()));
        }
    }
}
