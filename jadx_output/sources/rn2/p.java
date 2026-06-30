package rn2;

/* loaded from: classes15.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.w f397812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f397813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f397814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f397815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(rn2.w wVar, android.view.View view, android.view.View view2, java.util.List list) {
        super(0);
        this.f397812d = wVar;
        this.f397813e = view;
        this.f397814f = view2;
        this.f397815g = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rn2.w wVar = this.f397812d;
        android.view.View doneBtn = this.f397813e;
        kotlin.jvm.internal.o.f(doneBtn, "$doneBtn");
        android.view.View view = this.f397814f;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.q5g);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.q5n);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.ohp);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        rn2.w.a(wVar, doneBtn, (android.widget.TextView) findViewById, findViewById2, (android.widget.TextView) findViewById3, this.f397815g);
        return jz5.f0.f302826a;
    }
}
