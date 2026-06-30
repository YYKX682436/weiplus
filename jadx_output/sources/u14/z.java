package u14;

/* loaded from: classes5.dex */
public final class z extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f423802d = com.tencent.mm.vfs.q7.c("care_mode_hearing_aid");

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_902ac54f";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mm.vfs.w6.Q(resource.getPath(), this.f423802d);
    }
}
