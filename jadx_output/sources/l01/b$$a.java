package l01;

/* loaded from: classes.dex */
public final /* synthetic */ class b$$a implements bm5.w0 {
    @Override // bm5.w0
    public final java.lang.Object a() {
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        java.lang.String str = D + "wxacache/";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }
}
