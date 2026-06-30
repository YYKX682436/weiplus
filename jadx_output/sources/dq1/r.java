package dq1;

/* loaded from: classes8.dex */
public final class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab0.a f242354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI f242355e;

    public r(ab0.a aVar, com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI) {
        this.f242354d = aVar;
        this.f242355e = bizComSchIntermediateUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        ((cb0.d) this.f242354d).a();
        this.f242355e.finish();
    }
}
