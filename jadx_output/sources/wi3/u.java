package wi3;

/* loaded from: classes4.dex */
public class u extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f446270d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f446271e;

    public u(wi3.o oVar, int i17, long j17, wi3.r rVar) {
        this(oVar, i17, j17, "", "");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f446271e = u0Var;
        return dispatch(sVar, this.f446270d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5865;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMultiMediaReport", "onGYNetEnd, errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f446271e.onSceneEnd(i18, i19, str, this);
    }

    public u(wi3.o oVar, int i17, long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new wi3.p();
        lVar.f70665b = new wi3.q();
        lVar.f70667d = 5865;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mulmediareportcgi";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f446270d = a17;
        wi3.p pVar = (wi3.p) a17.f70710a.f70684a;
        pVar.f446258g = oVar;
        pVar.f446257f = i17;
        pVar.f446256e = j17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pVar.f446259h = linkedList;
        wi3.a aVar = new wi3.a();
        aVar.f446165d = "MEDIA_REPORT_USE_MMFG";
        wi3.b bVar = new wi3.b();
        bVar.f446167d = 1;
        bVar.f446168e = 1;
        aVar.f446166e = bVar;
        linkedList.add(aVar);
        pVar.f446255d = gm0.j1.b().h();
        java.util.LinkedList linkedList2 = pVar.f446259h;
        wi3.a aVar2 = new wi3.a();
        aVar2.f446165d = "img_phash";
        wi3.b bVar2 = new wi3.b();
        bVar2.f446167d = 6;
        bVar2.f446173m = str;
        aVar2.f446166e = bVar2;
        linkedList2.add(aVar2);
        java.util.LinkedList linkedList3 = pVar.f446259h;
        wi3.a aVar3 = new wi3.a();
        aVar3.f446165d = "img_pdq_hash";
        wi3.b bVar3 = new wi3.b();
        bVar3.f446167d = 6;
        bVar3.f446173m = str2;
        aVar3.f446166e = bVar3;
        linkedList3.add(aVar3);
        if (i17 == 2) {
            oVar.f446254z = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(oVar.f446239h);
            java.lang.String str3 = oVar.f446239h;
            oVar.f446238g = com.tencent.mm.sdk.platformtools.t8.E1(str3.substring(0, str3.indexOf(64)));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMultiMediaReport", "NetSceneMultiMediaReport init, MediaScene:%s, mediaid:%s, MediaType:%s, MediaSource:%s, to_username:%s, chatromid:%s, sns_url:%s, fileid:%s, filekey:%s, md5:%s, createtime:%s, media_width:%s, media_height:%s, thumb_url:%s, video_len:%s, video_fps:%s, audio_sample_rate:%s, video_codec:%s, audio_codec:%s, qrcode_url：%s, chatroom_size:%s, uuid:%s, phash:%s pdqhash:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(oVar.f446235d), java.lang.Integer.valueOf(oVar.f446236e), java.lang.Integer.valueOf(oVar.f446237f), oVar.f446239h, java.lang.Long.valueOf(oVar.f446238g), oVar.f446240i, oVar.f446241m, oVar.f446242n, oVar.f446243o, java.lang.Long.valueOf(oVar.f446244p), java.lang.Integer.valueOf(oVar.f446245q), java.lang.Integer.valueOf(oVar.f446246r), oVar.f446247s, java.lang.Integer.valueOf(oVar.f446248t), java.lang.Integer.valueOf(oVar.f446249u), java.lang.Integer.valueOf(oVar.f446250v), oVar.f446251w, oVar.f446252x, oVar.f446253y, java.lang.Integer.valueOf(oVar.f446254z), oVar.A, str, str2);
    }
}
