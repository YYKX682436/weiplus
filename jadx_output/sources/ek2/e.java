package ek2;

/* loaded from: classes3.dex */
public final class e extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.d f253434u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253435v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.ft0 f253436w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, long j18, java.lang.String str, byte[] bArr, int i17, java.lang.String str2, int i18, ek2.c micData, int i19, ek2.d dVar) {
        super(null, 1, null);
        java.lang.String str3;
        kotlin.jvm.internal.o.g(micData, "micData");
        this.f253434u = dVar;
        this.f253435v = "Finder.CgiFinderActivateLiveMic";
        r45.ft0 ft0Var = new r45.ft0();
        this.f253436w = ft0Var;
        ft0Var.set(3, java.lang.Long.valueOf(j17));
        ft0Var.set(1, db2.t4.f228171a.a(6802));
        ft0Var.set(4, java.lang.Long.valueOf(j18));
        ft0Var.set(5, str);
        ft0Var.set(7, xy2.c.f(this.f16135n));
        ft0Var.set(6, java.lang.Integer.valueOf(i17));
        ft0Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        ft0Var.set(8, str2);
        ft0Var.set(14, java.lang.Integer.valueOf(i19));
        ft0Var.set(9, java.lang.Integer.valueOf(i18));
        ft0Var.set(15, java.lang.Long.valueOf(c01.id.c()));
        r45.fl4 fl4Var = micData.f253421a;
        ft0Var.set(16, fl4Var);
        ft0Var.set(10, micData.f253422b);
        java.util.LinkedList linkedList = micData.f253423c;
        ft0Var.set(11, linkedList == null ? new java.util.LinkedList() : linkedList);
        java.util.LinkedList<r45.ea4> linkedList2 = micData.f253424d;
        ft0Var.set(12, linkedList2 == null ? new java.util.LinkedList() : linkedList2);
        java.util.LinkedList linkedList3 = micData.f253425e;
        ft0Var.set(13, linkedList3 == null ? new java.util.LinkedList() : linkedList3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("activate live mic id:");
        sb6.append(j17);
        sb6.append(" objectId:");
        sb6.append(j18);
        sb6.append(" objectNonceId:");
        sb6.append(str);
        sb6.append(" reportScene: ");
        sb6.append(i19);
        sb6.append(" sessionId:");
        sb6.append(str2);
        sb6.append(" micType: ");
        sb6.append(i18);
        sb6.append(" anchorSelfSeatPos: ");
        sb6.append(fl4Var.getInteger(4));
        sb6.append(" self: ");
        sb6.append(linkedList != null ? B(linkedList) : null);
        sb6.append(" otherInfo: ");
        if (linkedList2 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            for (r45.ea4 ea4Var : linkedList2) {
                java.util.LinkedList list = ea4Var.getList(1);
                java.lang.String B = list != null ? B(list) : "";
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("otherAnchorId: ");
                r45.fl4 fl4Var2 = (r45.fl4) ea4Var.getCustom(0);
                sb8.append(fl4Var2 != null ? fl4Var2.getString(0) : null);
                sb8.append(" anchorSession: ");
                r45.fl4 fl4Var3 = (r45.fl4) ea4Var.getCustom(0);
                sb8.append(fl4Var3 != null ? fl4Var3.getString(1) : null);
                sb8.append("  otherAudience: ");
                sb8.append(B);
                sb7.append(sb8.toString());
            }
            str3 = sb7.toString();
            kotlin.jvm.internal.o.f(str3, "toString(...)");
        } else {
            str3 = null;
        }
        sb6.append(str3);
        sb6.append(" unrecognized: ");
        sb6.append(linkedList3 != null ? B(linkedList3) : null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderActivateLiveMic", sb6.toString());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = this.f253436w;
        r45.gt0 gt0Var = new r45.gt0();
        gt0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) gt0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = gt0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderactivatelivemic";
        lVar.f70667d = 6802;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gt0 resp = (r45.gt0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253435v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.d dVar = this.f253434u;
        if (dVar != null) {
            lk2.a aVar = (lk2.a) dVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRefreshMicIntercom onCgiBack errCode:");
            sb6.append(i18);
            sb6.append(" reportScene: ");
            int i19 = aVar.f319008a;
            sb6.append(i19);
            com.tencent.mars.xlog.Log.i("FinderLiveMicHeartBeat", sb6.toString());
            if (i18 != 0 && i19 == 1) {
                lk2.c.f319011f = true;
            }
            lk2.c cVar = aVar.f319009b;
            if (cVar != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveMicHeartBeat", "doRefreshMicIntercom onCgiBack isNeedClose: false errCode:" + i18 + " heartbeat_interval: " + resp.getLong(2));
                cVar.f319012d.a();
                if (i18 == 0) {
                    cVar.a(resp.getLong(2) * 1000);
                } else {
                    cVar.a(20000L);
                }
            }
        }
    }

    public final java.lang.String B(java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(linkedList, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.fl4 fl4Var = (r45.fl4) it.next();
            sb6.append("sdkid: " + fl4Var.getString(0) + " seatPos: " + fl4Var.getInteger(4) + " session: " + fl4Var.getString(1) + " is_video_enabled: " + fl4Var.getBoolean(2) + " is_audio_enabled: " + fl4Var.getBoolean(3) + '\n');
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
