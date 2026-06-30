package ky2;

/* loaded from: classes.dex */
public final class f implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f313530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f313531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313533d;

    public f(com.tencent.mm.ui.widget.picker.c0 c0Var, android.widget.TextView textView, ky2.w wVar, int i17) {
        this.f313530a = c0Var;
        this.f313531b = textView;
        this.f313532c = wVar;
        this.f313533d = i17;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f313530a;
        c0Var.d();
        ky2.w wVar = this.f313532c;
        if (z17) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
            this.f313531b.setText(charSequence);
            ((ky2.r) wVar.f313585e.get(this.f313533d)).f313576b.f313579b = com.tencent.mm.sdk.platformtools.t8.P(charSequence.subSequence(0, charSequence.length() - 2).toString(), 0);
        }
        wVar.f313592o = c0Var.b();
    }
}
