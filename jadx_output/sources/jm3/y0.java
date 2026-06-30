package jm3;

/* loaded from: classes4.dex */
public final class y0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvPostUI f300367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f300368b;

    public y0(com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI, android.view.View view) {
        this.f300367a = musicMvPostUI;
        this.f300368b = view;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b bVar) {
        kotlin.jvm.internal.o.g(url, "url");
        if ((bVar != null ? bVar.f359534d : null) == null || bVar.f359534d.isRecycled()) {
            return;
        }
        byte[] bytes = url.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        ax1.x xVar = ax1.x.f15027a;
        androidx.appcompat.app.AppCompatActivity context = this.f300367a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.Bitmap bitmap = bVar.f359534d;
        kotlin.jvm.internal.o.f(bitmap, "bitmap");
        kotlin.jvm.internal.o.d(g17);
        xVar.a(context, this.f300368b, bitmap, g17);
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
