package ny2;

/* loaded from: classes.dex */
public final class h extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f341431d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f341432e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f341433f;

    /* renamed from: g, reason: collision with root package name */
    public ky2.w f341434g;

    /* renamed from: h, reason: collision with root package name */
    public long f341435h;

    /* renamed from: i, reason: collision with root package name */
    public long f341436i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f341437m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.assist.d9 f341438n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f341431d = "FinderLiveAnchorEditVoteUIC";
        this.f341432e = jz5.h.b(new ny2.g(activity));
        this.f341433f = jz5.h.b(new ny2.a(activity));
        this.f341437m = "";
        this.f341438n = com.tencent.mm.plugin.finder.assist.a9.a(com.tencent.mm.plugin.finder.assist.d9.f102093f, getContext(), getContext().getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
    }

    public final android.widget.TextView O6() {
        java.lang.Object value = ((jz5.n) this.f341433f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.alo;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f341434g = new ky2.w(getActivity());
        java.lang.Object value = ((jz5.n) this.f341432e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        wxRecyclerView.setAdapter(this.f341434g);
        com.tencent.mm.ui.fk.a(O6());
        ky2.w wVar = this.f341434g;
        if (wVar != null) {
            wVar.f313595r = new ny2.b(this);
        }
        if (wVar != null) {
            wVar.f313594q = new ny2.c(wxRecyclerView);
        }
        O6().setOnClickListener(new ny2.f(this));
        this.f341435h = getIntent().getLongExtra("finderlivecreateparamliveid", 0L);
        this.f341436i = getIntent().getLongExtra("finderlivecreateparamobjectid", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("finderlivecreateparamnonceobjectid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f341437m = stringExtra;
        ky2.w wVar2 = this.f341434g;
        if (wVar2 != null) {
            ky2.r rVar = new ky2.r("", new ky2.s(false, 0, null, 7, null), 0);
            java.util.List list = wVar2.f313585e;
            list.add(rVar);
            list.add(new ky2.r("", new ky2.s(false, 0, null, 7, null), 2));
            list.add(new ky2.r("", new ky2.s(false, 0, null, 7, null), 2));
            list.add(new ky2.r("", new ky2.s(false, 0, null, 7, null), 1));
            wVar2.notifyDataSetChanged();
            wVar2.f313591n = true;
        }
    }
}
