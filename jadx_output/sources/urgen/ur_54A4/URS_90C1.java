package urgen.ur_54A4;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0007¨\u0006\u0010"}, d2 = {"Lurgen/ur_54A4/URS_90C1;", "", "", dm.i4.COL_FINDEROBJECT, "", "UR_75AB", "", "", "commentScene", "downloadType", "Ljz5/f0;", "UR_804B", "([[BII)V", "UR_9F7B", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class URS_90C1 {
    public static final urgen.ur_54A4.URS_90C1 INSTANCE = new urgen.ur_54A4.URS_90C1();

    private URS_90C1() {
    }

    public static final boolean UR_75AB(byte[] finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        qg3.c0 c0Var = qg3.c0.f362809a;
        try {
            com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.FinderObject().parseFrom(finderObject);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderObject");
            dk4.a sj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).sj((com.tencent.mm.protocal.protobuf.FinderObject) parseFrom);
            java.lang.String str = sj6 != null ? sj6.f234482s : null;
            if (!(str == null || r26.n0.N(str))) {
                return cu2.x.c(cu2.x.f222449a, str, false, false, false, 14, null).field_cacheSize > 0;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MegaVideoPreloadJavaStatic", "startPreload but mediaId invalid");
            return false;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MegaVideoPreloadJavaStatic", "startPreload but finderObject invalid");
            return false;
        }
    }

    public static final void UR_804B(byte[][] finderObject, int commentScene, int downloadType) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        boolean compareAndSet = qg3.c0.f362812d.compareAndSet(true, false);
        qg3.c0 c0Var = qg3.c0.f362809a;
        if (compareAndSet) {
            es2.h0 b17 = c0Var.b();
            if (b17.f256378k.compareAndSet(true, false)) {
                b17.h();
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (byte[] bArr : finderObject) {
            try {
                com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.FinderObject().parseFrom(bArr);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderObject");
                arrayList.add(new so2.u1(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) parseFrom, 0)));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MegaVideoPreloadJavaStatic", "startPreload but finderObject invalid");
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MegaVideoPreloadJavaStatic", "No valid finder objects to preload");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoPreloadJavaStatic", "startPreload size:" + arrayList.size() + ", commentScene:" + commentScene);
        c0Var.b().i(new ek4.b(1, -1, commentScene, 3, 0L, null, downloadType == 0 ? 0 : 1, 48, null), arrayList, 0, "MicroMsg.MegaVideoPreloadJavaStatic");
    }

    public static final void UR_9F7B() {
        qg3.c0 c0Var = qg3.c0.f362809a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoPreloadJavaStatic", "stopPreload");
        if (qg3.c0.f362812d.compareAndSet(false, true)) {
            qg3.c0 c0Var2 = qg3.c0.f362809a;
            es2.h0 b17 = c0Var2.b();
            if (b17.f256378k.compareAndSet(false, true)) {
                b17.j("resetRunningTask", new es2.f0(b17));
            }
            c0Var2.b().f();
        }
    }
}
