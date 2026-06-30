package xe2;

/* loaded from: classes3.dex */
public final class j1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453872c = "LiveSingSongMsgInterceptor";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        r45.by1 by1Var;
        r45.ay1 ay1Var;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        mm2.m6 m6Var = (mm2.m6) this.f445267a.a(mm2.m6.class);
        java.lang.Object[] objArr = ch1Var != null && ch1Var.getInteger(1) == 20135;
        java.lang.String str = this.f453872c;
        r7 = null;
        r7 = null;
        java.lang.String str2 = null;
        if (objArr != true) {
            r45.fk1 fk1Var = new r45.fk1();
            if (ch1Var != null) {
                if ((ch1Var.getByteString(4) != null) == false) {
                    ch1Var = null;
                }
                if (ch1Var != null) {
                    com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                    fk1Var.parseFrom(byteString != null ? byteString.g() : null);
                }
            }
            com.tencent.mars.xlog.Log.i(str, "from msg SingingSongName: " + fk1Var.getString(0) + ", song_list_version: " + fk1Var.getLong(3) + ", has_live_song_list: " + fk1Var.getBoolean(1));
            fk1Var.getBoolean(1);
            m6Var.f329243h.postValue(fk1Var.getString(0));
            r45.z22 z22Var = (r45.z22) fk1Var.getCustom(4);
            if (z22Var != null) {
                m6Var.V6(z22Var);
                com.tencent.mars.xlog.Log.i(str, "Updated song cache: unique_add_id=" + z22Var.f391629f + ", song_mid=" + z22Var.f391627d);
                return;
            }
            return;
        }
        r45.ek1 ek1Var = new r45.ek1();
        if ((ch1Var.getByteString(4) != null) == false) {
            ch1Var = null;
        }
        if (ch1Var != null) {
            com.tencent.mm.protobuf.g byteString2 = ch1Var.getByteString(4);
            ek1Var.parseFrom(byteString2 != null ? byteString2.g() : null);
        }
        com.tencent.mars.xlog.Log.i(str, "from msg SyncNewSongInfo: has_new_song_list=" + ek1Var.getBoolean(0) + ", song_list_version=" + ek1Var.getLong(1));
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3867r8).getValue()).r()).intValue();
        m6Var.f329246n.postValue(java.lang.Boolean.valueOf(intValue != 1 ? intValue != 2 ? ek1Var.getBoolean(0) : false : true));
        r45.z22 z22Var2 = (r45.z22) ek1Var.getCustom(2);
        if (z22Var2 != null && (by1Var = z22Var2.f391631h) != null && (ay1Var = by1Var.f371143d) != null) {
            str2 = ay1Var.f370351e;
        }
        m6Var.f329242g.postValue(str2 == null ? "" : str2);
        r45.z22 z22Var3 = (r45.z22) ek1Var.getCustom(2);
        if (z22Var3 != null) {
            m6Var.V6(z22Var3);
            com.tencent.mars.xlog.Log.i(str, "Updated song cache: unique_add_id=" + z22Var3.f391629f + ", song_mid=" + z22Var3.f391627d + ", songName=" + str2);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20066, 20135};
    }
}
