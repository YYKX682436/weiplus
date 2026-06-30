package tz4;

/* loaded from: classes12.dex */
public class l implements lz4.c {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f423355a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f423356b;

    /* renamed from: c, reason: collision with root package name */
    public tz4.i f423357c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f423358d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f423359e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f423360f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f423361g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f423362h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f423363i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f423364j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f423365k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f423366l;

    public void a(boolean z17) {
        tz4.i iVar = this.f423357c;
        if (iVar != null) {
            android.content.Context context = this.f423355a.getContext();
            iVar.getClass();
            if (context == null) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e("MicroMsg.Note.WNToolBarAdapter", "recalculateLayout: pageContext is null", null);
                return;
            }
            java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17)};
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "recalculateLayout start, notifyList=%b", objArr);
            iVar.f423352o = false;
            iVar.f423353p = -1;
            if (iVar.x(iVar.y(context)) && z17) {
                iVar.notifyDataSetChanged();
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNToolBarAdapter", "recalculateLayout: notifyDataSetChanged called", null);
            }
        }
    }

    public final void b(tz4.u uVar, boolean z17) {
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = uVar == tz4.u.Recording ? this.f423365k : (com.tencent.mm.ui.widget.imageview.WeImageButton) this.f423357c.f423344d.get(uVar);
        if (weImageButton != null) {
            weImageButton.setIconColor(i65.a.d(weImageButton.getContext(), z17 ? com.tencent.mm.R.color.Brand_100 : com.tencent.mm.R.color.FG_0));
        }
    }
}
