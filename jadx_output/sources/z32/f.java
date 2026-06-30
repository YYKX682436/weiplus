package z32;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.b f469905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f469906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z32.s f469907f;

    public f(z32.b bVar, k91.v5 v5Var, z32.s sVar) {
        this.f469905d = bVar;
        this.f469906e = v5Var;
        this.f469907f = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z32.b bVar = this.f469905d;
        android.widget.TextView textView = bVar.f469879d;
        k91.v5 v5Var = this.f469906e;
        if (textView != null) {
            textView.setText(v5Var.field_nickname);
        }
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342079c = true;
        o11.g a17 = fVar.a();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = bVar.f469878c;
        if (weImageView != null) {
            weImageView.setIconColor(this.f469907f.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        n11.a.b().h(v5Var.field_smallHeadURL, bVar.f469878c, a17);
    }
}
