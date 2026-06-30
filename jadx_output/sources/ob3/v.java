package ob3;

/* loaded from: classes9.dex */
public class v implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f344088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ob3.w f344089b;

    public v(ob3.w wVar, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f344089b = wVar;
        this.f344088a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f344088a;
        c0Var.d();
        ob3.w wVar = this.f344089b;
        if (z17) {
            wVar.f344091e.f145042v.setText((java.lang.CharSequence) obj);
        }
        wVar.f344091e.f145044x = c0Var.b();
    }
}
