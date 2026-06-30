package pp0;

/* loaded from: classes5.dex */
public abstract class j0 {
    public static final com.tencent.mm.maas_api.MJMediaItem a(com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo) {
        pp0.u0 u0Var;
        kotlin.jvm.internal.o.g(mJAssetInfo, "<this>");
        if (mJAssetInfo.getIdentifierType() != qg.a.Filepath) {
            return null;
        }
        qg.c mediaType = mJAssetInfo.getMediaType();
        int i17 = mediaType == null ? -1 : pp0.i0.f357376a[mediaType.ordinal()];
        if (i17 == 1) {
            u0Var = pp0.u0.f357387e;
        } else {
            if (i17 != 2) {
                return null;
            }
            u0Var = pp0.u0.f357386d;
        }
        java.lang.String identifier = mJAssetInfo.getIdentifier();
        kotlin.jvm.internal.o.f(identifier, "getIdentifier(...)");
        return new com.tencent.mm.maas_api.MJMediaItem(u0Var, identifier, null, 0, 0, 0, 60, null);
    }
}
