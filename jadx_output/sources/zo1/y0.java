package zo1;

/* loaded from: classes5.dex */
public final class y0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final po1.d f474826d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f474827e = kz5.p0.f313996d;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f474828f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f474829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474830h;

    public y0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, po1.d dVar) {
        this.f474830h = createPackageUI;
        this.f474826d = dVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f474827e.size() + 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (po1.d) this.f474827e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (view == null) {
            view = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dwg, parent, false);
            kotlin.jvm.internal.o.d(view);
            view.setTag(new zo1.v0(this, view));
        }
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.DeviceListAdapter.ViewHolder");
        zo1.v0 v0Var = (zo1.v0) tag;
        int size = this.f474827e.size();
        android.widget.TextView textView = v0Var.f474795g;
        android.view.View view2 = v0Var.f474789a;
        android.widget.LinearLayout linearLayout = v0Var.f474794f;
        if (i17 == size) {
            textView.setVisibility(0);
            linearLayout.setVisibility(8);
            view2.setOnClickListener(new zo1.w0(this));
            return view;
        }
        textView.setVisibility(8);
        linearLayout.setVisibility(0);
        po1.d dVar = (po1.d) this.f474827e.get(i17);
        int ordinal = dVar.f357296b.ordinal();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = v0Var.f474790b;
        android.widget.TextView textView2 = v0Var.f474792d;
        if (ordinal == 0 || ordinal == 1) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_display_backup);
            if (dVar.f357302h) {
                textView2.setVisibility(0);
                textView2.setText(com.tencent.mm.R.string.f492855mx4);
            } else {
                textView2.setVisibility(8);
            }
        } else if (ordinal != 2) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_usb);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_usb);
            textView2.setVisibility(0);
            textView2.setText(dVar.f357299e);
        }
        v0Var.f474791c.setText(dVar.b());
        po1.g gVar = dVar.f357296b;
        po1.g gVar2 = po1.g.f357310h;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = v0Var.f474793e;
        if (gVar == gVar2 && ro1.v.f398014a.f(dVar)) {
            java.lang.String str = dVar.f357300f;
            po1.d dVar2 = this.f474830h.f92827s;
            weImageView2.setVisibility(kotlin.jvm.internal.o.b(str, dVar2 != null ? dVar2.f357300f : null) ? 0 : 8);
        } else {
            java.lang.String str2 = dVar.f357295a;
            po1.d dVar3 = this.f474826d;
            weImageView2.setVisibility(kotlin.jvm.internal.o.b(str2, dVar3 != null ? dVar3.f357295a : null) ? 0 : 8);
        }
        view2.setOnClickListener(new zo1.x0(this, dVar));
        return view;
    }
}
