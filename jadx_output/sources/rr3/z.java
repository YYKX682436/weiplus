package rr3;

/* loaded from: classes3.dex */
public final class z extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f399221d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f399222e;

    /* renamed from: f, reason: collision with root package name */
    public int f399223f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f399224g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f399225h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f399221d = jz5.h.b(new rr3.s(activity));
        this.f399222e = jz5.h.b(new rr3.w(activity));
        this.f399223f = 1;
        this.f399225h = jz5.h.b(new rr3.v(activity));
    }

    public final androidx.recyclerview.widget.RecyclerView O6() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f399221d).getValue();
    }

    public final android.widget.Button P6() {
        return (android.widget.Button) ((jz5.n) this.f399222e).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (qr3.o.f366102m == null) {
            com.tencent.mars.xlog.Log.i("NewBizInfoAuthScopeUIC", "staticResp == null");
            getActivity().finish();
        } else {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
            linearLayoutManager.Q(1);
            O6().setLayoutManager(linearLayoutManager);
            androidx.recyclerview.widget.RecyclerView O6 = O6();
            r45.n14 n14Var = qr3.o.f366102m;
            kotlin.jvm.internal.o.d(n14Var);
            java.util.LinkedList privacy_scope_item_list = n14Var.f380992f;
            kotlin.jvm.internal.o.f(privacy_scope_item_list, "privacy_scope_item_list");
            O6.setAdapter(new rr3.r(privacy_scope_item_list, this));
        }
        P6().post(new rr3.u(this));
        P6().setOnClickListener(new rr3.t(this));
    }
}
