package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ec implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116281d;

    public ec(com.tencent.mm.plugin.finder.live.view.mc mcVar) {
        this.f116281d = mcVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.TextView textView = (android.widget.TextView) this.f116281d.f116486d.findViewById(com.tencent.mm.R.id.f484066cw1);
        if (textView != null) {
            java.lang.String string = textView.getContext().getResources().getString(com.tencent.mm.R.string.f491772nu5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{no0.l.a(no0.m.f338730a, intValue, ":", false, false, false, 24, null)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
        }
        return jz5.f0.f302826a;
    }
}
