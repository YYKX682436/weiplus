package com.tencent.mm.ui.matrix;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/matrix/MatrixMemoryHookResultUI;", "Lcom/tencent/mm/ui/matrix/MatrixBaseLeakResultUI;", "<init>", "()V", "nh5/l", "nh5/o", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MatrixMemoryHookResultUI extends com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f209112g = jz5.h.b(new nh5.p(this));

    public int getLayoutId() {
        return com.tencent.mm.R.layout.bx8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("Native Leak");
        java.lang.Object value = ((jz5.n) this.f209112g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        java.lang.Object value2 = ((jz5.n) this.f209112g).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        oh5.i.f345498d.getClass();
        ((androidx.recyclerview.widget.RecyclerView) value2).setAdapter(new nh5.l(oh5.i.f345499e));
        ((ku5.t0) ku5.t0.f312615d).q(nh5.q.f337160d);
    }
}
