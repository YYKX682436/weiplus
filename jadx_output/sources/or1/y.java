package or1;

/* loaded from: classes.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI f347596d;

    public y(com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI) {
        this.f347596d = brandServiceIndexUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f347596d.f93996f == 1 ? 186 : 6;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsType", 33554499);
        a17.putExtra("ftsbizscene", i17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, false, 33554499);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.lang.String f17 = su4.r2.f(i17);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        hashMap.put("subSessionId", f17);
        a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        a17.putExtra("key_preload_biz", 4);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        j45.l.z(com.tencent.mm.sdk.platformtools.x2.f193071a, a17, null);
        su4.k2.a(i17, f17, f17, false, "", 33554499, "", false, "");
    }
}
