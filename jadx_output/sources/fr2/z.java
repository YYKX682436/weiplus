package fr2;

/* loaded from: classes2.dex */
public final class z extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f265775d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f265776e;

    /* renamed from: f, reason: collision with root package name */
    public final int f265777f;

    /* renamed from: g, reason: collision with root package name */
    public final int f265778g;

    /* renamed from: h, reason: collision with root package name */
    public final int f265779h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity act) {
        super(act);
        kotlin.jvm.internal.o.g(act, "act");
        this.f265777f = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        this.f265778g = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        this.f265779h = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 48);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.ho6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f265775d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.hnx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f265776e = (android.widget.TextView) findViewById2;
    }
}
