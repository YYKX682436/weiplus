package r53;

/* loaded from: classes8.dex */
public class q implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.x f392683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r53.w f392684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f392685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r53.y f392686d;

    public q(r53.y yVar, r53.x xVar, r53.w wVar, android.widget.ImageView imageView) {
        this.f392686d = yVar;
        this.f392683a = xVar;
        this.f392684b = wVar;
        this.f392685c = imageView;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
        r53.x xVar = this.f392683a;
        if (xVar != null) {
            xVar.b(str, view);
        }
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        if (bVar == null || (bitmap = bVar.f359534d) == null) {
            return;
        }
        r53.w wVar = this.f392684b;
        boolean z17 = wVar.f392713d;
        r53.y yVar = this.f392686d;
        if (z17) {
            yVar.getClass();
            if (bitmap != null && !bitmap.isRecycled()) {
                int width = bitmap.getHeight() > bitmap.getWidth() ? bitmap.getWidth() : bitmap.getHeight();
                bitmap = com.tencent.mm.sdk.platformtools.x.k0(bitmap, width, width, false);
            }
        }
        wVar.getClass();
        if (wVar.f392716g > 0.0f) {
            bitmap = com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() * wVar.f392716g);
        }
        if (wVar.f392710a) {
            ((jt0.i) yVar.f392722d).j(str, bitmap);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new r53.p(this, bitmap));
        r53.x xVar = this.f392683a;
        if (xVar != null) {
            xVar.a(view, bitmap);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
