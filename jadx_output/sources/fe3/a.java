package fe3;

/* loaded from: classes7.dex */
public final class a extends lc3.p {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f261536i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f261537m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f261538n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String bizName, java.lang.String instanceName, java.lang.String str) {
        super(instanceName);
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f261536i = bizName;
        this.f261537m = str;
        this.f261538n = "mbpkgs/" + bizName + ".wspkg";
    }

    @Override // jc3.x
    public java.lang.String g() {
        return this.f261536i;
    }

    @Override // lc3.o
    public boolean j() {
        java.lang.String str = this.f261536i;
        java.lang.String str2 = this.f261537m;
        if (str2 == null) {
            java.lang.Boolean a17 = jc3.w0.f299010a.a(str);
            if (a17 != null) {
                return a17.booleanValue();
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i("MircoMsg.MagicCommonPkgManagement", "enableCheckRemoteUDR: bizName=" + str + ", projectId=" + str2 + ", result=true (dynamic biz)");
        return true;
    }

    @Override // lc3.o
    public lc3.a k() {
        java.util.Map map = ge3.s.f270974a;
        ge3.a aVar = (ge3.a) ge3.s.f270974a.get(this.f261536i);
        if (aVar != null) {
            return new lc3.a(this.f261538n, aVar.c(), aVar.getMd5(), aVar.d());
        }
        return null;
    }

    @Override // lc3.o
    public lc3.c n() {
        return new lc3.c(this.f261538n, lc3.b.f317882d);
    }

    @Override // lc3.o
    public java.lang.String s() {
        return "/index.js";
    }

    @Override // lc3.o
    public java.lang.String u() {
        java.lang.String str = this.f261536i;
        java.lang.String str2 = this.f261537m;
        if (str2 == null) {
            return jc3.w0.f299010a.b(str);
        }
        com.tencent.mars.xlog.Log.i("MircoMsg.MagicCommonPkgManagement", "getUDRProjectId: bizName=" + str + ", projectId=" + str2 + " (from param)");
        return str2;
    }

    @Override // lc3.o
    public java.lang.String v() {
        return this.f261536i;
    }
}
