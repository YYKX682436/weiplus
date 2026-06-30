package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class a0 extends androidx.recyclerview.widget.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f173254d;

    /* renamed from: e, reason: collision with root package name */
    public final n3.q f173255e;

    public a0(android.content.Context context, androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f173254d = recyclerView;
        this.f173255e = new n3.q(context, new com.tencent.mm.plugin.textstatus.convert.topic.z(this, i17));
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SquareTitleItemTouchListener", "[onInterceptTouchEvent]", null);
        n3.q qVar = this.f173255e;
        if (qVar != null) {
            return qVar.a(e17);
        }
        kotlin.jvm.internal.o.o("mGestureDetector");
        throw null;
    }
}
