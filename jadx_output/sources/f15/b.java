package f15;

/* loaded from: classes.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f258694d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME), com.tencent.mm.protobuf.i.u(-1, "extra_key"), com.tencent.mm.protobuf.i.u(-1, "extra")});
        this.f258694d = appendAttrs;
        super.set__serialName("start_ui_params");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null});
    }

    public java.lang.String j() {
        return super.getString(this.f258694d + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f258694d + 2);
    }

    public java.lang.String l() {
        return super.getString(this.f258694d + 1);
    }

    public void n(java.lang.String str) {
        super.set(this.f258694d + 0, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f258694d + 2, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f258694d + 1, str);
    }
}
