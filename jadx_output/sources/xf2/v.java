package xf2;

/* loaded from: classes5.dex */
public final class v implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454308a;

    public v(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView) {
        this.f454308a = shellView;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView = this.f454308a;
        db5.t7.i(shellView.getContext(), shellView.getContext().getResources().getString(com.tencent.mm.R.string.e1i), com.tencent.mm.R.raw.icons_filled_done);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView = this.f454308a;
        db5.t7.i(shellView.getContext(), shellView.getContext().getResources().getString(com.tencent.mm.R.string.e1h), com.tencent.mm.R.raw.icons_filled_close);
    }
}
