package gx1;

/* loaded from: classes12.dex */
public class n extends gx1.l {

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f277320z;

    public n(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.f277307i.setVisibility(8);
        this.f277304f.setVisibility(8);
        this.f277312q.setVisibility(8);
        this.f277307i.setOnClickListener(null);
        this.f277313r.setOnClickListener(new gx1.m(this));
    }

    @Override // gx1.a
    public int i() {
        return -1;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        super.j(aVar, i17, i18);
        if (aVar.b() != -1) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.f277314s;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        linearLayout.setLayoutParams(layoutParams);
        this.f277313r.setVisibility(0);
        this.f277320z = this.itemView.findViewById(com.tencent.mm.R.id.f486162kf0);
    }
}
