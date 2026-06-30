package sf3;

/* loaded from: classes10.dex */
public final class a implements sf3.h {
    @Override // sf3.h
    public boolean a(sf3.g param) {
        kotlin.jvm.internal.o.g(param, "param");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.graphics.BitmapFactory.Options a17 = rq5.a.a(param.c());
        if (((float) a17.outHeight) / ((float) a17.outWidth) > ((com.tencent.mm.ui.bh.a(context).f197136b <= 0 || com.tencent.mm.ui.bh.a(context).f197135a <= 0 || ((((float) com.tencent.mm.ui.bh.a(context).f197136b) / ((float) com.tencent.mm.ui.bh.a(context).f197135a)) > 1.5f ? 1 : ((((float) com.tencent.mm.ui.bh.a(context).f197136b) / ((float) com.tencent.mm.ui.bh.a(context).f197135a)) == 1.5f ? 0 : -1)) >= 0) ? 2.2f : 2.5f)) {
            return false;
        }
        return rq5.a.c(param.c());
    }
}
