package g43;

/* loaded from: classes5.dex */
public final class m implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g43.m f268766d = new g43.m();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f268767e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f268768f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f268769g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f268770h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f268771i;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f268772m;

    static {
        jz5.i iVar = jz5.i.f302831f;
        f268767e = jz5.h.a(iVar, g43.g.f268757d);
        f268768f = jz5.h.a(iVar, g43.b.f268742d);
        f268769g = jz5.h.a(iVar, g43.k.f268764d);
        f268770h = jz5.h.a(iVar, g43.l.f268765d);
        f268771i = jz5.h.a(iVar, g43.j.f268763d);
        f268772m = jz5.h.b(g43.a.f268740d);
    }

    public static final java.lang.Object a(g43.m mVar, java.util.List list, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        mVar.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (list.isEmpty() && rVar.n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(kz5.p0.f313996d));
        }
        g43.m mVar2 = f268766d;
        java.util.List Q1 = ((y33.h) f268771i.getValue()).Q1(list, str);
        if (Q1.size() != list.size()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(Q1, 10));
            java.util.Iterator it = Q1.iterator();
            while (it.hasNext()) {
                arrayList.add(((y33.g) it.next()).field_userName);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!arrayList.contains((java.lang.String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                gm0.j1.d().g(new v33.l(new java.util.LinkedList(list), str, (com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo) mVar2.b().get(str), false, rVar));
            }
        } else if (rVar.n()) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(Q1));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final java.util.HashMap b() {
        return (java.util.HashMap) f268768f.getValue();
    }

    public final java.util.HashMap c() {
        return (java.util.HashMap) f268767e.getValue();
    }

    public final java.util.LinkedList d(java.util.List list, java.lang.String str) {
        int size = list.size();
        jz5.g gVar = f268772m;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        jz5.g gVar2 = f268770h;
        if (size > intValue) {
            java.util.List subList = list.subList(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), size);
            ((java.util.HashMap) gVar2.getValue()).put(str, subList);
            java.util.List subList2 = list.subList(0, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
            com.tencent.stubs.logger.Log.i("GameChatRoom.ChatroomMemberPreloadManager", "handleSyncChatroomMember restList size = " + subList.size() + "  requestSize = " + subList2.size() + "  rawUserSize =" + list.size());
            list = subList2;
        } else {
            ((java.util.HashMap) gVar2.getValue()).remove(str);
        }
        return list instanceof java.util.LinkedList ? (java.util.LinkedList) list : new java.util.LinkedList(list);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null) {
            int type = m1Var.getType();
            g43.m mVar = f268766d;
            jz5.g gVar = f268769g;
            boolean z17 = true;
            if (type == 4713) {
                if (i17 == 0 && i18 == 0 && (m1Var instanceof v33.w)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSyncChatroomMember  rawUserSize = ");
                    v33.w wVar = (v33.w) m1Var;
                    sb6.append(wVar.I().member_username_list.size());
                    sb6.append(" chatroomName = ");
                    sb6.append(wVar.H().chatroom_name);
                    sb6.append("   lastVersion = ");
                    sb6.append(wVar.H().last_version);
                    sb6.append("   nextVersion = ");
                    sb6.append(wVar.I().next_version);
                    com.tencent.stubs.logger.Log.i("GameChatRoom.ChatroomMemberPreloadManager", sb6.toString());
                    java.util.LinkedList<java.lang.String> linkedList = wVar.I().member_username_list;
                    if (linkedList != null && !linkedList.isEmpty()) {
                        z17 = false;
                    }
                    if (!z17) {
                        java.util.HashMap hashMap = (java.util.HashMap) gVar.getValue();
                        java.lang.String chatroom_name = wVar.H().chatroom_name;
                        kotlin.jvm.internal.o.f(chatroom_name, "chatroom_name");
                        hashMap.put(chatroom_name, new jz5.l(wVar.H().last_version, wVar.I().next_version));
                        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new g43.f(m1Var, null), 3, null);
                        return;
                    }
                    m33.t1 t1Var = (m33.t1) i95.n0.c(m33.t1.class);
                    java.lang.String str2 = wVar.H().chatroom_name + "memberVersion";
                    java.lang.String next_version = wVar.I().next_version;
                    kotlin.jvm.internal.o.f(next_version, "next_version");
                    byte[] bytes = next_version.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    ((com.tencent.mm.plugin.game.v1) t1Var).Ai(str2, bytes);
                    return;
                }
                return;
            }
            if (type != 4952) {
                if (type == 5069 && i17 == 0 && i18 == 0 && (m1Var instanceof v33.n)) {
                    v33.n nVar = (v33.n) m1Var;
                    if (nVar.getCommReqResp().f70711b.f70700a instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse) {
                        com.tencent.mm.protobuf.f fVar = nVar.getCommReqResp().f70711b.f70700a;
                        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse");
                        java.util.LinkedList<java.lang.String> linkedList2 = ((com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse) fVar).at_member_username_list;
                        com.tencent.stubs.logger.Log.i("GameChatRoom.ChatroomMemberPreloadManager", "handleCgiGetUserAtMemberList  atMembers = " + linkedList2.size() + "  threadId = " + java.lang.Thread.currentThread().getId() + "   threadName =  " + java.lang.Thread.currentThread().getName());
                        if (!linkedList2.isEmpty()) {
                            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new g43.e(linkedList2, m1Var, null), 3, null);
                            return;
                        }
                        java.util.HashMap c17 = mVar.c();
                        com.tencent.mm.protobuf.f fVar2 = nVar.getCommReqResp().f70710a.f70684a;
                        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest");
                        u33.m mVar2 = (u33.m) c17.get(((com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest) fVar2).chatroom_name);
                        if (mVar2 != null) {
                            ((g43.u) mVar2).a(kz5.p0.f313996d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 == 0 && i18 == 0 && (m1Var instanceof v33.l)) {
                v33.l lVar = (v33.l) m1Var;
                if (lVar.f433124g) {
                    java.util.HashMap hashMap2 = (java.util.HashMap) f268770h.getValue();
                    java.lang.String str3 = lVar.f433122e;
                    java.util.List list = (java.util.List) hashMap2.get(str3);
                    if (list != null && !list.isEmpty()) {
                        z17 = false;
                    }
                    if (!z17) {
                        gm0.j1.d().g(new v33.l(mVar.d(list, str3), lVar.f433122e, (com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo) mVar.b().get(str3), true, null, 16, null));
                        return;
                    }
                    jz5.l lVar2 = (jz5.l) ((java.util.HashMap) gVar.getValue()).get(str3);
                    if (lVar2 != null) {
                        if (lVar2.f302833d == null) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            m33.t1 t1Var2 = (m33.t1) i95.n0.c(m33.t1.class);
                            java.lang.String str4 = str3 + dm.i4.COL_UPDATETIME;
                            byte[] bArr = new byte[8];
                            for (int i19 = 0; i19 < 8; i19++) {
                                bArr[i19] = (byte) ((currentTimeMillis >> (i19 * 8)) & 255);
                            }
                            ((com.tencent.mm.plugin.game.v1) t1Var2).Ai(str4, bArr);
                        }
                        m33.t1 t1Var3 = (m33.t1) i95.n0.c(m33.t1.class);
                        byte[] bytes2 = ((java.lang.String) lVar2.f302834e).getBytes(r26.c.f368865a);
                        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                        ((com.tencent.mm.plugin.game.v1) t1Var3).Ai(str3 + "memberVersion", bytes2);
                    }
                    mVar.b().remove(str3);
                    u33.m mVar3 = (u33.m) mVar.c().remove(str3);
                    if (mVar3 != null) {
                        g43.x xVar = ((g43.u) mVar3).f268787a;
                        xVar.getClass();
                        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(xVar), (oz5.l) xVar.f268801n.getValue(), null, new g43.s(xVar, null), 2, null);
                    }
                }
            }
        }
    }
}
