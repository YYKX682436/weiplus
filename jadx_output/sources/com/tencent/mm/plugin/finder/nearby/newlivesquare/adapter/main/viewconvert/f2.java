package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class f2 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121666a;

    public f2(in5.s0 s0Var) {
        this.f121666a = s0Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("Finder.LiveTabJumpersListConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        sp2.j jVar = sp2.j.f411054a;
        android.content.Context context = this.f121666a.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        jVar.c(context, recordsSet, null);
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        sp2.j jVar = sp2.j.f411054a;
        android.content.Context context = this.f121666a.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, null, null, 12, null);
    }
}
