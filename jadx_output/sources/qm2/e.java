package qm2;

/* loaded from: classes3.dex */
public final class e extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public gk2.e f364711d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f364712e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f364713f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.uv f364714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(yz5.a aVar) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("FinderStartLiveMicTopicUIC", "openMicTopicWidget");
        com.tencent.mm.plugin.finder.live.widget.uv uvVar = this.f364714g;
        boolean z17 = false;
        boolean z18 = true;
        if (uvVar != null && uvVar.q()) {
            com.tencent.mars.xlog.Log.i("FinderStartLiveMicTopicUIC", "openMicTopicWidget: isShowing");
            return;
        }
        this.f364714g = new com.tencent.mm.plugin.finder.live.widget.uv(getActivity(), new qm2.b(this, aVar));
        gk2.e eVar = this.f364711d;
        if (eVar != null && ((mm2.g1) eVar.a(mm2.g1.class)).S6()) {
            gk2.e eVar2 = this.f364711d;
            if (eVar2 != null && ((mm2.g1) eVar2.a(mm2.g1.class)).B) {
                z17 = true;
            }
            z18 = z17;
        }
        com.tencent.mm.plugin.finder.live.widget.uv uvVar2 = this.f364714g;
        if (uvVar2 != null) {
            gk2.e eVar3 = this.f364711d;
            if (eVar3 == null || (str = ((mm2.g1) eVar3.a(mm2.g1.class)).A) == null) {
                str = "";
            }
            uvVar2.A(str, z18);
        }
    }
}
