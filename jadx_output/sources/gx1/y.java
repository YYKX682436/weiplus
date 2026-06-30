package gx1;

/* loaded from: classes12.dex */
public class y extends gx1.l {
    public final android.widget.ImageView A;
    public com.tencent.mm.plugin.component.editor.e B;
    public com.tencent.mm.ui.widget.dialog.u3 C;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f277333z;

    public y(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        gx1.x xVar = new gx1.x(this);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nhn);
        this.f277333z = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.p0l);
        imageView.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ozf);
        this.A = imageView2;
        this.f277312q.setVisibility(8);
        this.f277307i.setVisibility(8);
        imageView2.setVisibility(8);
        this.f277311p.setTag(this);
        this.f277311p.setOnClickListener(xVar);
    }

    @Override // gx1.a
    public int i() {
        return 6;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        ix1.m mVar = (ix1.m) aVar;
        android.graphics.Bitmap f17 = com.tencent.mm.plugin.component.editor.u1.f(mVar.f295346s, null);
        if (f17 == null && com.tencent.mm.vfs.w6.j(mVar.f295329r) && (f17 = com.tencent.mm.plugin.fav.ui.u1.b(mVar.f295329r)) != null) {
            try {
                if (com.tencent.mm.vfs.w6.j(mVar.f295346s)) {
                    com.tencent.mm.vfs.w6.h(mVar.f295346s);
                }
                com.tencent.mm.sdk.platformtools.x.D0(f17, 60, android.graphics.Bitmap.CompressFormat.JPEG, mVar.f295346s, false);
            } catch (java.lang.Exception unused) {
            }
        }
        android.widget.ImageView imageView = this.f277333z;
        if (f17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageBitmap(f17);
            imageView.setBackground(null);
        } else {
            android.util.DisplayMetrics displayMetrics = imageView.getResources().getDisplayMetrics();
            float f18 = (displayMetrics.density * 40.0f) + 0.5f;
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i19 = displayMetrics.widthPixels - ((int) f18);
            layoutParams2.width = i19;
            layoutParams2.height = (i19 * 52) / 68;
            imageView.setLayoutParams(layoutParams2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.f295324m.f375420m) || com.tencent.mm.sdk.platformtools.t8.K0(mVar.f295324m.f375412h)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorVideoItemHolder", "data key or url null!!!");
            } else {
                com.tencent.mm.plugin.component.editor.f.f96553d.c(new com.tencent.mm.plugin.component.editor.c(mVar.f295324m, false, com.tencent.mm.plugin.component.editor.a.TYPE_THUMB, i17));
            }
        }
        boolean z17 = aVar.f295318h;
        android.widget.ImageView imageView2 = this.A;
        if (z17) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        super.j(aVar, i17, i18);
    }
}
