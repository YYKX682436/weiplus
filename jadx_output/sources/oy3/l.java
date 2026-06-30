package oy3;

/* loaded from: classes13.dex */
public final class l implements com.tencent.mm.pluginsdk.ui.span.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f350034b;

    public l(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI, kotlin.jvm.internal.h0 h0Var) {
        this.f350033a = rtosWatchLoginUI;
        this.f350034b = h0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.t
    public void a(android.view.View view, int i17, com.tencent.mm.pluginsdk.ui.span.u obj) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(obj, "obj");
        java.lang.Object[] objArr = {com.tencent.mm.sdk.platformtools.m2.d(), this.f350034b.f310123d};
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350033a;
        c71.b.c(rtosWatchLoginUI, rtosWatchLoginUI.getString(com.tencent.mm.R.string.l3n, objArr), 0, true);
    }
}
