package kw4;

/* loaded from: classes8.dex */
public class x extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f313204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f313205i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kw4.c0 c0Var, long j17, java.lang.Boolean bool, int i17) {
        super(j17, bool);
        this.f313205i = c0Var;
        this.f313204h = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        boolean z17;
        kw4.c0 c0Var = this.f313205i;
        int i17 = this.f313204h;
        kw4.b0 e17 = c0Var.e(i17);
        if (e17 != null) {
            if (i17 == c0Var.f313158d && c0Var.e(i17) != null) {
                ((com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) c0Var.f313163i).J9();
            }
            java.util.List list = c0Var.f313157c;
            list.removeAll(c0Var.b(e17));
            android.view.ViewGroup c17 = c0Var.c(e17.f313148c);
            if (c17 != null) {
                ((java.util.LinkedList) list).remove(e17);
                c17.removeView((android.view.View) e17.f313146a.get());
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
