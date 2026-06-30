package pr;

/* loaded from: classes15.dex */
public final class l0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.q0 f357745d;

    public l0(pr.q0 q0Var) {
        this.f357745d = q0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        pr.q0 q0Var = this.f357745d;
        com.tencent.mars.xlog.Log.i(q0Var.f357768b, "init data callback: " + bundle);
        q0Var.h(bundle != null ? (com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData) bundle.getParcelable(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) : null);
    }
}
