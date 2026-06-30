package sz4;

/* loaded from: classes12.dex */
public class h0 extends sz4.u {

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ImageView f414196y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f414197z;

    public h0(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nhn);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.p0l);
        this.f414196y = imageView2;
        imageView.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ozf);
        this.f414197z = imageView3;
        this.f414239q.setVisibility(8);
        this.f414234i.setVisibility(8);
        imageView3.setVisibility(8);
        imageView2.setTag(this);
        imageView2.setOnClickListener(this.f414244v);
    }

    @Override // sz4.a
    public int i() {
        return 6;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.k kVar = (iz4.k) cVar;
        android.graphics.Bitmap g17 = qz4.c.g(kVar.f296117t, null);
        if (g17 == null && com.tencent.mm.vfs.w6.j(kVar.f296135s) && (g17 = com.tencent.mm.plugin.fav.ui.u1.b(kVar.f296135s)) != null) {
            try {
                if (com.tencent.mm.vfs.w6.j(kVar.f296117t)) {
                    com.tencent.mm.vfs.w6.h(kVar.f296117t);
                }
                q35.g.a(g17, 60, android.graphics.Bitmap.CompressFormat.JPEG, kVar.f296117t, false);
            } catch (java.lang.Exception unused) {
            }
        }
        android.widget.ImageView imageView = this.f414196y;
        if (g17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageBitmap(g17);
            imageView.setBackground(null);
        } else {
            android.util.DisplayMetrics displayMetrics = imageView.getResources().getDisplayMetrics();
            float f17 = (displayMetrics.density * 40.0f) + 0.5f;
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i19 = displayMetrics.widthPixels - ((int) f17);
            layoutParams2.width = i19;
            layoutParams2.height = (i19 * 52) / 68;
            imageView.setLayoutParams(layoutParams2);
        }
        boolean z17 = cVar.f296111i;
        android.widget.ImageView imageView2 = this.f414197z;
        if (z17) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        super.j(cVar, i17, i18);
    }

    @Override // sz4.u
    public android.view.View l() {
        return this.f414238p;
    }
}
