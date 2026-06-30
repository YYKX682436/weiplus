package ok4;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ok4.e f346010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, ok4.e eVar) {
        super(0);
        this.f346009d = str;
        this.f346010e = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct momentsVideoDownloadSourceStruct;
        java.util.HashMap hashMap = ok4.u.f346042b;
        java.lang.String str = this.f346009d;
        com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct momentsVideoDownloadSourceStruct2 = (com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct) hashMap.get(str);
        ok4.e eVar = this.f346010e;
        if (momentsVideoDownloadSourceStruct2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "SnsVideoDownloadReporter to report " + str + ", >> " + momentsVideoDownloadSourceStruct2.n() + ' ' + eVar + ' ' + java.lang.Thread.currentThread().getName());
            if (momentsVideoDownloadSourceStruct2.F <= 0 && momentsVideoDownloadSourceStruct2.H <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "struct is no to download, " + str);
                hashMap.remove(str);
                return jz5.f0.f302826a;
            }
            momentsVideoDownloadSourceStruct2.k();
            momentsVideoDownloadSourceStruct = (com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct) hashMap.remove(str);
        } else {
            momentsVideoDownloadSourceStruct = null;
        }
        if (momentsVideoDownloadSourceStruct == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "report >> " + str + " >> is no have struct, " + eVar);
        }
        return jz5.f0.f302826a;
    }
}
