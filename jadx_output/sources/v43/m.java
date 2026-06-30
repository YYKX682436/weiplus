package v43;

/* loaded from: classes8.dex */
public class m implements hm0.q {
    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        h53.j d17;
        if (com.tencent.mm.ui.bk.I() && com.tencent.mm.ui.bk.F() && (d17 = h53.j.d()) != null) {
            d17.f279057g.h(java.lang.String.format("if (SystemInfo == 'undefined' || SystemInfo.isDarkMode == 'undefined) {return;} SystemInfo.isDarkMode=%b; console.log(SystemInfo.isDarkMode);", java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C())), null);
        }
    }

    @Override // hm0.q
    public void onLowMemory() {
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
    }
}
