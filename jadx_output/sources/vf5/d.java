package vf5;

/* loaded from: classes.dex */
public final class d extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f436413d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f436414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f436413d = jz5.h.b(new vf5.b(activity));
        this.f436414e = jz5.h.b(vf5.a.f436408d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (((java.lang.Boolean) ((jz5.n) this.f436413d).getValue()).booleanValue()) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(getActivity());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getActivity(), iy1.c.WeChatContactsBlackListPage);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(getActivity(), "black_list_sid", (java.lang.String) ((jz5.n) this.f436414e).getValue());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(getActivity(), 4, 33328);
        }
    }
}
