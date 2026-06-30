package vv4;

/* loaded from: classes11.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f440512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440513g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f440514h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI, java.lang.String str, android.graphics.RectF rectF, java.lang.String str2, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440510d = mMFTSImageRecognitionUI;
        this.f440511e = str;
        this.f440512f = rectF;
        this.f440513g = str2;
        this.f440514h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vv4.v(this.f440510d, this.f440511e, this.f440512f, this.f440513g, this.f440514h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vv4.v vVar = (vv4.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI = this.f440510d;
        android.view.View view = (android.view.View) ((jz5.n) mMFTSImageRecognitionUI.f181637i).getValue();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + com.tencent.mm.ui.bl.h(view.getContext()), view.getPaddingRight(), view.getPaddingBottom());
        view.setOnClickListener(new vv4.p(mMFTSImageRecognitionUI));
        mMFTSImageRecognitionUI.getContentView().setOnClickListener(new vv4.q(mMFTSImageRecognitionUI));
        mMFTSImageRecognitionUI.getContentView().postDelayed(new vv4.u(this.f440510d, this.f440511e, this.f440512f, this.f440513g, this.f440514h), 100L);
        return jz5.f0.f302826a;
    }
}
