package z46;

/* loaded from: classes12.dex */
public class e implements java.io.FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f470153a;

    public e(z46.f fVar, java.lang.String str) {
        this.f470153a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(java.io.File file, java.lang.String str) {
        return str.startsWith(this.f470153a);
    }
}
