package xe2;

/* loaded from: classes3.dex */
public final class n1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453888c;

    /* renamed from: d, reason: collision with root package name */
    public long f453889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453888c = "LiveUpdateFinderObjectInterceptor";
    }

    @Override // we2.x
    public void c() {
        this.f453889d = 0L;
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        java.lang.Object next;
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        java.util.Iterator it = msgList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j17 = ((r45.ch1) next).getLong(12);
                do {
                    java.lang.Object next2 = it.next();
                    long j18 = ((r45.ch1) next2).getLong(12);
                    if (j17 < j18) {
                        next = next2;
                        j17 = j18;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        r45.ch1 ch1Var = (r45.ch1) next;
        if ((ch1Var != null ? ch1Var.getLong(12) : 0L) < this.f453889d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip this updateFinderObject by invalid seq. [");
            sb6.append(ch1Var != null ? ch1Var.getLong(12) : 0L);
            sb6.append(" : ");
            sb6.append(this.f453889d);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i(this.f453888c, sb6.toString());
            return;
        }
        gk2.e eVar = this.f445267a;
        if (ch1Var != null && (byteString = ch1Var.getByteString(4)) != null) {
            this.f453889d = ch1Var.getLong(12);
            r45.nk1 nk1Var = new r45.nk1();
            try {
                nk1Var.parseFrom(byteString.g());
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            int i17 = 5;
            if (pm0.v.z((int) nk1Var.getLong(5), 2)) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                java.lang.String str = "updateCoverInfo updateFinderInfo.cover_img:" + ((r45.c84) nk1Var.getCustom(1));
                java.lang.String str2 = c1Var.f328800f;
                com.tencent.mars.xlog.Log.i(str2, str);
                r45.c84 c84Var = (r45.c84) nk1Var.getCustom(1);
                if (c84Var != null) {
                    java.lang.String string = c84Var.getString(0);
                    java.lang.String string2 = nk1Var.getString(2);
                    com.tencent.mars.xlog.Log.i(str2, "updateCoverInfo url:" + string + " token:" + string2);
                    if (!(string == null || string.length() == 0)) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(string);
                        sb7.append(string2 != null ? string2 : "");
                        java.lang.String sb8 = sb7.toString();
                        c1Var.f328891u2 = sb8;
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = c1Var.f328846n;
                        if (!((finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null || liveInfo.getInteger(17) != 1) ? false : true)) {
                            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = c1Var.f328846n;
                            r45.uo1 liveDesc = (finderObject2 == null || (objectDesc4 = finderObject2.getObjectDesc()) == null) ? null : objectDesc4.getLiveDesc();
                            if (liveDesc != null) {
                                liveDesc.set(0, sb8);
                            }
                        }
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = c1Var.f328846n;
                        if (finderObject3 != null && (objectDesc3 = finderObject3.getObjectDesc()) != null && (media2 = objectDesc3.getMedia()) != null && (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media2)) != null) {
                            finderMedia2.setThumbUrl(sb8);
                            finderMedia2.setWidth(c84Var.getInteger(2));
                            finderMedia2.setHeight(c84Var.getInteger(1));
                            finderMedia2.setCoverUrl(string);
                            finderMedia2.setCover_url_token(string2);
                        }
                        ((kotlinx.coroutines.flow.h3) ((mm2.g1) c1Var.business(mm2.g1.class)).f329075p).k(sb8);
                    }
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = c1Var.f328846n;
                if (finderObject4 != null && (objectDesc2 = finderObject4.getObjectDesc()) != null && (media = objectDesc2.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                    java.util.LinkedList list = nk1Var.getList(3);
                    if ((list != null ? list.size() : 0) > 0) {
                        finderMedia.setLive_cover_imgs(nk1Var.getList(3));
                    }
                }
                i17 = 5;
            }
            if (pm0.v.z((int) nk1Var.getLong(i17), 1)) {
                mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
                c1Var2.V1 = nk1Var.getString(0);
                c1Var2.W1 = nk1Var.getString(4);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject5 = c1Var2.f328846n;
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc5 = finderObject5 != null ? finderObject5.getObjectDesc() : null;
                if (objectDesc5 != null) {
                    objectDesc5.setDescription(nk1Var.getString(0));
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject6 = c1Var2.f328846n;
                r45.uo1 liveDesc2 = (finderObject6 == null || (objectDesc = finderObject6.getObjectDesc()) == null) ? null : objectDesc.getLiveDesc();
                if (liveDesc2 != null) {
                    liveDesc2.set(1, nk1Var.getString(4));
                }
            }
            if (pm0.v.z((int) nk1Var.getLong(5), 3)) {
                ((mm2.c1) eVar.a(mm2.c1.class)).f328787c4 = (r45.ze2) nk1Var.getCustom(6);
                dk2.xa.f234344a.d(eVar);
            }
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).S9();
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20036};
    }
}
