package gf;

/* loaded from: classes7.dex */
public final class q1 implements sf.d {
    @Override // sf.d
    public void setPluginTextureScale(java.lang.String str, int i17, float f17, float f18) {
        java.lang.Integer num = (java.lang.Integer) gf.a2.f271012q.get(str + '_' + i17);
        com.tencent.mars.xlog.Log.i("SkylineViewRenderEngine", "setTextureScale engineId:" + num + " type:" + str + " id:" + i17 + " scaleX:" + f17 + " scaleY:" + f18);
        if (num != null) {
            num.intValue();
            d75.b.g(new gf.p1(num, i17, f17, f18));
        }
    }

    @Override // sf.d
    public void takePluginScreenshot(java.lang.String str, int i17) {
    }
}
