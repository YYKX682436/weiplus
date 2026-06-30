package r50;

/* loaded from: classes5.dex */
public final class d0 implements com.tencent.mm.pluginsdk.ui.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392573a;

    public d0(r50.j0 j0Var) {
        this.f392573a = j0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void a() {
        this.f392573a.f392590i = false;
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar != null) {
            mVar.j();
        }
        a31.m mVar2 = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar2 == null) {
            return;
        }
        mVar2.f973g = 4;
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void b() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void c(int i17) {
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar != null) {
            mVar.l(i17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void d() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void e(int i17) {
        z21.w wVar;
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar == null || (wVar = mVar.f985s) == null) {
            return;
        }
        wVar.e(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void f() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void g(int i17) {
        r50.j0 j0Var = this.f392573a;
        j0Var.f392590i = true;
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar != null) {
            mVar.i(i17);
        }
        if (com.tencent.mm.pluginsdk.ui.SpeechInputLayout.f189820y.a() == 2) {
            android.view.View m17 = j0Var.W6().m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$5", "onStartRecord", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m17, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$5", "onStartRecord", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
