package m71;

/* loaded from: classes5.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public m71.a f324491d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f324492e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f324493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        android.app.ProgressDialog progressDialog = this.f324492e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f324492e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r9, int r10, java.lang.String r11, com.tencent.mm.modelbase.m1 r12) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m71.g.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
