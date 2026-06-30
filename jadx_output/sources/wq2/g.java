package wq2;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wq2.h f448528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wq2.h hVar) {
        super(0);
        this.f448528d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wq2.h hVar = this.f448528d;
        android.app.Activity activity = hVar.f448529a;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        wq2.e eVar = hVar.f448538j;
        dk2.of ofVar = hVar.f448534f;
        return new gr2.p0(mMActivity, eVar, 0.0f, ofVar != null ? ofVar.f233867g : 0, ofVar != null ? ofVar.f233868h : 0, 4, null);
    }
}
