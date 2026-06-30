package zl1;

/* loaded from: classes7.dex */
public class h extends zl1.w {
    public h(zl1.t tVar) {
    }

    @Override // zl1.w
    public void a(java.lang.String str, zl1.y yVar) {
        super.a(str, yVar);
        com.tencent.mars.xlog.Log.e("IconLoadErrorHandler ", "load icon fail: " + str);
    }
}
