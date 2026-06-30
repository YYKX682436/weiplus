package vw;

/* loaded from: classes11.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv.h3 f440592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(rv.h3 h3Var) {
        super(1);
        this.f440592d = h3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.r rVar;
        com.tencent.pigeon.biz.BizImagePreviewActionResult ret = (com.tencent.pigeon.biz.BizImagePreviewActionResult) obj;
        kotlin.jvm.internal.o.g(ret, "ret");
        rv.h3 h3Var = this.f440592d;
        if (h3Var != null && (rVar = ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.ia) h3Var).f186258a) != null) {
            rVar.a(ret.toList());
        }
        return jz5.f0.f302826a;
    }
}
