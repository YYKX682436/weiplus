package nv3;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f340698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nv3.t f340699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv3.h f340700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lv3.a f340701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, nv3.t tVar, rv3.h hVar, lv3.a aVar) {
        super(0);
        this.f340698d = z17;
        this.f340699e = tVar;
        this.f340700f = hVar;
        this.f340701g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.res.Resources resources;
        java.lang.String string;
        android.content.res.Resources resources2;
        java.lang.String string2;
        boolean z17 = this.f340698d;
        rv3.h hVar = this.f340700f;
        nv3.t tVar = this.f340699e;
        if (z17) {
            tVar.getClass();
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = hVar.f400395d;
            lv3.a aVar = this.f340701g;
            audioCacheInfo.f155720q = (int) aVar.f321510c;
            audioCacheInfo.f155715i = aVar.f321509b;
            audioCacheInfo.f155716m = true;
            tVar.g(hVar, rv3.z.f400421e);
            cv3.d dVar = tVar.f340708f;
            if (dVar != null) {
                dVar.close();
            }
            android.content.Context context = tVar.f340703a;
            if (context != null && (resources2 = context.getResources()) != null && (string2 = resources2.getString(com.tencent.mm.R.string.oai)) != null) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = string2;
                e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
                e4Var.c();
            }
        } else {
            tVar.g(hVar, rv3.z.f400420d);
            android.content.Context context2 = tVar.f340703a;
            if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(com.tencent.mm.R.string.lfd)) != null) {
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var2.f211776c = string;
                e4Var2.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
