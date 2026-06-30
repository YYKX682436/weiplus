package oh2;

/* loaded from: classes10.dex */
public final class f extends oh2.d {

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f345370x;

    /* renamed from: y, reason: collision with root package name */
    public oh2.e f345371y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f345370x = "FinderLiveNormalRoomHorizontalLyricsDrawer";
        this.f345371y = oh2.e.f345366d;
        this.f345363u = i65.a.a(context, 24.0f);
        this.f345364v = i65.a.a(context, 24.0f);
        this.f345361s = (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - this.f345363u) - this.f345364v;
        this.f345362t = i65.a.a(context, 80.0f);
    }

    @Override // oh2.d
    public void a(my5.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.a(data);
        if (data.b() > 0) {
            this.f345353k = 0;
            this.f345354l = -1;
            this.f345355m = this.f345356n - 1;
            this.f345357o = 0.0f;
            this.f345358p = this.f345343a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    @Override // oh2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.graphics.Canvas r18, int r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oh2.f.c(android.graphics.Canvas, int):void");
    }

    @Override // oh2.d
    public java.lang.String e() {
        return this.f345370x;
    }

    @Override // oh2.d
    public void h() {
        this.f345353k = -1;
        this.f345357o = 0.0f;
        float f17 = this.f345343a;
        this.f345358p = f17;
        this.f345359q = f17;
        this.f345354l = -1;
        this.f345355m = this.f345356n - 1;
        com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomHorizontalLyricsDrawer", "reset");
    }

    @Override // oh2.d
    public void k(int i17) {
        b(i17 * (this.f345346d + this.f345347e), true).start();
    }

    @Override // oh2.d
    public void l(int i17, float f17) {
        float f18 = i17;
        float f19 = this.f345352j;
        float f27 = f18 * f19 * 2;
        int ordinal = this.f345371y.ordinal();
        if (ordinal == 0) {
            this.f345363u = f18 * f19;
            this.f345364v = f18 * f19;
        } else if (ordinal == 1) {
            this.f345363u = 0.0f;
            this.f345364v = f27;
        } else if (ordinal == 2) {
            this.f345363u = f27;
            this.f345364v = 0.0f;
        }
        super.l(i17, f17);
    }

    public final float m(my5.c cVar, int i17) {
        long j17 = i17;
        if (j17 < cVar.f332858b) {
            return 0.0f;
        }
        int d17 = d(cVar, i17);
        android.graphics.Paint paint = this.f345348f;
        if (d17 < 0) {
            return paint.measureText(cVar.f332857a);
        }
        my5.b bVar = (my5.b) cVar.f332860d.get(d17);
        java.lang.String mText = cVar.f332857a;
        kotlin.jvm.internal.o.f(mText, "mText");
        java.lang.String substring = mText.substring(0, bVar.f332855c);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String mText2 = cVar.f332857a;
        kotlin.jvm.internal.o.f(mText2, "mText");
        java.lang.String substring2 = mText2.substring(bVar.f332855c, bVar.f332856d);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        float measureText = paint.measureText(substring);
        float f17 = ((float) (j17 - bVar.f332853a)) / ((float) bVar.f332854b);
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        return measureText + (paint.measureText(substring2) * f17);
    }
}
