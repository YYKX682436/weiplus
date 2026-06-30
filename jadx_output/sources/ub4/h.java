package ub4;

/* loaded from: classes4.dex */
public class h extends androidx.recyclerview.widget.k3 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f426160m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ub4.p f426161d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f426162e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f426163f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f426164g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f426165h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ub4.i f426166i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ub4.i iVar, android.view.View view) {
        super(view);
        this.f426166i = iVar;
        this.f426161d = null;
        this.f426162e = null;
        this.f426163f = null;
        this.f426164g = null;
        this.f426165h = null;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n67);
        this.f426162e = textView;
        textView.setTextSize(0, ub4.i.y(iVar).getResources().getDimension(com.tencent.mm.R.dimen.f479574q));
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n6d);
        this.f426163f = textView2;
        textView2.setTextSize(0, ub4.i.y(iVar).getResources().getDimension(com.tencent.mm.R.dimen.f479574q));
        this.f426164g = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.n6c);
        this.f426165h = new androidx.recyclerview.widget.GridLayoutManager(ub4.i.y(iVar), 3);
        ub4.p pVar = new ub4.p();
        this.f426161d = pVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        ub4.l lVar = iVar.f426180t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnGridItemClickListener", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        pVar.f426195e = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnGridItemClickListener", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
    }
}
