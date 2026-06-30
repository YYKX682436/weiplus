package tf5;

/* loaded from: classes.dex */
public final class j extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f418996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f418996d = jz5.h.b(new tf5.i(this));
    }

    public static final void O6(android.content.Context context, java.lang.String viewId) {
        tf5.j jVar;
        kotlin.jvm.internal.o.g(viewId, "viewId");
        if (context == null) {
            jVar = null;
        } else {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            jVar = (tf5.j) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(tf5.j.class);
        }
        if (jVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.l(new jz5.l("page_sessionid", java.lang.Long.valueOf(((java.lang.Number) ((jz5.n) jVar.f418996d).getValue()).longValue())), new jz5.l("new_friends_page_type", 1), new jz5.l("view_id", viewId)), 33926);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        cy1.a aVar = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getActivity(), iy1.c.FMessageConversationUI)).ik(getActivity(), 4, 33926);
        aVar.fk(getActivity(), "page_sessionid", java.lang.Long.valueOf(((java.lang.Number) ((jz5.n) this.f418996d).getValue()).longValue()));
        aVar.fk(getActivity(), "new_friends_page_type", 1);
    }
}
