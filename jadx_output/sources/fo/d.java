package fo;

/* loaded from: classes.dex */
public final class d extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f264778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f264778d = jz5.h.b(new fo.c(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e0u;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.hideActionbarLine();
            mMActivity.setActionbarColor(getColor(com.tencent.mm.R.color.f478491c));
            mMActivity.setBackBtn(new fo.a(this));
            mMActivity.setMMTitle("");
        }
        jz5.g gVar = this.f264778d;
        em.k kVar = (em.k) ((jz5.n) gVar).getValue();
        if (kVar.f254489b == null) {
            kVar.f254489b = (android.widget.Button) kVar.f254488a.findViewById(com.tencent.mm.R.id.khs);
        }
        android.widget.Button button = kVar.f254489b;
        kotlin.jvm.internal.o.f(button, "getOkBtn(...)");
        com.tencent.mm.ui.fk.b(button);
        em.k kVar2 = (em.k) ((jz5.n) gVar).getValue();
        if (kVar2.f254490c == null) {
            kVar2.f254490c = (android.widget.TextView) kVar2.f254488a.findViewById(com.tencent.mm.R.id.odi);
        }
        android.widget.TextView textView = kVar2.f254490c;
        kotlin.jvm.internal.o.f(textView, "getTitleView(...)");
        com.tencent.mm.ui.fk.b(textView);
        em.k kVar3 = (em.k) ((jz5.n) gVar).getValue();
        if (kVar3.f254489b == null) {
            kVar3.f254489b = (android.widget.Button) kVar3.f254488a.findViewById(com.tencent.mm.R.id.khs);
        }
        kVar3.f254489b.setOnClickListener(new fo.b(this));
    }
}
