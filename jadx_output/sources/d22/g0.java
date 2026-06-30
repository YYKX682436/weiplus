package d22;

/* loaded from: classes12.dex */
public final class g0 implements rr.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f225842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f225844c;

    public g0(com.tencent.mm.ui.widget.dialog.f4 f4Var, android.content.Context context, d22.k0 k0Var) {
        this.f225842a = f4Var;
        this.f225843b = context;
        this.f225844c = k0Var;
    }

    @Override // rr.o
    public void a(boolean z17) {
        com.tencent.thumbplayer.tmediacodec.util.ThreadManager.runOnUiThread(new d22.f0(this.f225842a, z17, this.f225843b, this.f225844c));
    }
}
