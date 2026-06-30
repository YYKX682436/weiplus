package x63;

/* loaded from: classes5.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y63.a f452254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y63.a f452255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f452256f;

    public l(x63.p pVar, y63.a aVar, y63.a aVar2, int i17) {
        this.f452254d = aVar;
        this.f452255e = aVar2;
        this.f452256f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int size;
        java.lang.String str;
        y63.a aVar = this.f452255e;
        y63.a aVar2 = this.f452254d;
        if (aVar2 == null) {
            i17 = aVar.N.size();
            str = aVar.K;
            size = 0;
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (int i18 = 1; i18 <= aVar2.N.size(); i18++) {
                y63.b bVar = (y63.b) aVar2.N.get(java.lang.Integer.valueOf(i18));
                if (bVar != null && com.tencent.mm.sdk.platformtools.t8.D0(bVar.f459652a, c01.z1.r())) {
                    hashSet.add(bVar);
                    hashMap.put(bVar.f459656e, bVar);
                }
            }
            int i19 = 0;
            java.lang.String str2 = "";
            i17 = 0;
            for (int i27 = 1; i27 <= aVar.N.size(); i27++) {
                y63.b bVar2 = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i27));
                if (com.tencent.mm.sdk.platformtools.t8.D0(bVar2.f459652a, c01.z1.r())) {
                    if (hashSet.contains(bVar2)) {
                        i19++;
                    } else {
                        i17++;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            str2 = bVar2.f459654c;
                        }
                    }
                }
            }
            java.lang.String str3 = str2;
            size = hashSet.size() - i19;
            str = str3;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = aVar.K;
        }
        com.tencent.mm.autogen.mmdata.rpt.SoliotaireJoinStruct soliotaireJoinStruct = new com.tencent.mm.autogen.mmdata.rpt.SoliotaireJoinStruct();
        soliotaireJoinStruct.f60819j = soliotaireJoinStruct.b("Identifier", aVar.field_key, true);
        soliotaireJoinStruct.f60813d = soliotaireJoinStruct.b("ChatName", aVar.field_username, true);
        soliotaireJoinStruct.f60814e = soliotaireJoinStruct.b("LaunchUserName", aVar.field_creator, true);
        soliotaireJoinStruct.f60815f = aVar.field_msgSvrId;
        soliotaireJoinStruct.f60816g = size;
        soliotaireJoinStruct.f60817h = i17;
        soliotaireJoinStruct.f60818i = this.f452256f;
        soliotaireJoinStruct.f60820k = soliotaireJoinStruct.b("Punctuation", android.util.Base64.encodeToString(str.getBytes(), 0), true);
        android.util.Base64.encodeToString(str.getBytes(), 0);
        soliotaireJoinStruct.k();
    }
}
