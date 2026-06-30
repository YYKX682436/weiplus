package ot;

@j95.b
/* loaded from: classes9.dex */
public final class w extends jm0.o implements pt.l0 {

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f348340m;

    static {
        new ot.t(null);
        f348340m = jz5.h.b(ot.s.f348336d);
    }

    public void Zi(android.content.Context context, zt.k recordLoaderParams, android.widget.ImageView imageView, gk0.k bitmapOptions, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recordLoaderParams, "recordLoaderParams");
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(bitmapOptions, "bitmapOptions");
        java.lang.String aj6 = aj(recordLoaderParams);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgLoaderFeatureService", "attachRecordMsgItemThumb imageKey:" + aj6);
        g75.z zVar = new g75.z();
        zVar.l("Common_ImageKey", aj6);
        zVar.l("Common_TempFolder", new com.tencent.mm.vfs.r6(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Vi(), aj6 + "_thumb"));
        zVar.l("Common_StartTimestamp", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        zVar.l("Common_MakeSureUIThread", java.lang.Boolean.TRUE);
        zVar.l("Common_ImageViewRef", new d75.c(imageView));
        zVar.l("key_record_params", recordLoaderParams);
        zVar.l("Common_BitmapOptions", bitmapOptions);
        imageView.setTag(com.tencent.mm.R.id.h9z, aj6);
        new gk0.j(kz5.c0.k(zt.b.class, zt.f.class, zt.a.class, zt.m.class, zt.j.class, zt.e.class)).a(zVar, new java.lang.ref.WeakReference(new ot.u(imageView, aVar)));
    }

    public java.lang.String aj(zt.k recordLoaderParams) {
        kotlin.jvm.internal.o.g(recordLoaderParams, "recordLoaderParams");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("key_");
        sb6.append(recordLoaderParams.f475544a);
        sb6.append('_');
        s15.h hVar = recordLoaderParams.f475545b;
        sb6.append(hVar.getString(hVar.f303422d + 3));
        sb6.append('_');
        sb6.append(recordLoaderParams.f475546c);
        return sb6.toString();
    }

    public java.lang.String bj(java.lang.String imageKey, zt.k recordLoaderParams) {
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        kotlin.jvm.internal.o.g(recordLoaderParams, "recordLoaderParams");
        oi3.e eVar = recordLoaderParams.f475547d;
        s15.h dataItem = recordLoaderParams.f475545b;
        if (eVar != null) {
            if (!(eVar.getLong(eVar.f345617d + 0) > 0)) {
                eVar = null;
            }
            if (eVar != null) {
                int i17 = mc0.k.R0;
                int i18 = eVar.f345617d;
                long j17 = eVar.getLong(i18 + 0);
                long j18 = eVar.getLong(i18 + 1);
                java.lang.String msgTalker = eVar.getString(i18 + 3);
                int i19 = recordLoaderParams.f475546c;
                kotlin.jvm.internal.o.g(dataItem, "dataItem");
                kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
                ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
                java.lang.String G = bt3.g2.G(dataItem.getString(dataItem.f303422d + 3), msgTalker, j17, j18, i19);
                kotlin.jvm.internal.o.f(G, "getThumbPath(...)");
                return G;
            }
        }
        java.lang.String g17 = vu.a.g(dataItem);
        java.lang.String str = (g17 == null || r26.n0.N(g17)) ^ true ? g17 : null;
        if (str != null) {
            return str;
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Vi(), imageKey.concat("_thumb")).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }
}
