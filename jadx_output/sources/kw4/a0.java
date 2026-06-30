package kw4;

/* loaded from: classes8.dex */
public class a0 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f313143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f313144i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kw4.c0 c0Var, long j17, java.lang.Boolean bool, int i17) {
        super(j17, bool);
        this.f313144i = c0Var;
        this.f313143h = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        kw4.c0 c0Var = this.f313144i;
        int i17 = c0Var.f313158d;
        int i18 = this.f313143h;
        boolean z17 = false;
        if (i18 == i17 && c0Var.e(i18) != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) c0Var.f313163i).J9();
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
