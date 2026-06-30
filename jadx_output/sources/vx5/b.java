package vx5;

/* loaded from: classes12.dex */
public class b implements java.io.FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441329a;

    public b(java.lang.String str) {
        this.f441329a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(java.io.File file, java.lang.String str) {
        return (str.startsWith("java_") || str.startsWith("NativeCrash_")) && str.contains(this.f441329a.replace(':', '_')) && (str.contains("xweb_sandbox_crash") || str.contains("xweb_gpu_crash") || str.contains("xweb_render_crash"));
    }
}
