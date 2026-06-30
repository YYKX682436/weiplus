package zl0;

/* loaded from: classes13.dex */
public class b extends zl0.a {
    static {
        com.tencent.mm.vfs.q7.c("PublicResource");
    }

    public b(java.lang.String str) {
        this.f473558c = str;
    }

    @Override // zl0.a
    public java.lang.String b() {
        return c();
    }

    @Override // zl0.a
    public java.lang.String c() {
        return zl0.g.f473566c + "/" + this.f473558c + ".json";
    }

    @Override // zl0.a
    public boolean d() {
        return true;
    }

    @Override // zl0.a
    public java.lang.String toString() {
        return "FewshotModel{moduleName='" + this.f473558c + '}';
    }
}
