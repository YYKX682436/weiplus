package k91;

/* loaded from: classes.dex */
public final class j3 extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final k91.i3 f305624d = new k91.i3(null);

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_97097883";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        f305624d.a(resource);
    }
}
