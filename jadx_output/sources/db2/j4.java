package db2;

/* loaded from: classes2.dex */
public final class j4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final long f228025t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f228026u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.yj0 f228027v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f228028w;

    /* renamed from: x, reason: collision with root package name */
    public final r45.vg7 f228029x;

    /* renamed from: y, reason: collision with root package name */
    public cz2.f f228030y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(long j17, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String feedUsername, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, long j18, boolean z17, r45.qt2 qt2Var, int i19, int i27, r45.vg7 vg7Var, int i28, int i29, kotlin.jvm.internal.i iVar) {
        super(qt2Var, null, 2, null);
        int i37;
        com.tencent.mm.protobuf.g gVar2 = (i29 & 64) != 0 ? null : gVar;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = (i29 & 128) != 0 ? null : yj0Var;
        long j19 = (i29 & 256) != 0 ? 0L : j18;
        boolean z18 = (i29 & 512) != 0 ? true : z17;
        int i38 = (i29 & 4096) != 0 ? 0 : i27;
        r45.vg7 sortType = (i29 & 8192) != 0 ? r45.vg7.emFinderGetCommentListSortType_Default : vg7Var;
        int i39 = (i29 & 16384) != 0 ? 0 : i28;
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        kotlin.jvm.internal.o.g(sortType, "sortType");
        this.f228025t = j17;
        this.f228026u = gVar2;
        this.f228027v = yj0Var2;
        this.f228028w = z18;
        this.f228029x = sortType;
        long t07 = yj0Var2 != null ? yj0Var2.t0() : 0L;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.i51 i51Var = new r45.i51();
        i51Var.set(3, java.lang.Long.valueOf(j17));
        i51Var.set(4, str2);
        db2.t4 t4Var = db2.t4.f228171a;
        i51Var.set(1, t4Var.b(11842, qt2Var));
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var3 = yj0Var2;
        t4Var.h((r45.kv0) i51Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str)));
        i51Var.set(8, gVar2);
        if (j19 != 0) {
            i51Var.set(7, java.lang.Long.valueOf(j19));
        }
        i51Var.set(6, java.lang.Long.valueOf(t07));
        i51Var.set(5, java.lang.Integer.valueOf(z18 ? 2 : 1));
        com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderGetCommentList", "getIdScene scene:" + i18 + ", commentScene:" + i17);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j().r()).intValue() == 1 || com.tencent.mm.plugin.finder.storage.t70.M != 1) {
            if (i17 != 7 && (i17 != 8 || i18 != 1)) {
                i37 = 2;
            }
            i37 = 1;
        } else {
            if (!hc2.l.g(feedUsername)) {
                i37 = 3;
            }
            i37 = 1;
        }
        i51Var.set(2, java.lang.Integer.valueOf(i37));
        i51Var.set(9, java.lang.Integer.valueOf(i19));
        i51Var.set(11, java.lang.Integer.valueOf(i38));
        int i47 = sortType.f388228d;
        i51Var.set(10, java.lang.Integer.valueOf(i47));
        i51Var.set(12, java.lang.Integer.valueOf(i39));
        lVar.f70664a = i51Var;
        r45.j51 j51Var = new r45.j51();
        j51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) j51Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = j51Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetcommentlist";
        lVar.f70667d = 11842;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init pullScene:");
        sb6.append(i19);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(" lastBuffer=");
        sb6.append(gVar2 != null);
        sb6.append(" isSecondCommentFetch=");
        sb6.append(yj0Var3 != null);
        sb6.append(" scene ");
        sb6.append(i51Var.getInteger(9));
        sb6.append(",selectType=");
        sb6.append(i38);
        sb6.append(", sortType=");
        sb6.append(i47);
        com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderGetCommentList", sb6.toString());
        this.f228030y = cz2.f.f225004f;
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object obj;
        bu2.j jVar;
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        r45.j51 resp = (r45.j51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" emoji_desc_comment size=");
        sb6.append(resp.getList(11).size());
        sb6.append(" desc_comments size=");
        sb6.append(resp.getList(12).size());
        sb6.append(" resp=");
        sb6.append(resp);
        sb6.append(",half_sheet_info=");
        r45.xq2 xq2Var = (r45.xq2) resp.getCustom(10);
        sb6.append(xq2Var != null ? xq2Var.toString() : null);
        sb6.append("  thread=");
        sb6.append(java.lang.Thread.currentThread());
        com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderGetCommentList", sb6.toString());
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        int i19 = oVar.f70713d;
        com.tencent.mm.protobuf.f fVar2 = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentListRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.i51) fVar2).getCustom(1);
        bu2.h hVar = new bu2.h(i19, kv0Var != null ? kv0Var.getLong(5) : 0L);
        r45.pm2 pm2Var = (r45.pm2) resp.getCustom(7);
        long j17 = this.f228025t;
        if (pm2Var != null && (h17 = (jVar = bu2.j.f24534a).h(j17)) != null) {
            try {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                finderObject.parseFrom(h17.getFeedObject().toByteArray());
                r45.dm2 object_extend = finderObject.getObject_extend();
                if (object_extend != null) {
                    object_extend.set(12, pm2Var);
                }
                jVar.n(h90Var.a(finderObject, 0), hVar);
            } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderCache", e17, "", new java.lang.Object[0]);
            }
        }
        if (i17 >= 4) {
            this.f228030y = cz2.f.f225002d;
        }
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list = resp.getList(1);
            kotlin.jvm.internal.o.f(list, "getCommentInfo(...)");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : list) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj).getCommentId() == finderCommentInfo.getCommentId()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    linkedList.add(finderCommentInfo);
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.CgiGetFinderGetCommentList", "filterDuplicate " + finderCommentInfo.getCommentId() + " content " + finderCommentInfo.getContent() + " username " + finderCommentInfo.getUsername());
                }
            }
            resp.set(1, linkedList);
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f228027v;
            if (yj0Var != null) {
                yj0Var.u0().setLastBuffer(resp.getByteString(3));
                if (this.f228028w) {
                    yj0Var.u0().setContinueFlag(resp.getInteger(5));
                } else {
                    yj0Var.u0().setUpContinueFlag(resp.getInteger(4));
                }
            }
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127659db).getValue()).r()).intValue() == 1 && this.f228026u == null && resp.getList(1).size() > 5) {
                java.util.LinkedList list2 = resp.getList(1);
                com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = new com.tencent.mm.protocal.protobuf.FinderCommentInfo();
                finderCommentInfo2.setCommentId(1111111111L);
                finderCommentInfo2.setComment_type(1);
                finderCommentInfo2.setContent("新年打开百事，把乐带回家！");
                finderCommentInfo2.setHeadUrl("https://p2.itc.cn/q_70/images03/20210602/aba4da2697d3456caeba09726f7b2861.png");
                finderCommentInfo2.setUsername("");
                finderCommentInfo2.setNickname("百事可乐");
                r45.ky0 ky0Var = new r45.ky0();
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                finderJumpInfo.setJumpinfo_type(2);
                com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
                html5Info.setUrl("https://www.baidu.com");
                html5Info.setStyle(1);
                finderJumpInfo.setHtml5_info(html5Info);
                java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
                r45.wf6 wf6Var = new r45.wf6();
                wf6Var.set(1, 12);
                wf6Var.set(2, 2);
                r45.c74 c74Var = new r45.c74();
                c74Var.set(1, "打开百事可乐官方小程序");
                c74Var.set(0, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_music_dbffd75457b5423684dbbd330c2e3117.png");
                wf6Var.set(5, c74Var);
                style.add(wf6Var);
                ky0Var.set(0, finderJumpInfo);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                r45.jy0 jy0Var = new r45.jy0();
                jy0Var.set(0, 21);
                jy0Var.set(1, "内容重复");
                linkedList2.add(jy0Var);
                r45.jy0 jy0Var2 = new r45.jy0();
                jy0Var2.set(0, 22);
                jy0Var2.set(1, "不喜欢该广告");
                linkedList2.add(jy0Var2);
                r45.jy0 jy0Var3 = new r45.jy0();
                jy0Var3.set(0, 23);
                jy0Var3.set(1, "对此内容不感兴趣");
                linkedList2.add(jy0Var3);
                ky0Var.set(6, linkedList2);
                finderCommentInfo2.setAdvertisement_info(ky0Var);
                finderCommentInfo2.setContent_type(3);
                r45.e60 e60Var = new r45.e60();
                java.util.LinkedList list3 = e60Var.getList(2);
                r45.s60 s60Var = new r45.s60();
                s60Var.set(0, "http://playertest-75538.gzc.vod.tencent-cloud.com/mp4/h264_definition_source/h264_864_486.mp4");
                s60Var.set(4, 1920);
                s60Var.set(5, 1080);
                list3.add(s60Var);
                java.util.LinkedList list4 = e60Var.getList(1);
                r45.j60 j60Var = new r45.j60();
                j60Var.set(0, "https://www.smartm.com.tw/data/Images/31/3d/a4/7e/4142152402dc1f8d3d667d5.jpg");
                j60Var.set(2, 1920);
                j60Var.set(3, 1080);
                list4.add(j60Var);
                finderCommentInfo2.setContent_info(e60Var);
                list2.add(5, finderCommentInfo2);
            }
            com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderGetCommentList", "[onCgiBack] feedId=" + j17 + "  size=" + resp.getList(1).size() + ' ');
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return this.f228030y;
    }
}
