package ml3;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml3.b f328398d;

    public a(ml3.b bVar) {
        this.f328398d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String d17;
        boolean h17;
        this.f328398d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PieceCacheCleanController", "scanMusicFile");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ql3.b Ai = ll3.o2.Ai();
        Ai.getClass();
        java.lang.String format = java.lang.String.format("SELECT * from %s WHERE updateTime < ? AND  musicType  <> 4  AND musicType  <> 10  AND musicType  <> 11   order by updateTime DESC limit 10", "Music");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - 86400000;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = Ai.f364581e.B(format, new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis2)});
        while (B.moveToNext()) {
            ql3.a aVar = new ql3.a();
            aVar.convertFrom(B);
            arrayList.add(aVar);
        }
        B.close();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ql3.a aVar2 = (ql3.a) it.next();
            java.lang.String str = aVar2.field_songWifiUrl;
            if (str == null) {
                str = aVar2.field_songWebUrl;
            }
            if (!android.text.TextUtils.isEmpty(str) && (h17 = com.tencent.mm.vfs.w6.h((d17 = xl3.c.d(str))))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PieceCacheCleanController", "delete music file,  %s, result:%b", d17, java.lang.Boolean.valueOf(h17));
            }
        }
        ql3.b Ai2 = ll3.o2.Ai();
        Ai2.getClass();
        java.lang.String format2 = java.lang.String.format("SELECT * from %s WHERE updateTime < ? AND musicType <> ?  order by updateTime DESC limit 10", "Music");
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - 604800000;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor B2 = Ai2.f364581e.B(format2, new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis3), java.lang.String.valueOf(6)});
        while (B2.moveToNext()) {
            ql3.a aVar3 = new ql3.a();
            aVar3.convertFrom(B2);
            arrayList2.add(aVar3);
        }
        B2.close();
        arrayList2.addAll(arrayList);
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ql3.a aVar4 = (ql3.a) it6.next();
            java.lang.String c17 = xl3.c.c(aVar4.field_musicId, true);
            java.lang.String c18 = xl3.c.c(aVar4.field_musicId, false);
            java.lang.String e17 = xl3.c.e(aVar4.field_musicId, false);
            java.lang.String e18 = xl3.c.e(aVar4.field_musicId, true);
            com.tencent.mm.vfs.w6.h(c17);
            com.tencent.mm.vfs.w6.h(c18);
            com.tencent.mm.vfs.w6.h(e17);
            com.tencent.mm.vfs.w6.h(e18);
            ql3.b Ai3 = ll3.o2.Ai();
            java.lang.String str2 = aVar4.field_musicId;
            ((lt0.f) Ai3.f364580d).remove(str2);
            ((lt0.f) Ai3.f364582f).remove(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.PieceCacheCleanController", "delete music %d %s", java.lang.Integer.valueOf(ll3.o2.Ai().f364581e.delete("Music", "musicId=?", new java.lang.String[]{aVar4.field_musicId})), aVar4.field_musicId);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PieceCacheCleanController", "scanMusic UseTime=%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(com.tencent.mm.plugin.appbrand.jsapi.pay.k2.CTRL_INDEX);
        iDKey.SetKey(254);
        iDKey.SetValue((int) r4);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(com.tencent.mm.plugin.appbrand.jsapi.pay.k2.CTRL_INDEX);
        iDKey2.SetKey(255);
        iDKey2.SetValue(1L);
        arrayList3.add(iDKey);
        arrayList3.add(iDKey2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList3, false, false);
    }
}
