package vk4;

/* loaded from: classes2.dex */
public final class e extends com.tencent.mm.modelbase.i {
    public e(bw5.g80 request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        boolean[] zArr = request.f27740x;
        if (Zi != null) {
            request.f27734r = (bw5.jb0) jm4.r5.d(urgen.ur_0025.UR_5769.UR_DB48(((jm4.k4) Zi).getCppPointer(), request.f27733q), new bw5.jb0());
            zArr[13] = true;
        }
        byte[] byteArray = request.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        lVar.f70664a = new qk.s9(byteArray);
        lVar.f70665b = new qk.t9();
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/like";
        lVar.f70667d = 7310;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tingPostLike request appScene: ");
        sb6.append(request.f27732p);
        sb6.append(", listenId: ");
        sb6.append(request.getListenId());
        sb6.append(", categoryId: ");
        sb6.append(zArr[4] ? request.f27724e : "");
        sb6.append(", isCancel: ");
        sb6.append(request.f27725f);
        sb6.append(", type: ");
        sb6.append(request.f27727h);
        sb6.append(", finderFeedId: ");
        sb6.append(zArr[8] ? request.f27729m : "");
        sb6.append(", qqMusicSongId: ");
        sb6.append(request.f27730n);
        sb6.append(", qqMusicMid: ");
        sb6.append(zArr[10] ? request.f27731o : "");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingListenPostLikeCGI", sb6.toString());
    }
}
