package cx3;

/* loaded from: classes.dex */
public final class u implements on5.a {
    @Override // on5.a
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("DemoOneFragment", "onOverScroll dx: " + i17 + "，dy: " + i18);
    }

    @Override // on5.a
    public void b() {
        com.tencent.mars.xlog.Log.i("DemoOneFragment", "onOverStop");
    }
}
