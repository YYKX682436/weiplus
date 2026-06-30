package ke2;

/* loaded from: classes3.dex */
public final class c extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final int f306934u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f306935v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f306936w;

    /* renamed from: x, reason: collision with root package name */
    public final ss5.j0 f306937x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.q71 f306938y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f306939z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't wrap try/catch for region: R(57:91|(1:93)(1:209)|94|(1:96)(1:208)|97|(53:99|(1:101)|203|(1:205)|202|113|114|115|(41:117|118|(1:198)|122|(1:197)(1:128)|129|130|131|(1:133)|134|(1:136)|137|(1:139)|140|141|142|143|(1:191)|147|(1:149)|150|(1:152)|153|(1:155)|156|(1:158)(1:190)|159|(1:161)(1:189)|162|(1:164)(1:188)|165|(1:167)(1:187)|168|(1:170)(1:186)|171|(1:173)(1:185)|174|(1:176)(1:184)|177|178|(1:182)(2:180|181))|200|118|(1:120)|198|122|(1:124)|197|129|130|131|(0)|134|(0)|137|(0)|140|141|142|143|(1:145)|191|147|(0)|150|(0)|153|(0)|156|(0)(0)|159|(0)(0)|162|(0)(0)|165|(0)(0)|168|(0)(0)|171|(0)(0)|174|(0)(0)|177|178|(0)(0))(1:207)|103|(4:105|(1:107)|108|(49:112|113|114|115|(0)|200|118|(0)|198|122|(0)|197|129|130|131|(0)|134|(0)|137|(0)|140|141|142|143|(0)|191|147|(0)|150|(0)|153|(0)|156|(0)(0)|159|(0)(0)|162|(0)(0)|165|(0)(0)|168|(0)(0)|171|(0)(0)|174|(0)(0)|177|178|(0)(0)))|202|113|114|115|(0)|200|118|(0)|198|122|(0)|197|129|130|131|(0)|134|(0)|137|(0)|140|141|142|143|(0)|191|147|(0)|150|(0)|153|(0)|156|(0)(0)|159|(0)(0)|162|(0)(0)|165|(0)(0)|168|(0)(0)|171|(0)(0)|174|(0)(0)|177|178|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03cb, code lost:
    
        if (r4.Ri(r7.getLong(r8)) != ml2.r0.f327861a2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0819, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x081e, code lost:
    
        com.tencent.mars.xlog.Log.e(r26, "[bindGetLiveMsgCgiReportInfo] bind page params throw Exception : " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x081b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x081c, code lost:
    
        r26 = "HABBYGE-MALI.HellLiveVisitorReoprter";
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03d6, code lost:
    
        if (r7.getBoolean(7) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x008a, code lost:
    
        if ((r8.getInteger(0) != 2) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04fa A[Catch: Exception -> 0x050d, TRY_LEAVE, TryCatch #0 {Exception -> 0x050d, blocks: (B:115:0x04f2, B:117:0x04fa), top: B:114:0x04f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0665 A[Catch: Exception -> 0x0819, TryCatch #2 {Exception -> 0x0819, blocks: (B:143:0x0644, B:145:0x0665, B:147:0x0671, B:150:0x06b5, B:153:0x06d3, B:156:0x06fd, B:159:0x070f, B:162:0x0723, B:164:0x0736, B:165:0x0740, B:168:0x0759, B:171:0x0773, B:174:0x0787, B:176:0x07c7, B:177:0x07d2), top: B:142:0x0644 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0736 A[Catch: Exception -> 0x0819, TryCatch #2 {Exception -> 0x0819, blocks: (B:143:0x0644, B:145:0x0665, B:147:0x0671, B:150:0x06b5, B:153:0x06d3, B:156:0x06fd, B:159:0x070f, B:162:0x0723, B:164:0x0736, B:165:0x0740, B:168:0x0759, B:171:0x0773, B:174:0x0787, B:176:0x07c7, B:177:0x07d2), top: B:142:0x0644 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07c7 A[Catch: Exception -> 0x0819, TryCatch #2 {Exception -> 0x0819, blocks: (B:143:0x0644, B:145:0x0665, B:147:0x0671, B:150:0x06b5, B:153:0x06d3, B:156:0x06fd, B:159:0x070f, B:162:0x0723, B:164:0x0736, B:165:0x0740, B:168:0x0759, B:171:0x0773, B:174:0x0787, B:176:0x07c7, B:177:0x07d2), top: B:142:0x0644 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x070e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(r45.kv0 r26, java.lang.String r27, byte[] r28, long r29, long r31, java.lang.String r33, java.lang.String r34, int r35, boolean r36, int r37, r45.rn1 r38, int r39, r45.qt2 r40, java.lang.String r41, ss5.j0 r42, java.lang.String r43, r45.qm1 r44, r45.o72 r45, boolean r46, r45.y12 r47, r45.x82 r48, long r49, r45.wm1 r51) {
        /*
            Method dump skipped, instructions count: 2141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke2.c.<init>(r45.kv0, java.lang.String, byte[], long, long, java.lang.String, java.lang.String, int, boolean, int, r45.rn1, int, r45.qt2, java.lang.String, ss5.j0, java.lang.String, r45.qm1, r45.o72, boolean, r45.y12, r45.x82, long, r45.wm1):void");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.r71 resp = (r45.r71) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = this.f306936w;
        long j17 = this.f253452t;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 23L);
        } else if (this.f306939z) {
            j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
            sb6.append(i17);
            sb6.append(" errCode=");
            sb6.append(i18);
            sb6.append(" errMsg=");
            sb6.append(str);
            sb6.append(" resp curOnlineCount:");
            sb6.append(resp.getInteger(5));
            sb6.append(" cur_participant_count:");
            sb6.append(resp.getInteger(13));
            sb6.append(" liveInfoEnableFlag:");
            sb6.append(resp.getInteger(6));
            sb6.append(" liveCloseFlag:");
            sb6.append(resp.getInteger(7));
            sb6.append(" live_ext_flag:");
            sb6.append(resp.getInteger(11));
            sb6.append(" id: ");
            r45.nw1 nw1Var = (r45.nw1) resp.getCustom(3);
            sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
            sb6.append(' ');
            r45.nw1 nw1Var2 = (r45.nw1) resp.getCustom(3);
            sb6.append(nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.getInteger(2)) : null);
            sb6.append(" msg:");
            java.util.LinkedList list = resp.getList(2);
            sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            sb6.append(",interval:");
            sb6.append(resp.getInteger(17));
            sb6.append(", uniqueId:");
            sb6.append(this.f306935v);
            sb6.append(", playTogetherInfo=null:");
            sb6.append(((com.tencent.mm.protocal.protobuf.FinderJumpInfo) resp.getCustom(44)) == null);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 22L);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 21L);
        this.f306937x.a(i17, i18, str, resp, this.f306934u, this.f306935v);
    }

    @Override // az2.j
    public java.util.List s() {
        r45.q71 q71Var = this.f306938y;
        return kz5.c0.i(new jz5.l("offline", java.lang.String.valueOf(q71Var.getBoolean(7))), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(q71Var.getInteger(5))));
    }
}
