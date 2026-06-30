package j93;

/* loaded from: classes3.dex */
public final class r extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298486d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f298487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298486d = jz5.h.b(j93.q.f298481d);
        this.f298487e = jz5.h.b(new j93.p(this));
    }

    public final java.lang.String O6() {
        return (java.lang.String) ((jz5.n) this.f298486d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            cy1.a aVar = (cy1.a) rVar;
            aVar.Mj(getActivity());
            cy1.a aVar2 = (cy1.a) aVar.ak(getActivity(), iy1.c.LabelSelectPage);
            aVar2.fk(getActivity(), "label_select_sessionid", O6());
            aVar2.fk(getActivity(), "has_manage_btn", "1");
            aVar2.fk(getActivity(), "has_create_btn", "1");
            aVar2.fk(getActivity(), "label_business_type", (java.lang.String) ((jz5.n) this.f298487e).getValue());
            aVar2.ik(getActivity(), 12, 33926);
        }
    }
}
