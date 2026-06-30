package r60;

@j95.b
/* loaded from: classes7.dex */
public class e extends i95.w implements s60.e {
    public void wi(android.content.Context context, com.tencent.mm.model.gdpr.a aVar, java.lang.String str, com.tencent.mm.model.gdpr.b bVar) {
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (!com.tencent.mm.model.gdpr.g.a()) {
            bVar.a(0);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            bVar.a(1);
        } else {
            pq5.h.a().q(new com.tencent.mm.model.gdpr.e(aVar, str, bVar)).K(new com.tencent.mm.model.gdpr.c(bVar, context, aVar, str));
        }
    }
}
