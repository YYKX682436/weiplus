package lo5;

/* loaded from: classes14.dex */
public final class g implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lo5.h f320213a;

    public g(lo5.h hVar) {
        this.f320213a = hVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        this.f320213a.f320216c.b(false, false, false);
        i95.m c17 = i95.n0.c(jp5.o.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        jp5.o.R3((jp5.o) c17, context, false, 2, null);
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.d(true, true, lo5.f.f320212a);
    }
}
