package ek2;

/* loaded from: classes3.dex */
public final class p1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253514u;

    /* renamed from: v, reason: collision with root package name */
    public final int f253515v;

    /* renamed from: w, reason: collision with root package name */
    public final ek2.o1 f253516w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(long j17, byte[] bArr, java.lang.String str, long j18, r45.xl1 musicInfo, int i17, ek2.o1 callback) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253514u = "Finder.CgiFinderLiveModBackgroundMusic";
        this.f253515v = i17;
        this.f253516w = callback;
        r45.j02 j02Var = new r45.j02();
        j02Var.set(1, db2.t4.f228171a.a(6813));
        j02Var.set(5, java.lang.Long.valueOf(j17));
        j02Var.set(4, com.tencent.mm.protobuf.g.b(bArr));
        j02Var.set(2, str);
        j02Var.set(6, java.lang.Long.valueOf(j18));
        j02Var.set(3, musicInfo);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = j02Var;
        r45.k02 k02Var = new r45.k02();
        k02Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) k02Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = k02Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivemodbackgroundmusic";
        lVar.f70667d = 6813;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveModBackgroundMusic init ");
        sb6.append(j02Var.getLong(5));
        sb6.append(',');
        sb6.append(j02Var.getString(2));
        sb6.append(", times:");
        sb6.append(i17);
        sb6.append(", song_id_list:");
        r45.xl1 xl1Var = (r45.xl1) j02Var.getCustom(3);
        sb6.append(xl1Var != null ? xl1Var.getList(0) : null);
        sb6.append(",liveCookies is null:");
        sb6.append(j02Var.getByteString(4) == null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveModBackgroundMusic", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.k02 resp = (r45.k02) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" times:");
        int i19 = this.f253515v;
        sb6.append(i19);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        com.tencent.mars.xlog.Log.i(this.f253514u, sb6.toString());
        xl2.a aVar = (xl2.a) this.f253516w;
        aVar.getClass();
        if (!(i17 == 0 && i18 == 0) && i19 < 3) {
            long j17 = aVar.f455108a;
            byte[] bArr = aVar.f455109b;
            java.lang.String str2 = aVar.f455110c;
            long j18 = aVar.f455111d;
            r45.xl1 musicInfo = aVar.f455112e;
            kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
            new ek2.p1(j17, bArr, str2, j18, musicInfo, i19 + 1, new xl2.a(j17, bArr, str2, j18, musicInfo)).l();
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
