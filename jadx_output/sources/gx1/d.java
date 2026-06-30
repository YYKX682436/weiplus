package gx1;

/* loaded from: classes12.dex */
public class d extends gx1.l {
    public final int A;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f277295z;

    public d(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.A = 0;
        gx1.c cVar = new gx1.c(this);
        this.f277304f.setVisibility(0);
        this.f277312q.setVisibility(8);
        this.f277307i.setVisibility(8);
        this.f277304f.setTag(this);
        this.f277304f.setOnClickListener(cVar);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h_2);
        this.f277295z = imageView;
        imageView.setVisibility(8);
        this.A = nx1.z.f341329f - ((int) android.util.TypedValue.applyDimension(1, 20.0f, nx1.z.f341330g));
    }

    @Override // gx1.a
    public int i() {
        return 2;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        ix1.j jVar = (ix1.j) aVar;
        java.lang.String str = jVar.f295329r;
        java.lang.String str2 = jVar.f295322s;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            str = com.tencent.mm.vfs.w6.j(str2) ? str2 : null;
        }
        android.graphics.Bitmap f17 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? null : com.tencent.mm.plugin.component.editor.u1.f(str, null);
        android.widget.ImageView imageView = this.f277304f;
        imageView.setImageBitmap(null);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        imageView.setLayoutParams(layoutParams);
        if (f17 != null) {
            imageView.setImageBitmap(f17);
        } else {
            imageView.setImageBitmap(null);
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i19 = this.A;
            layoutParams2.width = i19;
            layoutParams2.height = i19;
            imageView.setLayoutParams(layoutParams2);
            imageView.setBackgroundColor(android.graphics.Color.parseColor("#f6f6f6"));
            if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f295324m.f375438u) || com.tencent.mm.sdk.platformtools.t8.K0(jVar.f295324m.f375434s)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorImageItemHolder", "data key or url null!!!");
            } else {
                com.tencent.mm.plugin.component.editor.f.f96553d.c(new com.tencent.mm.plugin.component.editor.c(jVar.f295324m, false, com.tencent.mm.plugin.component.editor.a.TYPE_FILE, i17));
            }
        }
        boolean z17 = aVar.f295318h;
        android.widget.ImageView imageView2 = this.f277295z;
        if (z17) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        super.j(aVar, i17, i18);
    }
}
