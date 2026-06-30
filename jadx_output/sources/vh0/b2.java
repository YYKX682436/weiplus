package vh0;

/* loaded from: classes8.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo f436836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ai0.h f436837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh0.f2 f436838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f436840h;

    public b2(com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo, ai0.h hVar, vh0.f2 f2Var, java.lang.String str, android.app.Activity activity) {
        this.f436836d = iYuanBaoAgreement$AgreementInfo;
        this.f436837e = hVar;
        this.f436838f = f2Var;
        this.f436839g = str;
        this.f436840h = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/YuanBaoAgreementService$attachAgreementEntriesToLayout$2$clickSpan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo = this.f436836d;
        if (!iYuanBaoAgreement$AgreementInfo.f67864i) {
            this.f436837e.f5067h = false;
            view.invalidate();
            this.f436838f.Di(this.f436839g, iYuanBaoAgreement$AgreementInfo, true);
        }
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        ((vh0.f3) n1Var).Zi(this.f436840h, iYuanBaoAgreement$AgreementInfo.f67861f);
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/YuanBaoAgreementService$attachAgreementEntriesToLayout$2$clickSpan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
