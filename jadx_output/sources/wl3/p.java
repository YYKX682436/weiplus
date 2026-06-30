package wl3;

/* loaded from: classes15.dex */
public class p implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f447077d;

    /* renamed from: e, reason: collision with root package name */
    public android.text.StaticLayout f447078e;

    /* renamed from: f, reason: collision with root package name */
    public float f447079f = Float.MIN_VALUE;

    public p(com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView, long j17, java.lang.String str) {
        this.f447077d = j17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        wl3.p pVar = (wl3.p) obj;
        if (pVar == null) {
            return -1;
        }
        return (int) (this.f447077d - pVar.f447077d);
    }
}
